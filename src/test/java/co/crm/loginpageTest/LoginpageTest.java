package co.crm.loginpageTest;

import org.testng.annotations.Test;

import com.crm.baseclass.Baseclass;
import com.crm.pages.Loginpage;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class LoginpageTest extends Baseclass{
	//LoginpageTest lp1;
	public LoginpageTest() throws IOException {
		super();
		
		
	}
  @Test(priority=0)
  public void f() throws IOException  {
	  //lp1=new  LoginpageTest();
	
	  Loginpage lp=new Loginpage();
	  lp.takesscreenshot("loginpage");
	  lp.login1(prop.getProperty("username"),prop.getProperty("password"));
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  intialize();
	  
  }

  @AfterTest
  public void afterTest() {
	 // driver.close();
  }

}
