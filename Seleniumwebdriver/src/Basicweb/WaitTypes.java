package Basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver;
	
	
	public WaitTypes(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement waitForElement(By locator, int timeout) {
		WebElement el=null;
		
		try {
			
			System.out.println("Eleemnt appeared in "+timeout+" seconds");
			WebDriverWait wait= new WebDriverWait(driver,timeout);
			el=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element appaeread in the required page");
			
			
		}catch(Exception e) {
			System.out.println("Element not appeared in specific time");
			
		}
		return el;
	}

}
