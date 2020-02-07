package com.crm.FilpkartnPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartHomePage {

	WebDriver driver;
	
	@FindBy(linkText="✕")
	private WebElement CloseLogin;
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	
	
	public FlipkartHomePage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
