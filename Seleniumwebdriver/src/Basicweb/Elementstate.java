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

public class Elementstate {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		url="http://197.220.114.46:9632";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void test() {
		driver.get(url);
		
		WebElement e1=driver.findElement(By.xpath("//input[@placeholder='Enter Username']"));
		System.out.println("Is this web element enabled" +e1.isEnabled());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
