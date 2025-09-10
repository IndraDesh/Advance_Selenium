package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectClassConceptTest {

	@Test
	public void selectTest() throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		
		WebElement dropdown = d.findElement(By.id("superheros"));
		
		Select s=new Select(dropdown);
	//	s.selectByValue("am");	//ant-man
	//	s.selectByValue("ta");	//the avengers
		
	//	s.selectByVisibleText("Ant-Man");	
	//	s.selectByVisibleText("The Avengers");
		
	//	System.out.println(s.isMultiple());
		
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
	//	s.deselectByIndex(0);	//deSelect methods
	//	s.deselectByIndex(2);
		
	//	s.deselectByValue("am");
	//	s.deselectByValue("ta");
		
	//	s.deselectByVisibleText("Ant-Man");
	//	s.deselectByVisibleText("The Avengers");
		
		s.deSelectByContainsVisibleText("Ant");
		s.deSelectByContainsVisibleText("Avengers");
	}
}
