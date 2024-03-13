package Task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sort_ddopt {
     @Test
     public void sort_dd()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		WebElement month_dd = driver.findElement(By.id("month"));
		Select s=new Select(month_dd);
		List<WebElement> opts = s.getOptions();
		for(WebElement opt:opts)
		{
		String txt = opt.getText();
		Reporter.log(txt,true);
	    }
		
  }

}
