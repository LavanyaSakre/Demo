package Testng_practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runner2 extends GenericScript {
	@Test
	public void demo()
	{
		String title=driver.getTitle();
		System.out.println(title);
		//Assert.assertTrue(title.contains("Facebook"));
		Assert.fail();
		System.out.println("TC pass");
		
	}

}
