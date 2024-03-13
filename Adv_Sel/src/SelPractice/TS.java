package SelPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class TS {

	public static void main(String[] args) throws IOException, InterruptedException {
      System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
      driver.get("https://www.youtube.com");
      driver.manage().window().maximize();
      TakesScreenshot ts=(TakesScreenshot) driver;
      File src=ts.getScreenshotAs(OutputType.FILE);
      File dst=new File("C:\\Users\\HP\\Desktop\\Screenshot_TC\\FB.jpeg");
      FileUtils.copyFile(src,dst);
      JavascriptExecutor js=(JavascriptExecutor) driver;
      for(int i=0;i<2;i++)
      {
      js.executeScript("window.scrollBy(0,500)");
      }
      driver.close();
      
	}	

}
