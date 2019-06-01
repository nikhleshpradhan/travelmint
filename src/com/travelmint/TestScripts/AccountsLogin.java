package com.travelmint.TestScripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountsLogin {
	
	
	
	@BeforeTest
	public void test1()
	{
		System.out.println("Before test run");
		
	}
	
	
	@BeforeClass
	
	public void test2()
	{
		
		System.out.println("Before class run");
	}
	
	
	@BeforeMethod
	public void test3()
	{
		
		System.out.println("Before method run");
	}
	
	
	@Test
	public void test4()
	{
		
		System.out.println("test1 run");
	}
	
	@Test
	public void test4i()
	{
		
		System.out.println("test2 run");
	}
	
	
	@AfterMethod
	public void test5()
	{
		
		System.out.println("After Method run");
	}
	@AfterClass
	public void test6()
	{
		
		System.out.println("After class run");
	}
	@AfterTest
	public void test7()
	{
		
		System.out.println("After test run");
	}
	

}
