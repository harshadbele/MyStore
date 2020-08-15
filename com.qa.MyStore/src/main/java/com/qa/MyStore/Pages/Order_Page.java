package com.qa.MyStore.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.MyStore.Test_Base.Test_Base;

public class Order_Page extends Test_Base {

	@FindBy (xpath="//a[@title='Women']") WebElement woman;
	@FindBy (xpath="//img[@title='Faded Short Sleeve T-shirts']") WebElement tshirt;
	@FindBy (xpath="//button[@name='Submit']") WebElement add_cart;
	@FindBy (xpath="//div[@class='clearfix']/div[2]/div[4]/a/span[contains(text(),'Proceed to checkout')]") WebElement checkout;
	
	//driver.switchTo().frame(0);
	
	public Order_Page() {
	PageFactory.initElements(driver,this);
	}
	
	
	public void product_order() throws InterruptedException
	{
		woman.click();
		tshirt.click();
		driver.switchTo().frame(0);
		add_cart.click();
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		checkout.click();

	}
	
}
