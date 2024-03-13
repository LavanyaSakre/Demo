package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElements {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com");
	     List<WebElement> links=driver.findElements(By.xpath("//a"));
	     int count=links.size();
	     System.out.println(count);
	     for(WebElement we:links)
	     {
	    	String linktext= we.getText();
	    	System.out.println(linktext);
	     }
	     for(int i=count-1;i>=0;i--)
	     {
	    	 WebElement we=links.get(i);
	    	 String linktext=we.getText();
	    	 System.out.println(linktext);
	     }
	}

}
