package org.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngConcept {
  
	@BeforeClass
	
	private void browserlaunch() {
		
     System.out.println("Browser launch");
	}
	@AfterClass
	
	private void closebrowser() {

		System.out.println("Close browser");
		
	}
	
	@BeforeMethod
	private void starttime() {
		
		System.out.println("Start time");
	}

	@AfterMethod

     private void endtime() {
		System.out.println("End time");

	}
	
	@Test
	
	private void tc1() {
		System.out.println("Test case 1");

	}
	
	@Test
	
	private void tc3() {
       System.out.println("Test case 3");
	}
	
	@Test
	
	private void tc2() {
       System.out.println("Test case2");
	}
	
}

