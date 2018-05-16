package co.crm.loginpageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.pages.Homepage;

public class HomepageTest extends LoginpageTest {
	HomepageTest hp1;
	
  public HomepageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@Test(priority=1)
  public void f1() throws IOException, InterruptedException {
	Homepage hp=new Homepage();
	hp.event1();
	hp.takesscreenshot("homepage");
	Thread.sleep(5000);
	hp.event12();
	driver.navigate().back();

  }
  
}
