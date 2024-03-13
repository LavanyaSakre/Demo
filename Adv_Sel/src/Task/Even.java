package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Even {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/HP/Desktop/box.html");
      List<WebElement> even = driver.findElements(By.xpath("(//input)[position() mod 2=1]"));
      for(WebElement even_txt:even)
      {
    	  even_txt.click();
      }
	}

}
