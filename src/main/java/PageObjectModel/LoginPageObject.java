package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;  //this driver does not have scope
	
	private By username = By.xpath("//input[@type='email']");
	
	private By password = By.xpath("//input[@id='password']");
	
	private By clickOnLogin = By.xpath("//input[@id='Login']");
	
	private By tryForFree = By.xpath("//a[@id='signup_link']"); 
	
	private By errorMessage = By.xpath("//div[@id='error']");
	
	
	public LoginPageObject(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public WebElement enterusername() {
		return driver.findElement(username);
	}
	
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	
	public WebElement enterlogin() {
		return driver.findElement(clickOnLogin);
		
	}
	
	public WebElement clickOntryForFree() {
		
		return driver.findElement(tryForFree);
	}


	public WebElement clickOnLogin1() {
		// TODO Auto-generated method stub
		return null;
	}


	public WebElement clickOnLogin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public WebElement errorMessage() {
		
		return driver.findElement(errorMessage);
	}
	
	
	

}

	
	
	



