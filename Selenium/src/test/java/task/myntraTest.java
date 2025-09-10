package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraTest {

	@Test
	public void watchesTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("watches"+Keys.ENTER);
	//	searchtf.sendKeys("watches");
	//	searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[title='CASIO G-Shock GBM-2100A-1A3DR Green Analog-Digital dial Bio-Based Resin G1583']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}
}
