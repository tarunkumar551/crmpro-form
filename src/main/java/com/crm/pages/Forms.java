package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Forms extends Loginpage{

	public Forms() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Forms']")
	WebElement forms;
	
	public void switch1() {
	    driver.switchTo().frame("mainpanel");
	    forms.click();
	}
	@FindBy(xpath="//a[@title='New Form']")
	WebElement newform;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement title;
	
	@FindBy(xpath="//select[@name='owner_user_id']")
	WebElement drop;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement save;
	
	
	public void form() throws InterruptedException {
		//Thread.sleep(4000);
		Actions act1=new Actions(driver);
		act1.moveToElement(forms).perform();
		act1.moveToElement(newform).perform();
		newform.click();
		Thread.sleep(4000);
		title.sendKeys("main hero");
		Select s1=new Select(drop);
		s1.selectByVisibleText("kumar raj (kumarraj)");
		save.click();
	}

}
