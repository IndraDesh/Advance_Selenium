package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class orangeHrmSendkeysTest {

	@Test
	public void sendkeysTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		 WebElement username = driver.findElement(By.name("username"));
		 username.sendKeys("Admin");
		 username.sendKeys(Keys.CONTROL+"A");
		 username.sendKeys(Keys.CONTROL+"C");
		 Thread.sleep(2000);
		 
		 WebElement password = driver.findElement(By.name("password"));
		 password.sendKeys(Keys.CONTROL+"V");
		 
		 Thread.sleep(3000);
		 driver.quit();
	}
}
