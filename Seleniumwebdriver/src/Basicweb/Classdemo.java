package Basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.className("inputtext")).sendKeys("1234sateesh@gmailc.om");
		driver.findElement(By.xpath("//label[@id='loginbutton']")).click();
		
		

	}

}
