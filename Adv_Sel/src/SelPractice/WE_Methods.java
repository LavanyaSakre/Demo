package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE_Methods {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com");
     WebElement ele=driver.findElement(By.xpath("//input[@name=\"email\"]"));
     ele.sendKeys("lavanya");
     Thread.sleep(5000);
     Point p=new Point(200,300);
     driver.manage().window().setPosition(p);
     //Dimension d=new Dimension(200,300);
     //driver.manage().window().setSize(d);
     //ele.clear();
     ele.sendKeys(Keys.CONTROL+"a");
     ele.sendKeys(Keys.DELETE);
     String attrValue=ele.getAttribute("name");
     System.out.println(attrValue);
     String fosize = ele.getCssValue("font-size");
     System.out.println(fosize);
     String tag=ele.getTagName();
     System.out.println(tag);
     boolean displayed  = ele.isDisplayed();
     if(displayed)
     {
    	 System.out.println("Ele is displayed");
     }
     else
     {
    	 System.out.println("ele not displayed");
     }
     boolean enabled  = ele.isEnabled();
     if(enabled)
     {
    	 System.out.println("Ele is enabled");
     }
     else
     {
    	 System.out.println("ele not enabled");
     }
     WebElement link=driver.findElement(By.xpath("//a[.=\"Forgotten password?\"]"));
     String text=link.getText();
     System.out.println(text);
     String fsize = link.getCssValue("font-size");
     System.out.println(fsize);
     Point loc=link.getLocation();
     System.out.println(loc);
     int x=loc.getX();
     System.out.println(x);
     int y=loc.getY();
     System.out.println(y);
    // link.click();
     //link.sendKeys(Keys.ENTER);
     WebElement button = driver.findElement(By.xpath("//a[.=\"Create new account\"]"));
     String size=button.getCssValue("line-height");
     System.out.println(size);
     driver.close();
     
	}

}
