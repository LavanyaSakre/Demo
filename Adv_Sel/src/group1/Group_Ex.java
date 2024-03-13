package group1;

import org.testng.annotations.Test;

public class Group_Ex 
{
  @Test(groups= {"sanity"})
  public void test1()
  {
	 System.out.println("Hello india"); 
  }
  @Test(groups= {"sanity","regression"})
  public void test2()
  {
	 System.out.println("Hello asia"); 
  }
  @Test(groups= {"regression"})
  public void test3()
  {
	 System.out.println("Hello world"); 
  }
}
