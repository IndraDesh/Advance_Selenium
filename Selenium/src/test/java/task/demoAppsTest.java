package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoAppsTest {

	@Test
	public void demoAppsRegisterTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		d.findElement(By.id("name")).sendKeys("qsp");
		Thread.sleep(1000);
		d.findElement(By.id("email")).sendKeys("qsp@123");
		Thread.sleep(1000);
		d.findElement(By.id("password")).sendKeys("qspiders");
		Thread.sleep(1000);
		d.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(3000);
		d.quit();
	}
}
