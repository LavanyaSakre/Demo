package TNG_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Insta
{
public WebDriver driver;
 @BeforeMethod
 public void openapp()
 {
	 System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.flipkart.com/");
 }
 @AfterMethod
 public void closeapp()
 {
	 driver.close();
 }
}
