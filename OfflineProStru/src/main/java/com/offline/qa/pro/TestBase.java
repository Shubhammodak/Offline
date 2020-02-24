package com.offline.qa.pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\shubham\\git\\Offline\\OfflineProStru\\src\\main\\java\\com\\offline\\qa\\config\\config.properties");
		prop.load(fis);
	}
	
	
	@BeforeMethod
	public static void OpenBrowser(){
		String brz=prop.getProperty("browser");
		if(brz.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver79.exe");
		driver = new ChromeDriver();
		}else
		{
			String ff=prop.getProperty("firefox");
			System.out.println("firefox");
		}
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void  quitebr(){
		driver.quit();
		
	}
	

}
