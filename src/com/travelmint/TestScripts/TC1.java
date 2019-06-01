package com.travelmint.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.travelmint.Utilities.Logs;
import com.travelmint.base.baseone;
import com.travelmint.pages.Login;

public class TC1  {
	
	String Expected= "http://travelmint.software/dashboard/Account";
	
	String Expected2 = "http://travelmint.software/dashboard/sale";
	
	
	Login loginLib;
	
 
	
	
	@BeforeClass
	public void configBeforeClass() {
		// object initialization
		loginLib = new Login();
		
	    
	}

	   
	@Test
	 
	public void loginTest() throws Exception
	{ 
		
		loginLib.signinsales("TM2019","test@test.com","123456","http://travelmint.software/");
	
	
 /*   if (Expected.equals(driver.getCurrentUrl()))
    {
    	System.out.println("Admin dashboard login " );
    	Logs.takeLogs("Login Success", "Admin dashboard login ");
    	
    }
    else if (Expected2.equals(driver.getCurrentUrl()))
    {
    	System.out.println("Sales Dashboard is open" );
    	Logs.takeLogs("Login Success", "Sales Dashboard is open ");
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(10000);
		//driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[2]/div[5]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]")).click();
		// System.out.println("Click2");
		
    }
    	
    else 
    {
    	System.out.println("Check your login details");
    	
    }*/
    	
//    try{
//    	Assert.assertEquals(driver.getTitle(),Expected);
//    	
//    	}catch(AssertionError e){
//    		Logs.takeLogs("Login failed", "Check login details ");
//    	  // Takescreenshot;
//    	}
//    
    
    
    
      System.out.println(Expected);

	
	// System.out.println("TC1");
	 //List<WebElement> t =	driver.findElements(By.id(pr.getProperty("tranding")));
	// System.out.println(t.size()); 
	// t.get(1).click();
	 
	// Screnshot.takeScreenshot(driver, "D:\\TravelMint\\Tranding.png");
		   
	}

}

