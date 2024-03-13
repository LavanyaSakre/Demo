package group1;

import org.testng.annotations.Test;

@Test(groups= {"g1"})
public class Demo1 
{
  @Test
  public void test1()
  {
	  System.out.println("hello world");
  }
}
