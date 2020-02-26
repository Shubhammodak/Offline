package com.offline.qa.pro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;

	
	
	public TestBase() throws IOException{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\shubham\\git\\Offline\\OfflineProStru\\src\\main\\java\\com\\offline\\qa\\config\\config.properties");
		prop.load(fis);
	}
	

	@BeforeMethod
	public static void OpenBrowser(){
		
		log = org.apache.log4j.Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure(prop.getProperty("C:\\Users\\shubham\\git\\Offline\\OfflineProStru\\src\\main\\resources\\log4j.propertiese"));
		String brz=prop.getProperty("browser");
		if(brz.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "chromedriver79.exe");
		log.info("****Launching Chrome Browser****");
		driver = new ChromeDriver();
		}else
		{
			String ff=prop.getProperty("firefox");
			//System.out.println("firefox");
			log.info("firefox");
		}
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void  quitebr(){
		driver.quit();
		
	}
	

}
