package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_login
{
 @Test
 public void login_fb() throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 FB f=new FB(driver);
	 Thread.sleep(2000);
	 f.username("lavanya12@gmail.com");
	 Thread.sleep(2000);
	 f.pass("lavi123");
	 Thread.sleep(2000);
	 f.login();
	 Thread.sleep(2000);
	
 }
}
