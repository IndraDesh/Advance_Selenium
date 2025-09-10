package extentReportConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class letcodeTest {
	
	public ExtentReports rep;	//global variable

	@BeforeSuite
	public void BS() {
		
		ExtentSparkReporter esp= new ExtentSparkReporter("./Reports/letcode2.png");	//To configure
		esp.config().setReportName("Indra");	//set report name
		esp.config().setTheme(Theme.DARK);		//set theme of the report
		esp.config().setDocumentTitle("Hello"); //set the title of the report
		
	     rep= new ExtentReports();		//generate the report
		rep.attachReporter(esp);					//add configurations to report
		rep.setSystemInfo("Browser", "Chrome");		//to add system environment data
		rep.setSystemInfo("OS", "Windows");
		rep.setSystemInfo("Author", "Indra");
	}
	
	@Test
	public void HomePageTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");

		ExtentTest test = rep.createTest("HomePageTest");
		test.log(Status.INFO, "Home Page is displayed");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		String temp = ts.getScreenshotAs(OutputType.BASE64);
		
		if (driver.getTitle().contains("Pune")) {
			test.log(Status.PASS, "title contains Pune");
		}else {
			test.log(Status.FAIL, "title not contains Pune");
			//test.addScreenCaptureFromBase64String(temp);
			test.addScreenCaptureFromBase64String(temp, "image");
		}
	}
	
	@Test
	public void EditPageTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		driver.findElement(By.xpath("//a[text()=' Edit ']")).click();
		
		ExtentTest test = rep.createTest("EditPageTest");
		test.log(Status.INFO, "Edit Page is displayed");
	}
	
	@AfterSuite
	public void AS() {
		
		rep.flush();	//backup of the report
	}
}
