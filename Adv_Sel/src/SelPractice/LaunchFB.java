package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LaunchFB extends Generic_Class {
@Test
public void login() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("lavanyasakre2912@gmail.com");
    driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Dl@091297");
    WebElement btn=driver.findElement(By.xpath("//button[@name=\"login\"]"));
    btn.click();
    Thread.sleep(2000);
   driver.navigate().refresh();
   Thread.sleep(2000);
   btn.click();
    
}
}
