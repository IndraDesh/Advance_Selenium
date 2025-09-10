package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keyboardActionsTest {

	@Test
	public void doubleClickTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		
		WebElement women = d.findElement(By.xpath("(//span[text()='WOMEN'])[1]"));
		
		Actions a=new Actions(d);
		a.keyDown(Keys.ENTER).perform();	//To press the control button
		Thread.sleep(2000);
		a.click(women).perform();
		a.keyUp(Keys.CONTROL).perform();	//To release the control button
	}
	
	@Test
	public void scrollTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com/");
		Thread.sleep(2000);
		
		Actions a=new Actions(d);
		a.scrollByAmount(0, 1200).perform();
		Thread.sleep(2000);
		a.scrollByAmount(0, 500).perform();
	}
	
	@Test
	public void scrollingTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		Thread.sleep(2000);
		
		WebElement DOM = d.findElement(By.xpath("//a[text()=' DOM ']"));
		
		Actions a=new Actions(d); 
		a.moveToElement(DOM).perform();
	}
	
	@Test
	public void scrollsTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		Thread.sleep(2000);
		
		
		
		Actions a=new Actions(d); 
		a.scrollFromOrigin(null, 0, 0).perform();
	}
}
