package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignUpPageObject;
import Resources.BaseClass;
import Resources.Constants;
import Resources.commonMethods;

public class SignUpTastCases extends BaseClass {
	
	
	@Test
	public void verifySignUp() throws IOException, InterruptedException {
		
		
		LoginPageObject lpo = new LoginPageObject(driver);
		
		
		lpo.clickOntryForFree().click();
		
		SignUpPageObject spo = new SignUpPageObject(driver);
		
		Thread.sleep(5000);
		spo.enterFirstName().sendKeys(Constants.firstname);
		
		spo.enterLastName().sendKeys(Constants.lastname);
		
		spo.enterjobTitle().sendKeys(Constants.jobTitle);
		
		spo.clicknextButton1().click();
		
		commonMethods.selectDropdown(spo.selectemployee(),4);
		
		commonMethods.selectDropdown(spo.selectcountry(), 15);
		
		commonMethods.selectDropdown(spo.selectstate(), 3);
		
		
		/*WebElement a = spo.selectemployee();
		Select s = new Select(a);
		s.selectByIndex(1);*/
		
		spo.entercompanyName().sendKeys(Constants.companyName);
		
		
		/*WebElement c = spo.selectcountry();
		Select p = new Select(c);
		p.selectByIndex(15);*/
		
		spo.clicknextButton2().click();
		
		/*WebElement b = spo.selectstate();
		Select r = new Select(b);
		r.selectByIndex(5);*/
		
		spo.clicknextButton3().click();
		
		
		

		
	
	}

	

		
	}


