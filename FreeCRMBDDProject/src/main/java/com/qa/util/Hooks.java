package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	public static WebDriver driver;

	@Before
	public static void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Niha\\chromedriverNew\\chromedriver78.exe");
		WebDriver driver = new ChromeDriver();
		new Baseclass(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("https://classic.freecrm.com/index.html");	
	}
	
//	@After
//	public static void teardown() {
//		driver.quit();
//	}
}
