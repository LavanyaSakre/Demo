package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/DD.html");
		WebElement dd = driver.findElement(By.id("Menu"));
		Select s=new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("d");
		Thread.sleep(1000);
		s.selectByVisibleText("Pizza");
		Thread.sleep(1000);
		s.deselectByIndex(1);
		Thread.sleep(1000);
		s.deselectByValue("d");
		Thread.sleep(1000);
		s.deselectByVisibleText("Pizza");
		Thread.sleep(1000);
		List<WebElement> opts = s.getOptions();
		int count=opts.size();
		System.out.println(count);
		for(WebElement opt:opts) 
		{
			String txt = opt.getText();
			System.out.println(txt);
		}
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("it is Multi select DD");
		}
		else
		{
			System.out.println("it is single select DD");
		}
		
	}

}
