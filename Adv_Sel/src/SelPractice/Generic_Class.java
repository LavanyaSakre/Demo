package SelPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Class {
	public static WebDriver driver;
	@BeforeMethod
	public void oppapp() 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
