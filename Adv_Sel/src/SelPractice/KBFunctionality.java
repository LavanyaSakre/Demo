package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KBFunctionality {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com");
     WebElement ele=driver.findElement(By.xpath("//input[@id=\"email\"]"));
     ele.sendKeys("lavanya");
     Thread.sleep(2000);
     ele.sendKeys(Keys.CONTROL+"a");
     Thread.sleep(2000);
     ele.sendKeys(Keys.DELETE);
     
	}

}
