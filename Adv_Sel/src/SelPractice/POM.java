package SelPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM {
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement login;
	public POM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void email()
	{
		email.sendKeys("asdfg");
	}
	public void pass()
	{
		pwd.sendKeys("Dl");
	}
	public void login()
	{
		login.click();
	}

}
