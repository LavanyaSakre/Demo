package Testng_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Insta_Login {
          @Test
          public void login() throws InterruptedException
          {
	       System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       Reporter.log("Browser launched", true);
	       driver.manage().window().maximize();
	       Reporter.log("Browser maximised", true);
	       driver.get("https://www.instagram.com");
	       Reporter.log("Url entered", true);
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("input[name='username']")).sendKeys("lavi2912@gmail.com");
	       Thread.sleep(2000);
          }

}
