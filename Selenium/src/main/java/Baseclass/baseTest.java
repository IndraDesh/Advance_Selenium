package Baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class baseTest {		//parent class
	
	public WebDriver driver;

	@BeforeSuite
	public void BS() {
		System.out.println("connect to the Data Base");
	}
	
	@BeforeClass
	public void BC() {		//launch the browser
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@BeforeMethod
	public void BM() {		//login to application
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	
	@AfterMethod
	public void AM() {		//logout from application
		driver.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	@AfterClass
	public void AC() {		//close the browser
		driver.quit();
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("Disconnect from Data Base");
	}
}
