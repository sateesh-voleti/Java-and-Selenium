package Basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idxpathdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurl="https://learn.letskodeit.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("sateesh.kumar@compulynx.com");

	}

}
