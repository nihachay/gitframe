package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.qa.Pages.crmpage;
import com.qa.util.Baseclass;
import com.qa.util.Hooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CrmProLoginSteps  {

	 static  WebDriver  driver ;
	public CrmProLoginSteps() {
				this.driver=Hooks.driver;
	}
	
	@Given("^launch the CrmPro application$")
	public void launch_the_CrmPro_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user launches application");
	    
	}

	@When("^user enters valid Username and Password$")
	public void user_enters_valid_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 crmpage.Username().sendKeys("batchautomation");
	 crmpage.Password().sendKeys("Test@12345");
	}

	@Then("^user should be able to login Succesfully\\.$")
	public void user_should_be_able_to_login_Succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    crmpage.login().click();
	}
	
	@Given("^user is already on home page$")
	public void user_is_already_on_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("driver="+driver);
		System.out.println(driver.getTitle());
	}

	@When("^user clicks on Contacts button and navigate to Newcontacts page$")
	public void user_clicks_on_Contacts_button_and_navigate_to_Newcontacts_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		crmpage.contacts().click();

	}

	@Then("^user enters \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String firstname, String lastname, String position) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		crmpage.firstname().sendKeys("first name");
		crmpage.lasttname().sendKeys("last name");
		crmpage.position().sendKeys("position");
	}

	@Then("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		crmpage.save().click();
	}
	



}
