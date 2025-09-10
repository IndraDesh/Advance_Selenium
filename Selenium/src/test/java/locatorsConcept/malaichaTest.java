package locatorsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class malaichaTest {
	@Test 
	public void malaichaaTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		Thread.sleep(3000);
		driver.quit();
	} 
	
	@Test
	public void MalaichatfTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		driver.findElement(By.name("username")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pin")).sendKeys("pass");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
