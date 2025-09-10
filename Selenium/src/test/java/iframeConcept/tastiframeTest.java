package iframeConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tastiframeTest {

	@Test
	public void iframeTaskTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//passing control to single iframe
		driver.switchTo().frame("singleframe");
		//Enter the name in textfield
		WebElement tf = driver.findElement(By.xpath("//input[@type='text']"));
		tf.sendKeys("Indranil");
		
		//switch back to main page
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		//switch to outer iframe
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		//switch  to inner iframe
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		//Enter the surname in inner frame
		WebElement tfld = driver.findElement(By.xpath("//input[@type='text']"));
		tfld.sendKeys("Deshmukh");
		
		driver.switchTo().defaultContent();
	}
}
