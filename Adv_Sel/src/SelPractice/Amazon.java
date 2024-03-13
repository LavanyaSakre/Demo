package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> links = driver.findElements(By.xpath("(//a)[position() mod 2 = 0]"));
		List<WebElement> imgs = driver.findElements(By.xpath("(//img)[position() mod 2 = 1]"));
		for(WebElement link:links)
		{
			String txt = link.getText();
			System.out.println(txt);
			
		}
		for(WebElement img:imgs)
		{
			String src = img.getAttribute("src");
			System.out.println(src);
		}
		
	}	

}
