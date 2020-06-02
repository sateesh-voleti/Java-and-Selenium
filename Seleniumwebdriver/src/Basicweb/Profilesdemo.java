package Basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class Profilesdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Sateesh backup\\Selenium\\Drivers\\geckodriver.exe");
		String baseurl="http://197.220.114.46:9632";
		WebDriver driver;
		
		ProfilesIni profile= new ProfilesIni();
		FirefoxProfile fxprofile=profile.getProfile("Automation");
		
		FirefoxOptions options=new FirefoxOptions();
		options.setProfile(fxprofile);
		
		driver= new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get(baseurl);

	}

}
