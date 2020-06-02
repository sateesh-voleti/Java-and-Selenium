package Basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriverselenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		//you an sent in environment variables
		WebDriver driver= new ChromeDriver();
		String baseurl= "https://gmail.com";
		driver.get(baseurl);
		driver.findElement(By.name("password")).sendKeys("sateesh");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sateesh");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

}