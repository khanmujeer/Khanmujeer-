package com.crm.genericLibrary;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

abstract public class BaseTest implements IAutoConstant {
	static
	{
	System.setProperty(CHROM_KEY,CHROM_VALUE);
	}
		
	public  Filedata file=new Filedata();
	public webDriverUtils webLib = new webDriverUtils();
		
		public WebDriver driver;
		@BeforeClass
		public void lanchBrowser() throws Exception 
		{
			String BROWSER=file.getDataFromPropreties("browser");
			if(BROWSER.equals("chrome"))
			{
				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(BROWSER.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			webLib.waitForLoad(driver);
		}

		@BeforeMethod
		public void openAmazon() throws Exception
		{
		     String url=file.getDataFromPropreties("AmazonUrl");
		     driver.get(url);
		}
	
			@AfterClass
			public  void closeBrowser()
			{			
			driver.close();
			}
		}
	

  
