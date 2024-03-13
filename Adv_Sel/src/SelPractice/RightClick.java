package SelPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    Actions act=new Actions(driver);
	    WebElement ele=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
	    act.contextClick(ele).perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()=\"Edit\"]")).click();
	    Alert a=driver.switchTo().alert();
	    String popupText=a.getText();
	    System.out.println(popupText);
	    Thread.sleep(2000);
	    //a.accept();
	    a.dismiss();
	   
	}

}
