package WebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class navigateTest {

	@Test
	public void navigationTest() throws Exception {
		
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		
		d.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		d.navigate().back();
		Thread.sleep(2000);
		
		d.navigate().forward();
		Thread.sleep(2000);
		
		d.navigate().refresh();
		Thread.sleep(2000);
		
		d.navigate().to("https://www.amazon.in/");
		d.quit();
	}
}
