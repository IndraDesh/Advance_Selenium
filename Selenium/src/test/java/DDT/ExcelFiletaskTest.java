package DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelFiletaskTest {

	@Test
	public void ExcelTest() throws EncryptedDocumentException, IOException {
		
FileInputStream fis= new FileInputStream("src\\test\\resources\\ExcelFileCredentials1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet2");
		
		Row r = sh.getRow(0);
		
		Cell c = r.getCell(1);
		
		String firstname = c.getStringCellValue();
		System.out.println(firstname);
		
		String lastname = wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastname);
		
		String email = wb.getSheet("Sheet2").getRow(2).getCell(1).getStringCellValue();
		System.out.println(email);
		
		String password = wb.getSheet("Sheet2").getRow(3).getCell(1).getStringCellValue();
		System.out.println(password);
		
		String confmpass = wb.getSheet("Sheet2").getRow(4).getCell(1).getStringCellValue();
		System.out.println(confmpass);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confmpass);
		
		WebElement register = driver.findElement(By.xpath("//div[@class='page registration-page']"));
		File temp = register.getScreenshotAs(OutputType.FILE);
		File dest = new File("./demowebshop/register.png");
		FileUtils.copyFile(temp, dest);
	}
}
