package com.travelmint.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.travelmint.Utilities.Logs;
import com.travelmint.base.baseone;

public class TourGeneralDetails {
	
	baseone DD = new baseone();
    Properties pr = DD.getpr();
    
	
	public void fixpax(String tourname, String validtyfrom,String validtyto,
			            String QueryNote,  String UserNote ,String Noofnigt,String Themes,String Fto)
	{
		
		try
		{
			
		
			baseone.driver.findElement(By.id(pr.getProperty("TourName"))).sendKeys(tourname); 
			baseone.driver.findElement(By.xpath(pr.getProperty("validtyfrom"))).sendKeys(validtyfrom);
			baseone.driver.findElement(By.xpath(pr.getProperty("validtyto"))).sendKeys(validtyto);
			baseone.driver.findElement(By.xpath(pr.getProperty("QueryNote"))).sendKeys(QueryNote);
			baseone.driver.findElement(By.xpath(pr.getProperty("UserNote"))).sendKeys(UserNote);
			baseone.driver.findElement(By.xpath(pr.getProperty("Noofnigt"))).sendKeys(Noofnigt);
			
			Select dropDown = new Select(baseone.driver.findElement(By.xpath(pr.getProperty("Theme"))));
			List<WebElement> e = dropDown.getOptions();
			int itemCount = e.size();

			for(int l = 0; l < itemCount; l++)
			{
				 System.out.println(e.get(l).getText());
				if(e.get(l).getText().equals(Themes))
				{
					dropDown.selectByIndex(l);
					break;
				}
			    System.out.println(e.get(l).getText());
			}
			
			
			

		
			baseone.driver.findElement(By.xpath("//span[@id='select2-AgentId-container']")).click();
			Thread.sleep(10000);
		List<WebElement>FTO =	baseone.driver.findElements(By.xpath("//ul/li[@role='treeitem']"));
			int ec = FTO.size();
			
			for(int ee=0;ee<=ec;ee++)
				
			{
				
				System.out.println(FTO.get(ee).getText());
				
				if(FTO.get(ee).getText().equals(Fto))
				{
					FTO.get(ee).click();
					break;
				}
			  
			}
				
				
				
			
		baseone.driver.findElement(By.xpath(pr.getProperty("Savebutton"))).click();
		
		Thread.sleep(5000);
		}
		
catch (Exception e)
		
		{
			String a = e.toString();
			 Logs.takeLogs("Login failed ", a);
			
		}
		
		
	}

}
