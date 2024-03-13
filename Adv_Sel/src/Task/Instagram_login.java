package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_login {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.instagram.com");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[name='username']")).sendKeys("lavi2912@gmail.com");
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Daya@12");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='Log in']")).click();
       Thread.sleep(8000);
       driver.findElement(By.xpath("(//span[.='Search'])[2]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("dayananda reddy");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//span[contains(.,'daya')])[1]/../../../..")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@type='button']")).click();
      
       
	}

}
