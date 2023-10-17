package com.red.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {

	
	@FindBy(xpath = "//input[@id='src']")
	WebElement fromLocation;
	
	@FindBy(xpath = "//input[@id='dest']")
	WebElement destination;
	
	@FindBy(xpath="//div[@id='onwardCal']")
	WebElement inputDate;
	
	@FindBy(xpath="//span[text()='13']")
	WebElement selectDate;
	
	@FindBy(xpath="//button[@id='search_button']")
	WebElement search;
	

	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public void gettitle(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	public void fromLocation(String locationName) throws InterruptedException {
		fromLocation.sendKeys(locationName);
		Thread.sleep(1000);
	}
	
	
	
	public void toLocation(String destName) throws InterruptedException {
		destination.sendKeys(destName);
		Thread.sleep(1000);
	}
	
	
	public void selectDate() throws InterruptedException {
		inputDate.click();
		Thread.sleep(1000);
		selectDate.click();
	}
	
	
	public void search() {
		search.click();
	}
		
	
}



