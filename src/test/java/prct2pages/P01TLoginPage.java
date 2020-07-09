package prct2pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class P01TLoginPage 
{
	public WebDriver driver;
    //Elements of page considering as properties(annotated property) of this class
   @FindBy(how=How.NAME, using="userName")
   public WebElement txt_uname;
   
   @FindBy(how=How.NAME, using="pass")
   public WebElement txt_pwd;
   
   @FindBy(how=How.XPATH, using="//input[@value='Submit']")
   public WebElement btn_submit;
   
   @FindBy(how=How.XPATH, using="//a[text()='Forgot password?']")
   public WebElement link_forgot_pw;
   
   @FindBy(how=How.XPATH, using="//a[text()='Get Android App']")
   public WebElement link_get_android;
   
   @FindBy(how=How.XPATH, using="//a[text()='customercare@octobiz.in']")
   public WebElement link_customer_care;
    //assign created driver object to current class driver object to work on page in browser
   public P01TLoginPage(WebDriver driver)
   {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
   }
   //operational methods 
   public void uname_fill(String x)
   {
	   txt_uname.sendKeys(x);
   }
   
   public void pw_fill(String y)
   {
	   txt_pwd.sendKeys(y);
   }
   
   public void submit_click()
   {
	   btn_submit.click();
   }
   
   public String alert_message()
   {
	  String str= driver.switchTo().alert().getText();
	  driver.switchTo().alert().accept();
	  return str;
   }
   
   public void forgot_click()
   {
	   link_forgot_pw.click(); 
   }
   public void androd_click()
   {
	   link_get_android.click(); 
   }
   
   
   
	   
	   
}
