package popupsConcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class childWindowPopup {

	@Test
	public void ChildWindowPopupTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 1000).perform();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> child = driver.getWindowHandles();
		for(String string : child) {
			driver.switchTo().window(string);
		}
		
		driver.findElement(By.name("email")).sendKeys("abc@123"+Keys.ENTER);
		driver.findElement(By.name("pass")).sendKeys("abc111"+Keys.ENTER);
	}
}
