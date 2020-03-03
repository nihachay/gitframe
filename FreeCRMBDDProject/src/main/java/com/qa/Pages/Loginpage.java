package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginpage extends TestBase{

	
	
	public static String Logintitle() {
		return driver.getTitle();
	}


	public static WebElement Username() throws Throwable {
		return  driver.findElement(By.xpath("//input[@name='email']"));
	}
	public static WebElement Password() throws Throwable {
		return  driver.findElement(By.xpath("//input[@name='password']"));
	}

	public static WebElement login() throws Throwable {
		
		WebElement element= driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		return element;
	}



	public void home_page() throws Throwable {

	}
}

