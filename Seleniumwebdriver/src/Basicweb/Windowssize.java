package Basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowssize {
	WebDriver driver;
	String baseurl;
	JavascriptExecutor je;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseurl="http//197.220.114.46:9632";
		driver.manage().window().maximize();
		je=(JavascriptExecutor) driver;
	}
	
	@Test
	public void test() {
		je.executeScript("window.location ='http://197.220.114.46:9632'");
		
		long hight=(Long) je.executeScript("return window.innerHeight;");
		long width=(Long) je.executeScript("return window.innerWidth;");
		System.out.println("Window hight is "+hight+ "and window width is "+width);
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
