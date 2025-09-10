package JavascriptExecutor_conecpt;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollTo_JSExecutor {

	@Test
	public void ScrollTo_method() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://doodles.google/search/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,1800)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
	}
}
