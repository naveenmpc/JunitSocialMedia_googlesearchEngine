package com.spotyshoe.Tests;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.spotyshoe.selenium.HomePage;
import com.spotyshoe.selenium.LoginPage;
import com.spotyshoe.selenium.OrderPage;
import com.spotyshoe.selenium.RegisterPage;
import com.spotyshoe.selenium.TestBase;

public class OrderpageTest  extends TestBase {HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	OrderPage op;
	@BeforeTest
	public void start_browser(){
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
		op = new OrderPage(driver);
	}
@Test(priority='1')
	public void test_login(){	
	lp.user_login();
	}
	@Test(priority='2')
public void test_click_orders()
	{
		op.click_orderPage();
	}
@Test(priority='3')
	public void test_getTitle_page(){String expected = "http://localhost:9010/orders";
		String Actual = hp.getURL_page();
		Assert.assertEquals(Actual, expected);}
	
}