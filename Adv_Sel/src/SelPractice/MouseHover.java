package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.flipkart.com/");
	    Actions act=new Actions(driver);
	    WebElement ele=driver.findElement(By.xpath("//span[text()=\"Fashion\"]/.."));
	    act.moveToElement(ele).perform();
	    Thread.sleep(2000);
	    WebElement src=driver.findElement(By.xpath("//div[text()=\"Best of Electronics\"]"));
	    WebElement dst=driver.findElement(By.xpath("//div[contains(text(),\"Beauty\")]"));
	    act.moveToElement(src).perform();
	    act.dragAndDrop(src,dst).perform();
	    Thread.sleep(2000);
	    
	}

}
