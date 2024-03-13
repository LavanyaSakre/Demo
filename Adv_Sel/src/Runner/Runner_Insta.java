package Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.testng.annotations.Test;

import PmScript.Pom_insta;
import TNG_Generic.Generic_Insta;

public class Runner_Insta extends Generic_Insta 
{
  @Test
  public void insta_login() throws InterruptedException, AWTException
  {
	 Pom_insta pi=new Pom_insta(driver);
	 pi.srch();
	 Thread.sleep(2000);
	 Robot r=new Robot();
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 Thread.sleep(2000);
	 pi.smsg();
	 Thread.sleep(2000);
	 pi.fstsug();
	 Thread.sleep(2000);
	 Set<String> all_id = driver.getWindowHandles();
	 for(String id:all_id)
	 {
	 driver.switchTo().window(id);
	 }
	 pi.addcart();
	 Thread.sleep(2000);
  }
}
