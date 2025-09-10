package JavascriptExecutor_conecpt;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollBy_JSExecutor {

	@Test
	public void scrollBy_method() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://doodles.google/search/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}
}
