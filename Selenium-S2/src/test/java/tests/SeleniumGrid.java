package tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.Platform;

public class SeleniumGrid {
	WebDriver d;
	@Test
	public void f() 
	{
		URL u;
		DesiredCapabilities c = DesiredCapabilities.chrome();
		c.setBrowserName("chrome");
		c.setPlatform(Platform.WINDOWS);
		try 
		{
			u = new URL("http://localhost:5544/wd/hub");
		}
		catch(Exception e)
		{
			u = null;
			e.printStackTrace();
		}
		d = new RemoteWebDriver(u,c);
	}
	public void setup()
	{
		
	}
		
}