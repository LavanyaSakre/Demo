package Testng_practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1 extends GenericScript{
	@Test
	public void login() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("lavanya");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	@Test
	public void login1()
	{
		driver.findElement(By.id("email")).sendKeys("lavanya");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).click();
	}

}
