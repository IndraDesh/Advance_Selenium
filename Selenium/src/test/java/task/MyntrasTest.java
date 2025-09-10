package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntrasTest {

	@Test
	public void myntraTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("watches"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/32531370/2025/3/25/c0ad37b6-d548-4812-ae13-ba9ccb3bdcdf1742879635628-Dire-138-25D-Curved-Display-Working-Crown-250-Watchfaces-Hea-1.jpg']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
