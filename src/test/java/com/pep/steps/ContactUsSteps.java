package com.pep.steps;

import com.pep.Base.TestBase;
import com.pep.pages.ContactUsPage;
import com.pep.utility.Xls_Reader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class ContactUsSteps extends TestBase{
	
	ContactUsPage cp;
	
	@Given("I am contact us Page")
	public void i_am_contact_us_page() {
	  
		initialization();
		driver.navigate().to("http://automationpractice.com/index.php?controller=contact");
		cp = new ContactUsPage();
		
	}

	@When("I fill the form from sheet {string} and rowNumber {int}")
	public void i_fill_the_form_from_sheet_and_row_number(String sheetName, int RowNumber) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\sonal\\Desktop\\Excels\\BDDData.xlsx");
		String a2 =reader.getCellData(sheetName,"email", RowNumber);
		System.out.println(a2);
		String a3 =reader.getCellData(sheetName,"orderref", RowNumber);
		System.out.println(a3);
		String a4 =reader.getCellData(sheetName,"message", RowNumber);
		cp.fillContactUsForm(a2, a3, a4);
	   
	}
	@When("user click on send button")
	public void user_click_on_send_button() {
	   cp.clickSend();
	}

}
