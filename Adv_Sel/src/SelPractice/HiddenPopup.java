package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup 
{
  public static void main(String[]args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.cleartrip.com/flights");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()=\"Sat, Jan 6\"]/..")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()=\"10\"]")).click();
  }
}
