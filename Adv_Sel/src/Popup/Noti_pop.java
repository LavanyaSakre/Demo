package Popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noti_pop {

		public static void main(String[] args) throws IOException {
		     System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.redbus.com");
		     Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Autoit\\Redbusnoti.exe");
		     driver.close();
		    
			}

	}


