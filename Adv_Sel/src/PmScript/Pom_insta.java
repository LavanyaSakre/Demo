package PmScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Pom_insta
{
 @FindBy(name="q")
 private WebElement search;
 
 @FindBy(xpath="//div[.='SAMSUNG']")
 private WebElement samsung;
 
 @FindBy(xpath="//div[.='SAMSUNG Galaxy F14 5G (OMG Black, 128 GB)']")
  private WebElement fst_sug;
 
 @FindBy(xpath="//button[text()='Add to cart']")
 private WebElement add;
 
 public Pom_insta(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void srch()
 {
	 search.sendKeys("mobiles");
 }
 public void smsg()
 {
	 samsung.click();
 }
 public void fstsug()
 {
	 fst_sug.click();
 }
 public void addcart()
 {
	 add.click();
 }

}
