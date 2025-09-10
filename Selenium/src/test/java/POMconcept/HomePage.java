package POMconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath = "(//input[@placeholder=\"Type for hints...\"])[1]")
	private WebElement empnametf;

	public WebElement getPim() {
		return pim;
	}

	public WebElement getEmpnametf() {
		return empnametf;
	}
	
	//create constructor
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//method
	public void emp(String empname) {
		pim.click();
		empnametf.sendKeys(empname);
	}
	}
