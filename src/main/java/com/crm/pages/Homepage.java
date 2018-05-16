package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Loginpage{

	Homepage hp;
	public Homepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@title='New Event'])[1]")
	WebElement event;
	
	
	
	
	public void event1()
	{
	
		driver.switchTo().frame("mainpanel");
		event.click();
	}
	
	
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	public void event12()
	{
	
	title.sendKeys("hero");
	}

}
