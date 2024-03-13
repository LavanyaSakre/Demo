package SelPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	      driver.get("https://www.letskodeit.com/practice");
	      JavascriptExecutor js=(JavascriptExecutor) driver;
	      for(int i=0;i<2;i++)
	      {
	      js.executeScript("window.scrollBy(0,500)");
	      }
	      driver.findElement(By.xpath("//input[@id=\"disabled-button\"]")).click();
	      Thread.sleep(2000);
	      //driver.findElement(By.xpath("//input[@id=\"enabled-example-input\"]")).sendKeys("lavanya");
	      js.executeScript("document.getElementById('enabled-example-input').value='lavanya'");
	      Thread.sleep(2000);
	      js.executeScript("document.getElementById('enabled-example-input').value=''");

	}

}
