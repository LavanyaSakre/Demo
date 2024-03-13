package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class FB_dd {
     @Test
     public void dd_sort()
	 {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		WebElement month_dd = driver.findElement(By.id("month"));
		Select s2=new Select(month_dd);
		List<WebElement> opts = s2.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement opt:opts)
		{
		String txt = opt.getText();
		l.add(txt);
		Collections.sort(l);         //sort in ascending order
		}
		String arr_list = l.toString();  //reporter.log will not accept collection type variable so convert to string
		Reporter.log(arr_list,true);
		for(String month_asec:l)     //fetch the array element one by one in the form of string
		{
			Reporter.log(month_asec,true);
		}
		Collections.sort(l, Collections.reverseOrder()); //descending order
		Reporter.log(arr_list,true);
		for(String month_dsec:l)
		{
			Reporter.log(month_dsec,true);
		}
		TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
		for(WebElement opt:opts)
		{
		String txt = opt.getText();
		t.add(txt);
		}
		String ts = t.toString();
	    Reporter.log(ts,true);
	}

}
