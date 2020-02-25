package com.offline.qa.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.offline.qa.pages.Home_Page;
import com.offline.qa.pages.Login_Page;
import com.offline.qa.pro.TestBase;

public class LoginPageTest extends TestBase {
	Login_Page login;
	Home_Page homepage;
	/*@BeforeMethod
	public void SetuP(){
		TestBase.OpenBrowser();
	}*/

	public LoginPageTest() throws Exception {
		super();
		
	}
@BeforeTest
public void objoglogin() throws Exception{
	login = new Login_Page();
}

	@Test(priority=1)
	public void checkTitle(){
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Log in";
		Assert.assertEquals(actTitle, expTitle);
		
	}
	
	@Test(priority=2)
	public void checkErrormsg(){
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actMsg=driver.findElement(By.id("email_error")).getText();
		System.out.println(actMsg);
		String expMsg="Please enter email.";
		Assert.assertEquals(actMsg, expMsg);
		
	}
	@Test(priority=3)
	public void checkErrormsgPassword(){
		
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actMsg=driver.findElement(By.xpath("//*[@id=\"password_error\"]")).getText();
		System.out.println(actMsg);
		String expMsg="Please enter password.";
		Assert.assertEquals(actMsg, expMsg);
		
	}
	@Test(priority = 4)
	public void checkErrormsgBothempty() {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actMsg = driver.findElement(By.id("email_error")).getText();
		String actMsg1 = driver.findElement(By.xpath("//*[@id=\"password_error\"]")).getText();
		System.out.println(actMsg);
		System.out.println(actMsg1);
		String expMsg = "Please enter email.";
		String expMsg1 = "Please enter password.";
		Assert.assertEquals(actMsg, expMsg);
		Assert.assertEquals(actMsg1, expMsg1);

	}
	@Test(priority = 5)
	public void homepage() throws Exception{
		login.navigatetohome();
		
	}
	
	}

	
	
	


