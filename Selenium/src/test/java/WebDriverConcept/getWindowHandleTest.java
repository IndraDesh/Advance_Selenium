package WebDriverConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getWindowHandleTest {

	@Test
	public void getWindowTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("watches");
		searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[title='Spiky Kids Pack Of 2 Dial & Straps Analogue Multi Function Watch Combo_EVA19_BlkPnk']")).click();
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	
	public void getWindowsTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement searchtf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("watches");
		searchtf.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img[title='Spiky Kids Pack Of 2 Dial & Straps Analogue Multi Function Watch Combo_EVA19_BlkPnk']")).click();
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
