package stepdefinition;

import org.junit.Assert;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Logout;
import locator.Myreview;

public class Logoutstepdefinition extends Base {
	
	
	Logout l;

    @Given("user setting to launching the application infoez url")
	public void user_setting_to_launching_the_application_infoez_url() {
		
		launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net");

        l = new Logout(driver);
	   
	}

	@When("user logged into the infoez application customer panel")
	public void user_logged_into_the_infoez_application_customer_panel() {
		
		elementToBeclick(l.signin);
	       click(l.signin);
	       
	        visibilitywait(l.email);
	        clear(l.email);
	        sendkeys(l.email, "customer@infoez.com");

	        visibilitywait(l.password);
	        clear(l.password);
	        sendkeys(l.password, "Customer@123");

	        elementToBeclick(l.submit);
	       click(l.submit);
		   
	   
	}

	@When("user clicks the profile button in the right corner")
	public void user_clicks_the_profile_button_in_the_right_corner() {
		
		Base.visibilitywait(l.welcomback);
		
		Base.invisiblewait(l.welcomback);
			
		Base.elementToBeclick(l.profilebtn);
			click(l.profilebtn);
	    
	}

	@When("user clicks the logout button")
	public void user_clicks_the_logout_button() {
		
	Base.elementToBeclick(l.logout);
	click(l.logout);
	    
	}

	@Then("verify the redirection pages")
	public void verify_the_redirection_pages() {
		
		Assert.assertTrue(driver.getPageSource().contains("Sign in"));
	    
	}




}
