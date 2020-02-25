package com.offline.qa.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.offline.qa.pages.Home_Page;
import com.offline.qa.pro.TestBase;

public class HomePageTest extends TestBase {
	Home_Page homepage;
	public HomePageTest() throws Exception {
		super();

	}
	@BeforeTest
	public void objoghomepage() throws Exception{
	homepage = new Home_Page();
	}

	/*@Test
	public void navigatetoHomepg() {
		*/
		// PageFactory.initElements(driver, this);
		// driver.navigate().to("file:///F:/poonam%20jbk/Offline%20Website/pages/examples/dashboard.html");
		/*String curUrl = driver.getCurrentUrl();
		System.out.println(curUrl);*/
	//}
	@Test
	public void verifytitle(){
		String acttiltle= homepage.VerifyHomePageTitle();
		System.out.println(acttiltle);
		Assert.assertEquals(acttiltle, "dashboard");
	}

	

}
