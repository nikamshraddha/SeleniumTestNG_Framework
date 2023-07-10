package TestCases;

import java.io.IOException;


import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.Constants;
import PageObjectModel.LoginPageObject;


public class LoginTestCase extends BaseClass {
	
	
	@Test(dataProvider="testData")
	public void verifyLogin(String username, String password) throws IOException {
		
		
		LoginPageObject lpo = new LoginPageObject(driver);
		
		lpo.enterusername().sendKeys(username);
		lpo.enterpassword().sendKeys(password);
		lpo.enterlogin().click();
		
		
		
		WebElement a = lpo.errorMessage();
		String actualText=a.getText();
		
		String ExpectedText=Constants.ExpectedTextMessage;
		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText,ExpectedText,"Valid error message is not showing");  
		
		sa.assertAll();
		
		
	}
	
	
	//Object is a class
	//Object[][] is a return type of dataprovider
	@DataProvider
	public Object[][] testData ()  {     //testData()    //testData is a dataProvider name
		Object[][] data= new Object[3][3]; //Create the object of the object class
		data[0][0]=Constants.username1; //1st username
		data[0][1]=Constants.password1; //1st password
		data[1][0]=Constants.username2; //2nd username
		data[1][1]=Constants.password2; //2nd password
		data[2][0]=Constants.username3; //3rd username
		data[2][1]=Constants.password3; //3rd password
		
		return data;
	}
		
		
}
	
	

