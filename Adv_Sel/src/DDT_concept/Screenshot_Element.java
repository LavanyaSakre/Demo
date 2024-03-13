package DDT_concept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Element {

	public static void main(String[] args) throws IOException {
     System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
     WebElement ele=driver.findElement(By.id("email"));
     File tmp = ele.getScreenshotAs(OutputType.FILE);
     File pmt=new File("./Screenshot/email.jpeg");
     FileHandler.copy(tmp, pmt);
     driver.close();
	}

}
