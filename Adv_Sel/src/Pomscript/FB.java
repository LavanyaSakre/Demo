package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB 
{
	@FindBy(id="email")
	private WebElement uname;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement lgn;
	
	public FB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void username(String un)
	 {
		 uname.sendKeys(un);
	 }
	 public void pass(String pd)
	 {
		 pwd.sendKeys(pd);
	 }
	 public void login()
	 {
		 lgn.click();
	 }

}
