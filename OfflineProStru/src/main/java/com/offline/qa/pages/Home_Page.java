package com.offline.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.offline.qa.pro.TestBase;

public class Home_Page extends TestBase {

	public Home_Page() throws Exception {
		super();
		PageFactory.initElements(driver, this);
		
	}
	//page factory
	@FindBy(linkText="Users")
	WebElement users;
	
	//initializing pg objects
	
//actions
	public String VerifyHomePageTitle()
	{
		return driver.getTitle();
	}
	public void clickonusers()	{
		users.click();
	}
	
}
