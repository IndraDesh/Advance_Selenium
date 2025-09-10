package ActionsClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseActionsTest {

	@Test
	public void ClickingTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		//identify dropdowm element
		WebElement Dropdown = d.findElement(By.partialLinkText("Drop-Down"));
		
		//create object of Actions class & pass driver refernce in actions constructor
		Actions a=new Actions(d);
		//call non static method
		a.click(Dropdown);	//clicking on targeted element(drop-down text)
	//	a.click();		//click on webpage
		//call perform method
		a.perform();
	}
	
	@Test
	public void sendkeyTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		//identify dropdowm element
		WebElement Dropdown = d.findElement(By.xpath("//a[text()=' Edit ']"));
		
		//create object of Actions class & pass driver refernce in actions constructor
		Actions a=new Actions(d);
	//	a.sendKeys(Keys.PAGE_DOWN);		//for scrolling
		a.sendKeys(Dropdown, Keys.ENTER).perform();		//clicking,enter the value
		WebElement textf = d.findElement(By.id("fullName"));
		a.sendKeys(textf, "Pune").perform();
	}
	
	@Test
	public void ContextClickTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		WebElement pom = d.findElement(By.partialLinkText("Page Object Model"));
		
		Actions a=new Actions(d);	
	//	a.contextClick();		//right click on the webpage
		a.contextClick(pom);	//right click on webElement
		a.perform();
	}
	
	@Test
	public void dragdropTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/droppable");
		
		Thread.sleep(2000);
		
		WebElement source = d.findElement(By.id("draggable"));
		WebElement target = d.findElement(By.id("droppable"));
		
		Actions a=new Actions(d);
	//	a.dragAndDrop(source, target).perform();
		a.clickAndHold(source).moveToElement(target).release(target).perform();
	}
	
	@Test
	public void moveToElementTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
	
		WebElement studio = d.findElement(By.xpath("//a[text()='Studio']"));
		Actions a=new Actions(d);
		a.moveToElement(studio).perform();
	}
	
	@Test
	public void moveToElementsTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		
		Thread.sleep(2000);
	
		WebElement home = d.findElement(By.xpath("(//a[text()='Home'])[1]"));
		Actions a=new Actions(d);
		a.moveToElement(home, -200, 0).perform();
	}
	
	@Test
	public void moveByOffsetTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		Actions a=new Actions(d);
		a.moveByOffset(500, 300).contextClick().perform();
	}
	
	@Test
	public void ElementTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/test");
		
		Actions a=new Actions(d);
		a.moveByOffset(500, 400).contextClick().build().perform();	//build() used in selenium 3
	}
	
	@Test
	public void doubleClickTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(1000);
		
		WebElement button = d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a=new Actions(d);
		a.doubleClick(button).perform();
	}
}
