package WebDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class closeTest {
		
		@Test
		public void closeTest1() {
			
			WebDriver d=new ChromeDriver();
			d.close();
	}
}


