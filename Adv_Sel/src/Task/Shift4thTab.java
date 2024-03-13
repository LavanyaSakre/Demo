package Task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shift4thTab {

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.selenium.dev/");
			driver.manage().window().maximize();
			
			
			WebElement downloads=driver.findElement(By.xpath("//span[.='Downloads']"));
			Actions act=new Actions(driver);
			act.contextClick(downloads).perform();
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
			
			WebElement Documentation=driver.findElement(By.xpath("//span[.='Documentation']"));
			act.contextClick(Documentation).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
			
			WebElement Projects=driver.findElement(By.xpath("//span[.='Projects']"));
			act.contextClick(Projects).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
			
			Set<String> all_id = driver.getWindowHandles();
			ArrayList<String> arr_id=new ArrayList<String>(all_id);
			String fid = arr_id.get(0);
			driver.switchTo().window(fid);
			String tid = arr_id.get(2);
			driver.switchTo().window(fid);
			Thread.sleep(200);
			driver.switchTo().window(tid);
			
			
				
			
			}

	}


