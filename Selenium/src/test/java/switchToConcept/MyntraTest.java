package switchToConcept;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {

	@Test
	public void addToCart() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
		WebElement searchtf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
		searchtf.sendKeys("watches"+Keys.ENTER);
	    driver.findElement(By.cssSelector("img[title='Nibosi Men Stainless Steel Straps Analogue Chronograph Watch NB-2573-Slvr-Blk']")).click();
	   
	    String parentWindow = driver.getWindowHandle();
	    //To get control on child window
	    Set<String> bag = driver.getWindowHandles();	//2 windows
	    for (String id: bag) {
	    	driver.switchTo().window(id);
	    }
	    driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	    driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	    driver.findElement(By.xpath("//div[text()='PLACE ORDER']")).click();
	    
	    //to get control back to parent window
	    driver.switchTo().window(parentWindow);
	    driver.findElement(By.cssSelector("img[title='Carlton London Women Dial & Stainless Steel Bracelet Style Straps Analogue Watch CLSSCDGRN']")).click();
	    
	    //to get control on new child window
	    Set<String> bag1 = driver.getWindowHandles();	//3 windows
	    for (String id1: bag1) {
	    	driver.switchTo().window(id1);
	    }
	    driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	    driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	    driver.findElement(By.xpath("//div[text()='PLACE ORDER']")).click();
	    
	    //to get control back to parent window
	    driver.switchTo().window(parentWindow);
	}
}
