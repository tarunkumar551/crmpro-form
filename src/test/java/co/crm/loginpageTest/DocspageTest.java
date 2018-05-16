package co.crm.loginpageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.pages.Docspage;

public class DocspageTest extends HomepageTest{
  public DocspageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		
	
	}

@Test(priority=2)
  public void f2() throws IOException, InterruptedException {
	Thread.sleep(4000);
	Docspage d1=new Docspage();
	d1.docs();
	d1.action();
	d1.newdir();
	d1.takesscreenshot("docs");
	
	
  }

}
