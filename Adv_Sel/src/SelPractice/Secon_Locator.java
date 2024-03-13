package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secon_Locator {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("C:\\Users\\HP\\Desktop\\Screenshot_TC\\locator.html");
	      driver.findElement(By.id("face")).click();
	}

}
