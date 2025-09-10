package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webElementScreenshotTest {

	@Test
	public void webElementSsTest() throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		//identify the webelement in the webpage
		WebElement icon = driver.findElement(By.cssSelector("a[class='myntraweb-sprite desktop-logo sprites-headerLogo ']"));
		
		File temp= icon.getScreenshotAs(OutputType.FILE);
		File dest=new File("./myntraicon/icon.png");
		FileUtils.copyFile(temp, dest);
				
		Thread.sleep(3000);
		driver.quit();
	}
}
