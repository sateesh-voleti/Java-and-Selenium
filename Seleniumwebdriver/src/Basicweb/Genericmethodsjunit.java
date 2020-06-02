package Basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericmethodsjunit {
	
	private WebDriver driver;
	private String url;
	private Genericmethodsdemo gn;

	@Before
	public void setUp() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		url="http://197.220.114.46:9632";
		gn=new Genericmethodsdemo(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.get(url);
		WebElement element=gn.getElement("exampleInputEmail1", "id");
		element.sendKeys("admin");
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
