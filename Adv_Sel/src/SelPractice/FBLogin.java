package SelPractice;

import org.testng.annotations.Test;

public class FBLogin extends Generic_Class {
@Test
public void fblogin() throws InterruptedException {
	POM p=new POM(driver);
	p.email();
	p.pass();
	p.login();
	Thread.sleep(2000);
	driver.navigate().refresh();
	p.login();
}
}
