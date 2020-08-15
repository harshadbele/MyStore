package com.qa.MyStore.Test_Cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.MyStore.Pages.Home_Page;
import com.qa.MyStore.Pages.Signup_Page;
import com.qa.MyStore.Test_Base.Test_Base;

public class Signup_Page_Test extends Test_Base {

	Signup_Page signupPage;
	Home_Page homePage;
	
	public Signup_Page_Test() {
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		signupPage=new Signup_Page();
		homePage=new Home_Page();
		homePage.login_username_link();
	}
	
	@Test
	public void register_account_test() throws InterruptedException
	{
		//signupPage.register_account();
		signupPage.register_account("shardabe@gmail.com","shardabee","diensh","sharda","25","12",
				"1988","California","monut","California", "23134","4321244");
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
