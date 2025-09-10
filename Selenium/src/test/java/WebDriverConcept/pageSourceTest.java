package WebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pageSourceTest {

	@Test
	public void getPageSourceTest() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		String source = d.getPageSource();
		System.out.println(source);
	}
}
