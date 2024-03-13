package SelPractice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Gen_photo
{
	public static void get_photo(WebDriver driver) throws IOException
	{
		Date d=new Date();
		String d1 = d.toString();
		String da = d1.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File tmp = ts.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./Screenshot/"+da+".jpeg");
		try
		{
		FileUtils.copyFile(tmp, pmt);
		}
		catch(IOException e)
		{
			System.out.println("photo not captured");
			e.printStackTrace();
		}
		
		
	}
}
public class Generic_Ts {

	public static void main(String[] args) throws IOException {
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     Gen_photo.get_photo(driver);
     driver.get("https://www.facebook.com");
     Gen_photo.get_photo(driver);
     
     
	}

}
