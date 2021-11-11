package com.pep.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pep.Base.TestBase;



public class ContactUsPage extends TestBase {
	
	@FindBy(id="id_contact")
	WebElement Subjectheading;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="id_order")
	WebElement orderref;
	@FindBy(id="message")
	WebElement messageText;
	@FindBy(id="submitMessage")
	WebElement sendButton;
	
	public ContactUsPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	public String getContactUsPageTitle() {
		return driver.getTitle();
	}
	public void fillContactUsForm(String emailId, String orderReference, String message) {
		Select select = new Select(Subjectheading);
		select.selectByVisibleText("Customer service");
		email.sendKeys(emailId);
		orderref.sendKeys(orderReference);
		messageText.sendKeys(message);
	}
	
	public void clickSend() {
		sendButton.click();
	}
	
}
