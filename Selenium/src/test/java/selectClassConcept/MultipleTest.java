package selectClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleTest {

	@Test
	public void selectWebElementTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/r.php?entry_point=login");
		
		//identify webelement ---month dropdown
		WebElement months = d.findElement(By.id("month"));
		
		Select s=new Select(months);
		System.out.println(s.isMultiple());
	}
	
	@Test
	public void selectWebElementsTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/r.php?entry_point=login");
		
		//identify webelement ---day dropdown
		WebElement day = d.findElement(By.id("day"));
		
		Select s=new Select(day);
		System.out.println(s.isMultiple());
	}
	
	@Test
	public void isMultipleWebElementsTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		Select s=new Select(dropdown);
		System.out.println(s.isMultiple());
	}
}
