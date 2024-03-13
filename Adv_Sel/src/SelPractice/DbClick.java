package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DbClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://api.jquery.com/dblclick/");
	    driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
	    Thread.sleep(2000);
	    WebElement ele=driver.findElement(By.xpath("//span[text()=\"Double click the block\"]/preceding-sibling::div"));
	    Thread.sleep(2000);
	    Actions act=new Actions(driver);
	    Thread.sleep(2000);
	    act.doubleClick(ele).perform();
	    Thread.sleep(2000);
	}

}
