package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattributevalue {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url="http://197.220.114.46:9632";
		
		}

	
	@Test
	public void test() {
		driver.get(url);
		WebElement elmnt=driver.findElement(By.id("exampleInputEmail1"));
		String attributevalue=elmnt.getAttribute("class");
		System.out.println("The attribute is" +attributevalue);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
