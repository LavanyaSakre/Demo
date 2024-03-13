package Testng_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScript {
	public WebDriver driver;
 @BeforeMethod
 public void openApp()
 {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
 }
 @AfterMethod
 public void closeapp()
 {
	 driver.close();
 }
}
