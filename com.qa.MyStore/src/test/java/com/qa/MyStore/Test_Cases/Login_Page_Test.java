package com.qa.MyStore.Test_Cases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.MyStore.Pages.Home_Page;
import com.qa.MyStore.Pages.Login_Page;
import com.qa.MyStore.Test_Base.Test_Base;

public class Login_Page_Test extends Test_Base{

	Login_Page loginPage;
	Home_Page homePage;
	public Login_Page_Test() {
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		homePage=new Home_Page();
		loginPage=new Login_Page();
		
	}
	
	//title validation
	@Test(priority=1)
	public void ValidateLogin_Title_Test()
	{
		String actual=loginPage.ValidateLogin_Title();
		String expected="My Store";
		Assert.assertEquals(actual,expected);
	}

	//logo validation merging branch_B & branch_C
	@Test(priority=2)
	public void ValidateLogo_Display_Test()
	{
		Assert.assertTrue(loginPage.ValidateLogo_Display());


		System.out.println("It's branch_C");
	}
	
	
	@Test(priority=3)
	public void login_Test()
	{
		homePage.login_username_link();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority=3)
	public void logout_Test()
	{
		Assert.assertTrue(loginPage.ValidateLogo_Display());
		System.out.println("Its Branch_C");
	}

	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
