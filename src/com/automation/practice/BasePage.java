package com.automation.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	//Declaration
	@FindBy(xpath="//input[@name='username']")
	private WebElement textUsername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement textPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnClick;

	//Initialization
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//Utilizatiom
	
	public void enterUsername(String str)
	{
		
		textUsername.sendKeys(str);
	}
	
	public void enterPassword(String str)
	{
		
		textPassword.sendKeys(str);
	}
	
	public void clickLogin()
	{
		btnClick.click();
	}
	
	
}
