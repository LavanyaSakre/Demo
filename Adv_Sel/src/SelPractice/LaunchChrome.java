package SelPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
	}

}
