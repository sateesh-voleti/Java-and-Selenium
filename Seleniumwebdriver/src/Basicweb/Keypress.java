package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keypress {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		url="http://197.220.114.46:9632";
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("admin");
		driver.findElement(By.id("exampleInputEmail1")).sendKeys(Keys.ENTER);
		
		
	}

}
