package com.qa.MyStore.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.MyStore.Test_Base.Test_Base;

public class Login_Page extends Test_Base {

	@FindBy (xpath="//input[@id='email']") WebElement username;
	@FindBy (xpath="//input[@id='passwd']") WebElement password;
	@FindBy (xpath="//button[@id='SubmitLogin']") WebElement signup_click;
	@FindBy (xpath="//img[@class='logo img-responsive']") WebElement logo;
	
	public Login_Page() {
		PageFactory.initElements(driver,this);
	}

	public String ValidateLogin_Title()
	{
		return driver.getTitle();
	}

	public boolean ValidateLogo_Display() 
	{
		
		return logo.isDisplayed();	
	}

	public Home_Page login(String usernm,String pass)
	{
		username.sendKeys(usernm);
		password.sendKeys(pass);
		signup_click.click();
		return new Home_Page();
	
	}


}