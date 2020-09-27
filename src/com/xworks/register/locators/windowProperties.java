package com.xworks.register.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowProperties {
	
	public static String pageSource;
	public static String title;
	
	public static void windowproperties(WebDriver driver) 
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/xworkz-selenium/");
		driver.manage().window().maximize();		
		pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		title = driver.getTitle();
		if(title.equalsIgnoreCase(""))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
