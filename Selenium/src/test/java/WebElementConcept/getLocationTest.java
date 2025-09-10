package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getLocationTest {

	@Test
	public void getlocationTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Bag");
		driver.findElement(By.cssSelector("span[class='desktopHomePageSprite HeaderSearch']")).click();
		
	//	Point image = driver.findElement(By.cssSelector("img[alt='logoIcon']")).getLocation();
	//	System.out.println(image.getX());
	//	System.out.println(image.getY());
		
		Point image = driver.findElement(By.cssSelector("img[alt='ABG Brand Logo']")).getLocation();
		System.out.println(image.getX());
		System.out.println(image.getY());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
