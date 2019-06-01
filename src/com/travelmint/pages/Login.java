package com.travelmint.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.travelmint.Utilities.Logs;
import com.travelmint.base.baseone;

public class Login  {

	baseone DD = new baseone();
	WebDriver driver = DD.getChromeDriver();
        Properties pr = DD.getpr();
     String Expected1 = "http://travelmint.software/dashboard/sale";
     String Expected2=  "http://travelmint.software/dashboard/index";
     String Expected3=  "http://travelmint.software/dashboard/Account";
     String Expected4=  "http://travelmint.software/dashboard/Account";
	public void signinsales(String SecID ,String EmailID , String password,String URL) throws Exception
	{
		try
		{
			
			baseone.driver.get(URL);
			baseone.driver.findElement(By.id(pr.getProperty("SecID"))).sendKeys(SecID); 
			baseone.driver.findElement(By.id(pr.getProperty("EmailID"))).sendKeys(EmailID);
			baseone.driver.findElement(By.name(pr.getProperty("password"))).sendKeys(password);
			baseone.driver.findElement(By.tagName(pr.getProperty("singin"))).click();
		Thread.sleep(5000);
		}
		 
		catch (Exception e)
		
		{
			String a = e.toString();
			 Logs.takeLogs("Login failed ", a);
			
		}
		 if (Expected1.equals(baseone.driver.getCurrentUrl()))
		    {
		    	System.out.println("Sales dashboard login " );
		    
		    	 Logs.takeLogs("Sales Login", "All Element found on login page and sales dasboard is open ");
		    }
		 else 
		 {
			 System.out.println("Check sales users login details ");
		 }
		
	} 
			public void siginoperation(String SecID ,String EmailID , String password,String URL) throws Exception
			{
				try
				{
					
					baseone.driver.get(URL);
					baseone.driver.findElement(By.id(pr.getProperty("SecID"))).sendKeys(SecID); 
					baseone.driver.findElement(By.id(pr.getProperty("EmailID"))).sendKeys(EmailID);
					baseone.driver.findElement(By.name(pr.getProperty("password"))).sendKeys(password);
					baseone.driver.findElement(By.tagName(pr.getProperty("singin"))).click();
				Thread.sleep(5000);
				}
				 
				catch (Exception e)
				
				{
					String a = e.toString();
					 Logs.takeLogs("Login failed ", a);
					
				}
				 if (Expected2.equals(baseone.driver.getCurrentUrl()))
				    {
				    	System.out.println("Operation dashboard login " );
				    
				    	 Logs.takeLogs("Operation User Login", "All Element found on login page and sales dasboard is open ");
				    }
				 else 
				 {
					 System.out.println("Check Operation users login details ");
				 }
				
			}
			
			public void siginaccounts(String SecID ,String EmailID , String password,String URL) throws Exception
			{
				try
				{
					
					baseone.driver.get(URL);
					baseone.driver.findElement(By.id(pr.getProperty("SecID"))).sendKeys(SecID); 
					baseone.driver.findElement(By.id(pr.getProperty("EmailID"))).sendKeys(EmailID);
					baseone.driver.findElement(By.name(pr.getProperty("password"))).sendKeys(password);
					baseone.driver.findElement(By.tagName(pr.getProperty("singin"))).click();
				Thread.sleep(5000);
				}
				 
				catch (Exception e)
				
				{
					String a = e.toString();
					 Logs.takeLogs("Login failed ", a);
					
				}
				 if (Expected3.equals(baseone.driver.getCurrentUrl()))
				    {
				    	System.out.println("Accounts dashboard login " );
				    
				    	 Logs.takeLogs("Accounts user Login", "All Element found on login page and sales dasboard is open ");
				    }
				 else 
				 {
					 System.out.println("Check Accounts users login details ");
				 }
				
			}
		 
				 public void signintransport(String SecID ,String EmailID , String password,String URL) throws Exception
					{
						try
						{
							
							baseone.driver.get(URL);
							baseone.driver.findElement(By.id(pr.getProperty("SecID"))).sendKeys(SecID); 
							baseone.driver.findElement(By.id(pr.getProperty("EmailID"))).sendKeys(EmailID);
							baseone.driver.findElement(By.name(pr.getProperty("password"))).sendKeys(password);
							baseone.driver.findElement(By.tagName(pr.getProperty("singin"))).click();
						Thread.sleep(5000);
						}
						 
						catch (Exception e)
						
						{
							String a = e.toString();
							 Logs.takeLogs("Login failed ", a);
							
						}
						 if (Expected2.equals(baseone.driver.getCurrentUrl()))
						    {
						    	System.out.println("Transport dashboard login " );
						    
						    	 Logs.takeLogs("Transport Login", "All Element found on login page and sales dasboard is open ");
						    }
						 else 
						 {
							 System.out.println("Check Transport users login details ");
						 }
		 
		
			
//		List <WebElement>  s = driver.findElements(By.xpath(pr.getProperty("signbutton")));
//		
//		System.out.println(s.size());
//		
//		s.get(1).click();
//		
//		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(User);
//		driver.findElement(By.xpath(pr.getProperty("next"))).click();
//		 Thread.sleep(10000);
//			
//		//driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[3]")).sendKeys(passwords);
//		
//		 WebElement password =  driver.findElement(By.xpath("//input[@type='password']"));
//		 password.sendKeys(passwords);
//		 driver.findElement(By.xpath(pr.getProperty("next"))).click();
//		 Thread.sleep(10000);
	}
}
//*[@id="password"]/div[1]/div/div[1]/input