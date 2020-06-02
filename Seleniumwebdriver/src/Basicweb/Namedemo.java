package Basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://learn.letskodeit.com/p/practice";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.name("enter-name")).sendKeys("data");
		

	}

}
