package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getTagnameTest {

	@Test
	public void getTagTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pantaloons.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Bag");
		driver.findElement(By.cssSelector("span[class='desktopHomePageSprite HeaderSearch']")).click();
		
	//	String tagName = driver.findElement(By.cssSelector("img[alt='logoIcon']")).getTagName();
	//	System.out.println(tagName);
		
		String tagName = driver.findElement(By.cssSelector("*[alt='logoIcon']")).getTagName();
		System.out.println(tagName);
		
		Dimension image = driver.findElement(By.cssSelector("img[alt='logoIcon']")).getSize();
		System.out.println(image);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
