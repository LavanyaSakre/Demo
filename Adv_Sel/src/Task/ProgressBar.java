package Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgressBar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter time in seconds\"]")).sendKeys("10");
		driver.findElement(By.xpath("//button[.='Start']")).click();
		WebElement dd = driver.findElement(By.xpath("//p[.='Do you like Automation']/../select"));
		Select s=new Select(dd);
		s.selectByValue("yes");
	}

}
