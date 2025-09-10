package JavascriptExecutor_conecpt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ScrollIntoView_JSExecutor {

	@Test
	public void ScrollIntoView() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://doodles.google/search/");
		
		WebElement india = driver.findElement(By.xpath("//p[text()='India Independence Day 2025']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//true ==>> scroll the element to top of the webpage
		js.executeScript("arguments[0].scrollIntoView(true);" ,india);	
		//false ==>> scroll the element to the bottom of the webpage
	//	js.executeScript("arguments[0].scrollIntoView(false);" ,india);
	}
	
	@Test
	public void ScrollIntoView_method() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		
		WebElement india = driver.findElement(By.xpath("//span[text()='India']"));
		

		JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].scrollIntoView(true);" ,india);
		js.executeScript("arguments[0].scrollIntoView(false);" ,india);
	}
}
