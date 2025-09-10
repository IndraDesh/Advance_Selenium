package WebDriverConcept;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ManageTest {
	
	@Test
	public void getsizeTest() {
		
		WebDriver d=new ChromeDriver();//runtime polymorphirm
		
		//Method chaining
		//d.manage().window().maximize();
		//d.manage().window().minimize();
		//d.manage().window().fullscreen();
		Dimension a = d.manage().window().getSize();
		System.out.println(a.getHeight());
		System.out.println(a.getWidth());
	}
	
	@Test
	public void setSizeTest() {
		
		WebDriver d=new ChromeDriver();
		
		Dimension dim=new Dimension(200,500);
		d.manage().window().setSize(dim);
	}
	
	@Test
	public void getPositionTest() {
		
		WebDriver d=new ChromeDriver();
		Point axis = d.manage().window().getPosition();
		System.out.println(axis.getX());
		System.out.println(axis.getY());
	}
	
	@Test
	public void setPositionTest() {
		
		WebDriver d=new ChromeDriver();
		Point p=new Point(600,300);
		d.manage().window().setPosition(p);
	}

}
