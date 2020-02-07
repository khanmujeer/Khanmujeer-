package com.crm.genericLibrary;

import java.awt.Robot;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webDriverUtils {
	
	
	
	public static void verifyPage(WebDriver driver,String expectTitle)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains(expectTitle));
		String actualTitle = driver .getTitle();
		Assert.assertEquals(actualTitle, expectTitle);
		System.out.println("The page is verifyed sucessfully==>"+expectTitle);
	}

	/**
	 * 
	 * @return
	 */
	public int generateRandomNumber()
	{
		Random ran = new Random ();
		return ran.nextInt(100);
		
	}
	/**
	 * 
	 * @param driver
	 */
	public void waitForLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	//public void VerifyErrMsg()
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void waitandClick(WebDriver driver,WebElement element)
	{
		WebDriverWait wait= new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.invisibilityOf(element));
		
	}
	/**
	 * 
	 * @param driver
	 * @param element
	 */
	public void movetocurser(WebDriver driver ,WebElement element)
	{
	Actions act=new Actions(driver);
	act.moveToElement(element).perform();
	}
	
	/**
	 * 
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitForElementClick(WebElement element) throws InterruptedException
	{
		int count=0;
		while(count<=20)
		{
			try
			{
				element.click();
				break;
			}
			
			catch(Throwable t)
			{
				Thread.sleep(1000);
				count++;
			}
		}
	}
	
			
			static String parentId=null;
			 static String childId=null;
			/**
			 * 
			 * @param driver
			 */
			public void switchToChildWindow(WebDriver driver)
				
			{
				Set<String> windows = driver.getWindowHandles();
				Iterator<String> it = windows.iterator();
				parentId=it.next();
				childId=it.next();
				
				driver.switchTo().window(childId);
			}
			/**
			 * 
			 * @param driver
			 */
			public void switchToParentWindow(WebDriver driver)
			{
				driver.switchTo().window(parentId);
				
			}
			/**
			 * 
			 * @param element
			 * @param text
			 */
			public void select(WebElement element,String text)
			{
				Select s=new Select(element);
				s.selectByVisibleText(text);
			}
			/**
			 * 
			 * @param element
			 * @param index
			 */
			
			public void select(WebElement element,int index)
			{
				Select s=new Select (element);
				s.selectByIndex(index);
			}
			
			public void acceptAlert(WebDriver driver)
			{
				driver.switchTo().alert().accept();
			}
			public void cancelAlert(WebDriver driver)
			{
				driver.switchTo().alert().dismiss();
			}
			
	
	public static WebDriverWait exlpWait(WebDriver driver,long eto)
	{
		return new WebDriverWait(driver,eto);
		
	}
	public static Actions actions(WebDriver driver)
	{
		return new Actions(driver);
		
	}
	
	public static  Select select(WebElement element)
	{
		return new Select(element);
		
	}
	
	public static Robot robot() 
	{
		Robot r=null;
		try
		{
		r=new Robot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return r;
	}

}


