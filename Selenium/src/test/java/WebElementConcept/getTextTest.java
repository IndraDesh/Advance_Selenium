package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getTextTest {
	
	@Test
	public void gettextTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		String element = driver.findElement(By.xpath("//p[text()='Forgot Your Password? ']")).getText();
		System.out.println(element);
		
		String link = driver.findElement(By.linkText("OrangeHRM, Inc")).getText();
		System.out.println(link);
		
		String username = driver.findElement(By.name("username")).getText();
		System.out.println(username);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
