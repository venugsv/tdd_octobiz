package prct2pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class P03BusPage 
{
	public WebDriver driver;
    
	   
	   @FindBy(how=How.XPATH, using="//a[text()='Bus']")
	   public WebElement mdl_bus;
	      
	   @FindAll(@FindBy(how=How.XPATH, using="(//ul)[7]/li"))
	   public List <WebElement> list_source;
	   	
	   @FindBy(how=How.XPATH, using="//input[@placeholder='Destination']")
	   public WebElement list_destination;
	   
	   @FindBy(how=How.XPATH, using="//input[@id='bus_city_o']")
	   public WebElement txt_source;
	   
	   @FindBy(how=How.XPATH, using="//input[@id='bus_city_d']")
	   public WebElement txt_dest;
	   
	 
	   @FindBy(how=How.XPATH, using="//input[@id='departing']")
	   public WebElement calender_depart;
	   
	   @FindBy(how=How.XPATH, using = "(//table)[2]/tbody/tr")
	   public List<WebElement> rowWeeks;

	   
	   @FindBy(how=How.XPATH, using = "(//table)[2]/tbody/tr/td")
	   public List<WebElement> colDays;
	   	   
	   @FindBy(how=How.XPATH, using="//input[@id='submitbutton'and @value='Search Bus']")
	   public WebElement btn_search_bus;
	   
	   
	   @FindBy(how=How.XPATH, using="")
	   public WebElement lbl_error_msg;

	   
	  public P03BusPage(WebDriver driver)
	  {
		this.driver  = driver;
		PageFactory.initElements(driver, this);
	  
	  }
	  public void fill_source(String src) throws Exception
	  {
		 
		  int flog=0;
		  
		  txt_source.sendKeys(src); 
		  Actions a = new Actions(driver);
		   List<WebElement> li=  list_source;
		   
		  // list_source.
		   for(WebElement e:li)
		   {
			   System.out.println("selected city----"+e.getText());
			   
			   if(src.equalsIgnoreCase(e.getText()))
			   {
				   flog=1;
				  e.click();
				 //  a.click(e);
				   System.out.println("selected city"+e.getText());
			       break;
			   }
			  
		   }
		   if(flog==0)
		   {
			   System.out.println("invalid source city: please Enter correct source city");
			   //System.exit(flog);
		   }
		   Thread.sleep(2000);
	  }
	  public void fill_dest(String dest) throws Exception
	  {
		 
		  int flog=0;
		  txt_dest.sendKeys(dest); 
		   List<WebElement> li=  list_source;
		   
		  // list_source.
		   for(WebElement e:li)
		   {
			   System.out.println("selected city----"+e.getText());
			   
			   if(dest.equalsIgnoreCase(e.getText()))
			   {
				   flog=1;
				  e.click();
				 //  a.click(e);
				   System.out.println("selected city"+e.getText());
			       break;
			   }
			  
		   }
		   if(flog==0)
		   {
			   System.out.println("invalid source city: please Enter correct source city");
			   //System.exit(flog);
		   }
		   Thread.sleep(2000);
	  } 
	  
	  public void datePicker(String expected) throws Exception
	  {
		  calender_depart.click();
		  int rowWeek=rowWeeks.size();
		  int colDay=colDays.size();
		  for(int i=0;i<=rowWeek;i++) 
		  {
			  for(int j=0;j<colDay;j++)
			  {
				  String actual=colDays.get(j).getText();
				  System.out.println(actual);
				  if(expected.toLowerCase().contains(actual))
				  {
					  colDays.get(j).click();
					  Thread.sleep(3000);
					  break;
				  }
			  }
		  }
	   
	  
	  }
	  
	  public String dateFilled(String expDate)
	  {
	   return calender_depart.getText();
	  }
	  
}
