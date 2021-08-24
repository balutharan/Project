package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    
    static WebDriver driver;
	private static void loadBrowser() {

		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		
	}

	  private static void closeBrowser() {

		  driver.quit();
		  
		    
	}
	
	private static void maxWindow() {

		driver.manage().window().maximize();
		
		
		
	}
	
	private static void pageTitle() {

		String titlename = driver.getTitle();
		
		System.out.println(titlename);
		
	}
	 private static void pageUrl() {

		 String url = driver.getCurrentUrl();
		 System.out.println(url);
	}
	
	private static void launchUrl(String url) {

		driver.get(url);
		
	}
	
	
	

	}
	
	

		
	
	
	   
	

