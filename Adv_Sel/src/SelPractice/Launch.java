package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com");
     driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("aaaa");
     driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("Dl@");
     WebElement btn=driver.findElement(By.xpath("//button[@name=\"login\"]"));
     btn.click();
     Thread.sleep(2000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    btn.click();
	}

}
