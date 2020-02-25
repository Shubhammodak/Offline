package com.offline.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.offline.qa.pro.TestBase;

public class Login_Page extends TestBase {

	public Login_Page() throws Exception {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id ="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath = "//*[@id=\"form\"]/div[3]/div/button" )
	WebElement loginbutton;
	
	
	public void login(){
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
	}

	
}
