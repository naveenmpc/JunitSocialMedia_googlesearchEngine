package com.app.phase2Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndProject2 {

	
	webDriver driver;
	
	@BeforeAl
	public void startbrowser()
  {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
		
		}
}
