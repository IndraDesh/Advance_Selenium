package popupsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptPopupTest {

	@Test
	public void alertPopupTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void confirmationPopupTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	
	@Test
	public void PromptPopupTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert().sendKeys("Indranil");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
