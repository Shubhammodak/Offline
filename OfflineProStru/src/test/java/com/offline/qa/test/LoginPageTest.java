package com.offline.qa.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.offline.qa.pro.TestBase;

public class LoginPageTest extends TestBase {

	public LoginPageTest() throws IOException {
		super();

	}

	@Test(priority = 1)
	public void checkTitle() {
		String actTitle = driver.getTitle();
		String expTitle = "JavaByKiran | Log in";
		Assert.assertEquals(actTitle, expTitle);

	}

	@Test(priority = 2)
	public void checkErrormsg() {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actMsg = driver.findElement(By.id("email_error")).getText();
		//System.out.println(actMsg);
		log.info(actMsg);
		String expMsg = "Please enter email.";
		Assert.assertEquals(actMsg, expMsg);

	}

	@Test(priority = 3)
	public void checkErrormsgPassword() {

		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actMsg = driver.findElement(By.xpath("//*[@id=\"password_error\"]")).getText();
		//System.out.println(actMsg);
		log.info(actMsg);
		String expMsg = "Please enter password.";
		Assert.assertEquals(actMsg, expMsg);

	}

	@Test(priority = 4)
	public void checkErrormsgBothempty() {
		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actMsg = driver.findElement(By.id("email_error")).getText();
		String actMsg1 = driver.findElement(By.xpath("//*[@id=\"password_error\"]")).getText();
		//System.out.println(actMsg);
		//System.out.println(actMsg1);
		log.info(actMsg);
		log.debug(actMsg1);
		String expMsg = "Please enter email.";
		String expMsg1 = "Please enter password.";
		Assert.assertEquals(actMsg, expMsg);
		Assert.assertEquals(actMsg1, expMsg1);

	}

}
