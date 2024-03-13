package DDT_concept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

class Generic
{
	public static void get_photo_Element(WebElement ele,String txt)
	{
		 File tmp = ele.getScreenshotAs(OutputType.FILE);
	     File pmt=new File("./Screenshot/"+txt+".jpeg");
	     try
	     {
	     FileHandler.copy(tmp, pmt);
	     }
	     catch(IOException e)
	     {
	    	 System.out.println("captured");
	    	 e.printStackTrace();
	     }
	}
}
public class Gen_screenshot_element {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.facebook.com");
	     WebElement ele=driver.findElement(By.id("email"));
	     Generic.get_photo_Element(ele, "username");
	}

}
