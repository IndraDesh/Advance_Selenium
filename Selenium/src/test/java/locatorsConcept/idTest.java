package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class idTest {

	@Test
	public void GooglePagesTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.id("APjFqb"));
		search.click();
		search.sendKeys("Pune");
		Thread.sleep(3000);
		search.clear();
		
		Thread.sleep(3000);
		driver.quit();
		}
	
}
