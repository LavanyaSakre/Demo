package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/HP/Desktop/Task.html");
	      Thread.sleep(2000);
	      driver.findElement(By.id("i2")).sendKeys("XYZ");
	      WebElement ele = driver.findElement(By.id("i1"));
	      Thread.sleep(2000);
	      ele.clear();
	      Thread.sleep(2000);
	      ele.sendKeys("Manager");
	      Thread.sleep(2000);
	      driver.findElement(By.id("i3")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("n1")).click();
	}

}
