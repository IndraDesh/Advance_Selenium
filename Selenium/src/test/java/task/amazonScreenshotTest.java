package task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonScreenshotTest {

	@Test
	public void AmazonSSTest() throws IOException, InterruptedException {
		
		java.util.Date d= new java.util.Date();
		String timedate = d.toString().replace(':', '-');
		
		//screenshot 1
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in//");
		Thread.sleep(1000);
		TakesScreenshot ts1=(TakesScreenshot) driver;
		File temp1 = ts1.getScreenshotAs(OutputType.FILE);
		File destinationFile1 = new File("./Amazon/Mainpage"+timedate+".png");
		FileUtils.copyFile(temp1, destinationFile1);
		
		//screenshot 2
		WebElement searchtf = driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("watches"+Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		Thread.sleep(1000);
        TakesScreenshot ts2=(TakesScreenshot) driver;
		File temp2 = ts2.getScreenshotAs(OutputType.FILE);
		File destinationFile2 = new File("./Amazon/searchWatches"+timedate+".png");
		FileUtils.copyFile(temp2, destinationFile2);
		
		//screenshot 3
		driver.findElement(By.xpath("(//img[contains(@alt,'Casio Vintage A-158WA-1Q Digital Grey Dial')])[1]")).click();
		Thread.sleep(1000);
		TakesScreenshot ts3=(TakesScreenshot) driver;
		File temp3 = ts3.getScreenshotAs(OutputType.FILE);
		File destinationFile3 = new File("./Amazon/Watch"+timedate+".png");
		FileUtils.copyFile(temp3, destinationFile3);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
