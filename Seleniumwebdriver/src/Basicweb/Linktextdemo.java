package Basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextdemo {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String address="https://letskodeit.teachable.com/";
		driver.get(address);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(9000);
		driver.findElement(By.partialLinkText("Prac")).click();
	}

}
