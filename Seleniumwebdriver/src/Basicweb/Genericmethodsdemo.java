package Basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Genericmethodsdemo {
	WebDriver driver;

	public Genericmethodsdemo(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element is " + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element with xpath " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else {

			System.out.println("Element not initialised");
		}
		return null;
	}
}

