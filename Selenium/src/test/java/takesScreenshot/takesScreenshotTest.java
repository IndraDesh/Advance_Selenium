package takesScreenshot;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takesScreenshotTest {

	@Test
	public void getScreenshotTest() throws IOException, InterruptedException {
		
		java.util.Date d= new java.util.Date();
		String timedate = d.toString().replace(':', '-');
	//	String timedate = new java.util.Date().toString().replace(':', '-');
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(3000);
		
		//step 1: downcast
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step 2: getscreenshotAs() & store screenshot in file form
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//step 3: create permanent location
	//	File destinationFile = new File("selenium1/pune/pic.png");
		File destinationFile = new File("./pune/pic"+timedate+".png");
		//step 4: created a folder & moved screenshot from temp location to permanent loaction
		FileUtils.copyFile(temp, destinationFile);
		
		Thread.sleep(3000);
		driver.quit();
	}
}

