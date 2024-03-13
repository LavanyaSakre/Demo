package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	     driver.findElement(By.xpath("//li[.='iFrame']")).click();
	     List<WebElement> frame=driver.findElements(By.xpath("/iframe"));
	     int count=frame.size();
	     System.out.println(count);
	     
	}

}
