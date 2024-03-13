package SelPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handledropdowns {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.sugarcrm.com/au/request-demo/");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]")).click();
     Thread.sleep(5000);
     WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"how-select\"]"));
     Select s=new Select(dropdown);
     s.selectByValue("YouTube");
     s.selectByIndex(1);
     List<WebElement> opts=s.getOptions();
     int count=opts.size();
     System.out.println(count);
     for(WebElement op:opts)
     {
    	 String opText=op.getText();
    	 System.out.println(opText);
     }
     boolean b=s.isMultiple();
     if(b)
     {
    	 System.out.println("multi select dropdown");
     }
     else
     {
    	 System.out.println("not multi select dropdown");
     }
	}

}
