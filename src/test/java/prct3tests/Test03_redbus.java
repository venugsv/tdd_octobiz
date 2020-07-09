package prct3tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import prct1utiliy.MyUtility;
import prct2pages.P01TLoginPage;





public class Test03_redbus
{
	public WebDriver driver;
	public MyUtility u;
	public P01TLoginPage p01;
	public Properties p;
	
	@BeforeMethod
	public void method()throws Exception
	{
		
		File f = new File("E:\\new eclipse\\bdd_single_glue\\src\\test\\resources\\properties\\geturl.properties");
		FileReader fr = new FileReader(f);
		p=new Properties();
		p.load(fr);
		u= new MyUtility();
		
		p01 =new P01TLoginPage(driver) ;

	}

	@Test(priority=1)
	@Parameters("bn")
	public void method1(String bn)
	{
		
		driver=u.openBrowser(bn);
	u.launch_site(p.getProperty("url"));


	
	}
	
	@Test(priority=2)
	@Parameters({"uname", "pwd", "almsg"})
	
	public void method2(String un,String pw, String al) throws Exception
	{
		p01.uname_fill(un);
		p01.pw_fill(pw);
		p01.submit_click();
		
		String str=p01.alert_message();
		
		if(str.contains(al))
		{
			System.out.println("alert message validated correctly");
			Reporter.log("alert validated");
		}
		else
		{
			System.out.println("alert message validated not correctly");
			Reporter.log("alert not validated");
			u.getshot();
			//System.out.println(pic);
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
