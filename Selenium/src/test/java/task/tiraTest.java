package task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tiraTest {

	@Test
	public void searchProductTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
		WebElement searchProd = driver.findElement(By.id("search"));
		searchProd.sendKeys("perfumes");
		searchProd.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void tiraPerfTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tirabeauty.com/");
		WebElement search = driver.findElement(By.id("search"));
		search.sendKeys("perfumes"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Jean Paul Gaultier | Jean Paul Gaultier Le Male Elixir Eau De Parfum For Men (125 ml)']")).click();
	}
	
	@Test
	public void googleTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.google.com/");
		d.findElement(By.linkText("About")).click();
	}
}
