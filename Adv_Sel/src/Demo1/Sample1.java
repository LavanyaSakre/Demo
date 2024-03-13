package Demo1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
  public void hi()
  {
    Reporter.log("hi",true);
  }

}
