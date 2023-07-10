package PageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
	
	public WebDriver driver ;  //This driver does not have scope
	
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	
	private By lastName = By.xpath("//input[@name='UserLastName']");
	
	private By jobTitle = By.xpath("//input@name='UserTitle']");
	
	private By nextButton1 = By.xpath("//span[contains(text(),'Next')]");
	
	private By selectEmployees = By.xpath("//select[@name='CompanyEmployees']");
	
	private By companyName = By.xpath("//input[@name='CompanyName']");
	
	private By selectCountry = By.xpath("//select[@name='CompanyCountry']");
	
	private By nextButton2 = By.xpath("//span[contains(text(),'Next')]");
	
	private By selectState = By.xpath("//select[@name='CompanyState']");
	
	private By nextButton3 = By.xpath("//span[contains(text(),'Next')]");
	
	
	
	public SignUpPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement enterFirstName() {
		
		return driver.findElement(firstName);
	}
	
	public WebElement enterLastName() {
		
		return driver.findElement(lastName);
	}
	
	public WebElement enterjobTitle() {
		
		return driver.findElement(jobTitle);
	}
	
	public WebElement clicknextButton1() {
		
		return driver.findElement(nextButton1);
	}
	
	public WebElement selectemployee() {
		
		return driver.findElement(selectEmployees);
	}
	
	
	public WebElement entercompanyName() {
		
		return driver.findElement(companyName);
	}
	
	
	public WebElement selectcountry() {
		
		return driver.findElement(selectCountry);
	}
	
	public WebElement  clicknextButton2() {
		
		return driver.findElement(nextButton2);
	}
	
	public WebElement selectstate() {
		
		return driver.findElement(selectState);
	}
	
	public WebElement  clicknextButton3() {
		
		return driver.findElement(nextButton3);
	}
	
	
	

}
