package POMconcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name="username")
	private WebElement usernametf;
	
	@FindBy(name="password")
	private WebElement passwordtf;
	
	@FindBy(xpath ="//button[text()=' Login ']")
	private WebElement loginbtn;

	public WebElement getUsernametf() {
		return usernametf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//create constructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//create Method
	public void Login(String usernamedata,String passworddata) {
		usernametf.sendKeys(usernamedata);
		passwordtf.sendKeys(passworddata);
		loginbtn.click();
	}
}
