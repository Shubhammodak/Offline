package com.offline.qa.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	public static WebDriver driver;

	
	@BeforeMethod
	public static void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver79.exe");
		driver = new ChromeDriver();
		driver.get("file:///E:/Jbk52/Offline%20Website/Offline%20Website/index.html");
	}
	
	@AfterMethod
	public void  quitebr(){
		driver.quit();
		
	}
	

}
