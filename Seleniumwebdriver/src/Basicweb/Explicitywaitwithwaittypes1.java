package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitywaitwithwaittypes1 {
	private WebDriver driver;
	private String url;
	WaitTypes1 wt;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		//driver= new ChromeDriver
		url="http://197.220.114.46:9632";
		        wt= new WaitTypes1(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void test() {
		driver.get(url);
		WebElement webelement=wt.waitForElement(By.id("exampleInputEmail1"), 3);
		webelement.sendKeys("admin");
		WebElement webelement1=wt.waitForElement(By.xpath("//button[@class='btn btn-block btn-primary mt-3']"), 3);
		webelement1.click();
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-3']")).click();
		wt.clickWhenReady(By.xpath("//em[@class='icon-logout sizeforsmalldevice']"), 10);
		}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
