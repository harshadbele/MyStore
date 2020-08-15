package com.qa.MyStore.Test_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Base {

	public static String src="C:\\Users\\admin\\workspace\\MyStore\\automation\\src\\main\\java\\com\\qa\\MyStore\\config\\config.properties";
	public static WebDriver driver;
	public static Properties prop;
//commented
	public Test_Base() 
	{

		try {
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		} 
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}

	public void intialization()
	{
		String browsername=prop.getProperty("browser");

		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
						
		}

		driver.manage().window().maximize();
	}
}
