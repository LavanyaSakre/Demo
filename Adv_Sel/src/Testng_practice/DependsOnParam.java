package Testng_practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnParam {
     @Test
     public void compose()
    {
		Reporter.log("message is created",true);

	}
     @Test(dependsOnMethods = "compose")
     public void sentItems()
     {
    	 Reporter.log("message is sent",true);
    	 Assert.fail();
     }
     @Test(dependsOnMethods = "sentItems")
     public void trash()
     {
    	 Reporter.log("message is deleted",true);
     }

}
