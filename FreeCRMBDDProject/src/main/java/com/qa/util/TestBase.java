package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fis= new FileInputStream
					("D:\\eclipse-workspace\\FreeCRMBDDProject\\src\\main\\java\\com\\qa\\config\\config.properties");
				prop.load(fis);
			} catch (IOException e) {
			e.getMessage();
			}
			}
	
	public static void initialization() {
	
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Niha\\chromedriverNew\\chromedriver78.exe");
	 driver = new ChromeDriver();
	 }
	 	 else if(browsername.equals("firefox")) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Niha\\chromedriverNew\\chromedriver78.exe");
	 driver = new FirefoxDriver();
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITWAIT,TimeUnit.SECONDS);
	 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	 
	 driver.get(prop.getProperty("url"));
		 		
	}

}
