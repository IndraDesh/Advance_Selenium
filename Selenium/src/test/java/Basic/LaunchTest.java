package Basic;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchTest {

	@Test
	public void launchAppTest() {
		
		ChromeDriver d= new ChromeDriver();
		d.get("https://demoapps.qspiders.com/");
	}
	
	@Test
	public void loginToAppTest() {
		
	}
	
}













