package gen_pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Gen1 implements Framework_constants
{
@Test
public void test()
{
 System.setProperty(chrome_key, chrome_value);
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.facebook.com");
 System.setProperty(gecko_key, gecko_value);
 WebDriver driver1=new FirefoxDriver();
 driver1.manage().window().maximize();
 driver1.get("https://www.facebook.com");
}
}
