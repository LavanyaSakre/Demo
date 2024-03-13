package SelPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
	    Actions act=new Actions(driver);
	    WebElement src=driver.findElement(By.xpath("//div[@id=\"dropContent\"]/div[@id=\"box4\"]"));
	    WebElement dst=driver.findElement(By.xpath("//div[@id=\"dropContent\"]/div[@id=\"box1\"]"));
	    Thread.sleep(2000);
	    act.dragAndDrop(src,dst).perform();
	    Thread.sleep(2000);
	}

}
