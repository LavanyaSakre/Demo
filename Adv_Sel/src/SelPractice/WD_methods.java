package SelPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WD_methods {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
     Thread.sleep(2000);
     String title = driver.getTitle();
     System.out.println(title);
     Thread.sleep(2000);
     String url=driver.getCurrentUrl();
     System.out.println(url);
     Thread.sleep(2000);
     String psrc=driver.getPageSource();
     System.out.println(psrc);
     Thread.sleep(2000);
     driver.navigate().to("https://www.youtube.com");
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     Thread.sleep(2000);
     driver.quit();
     
	}

}
