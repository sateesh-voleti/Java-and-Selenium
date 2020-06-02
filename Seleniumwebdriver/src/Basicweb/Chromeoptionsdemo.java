package Basicweb;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionsdemo {

	public static void main(String[] args) {
		String url="https://google.com";
		WebDriver driver;
		ChromeOptions options=new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\Nexx\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\aohghmighlieiainnegkcijnfilokake\\0.10_0.crx"));
		
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
	
	}

}
