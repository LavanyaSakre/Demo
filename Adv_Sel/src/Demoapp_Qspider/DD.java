package Demoapp_Qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DD {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("7894561236");
		Thread.sleep(2000);
		WebElement gender_dd = driver.findElement(By.id("select2"));
		Thread.sleep(2000);
		Select s=new Select(gender_dd);
		Thread.sleep(2000);
		s.selectByValue("female");
		Thread.sleep(2000);
		WebElement country_dd = driver.findElement(By.id("select3"));
		Thread.sleep(2000);
		Select s1=new Select(country_dd);
		Thread.sleep(2000);
		s1.selectByValue("India");
		Thread.sleep(2000);
		WebElement state_dd = driver.findElement(By.id("select5"));
		Thread.sleep(2000);
		Select s2=new Select(state_dd);
		Thread.sleep(2000);
		s2.selectByValue("Karnataka");
		Thread.sleep(2000);
		WebElement city_dd = driver.findElement(By.xpath("//label[.='City']/..//select"));
		Thread.sleep(2000);
		Select s3=new Select(city_dd);
		Thread.sleep(2000);
		s3.selectByVisibleText("Davanagere");
	}

}
