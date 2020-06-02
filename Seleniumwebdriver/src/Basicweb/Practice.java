package Basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://gmail.com";
		String url1="http://197.220.114.46:9632/#/nexx/merchandising/dashboard";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		WebElement title1=driver.findElement(By.xpath("//div[2]//ul[1]//li[3]//a[1]//em[1]"));
		boolean value=title1.isEnabled();
		System.out.println("This button enabled: "+value);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).sendKeys("sateesh.kumar@compulynx.com");

	}

}
