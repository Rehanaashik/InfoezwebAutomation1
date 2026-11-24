package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Myreview;
import locator.Review;

public class Myreviewstepdefinition extends Base {
	
	Myreview m;

    @Given("user set to launches the applications url in the search")
	public void user_set_to_launches_the_applications_url_in_the_search() {
		
		launchbrowser();
        maximizebrowser();
        openurl("https://d2mojgetgp5xie.cloudfront.net");

        m = new Myreview(driver);
	   
	}

	@When("user logging into the application to verify my review functionality")
	public void user_logging_into_the_application_to_verify_my_review_functionality() {
		
		elementToBeclick(m.signin);
	       click(m.signin);
	       
	        visibilitywait(m.email);
	        clear(m.email);
	        sendkeys(m.email, "customer@infoez.com");

	        visibilitywait(m.password);
	        clear(m.password);
	        sendkeys(m.password, "Customer@123");

	        elementToBeclick(m.submit);
	       click(m.submit);
		   
	}
	
	@When("user clicking the profile button")
	public void user_clicking_the_profile_button() {
		
		Base.visibilitywait(m.welcomback);
		
	Base.invisiblewait(m.welcomback);
		
		 
		//Base.visibilitywait(m.profilebtn);
		Base.elementToBeclick(m.profilebtn);
		click(m.profilebtn);
		
	}
	
	

	@When("user clicks the my review button")
	public void user_clicks_the_my_review_button() {
		
		
		Base.elementToBeclick(m.myreviews);
		click(m.myreviews);
	 
	}
	
	
	
	@When("user deletes the review")
	public void user_deletes_the_review() {
		
		Base.visibilitywait(m.dlticon);

	   if(m.dlticon.isDisplayed()) {
		   click(m.dlticon);
		   Base.alertwait();
		   Base.acceptalert();
		   }
	   
	   
	}
	   
      @Then("user should verify the review status")
	public void user_should_verify_the_review_status() {
	 		
	 		
	 		Base.visibilitywait(m.reviewremoved);
	 		
	 		Assert.assertTrue(driver.getPageSource().contains("Review removed"));
	 		}
	 		
	 		
	 	}
	 	
	 	
	 		
		
		
	 	

