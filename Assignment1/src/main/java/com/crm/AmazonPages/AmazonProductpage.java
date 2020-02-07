package com.crm.AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AmazonProductpage {

	WebDriver driver;
	@FindBy(xpath="((//span[contains(text(),'Apple iPhone XR (64GB) - Yellow')])[3])//../../../../../../../div[2]//a[1]")
	private WebElement currentPrice;
	
	public AmazonProductpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
