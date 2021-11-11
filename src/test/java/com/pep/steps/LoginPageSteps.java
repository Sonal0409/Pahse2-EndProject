package com.pep.steps;

import org.junit.Assert;

import com.pep.Base.TestBase;
import com.pep.pages.Loginpage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageSteps extends TestBase{
	
	@After
	public void closeBrowser()
	{
		driver.close();
	}
	
	Loginpage lp;
	String title;
	
	@Given("I am on the loginPage")
	public void i_am_on_the_login_page() {
		
		initialization();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    lp = new Loginpage();
	}

	@When("I get the title of the page")
	public void i_get_the_title_of_the_page() {
		
		title = lp.ValidateTitle();
		System.out.println(title);
	  
	}
	@Then("I valdate the title of the page")
	public void i_valdate_the_title_of_the_page() {
		String expectedtitle="Login - My Store";
		Assert.assertEquals(title, expectedtitle);
	
	}

	@Then("Validate if forget password link is displayed")
	public void validate_if_forget_password_link_is_displayed() {
		
		String text1= lp.forgetPassword();
		System.out.println(text1);

}
	@When("I enter Username {string}")
	public void i_enter_username(String username) {
		
		lp.enterUsername(username);
		
	  
	}
	@When("I enter Password {string}")
	public void i_enter_password(String password) throws InterruptedException {
		
		lp.enterpassword(password);
		Thread.sleep(2000);
	   
	}
	
	
	
	
	
	
	
	


}
