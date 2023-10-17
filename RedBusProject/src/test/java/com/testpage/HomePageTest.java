package com.testpage;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.redbus.Base.BaseTest;
import com.red.pages.HomePage;

public class HomePageTest extends BaseTest {

	
	@BeforeTest
	public void test() {

		openBrowser("Firefox");

	}
	
	@Test
	public void Home_Page_Test() throws InterruptedException {HomePage homepg=new HomePage(driver);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		homepg.gettitle(driver);
		homepg.fromLocation("Chennai");
		homepg.toLocation("Mumbai");
		homepg.selectDate();
		homepg.search();
	}
}
