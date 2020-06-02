package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatingbetweenpages {
	 WebDriver driver;
	 String url;
	 String title;
	 String currenturl;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		url = "http://197.220.114.46:9632";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(url);
		title=driver.getTitle();
		System.out.println("The title of the page is "+title);
		currenturl=driver.getCurrentUrl();
		System.out.println("The current url is "+currenturl);
		driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("admin");
		driver.findElement((By.xpath("//body[@id='main-body']/app-root/app-login/div/div/div/div/div/div/div/form[@name='loginForm']/button[1]"))).click();
		System.out.println("The current url is: "+currenturl);
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("The current url is: "+currenturl);
		Thread.sleep(3000);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource); 
		
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	
}
