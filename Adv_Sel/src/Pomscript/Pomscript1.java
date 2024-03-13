package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomscript1 {
	@FindBy(id = "email")
	private WebElement unmae;

	public Pomscript1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void username() {
		unmae.sendKeys("selenium");
	}
}