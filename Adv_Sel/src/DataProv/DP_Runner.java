package DataProv;

import org.testng.annotations.Test;

public class DP_Runner 
{
 @Test(dataProvider="loginCredential",dataProviderClass=DataProv_Ex.class)
 public void loginTest(String un,String pwd)
 {
	 System.out.println(un+ " "+pwd);
 }
}
