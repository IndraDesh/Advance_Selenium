package POMconcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BasePage {

	@Test
	public void loginToApplication() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		LoginPage lp=new LoginPage(driver);
		
	//	PageFactory.initElements(driver, lp);
	//	lp.getUsernametf().sendKeys("Admin");
	//	lp.getPasswordtf().sendKeys("admin123");
	//	lp.getLoginbtn().click();
		lp.Login("Admin", "admin123");
		
		HomePage hp= new HomePage(driver);
		
	//	hp.getPim().click();
	//	hp.getEmpnametf().sendKeys("selenium");
		hp.emp("selenium");
		
	}
}
