package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Docspage extends Homepage{

	public Docspage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Docs']")
	WebElement docs1;
/*	@FindBy(xpath="//a[text()='Docs']")
	WebElement docs;*/
	
	public void docs() {
		driver.switchTo().frame("mainpanel");
		//docs.click();
	}
	
	
	
	@FindBy(xpath="//a[text()='New Directory']")
	WebElement newdocs;
	
	public void action() throws InterruptedException {
		
		Actions act=new Actions(driver);
		act.moveToElement(docs1).perform();
		act.moveToElement(newdocs);
		newdocs.click();
		Thread.sleep(5000);
		
	}
	
	
	@FindBy(xpath="//input[@id='directory']")
	WebElement directory;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement description;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement save;
	
	
	public void newdir()
	{
		directory.sendKeys("title");
		description.sendKeys("i am good man in the world");
		save.click();
	}

}
