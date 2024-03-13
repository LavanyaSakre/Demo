package SelPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroweser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://skpatro.github.io/demo/links/");
		  driver.findElement(By.xpath("//input[@name=\"NewWindow\"]")).click();
		  String pid = driver.getWindowHandle();
		  Set<String> all_id = driver.getWindowHandles();
		  int count = all_id.size();
		  System.out.println(count);
		  for(String id:all_id)
		  {
			  driver.switchTo().window(id);
			  driver.manage().window().maximize();
			  String title = driver.getTitle();
			  System.out.println(title);
			  if(id.equals(pid))
			  {
			  driver.close();
			  }
		  }
	}

}
