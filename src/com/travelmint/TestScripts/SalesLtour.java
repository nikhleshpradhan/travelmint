package com.travelmint.TestScripts;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.travelmint.Utilities.ExcelLib;
import com.travelmint.base.baseone;
import com.travelmint.pages.Login;
import com.travelmint.pages.TourGeneralDetails;



public class SalesLtour  { 
	TourGeneralDetails genral;
	ExcelLib eLib;
	String sheetName;
	
	baseone DD = new baseone();
    Properties pr = DD.getpr();
	
	@BeforeClass
	public void configBeforeClass() {
		// object initialization
		genral = new TourGeneralDetails();
		eLib = new ExcelLib();
		sheetName = "General_details";
	}


	@Test
	
	public void oTour()throws Exception
	{
		
	
		Thread.sleep(10000);
	     baseone.driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[2]/div[5]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]/span[1]")).click();
	    
	     
	 	Thread.sleep(10000);
			

	 	
	             
	
                  
          String tourname = eLib.getExcelData(sheetName, 0, 0);
  	
  		String validtyfrom = eLib.getExcelData(sheetName,0, 1);
  		  		String validtyto = eLib.getExcelData(sheetName, 0, 2);
  		String QueryNote = String.valueOf(eLib.getExcelData(sheetName, 0, 3));
  		String UserNote = eLib.getExcelData(sheetName, 0, 4);
  		String Noofnigt = eLib.getExcelData(sheetName, 0, 5);
  		String Themes = eLib.getExcelData(sheetName, 0, 6);
 	String Fto = eLib.getExcelData(sheetName, 0, 7);
  	  genral.fixpax(tourname, validtyfrom, validtyto, QueryNote, UserNote ,Noofnigt, Themes,Fto );
  		
	}
	
		 
		 
} 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	     //   Actions action = new Actions(driver);

	        //action.moveToElement(element).build().perform();
	 
	      //  driver.findElement(By.xpath("//li(@class='treeview')")).click();
	 
	        
	  //  driver.findElement(By.xpath("//a[contains(.,'TourPlan')]")).click();
	//   driver.findElement(By.xpath("//div[@class='col-md-2 col-sm-3 col-xs-6']//td[1]/a")).click();
	
	
		//span[contains(text(),'TourPlan')]

	
//	List <WebElement> lists  =    driver.findElements(By.tagName("a"));
//	 
//	 
//	 System.out.println(lists.size());
//	 for(int i = 0; i < lists.size(); i++){
//		 System.out.println(lists.get(i).getText());
//	
	

