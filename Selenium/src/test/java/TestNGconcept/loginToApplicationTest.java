package TestNGconcept;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Baseclass.baseTest;

public class loginToApplicationTest extends baseTest {

	@Test(invocationCount = 2,priority = 3)
	public void loginToApplicationUsernamePasswordTest() {
		
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
	}
	
	@Test(priority=1)
	public void clickOnPIMTest() {
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}
	
	@Test(priority=2)
	public void clickOnTimeTest() {
		
		driver.findElement(By.xpath("//span[text()='Time']")).click();
	}
}
