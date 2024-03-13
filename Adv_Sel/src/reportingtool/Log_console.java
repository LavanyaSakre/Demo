package reportingtool;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log_console {
	 @Test
	  public void report() throws IOException
	  {
		  BasicConfigurator.configure();
		  Logger log=Logger.getLogger(this.getClass().getName());
		  log.warn("warning message");
		  log.error("error message");
		  log.info("tc info");
		  
	  }

}
