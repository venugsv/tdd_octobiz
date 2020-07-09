package prct1utiliy;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyUtility 

{
	WebDriver driver;
	public WebDriver openBrowser(String bn)
	{
		
		if(bn.equalsIgnoreCase("chrome"))
		{
            
			System.setProperty("webdriver.chrome.driver", "E:\\batch244\\chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
           return driver;
	
	}
	public void launch_site(String url)
	{
		driver.get(url);
	}
   
	public void close_site()
	{
		driver.quit();
	
	}
	public String screenshot() throws Exception
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yyyy-hh-mm-ss");
		Date dt=new Date();
		String fn=sf.format(dt)+".png";
		File src=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(fn);
		FileHandler.copy(src,dest);
		return(dest.getAbsolutePath());
	}

	public void getshot() throws Exception
	{
		Robot bot= new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r=new Rectangle(d);
		BufferedImage bi=bot.createScreenCapture(r);
		ImageIO.write(bi, "jpg",new File("E:\\new eclipse\\tdd_single_octobiz\\venuimg.jpg"));
	//return bi.toString();
		
	}
	
}
