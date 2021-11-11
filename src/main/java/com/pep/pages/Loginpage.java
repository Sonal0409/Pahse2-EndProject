package com.pep.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pep.Base.TestBase;

public class Loginpage extends TestBase{
	
	// Object repository
	
	@FindBy(linkText="Forgot your password?")
	WebElement fgtpwd;
	@FindBy(id="email")
	WebElement eml;
	@FindBy(id="passwd")
	WebElement pwd;
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Action methods
	
	public String ValidateTitle()
	{
		return driver.getTitle();
	}
	
	public String forgetPassword()
	{
		return fgtpwd.getText();
	}
	
	public void enterUsername(String username)
	{
		eml.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		pwd.sendKeys(password);
	}
	


}
