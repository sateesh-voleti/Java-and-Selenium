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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nexxtest {
	private WebDriver driver;
	String baseurl;
	WebElement el;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		baseurl="http://197.220.114.46:9632";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("admin");
		Thread.sleep(3000);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		el=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-block btn-primary mt-3']")));
		el.click();
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.cssSelector(".icon-logout")).click();
	}

}
