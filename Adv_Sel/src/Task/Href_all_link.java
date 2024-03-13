package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Href_all_link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.xpath("(//a) [position() mod 2 =0 ]"));
		int count = links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link=links.get(i);
			Thread.sleep(1000);
			String href_val = link.getAttribute("href");
			System.out.println(href_val);
			
		}
		System.out.println(count+ " " +  "links are present in facebook page");
	}

}
