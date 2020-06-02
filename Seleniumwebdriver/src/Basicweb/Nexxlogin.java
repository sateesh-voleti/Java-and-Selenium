package Basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nexxlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url="http://197.220.114.46:9632";
		driver.get(url);
		driver.findElement(By.name("userName")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='main-body']/app-root/app-login/div/div/div/div/div/div/div/form[@name='loginForm']/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password' and @id='exampleInputPassword1']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Sign out']")).click();
		/*WebElement logout1 =driver.findElement(By.cssSelector("app-root.layout-fixed:nth-child(2) app-layout.ng-star-inserted:nth-child(2) div.wrapper app-header.topnavbar-wrapper nav.navbar.topnavbar:nth-child(1) div.row div.col-7.col-xs-6.col-sm-6.col-md-4.col-lg-5.search-list1:nth-child(2) ul.navbar-nav.flex-row.mr-autoCsmCSS li.nav-item.d-md-block:nth-child(3) a.nav-link > em.icon-logout.sizeforsmalldevice"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", logout1);
		Actions actions = new Actions(driver);
		actions.moveToElement(logout1).click().build().perform();
		String url1="https://google.com";
		driver.get(url1);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();*/
		Thread.sleep(3000);
		//driver.quit();
		

	}

}
