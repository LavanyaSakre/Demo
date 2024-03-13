package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Locators {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("C:\\Users\\HP\\Desktop\\Screenshot_TC\\locator.html");
      driver.findElement(By.tagName("a")).click();
      
	}

}
