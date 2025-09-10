package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sendkeysTest {

	@Test
	public void sendKeysTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		//button.click();
		//button.submit();
		//button.sendKeys(Keys.ENTER);
		
		WebElement usertf = driver.findElement(By.id("username"));
		usertf.sendKeys(Keys.CONTROL+"A");
		usertf.sendKeys(Keys.CONTROL+"C");
		//usertf.sendKeys(Keys.DELETE);
		Thread.sleep(1000);
		
		WebElement passtf = driver.findElement(By.id("password"));
		passtf.sendKeys(Keys.CONTROL+"V");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
