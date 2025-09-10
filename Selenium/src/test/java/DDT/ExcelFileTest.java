package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelFileTest {

	@Test
	public void getDataFromExcelTest() throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis= new FileInputStream("src\\test\\resources\\ExcelFileCredentials.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row r = sh.getRow(0);
		
		Cell c = r.getCell(1);
		
		String username = c.getStringCellValue();
		System.out.println(username);
		
		String password = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(password);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
}
