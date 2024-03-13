package SelPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChromeNFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver1=new ChromeDriver();
	}

}

