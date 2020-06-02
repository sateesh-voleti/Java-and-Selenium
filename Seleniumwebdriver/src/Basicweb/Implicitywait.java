package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitywait {
	private WebDriver driver;
	private String url;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		url="http://197.220.114.46:9632";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	}
	
	
	@Test
	public void test() {
		driver.get(url);
		
	}
	
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
