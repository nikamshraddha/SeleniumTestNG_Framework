package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonMethods {
	
	
	public static void selectDropdown(WebElement element,int index) {
		
		WebElement a = element;
		Select s = new Select(a);
		s.selectByIndex(index);
	}
	
	
	//we can also use visibleText/Value
	/*public static void selectDropdownWithVisibleText(WebElement element,String visibleText) {
		
		WebElement a = element;
		Select s = new Select(a);
		s.selectByVisibleText( visibleText);
	}*/
	

	

}
