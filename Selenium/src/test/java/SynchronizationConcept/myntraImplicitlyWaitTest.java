package SynchronizationConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraImplicitlyWaitTest {

	@Test
	public void MyntraTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("watches");
		driver.findElement(By.cssSelector("span[class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Smart Watches']")).click();
		driver.findElement(By.cssSelector("img[alt='Helix By Timex Water Resistant Smart Watches TW0HXW700T']")).click();
	}
}

