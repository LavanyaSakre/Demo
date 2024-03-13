package Listen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listen_Runner 
{
  @Test
  public void compose()
  {
	  System.out.println("message composed");
  }
  @Test
  public void sentItems()
  {
	  System.out.println("message sent");
	  Assert.fail();
  }
  @Test(dependsOnMethods = "sentItems")
  public void trash()
  {
	  System.out.println("message deleted");
  }
}
