package Popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windo_noti {

	public static void main(String[] args) throws IOException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://the-internet.herokuapp.com/");
     driver.findElement(By.linkText("Basic Auth")).click();
     Runtime.getRuntime().exec("C:/Users/HP/Desktop/Autoit/Window_noti.exe");
    
	}

}
