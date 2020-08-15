package com.qa.MyStore.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.MyStore.Test_Base.Test_Base;

public class Signup_Page extends Test_Base{
	
	@FindBy (xpath="//input[@id='email_create']") WebElement email_registration;
	@FindBy (xpath="//button[@id='SubmitCreate']") WebElement submit;
	@FindBy (xpath="//input[@id='id_gender1']") WebElement mr;
	@FindBy (xpath="//input[@id='id_gender2']") WebElement mrs;
	@FindBy (xpath="//*[@id='customer_firstname']") WebElement firstname;
	@FindBy (xpath="//*[@id='customer_lastname']") WebElement lastname;
	@FindBy (xpath="//input[@id='passwd']") WebElement password;
	@FindBy (xpath="//input[@id='address1']") WebElement address;
	@FindBy (xpath="//input[@id='city']") WebElement city;
	@FindBy (xpath="//input[@id='postcode']") WebElement postcod;
	@FindBy (xpath="//input[@id='phone']") WebElement phone;
	//@FindBy (xpath="//input[@id='submitAccount']") WebElement registration;
	@FindBy (xpath="//div[@class='submit clearfix']/button[@type='submit']") WebElement regi;
	
	public Signup_Page() {
	PageFactory.initElements(driver, this);
	}
	
	
	public Home_Page register_account(String email,String fname,String lname,String pass,String days,String month,String year,
			String adress,String cty,String state,String postcode,String phnumber) throws InterruptedException
	{
		email_registration.sendKeys(email);
		submit.click();
		Thread.sleep(3000);
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		
		password.sendKeys(pass);
		
		Select select=new Select(driver.findElement(By.xpath("//select[@id='days']")));
		select.selectByValue(days);
		Thread.sleep(3000);
		Select select2=new Select(driver.findElement(By.xpath("//select[@id='months']")));
		select2.selectByValue(month);
		
		Select select3=new Select(driver.findElement(By.xpath("//select[@id='years']")));
		select3.selectByValue(year);
		
		address.sendKeys(adress);
		
		city.sendKeys(cty);
		
		Select select4=new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
 		select4.selectByVisibleText(state);
		Thread.sleep(3000);
 		postcod.sendKeys(postcode);
 		phone.sendKeys(phnumber);
 		
 		Thread.sleep(3000);
 		//registration.click();
 		regi.click();
		return new Home_Page();
	}
}
