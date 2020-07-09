package prct2pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class P02HomePage {
	
	public WebDriver driver;
      
	   
	   @FindBy(how=How.XPATH, using="//a[text()='Recharge']")
	   public WebElement mdl_recharge;
	
	   @FindBy(how=How.XPATH, using="//p[text()='DTH']")
	   public WebElement s_mdl_dth;
	   
	   @FindBy(how=How.XPATH, using="//select[@name='OperatorDTH']")
	   public WebElement drp_dth_operator;
	   
	   /*@FindAll({@FindBy(how=How.XPATH, using="(//select[@name='OperatorDTH'])/option")})
	   public List<WebElement> dth_operator;*/
	   
	   @FindBy(how=How.XPATH, using="//input[@name='amountDTH']")
	   public WebElement txt_amount;
	   
	   @FindBy(how=How.XPATH, using="//input[@name='DTHNo']")
	         
	   public WebElement txt_dth_ac_n;
	
	   @FindBy(how=How.XPATH, using="//input[@id='img_btn2']")
	   public WebElement btn_dth_submit;

	   @FindBy(how=How.XPATH, using="//div[contains(text(),'Unknown Error')]")
	   public WebElement lbl_error_msg;

	   public P02HomePage(WebDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	   
	   }
	   public String getTitle()
	   {
		   return driver.getTitle();
	   }
	   public void click_dth() throws Exception
	   {
		   s_mdl_dth.click();
		   Thread.sleep(2000);
	   }
	   public void select_option(String option_value) throws Exception
	   {
		   int flog=0;
		   drp_dth_operator.click();
		   Select s= new Select(drp_dth_operator);
		   List<WebElement> li=  s.getOptions();
		   for(WebElement e:li)
		   {
			   
			   if(option_value.contains(e.getText()))
			   {
				   flog=1;
				   e.click();
			       break;
			   }
			  
		   }
		   if(flog==0)
		   {
			   System.out.println("invalid operator: please Select correct dth operator value");
			   //System.exit(flog);
		   }
		   Thread.sleep(2000);
	   }
	   public void fill_amount(String amt) throws Exception
	   {
		   
		   txt_amount.sendKeys(amt);
		   //Thread.sleep(2000);
	   }
	   public void fill_ac_no(String acno) throws Exception
	   {
		   txt_dth_ac_n.sendKeys(acno);
		   //Thread.sleep(2000);
	   }
	   public void submit_dth() throws Exception
	   {
		   btn_dth_submit.click();
		   Thread.sleep(2000);
	   }
	   public String display_error_msg()
	   {
		  return lbl_error_msg.getText();
	   }
	   public String alert_error_msg()
	   {
		  return driver.switchTo().alert().getText();
	   }
}
