package SelPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RB {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.google.com");
	     WebElement ele=driver.findElement(By.xpath("//a[.=\"ಕನ್ನಡ\"]"));
	     Actions act=new Actions(driver);
	     act.contextClick(ele).perform();
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_T);
	     r.keyRelease(KeyEvent.VK_T);
	     Set<String> all_id=driver.getWindowHandles();
	     int count=all_id.size();
	     System.out.println(count );
	     for(String id:all_id)
	     {
	     driver.switchTo().window(id);
	     }
	}

}
