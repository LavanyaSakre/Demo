package SelPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TngDemo1 {
	@Test
	public void test1()
	{
		Reporter.log("hii",false);
	}
	@Test(invocationCount=3)
	public void test2()
	{
		Reporter.log("hello",true);
	}
	

}
