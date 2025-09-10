package selectClassConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class multipleElementTest {

	@Test
	public void valueMultidropdownTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		
		//identify webelement---fruit dropdown
		WebElement dropdown = d.findElement(By.id("fruits"));
		
		//create object of select class & pass webelement as an argument
		Select s=new Select(dropdown);
		
		//call non static methods
		List<WebElement> allnames = s.getOptions();  //return multiple webelement id's
		for(WebElement fruit:allnames) {
			System.out.println(fruit.getText());  //return text of webelement
		}
}
	
	@Test
	public void multipleWebElementTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		Select s=new Select(dropdown);
		
		s.selectByVisibleText("Aquaman");
		s.selectByVisibleText("The Avengers");
		s.selectByVisibleText("Batman");
		
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement selected:all) {
			System.out.println(selected.getText());
		}
		}
	
	@Test
	public void singleWebElementTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		Select s=new Select(dropdown);
		
		s.selectByVisibleText("Aquaman");
		s.selectByVisibleText("The Avengers");
		s.selectByVisibleText("Batman");
		
		//return type of getFirstSelectedOption method is 'webElement' so we can call getText() method directly...no need to use for each loop 
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		s.deselectAll();
	}
}
