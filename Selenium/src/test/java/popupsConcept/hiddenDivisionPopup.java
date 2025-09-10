package popupsConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class hiddenDivisionPopup {

	@Test
	public void hiddenDivisionTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		for(;;)
			try {
				driver.findElement(By.xpath("//div[@aria-label=\"Thu Dec 25 2025\"]")).click();
				break;
			}
		catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		}
		
	//	Thread.sleep(7000);
	//	driver.quit();
	}
}
