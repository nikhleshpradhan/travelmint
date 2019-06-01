package com.travelmint.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.travelmint.Utilities.Logs;

public class baseone {
	
	public static WebDriver driver;
	public  WebDriver getChromeDriver(){
		System.setProperty("webdriver.chrome.driver","\\TravelMint\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");

		driver=  new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;

		}
		


		

public   Properties getpr()
{
	Properties pr = null;
	try
	{
 

  File f = new File ("\\TravelMint\\src\\com\\travelmint\\Object\\OR.properties");
 FileInputStream fi = new FileInputStream(f);
 pr = new Properties();
  pr.load(fi);

	
    Logs.takeLogs("BaseClass", "Repository get logged successfully");
	}
catch(Exception e)
	{
	Logs.takeLogs("BaseClass", "Repository Load fail");   
	}
	return pr;
	
	
}
}
	
//	public ChromeDriver driver;
//	public Properties pr;
//		
//		@BeforeTest()
//		
//		public void openBrowser() throws Exception
//		{
//		
//			System.setProperty("webdriver.chrome.driver","\\TravelMint\\chromedriver.exe");
//	try
//			{
//		WebDriver	driver= new ChromeDriver();
//			   	driver.manage().window().maximize();
//			   	driver.get("http://travelmint.software/"); 
//	            Thread.sleep(10000);
//	            
//	            Logs.takeLogs("BaseClass", "TravelMint Login page open");
//			}
//			
//	catch(Exception e)
//	
//			{
//				Logs.takeLogs("Baseone", "Base Class Fail");
//				
//			}
//		   	
//	try
//			{
//		 
//		
//		  File f = new File ("\\TravelMint\\src\\com\\travelmint\\Object\\OR.properties");
//		  FileInputStream fi = new FileInputStream(f);
//		  pr = new Properties();
//		  pr.load(fi);
//		  
//		    Logs.takeLogs("BaseClass", "Repository get logged successfully");
//		    
//			}
//	catch(Exception e)
//	
//			{
//				Logs.takeLogs("BaseClass", "Repository Load fail");   
//				
//			}
//
//		   	
//}

