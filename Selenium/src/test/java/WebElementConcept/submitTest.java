package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class submitTest {

	@Test
	public void SubmitTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.name("login")).submit();
	 // submit is work for webElement which is having (1)button/input tag and (2)inside form tag. (3)  
	    
	//	driver.findElement(By.xpath("//a[text()='Create new account']")).submit();
	}
}
