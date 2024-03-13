package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner1 {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Pomscript1 p=new Pomscript1(driver);
		Thread.sleep(2000);
		p.username();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.username();
	}

}
