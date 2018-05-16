package com.crm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.baseclass.Baseclass;

public class Loginpage extends Baseclass{
	
	Loginpage lp;
	public Loginpage() throws IOException{
		super();
		// TODO Auto-generated constructor stub
		//Loginpage lp=new Loginpage();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement uname;
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	public Homepage login1(String un,String pw) throws IOException 
	{
		uname.sendKeys(un);
		pass.sendKeys(pw);
		login.click();
		return new Homepage();
		
		
	}
	

	

}
