package com.qa.MyStore.Test_Cases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.MyStore.Pages.Home_Page;
import com.qa.MyStore.Pages.Login_Page;
import com.qa.MyStore.Pages.Order_Page;
import com.qa.MyStore.Test_Base.Test_Base;

public class Order_Page_Test extends Test_Base{

	Home_Page homePage;
	Login_Page loginPage;
	Order_Page orderPage;
	
	public Order_Page_Test() {
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		intialization();
		homePage=new Home_Page();
		loginPage=new Login_Page();
		orderPage=new Order_Page();
		homePage.login_username_link();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test
	public void product_order_Test() throws InterruptedException
	{
	
		orderPage.product_order();
	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
}
