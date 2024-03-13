package JSExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notiication");
	      WebDriver driver=new ChromeDriver(opt);
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	      driver.get("https://www.amazon.in");
	      Thread.sleep(2000);
	      WebElement ele = driver.findElement(By.xpath("//div[.='Get to Know Us']"));
	      Thread.sleep(2000);
	      JavascriptExecutor js=(JavascriptExecutor) driver;
	      Thread.sleep(2000);
	      js.executeScript("arguments[0].scrollIntoView()",ele);
	}

}
