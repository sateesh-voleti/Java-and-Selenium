package Basicweb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecutor {
	private WebDriver driver;
	String baseurl;
	private JavascriptExecutor js;
	

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		baseurl="http://197.220.114.46:9632";
		js=(JavascriptExecutor) driver;
	}
	
	@Test
	public void test() {
		driver.get(baseurl);
		WebElement textBox= (WebElement) js.executeScript("return document.getElementById('exampleInputEmail1');");
		textBox.sendKeys("admin");
	}

	@After
	public void tearDown() throws Exception {
		
		
	}

	

}
