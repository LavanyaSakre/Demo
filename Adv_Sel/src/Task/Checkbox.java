package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/checkbox.html");
		List<WebElement> cbox = driver.findElements(By.xpath("//input"));
		int count = cbox.size();
		for(WebElement box:cbox)
		{
			Thread.sleep(2000);
	     box.click();
		}
		for(int i=count-1;i>=0;i--)
		{
		 WebElement box = cbox.get(i);
		 Thread.sleep(1000);
		 box.click();
		}
	}

}
