package Testng_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_param
{
 @Test(priority = 1)
 public void test1()
 {
	 Reporter.log("Asia",true);
 }
 @Test(enabled = false)
 public void test2()
 {
	 Reporter.log("Asia",true);
 }
 @Test(invocationCount = 3)
 public void test3()
 {
	 Reporter.log("India",true);
 }
}
