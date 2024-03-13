package Paral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void exec(String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
		else
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
		}
	}
	

}
