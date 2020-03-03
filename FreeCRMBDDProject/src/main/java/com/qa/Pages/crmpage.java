package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.util.Baseclass;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class crmpage extends Baseclass{

	//public static WebDriver driver;
	public crmpage(WebDriver driver) {
		super(driver);
	}
	public static String Logintitle() {
		return driver.getTitle();
	}
	public static WebElement Username() throws Throwable {
		return  driver.findElement(By.name("username"));
	}
	public static WebElement Password() throws Throwable {
		return  driver.findElement(By.name("password"));
	}

	public static WebElement login() throws Throwable {

		WebElement element= driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
		return element;
	}
	public static String home_pagetitle() throws Throwable {
		return driver.getTitle();
	}
	public static WebElement contacts() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).build().perform();
	return	driver.findElement(By.xpath("//a[@title='New Contact']"));
	}
		
	
	public static WebElement firstname() throws Throwable {
		return driver.findElement(By.name("first_name"));
	
	}
	public static WebElement lasttname() throws Throwable {
		
		return driver.findElement(By.name("surname"));
	
}
	public static WebElement position() throws Throwable {
	
		return driver.findElement(By.name("company_position"));
	}
	
	public static WebElement save() throws Throwable {
		
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}
}
