package DataProv;

import org.testng.annotations.DataProvider;

public class DataProv_Ex 
{
 @DataProvider(name="loginCredential")
 public Object[][] getData()
 {
	 Object[][] data= {{"lavi@gmail,com","123"},{"pooja@gmail.com","456"},{"madhu@gmail.com","789"}};
	 return data;
 }
}
