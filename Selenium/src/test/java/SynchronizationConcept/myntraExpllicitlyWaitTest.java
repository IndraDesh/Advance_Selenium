package SynchronizationConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class myntraExpllicitlyWaitTest {

	@Test
	public void expllicitlyWaitTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//step 1:
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement searchbar=driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchbar));
		
		searchbar.sendKeys("watches");
	}
	
	@Test
	public void explicitlyWaitTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement editText= driver.findElement(By.xpath("//a[text()=' Edit ']"));
		wait.until(ExpectedConditions.elementToBeClickable(editText));
		editText.click();
		
		driver.findElement(By.id("fullName")).sendKeys("Indranil");
	}
	
	@Test
	public void FluentWaitTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		WebElement text=driver.findElement(By.xpath("//h1[text()='Ready to be a Pro Engineer?']"));
		WebElement editText= driver.findElement(By.xpath("//a[text()=' Edit ']"));
	
	//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		FluentWait wait= new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(2));	//polling period
		wait.withTimeout(Duration.ofSeconds(50));	//max time duration
		wait.until(ExpectedConditions.elementToBeSelected(editText));
		editText.click();
		
		driver.findElement(By.id("fullName")).sendKeys("Indranil");
	}
}
