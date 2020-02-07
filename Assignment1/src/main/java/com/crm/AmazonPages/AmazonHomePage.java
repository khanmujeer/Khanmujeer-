package com.crm.AmazonPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	public WebDriver driver;
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
