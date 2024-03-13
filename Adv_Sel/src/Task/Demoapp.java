package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapp {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      Thread.sleep(2000);
      driver.get("https://demoapps.qspiders.com/ui?scenario=1");
      Thread.sleep(2000);
      driver.findElement(By.id("name")).sendKeys("Lavanya");
      Thread.sleep(2000);
      driver.findElement(By.id("email")).sendKeys("lavanyasakre2912@gmail.com");
      Thread.sleep(2000);
      WebElement pwd = driver.findElement(By.name("password"));
      pwd.sendKeys("1234");
      Thread.sleep(2000);
      pwd.sendKeys(Keys.CONTROL+"a");
      pwd.sendKeys(Keys.DELETE);
      Thread.sleep(2000);
      pwd.sendKeys("Dl@091297");
      String pwdvalue = pwd.getAttribute("value");
      System.out.println(pwdvalue);
      
      //driver.findElement(By.xpath("//button[.='Register']")).submit();
      
	}

}
