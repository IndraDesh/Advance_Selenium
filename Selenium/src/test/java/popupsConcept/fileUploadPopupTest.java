package popupsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fileUploadPopupTest {

	@Test
	public void FileUploadTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		driver.findElement(By.xpath("//p[contains(text(),'I have work experience')]")).click();
		
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\indra\\Downloads\\sel vijay cv2.pdf");
		
		Thread.sleep(3000);
		driver.quit();
		}
}
