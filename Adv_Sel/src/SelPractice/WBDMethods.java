package SelPractice;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WBDMethods {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String CURL=driver.getCurrentUrl();
		System.out.println(CURL);
		String title=driver.getTitle();
		System.out.println(title);
		String id=driver.getWindowHandle();
		System.out.println(id);
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);
		driver.close();
		
		
	}

}
