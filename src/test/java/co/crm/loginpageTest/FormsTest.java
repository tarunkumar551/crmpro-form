package co.crm.loginpageTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.pages.Forms;

public class FormsTest extends LoginpageTest {
  public FormsTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

@Test(priority=1)
  public void f1() throws IOException, InterruptedException {
	Forms f1=new Forms();
	f1.switch1();
	f1.takesscreenshot("form");
	f1.form();
  }
}
