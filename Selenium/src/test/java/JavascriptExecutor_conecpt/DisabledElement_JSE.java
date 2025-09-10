package JavascriptExecutor_conecpt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisabledElement_JSE {
	@Test
	public void disabledElement() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/javase-jdk17-doc-downloads.html");
		
		driver.findElement(By.xpath("//a[text()='jdk-17.0.16_doc-all.zip']")).click();
		
		WebElement disabled = driver.findElement(By.xpath("//a[text()='Download jdk-17.0.16_doc-all.zip']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", disabled);
	}
}
