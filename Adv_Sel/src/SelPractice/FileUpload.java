package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  Thread.sleep(2000);
	  WebElement ele= driver.findElement(By.xpath("//input[@id=\"myFile\"]"));
	  ele.sendKeys("C:\\Users\\HP\\Downloads\\Lavanya_MCA_2021 (1).pdf");
	 
  }
}
