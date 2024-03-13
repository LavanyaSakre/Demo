package Popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("file:///C:/Users/HP/Desktop/Fileupload.html");
	     driver.findElement(By.id("file"));
	     Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\Autoit\\Up_popup.exe");
	     Thread.sleep(5000);
	     driver.close();
	}

}
