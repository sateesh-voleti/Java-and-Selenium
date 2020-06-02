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

public class Gettextdemo {
	WebDriver driver;
	String url;

	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		url="http://197.220.114.46:9632";
		
		
	}
	
	@Test
	public void test() {
		driver.get(url);
		WebElement elementtext=driver.findElement(By.xpath("//body[@id='main-body']/app-root/app-login/div/div/div/div/div/div/div/form[@name='loginForm']/button[1]"));
		String getvalue=elementtext.getText();
		System.out.println("Button text is: "+getvalue);
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	
}
