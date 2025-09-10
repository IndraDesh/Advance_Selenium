package popupsConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class authenticationsPopupTest {

	@Test
	public void AuthenticationpopupTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//To handle Authentication popup we have to add username & password directly in the url
		//username:admin   password:admin@
		
		Thread.sleep(3000);
		driver.quit();
	}
}
