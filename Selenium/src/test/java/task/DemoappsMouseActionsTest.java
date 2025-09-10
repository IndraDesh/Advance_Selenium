package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoappsMouseActionsTest {

	@Test
	public void dragdropTest() throws InterruptedException{
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		Thread.sleep(2000);
		
		WebElement drag = d.findElement(By.xpath("//div[text()='Drag Me']"));
		
		Actions a=new Actions(d);
		a.dragAndDropBy(drag, 500, 100).perform();
	}
	
	@Test
	public void MouseHoverTest() throws InterruptedException{
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		Thread.sleep(2000);
		
		WebElement mousehover = d.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));
		
		Actions a=new Actions(d);
		a.moveToElement(mousehover).perform();
	}
	
	@Test
	public void clickAndHoldTest() throws InterruptedException{
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(2000);
		
		WebElement circle = d.findElement(By.id("circle"));
		
		Actions a=new Actions(d);
		a.clickAndHold(circle).perform();
	}
}
