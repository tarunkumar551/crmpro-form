package com.crm.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.crm.utils.Utils;

public class Baseclass {
	public static WebDriver driver;
	public static Properties prop;
	public Baseclass() throws IOException
	{
		prop=new Properties();
		FileInputStream fio=new FileInputStream("D:\\seenu\\crm\\src\\main\\java\\com\\crm\\config\\config.properties");
		prop.load(fio);
	}
	public void takesscreenshot(String str) throws IOException {
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("D:\\seenu\\crm\\screenshot"+str+".png"));
	}
	public static void intialize()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}else {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
