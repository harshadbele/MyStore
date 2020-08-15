package com.qa.MyStore.Test_Cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.MyStore.Pages.Home_Page;
import com.qa.MyStore.Pages.Login_Page;
import com.qa.MyStore.Test_Base.Test_Base;


public class Home_Page_Test extends Test_Base{

	Home_Page homePage;
	Login_Page loginPage;
	public Home_Page_Test() {
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		homePage=new Home_Page();
		loginPage=new Login_Page();
	}
	
	@Test(priority=1)
	public void login_username_link_Test()
	{
		loginPage=homePage.login_username_link();
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
}
