package iframeConcept;

import java.awt.Checkbox;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class basiciframeTest {

	@Test
	public void iframeTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://qa-automation-practice.netlify.app/iframe");
		
		//by indexing
		//driver.switchTo().frame(0);
		
		//using name/id
		driver.switchTo().frame("iframe-checkboxes");
		
		//using WebElement
		//WebElement frame = driver.findElement(By.xpath("//iframe[@src='assets/iframe-redirect-page.html']"));
		//driver.switchTo().frame(frame);
		
		 WebElement text = driver.findElement(By.xpath("//h1[text()='Hello, this is an Iframe!']"));
		 System.out.println(text.getText());
		 
		 WebElement paratext = driver.findElement(By.xpath("//p[contains(text(),'This is a simple hero unit, a simple jumbotron-style')]"));
		 System.out.println(paratext.getText());
		 
		 //switching control back to parent
		 driver.switchTo().parentFrame();
		 
		 //outside  the frame
		 WebElement Maintext = driver.findElement(By.xpath("//h2[text()='Iframe Example']"));
		 System.out.println(Maintext.getText());
	}
}
