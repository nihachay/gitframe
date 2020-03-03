package StepDefination;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.qa.Pages.Loginpage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination extends TestBase {
	



@Given("^user is already in login page$")
public void user_is_already_in_login_page()  {
   TestBase.initialization();
  }

@When("^title of the login page is Free CRM$")
public void title_of_the_login_page_is_Free_CRM() throws Throwable  {
    // Write code here that turns the phrase above into concrete actions

	
	Loginpage.Logintitle();
	
}

@Then("^user enters User name and Password$")
public void user_enters_User_name_and_Password() throws Throwable  {
    // Write code here that turns the phrase above into concrete actions
	
			Loginpage.Username().sendKeys("niharika.chay@gmail.com");
	
	 
		Loginpage.Password().sendKeys("Saibaba@12");
}

@Then("^User clicks on login button$")
public void user_clicks_on_login_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	
		Loginpage.login().click();
	
}

@Then("^User is on home page$")
public void user_is_on_home_page()  {
    // Write code here that turns the phrase above into concrete actions
    
}



}
