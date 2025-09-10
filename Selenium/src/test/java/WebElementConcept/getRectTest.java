package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getRectTest {

	@Test
	public void getrectTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Bag");
		driver.findElement(By.cssSelector("span[class='desktopHomePageSprite HeaderSearch']")).click();
		
		Rectangle rect = driver.findElement(By.cssSelector("img[alt='ABG Brand Logo']")).getRect();
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
