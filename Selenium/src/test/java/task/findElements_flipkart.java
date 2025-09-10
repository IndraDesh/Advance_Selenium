package task;

import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findElements_flipkart {

	@Test
	public void FindElements_iphoneTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		WebElement searchtf = driver.findElement(By.name("q"));
		searchtf.sendKeys("iphone16");
		Thread.sleep(2000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@class,'_1MRYA1')]//li"));
		System.out.println("Dropdown suggestions of iphone16 :");
		
		for(WebElement suggestion:suggestions) {
			System.out.println(suggestion.getText());
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
}
