package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportTest {

	@Test
	public void ExtentReportstest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/test");
		
		ExtentSparkReporter esp= new ExtentSparkReporter("./Reports/letcode3.png");	//To configure
		esp.config().setReportName("Indra");	//set report name
		esp.config().setTheme(Theme.DARK);		//set theme of the report
		esp.config().setDocumentTitle("Hello"); //set the title of the report
		
		ExtentReports rep= new ExtentReports();		//generate the report
		rep.attachReporter(esp);					//add configurations to report
		rep.setSystemInfo("Browser", "Chrome");		//to add system environment data
		rep.setSystemInfo("OS", "Windows");
		rep.setSystemInfo("Author", "Indra");
		rep.flush();
	}
}
