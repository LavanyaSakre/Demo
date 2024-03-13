package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeVid {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.youtube.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//span[.='Sign in'])[1]/../..")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("lavanyasakre2912@gmail.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[.='Next']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("1234");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("input[id='search']")).sendKeys("KGF song");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("(//div[.='Share'])[3]/../../../..//button[@title='I like this']")).click();
	       Thread.sleep(2000);
	       //driver.findElement(By.xpath("(//span[.='Sign in'])[2]")).click();
	       }

}
