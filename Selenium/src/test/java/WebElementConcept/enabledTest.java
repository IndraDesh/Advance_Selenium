package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class enabledTest {
	
	@Test
	public void isSelectedTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/indra/OneDrive/Desktop/p.html");
		boolean checkbox = driver.findElement(By.cssSelector("input[type ='checkbox']")).isSelected();
		// isSelected will only work for checkbox & radio button.
		System.out.println(checkbox);
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void displayedTest() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		boolean loginbtn = driver.findElement(By.xpath("//button[text()=' Login ']")).isDisplayed();
		// isDisplayed is work for any tag
		System.out.println(loginbtn);
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void enableTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/free-online-trial");
		boolean btn = driver.findElement(By.id("confirm-button")).isEnabled();
		//isEnabled is only work for input tag & button tag
		System.out.println(btn);
	}
}
