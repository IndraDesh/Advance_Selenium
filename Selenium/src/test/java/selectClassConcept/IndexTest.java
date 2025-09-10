package selectClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IndexTest {

	@Test
	public void indexTest() {
			
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://www.facebook.com/r.php?entry_point=login");
			
			WebElement months = d.findElement(By.id("month"));
			
			Select s=new Select(months);
			s.selectByIndex(0);
		}
	
	@Test
	public void IndexWebElementsTest() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		Select s=new Select(dropdown);
		s.selectByIndex(0);
	}
}
