package com.qa.MyStore.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.MyStore.Test_Base.Test_Base;

public class Home_Page extends Test_Base{

	@FindBy (xpath="//a[contains(text(),'Sign in')]") WebElement login_link;
	
	public Home_Page() {
	PageFactory.initElements(driver, this);
	}
	
	public Login_Page login_username_link()
	{
		login_link.click();
		
		return new Login_Page();
	}
}
