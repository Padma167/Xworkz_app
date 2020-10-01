package com.xworks.register.locators;

import org.openqa.selenium.WebDriver;

public class windowProperties {
	
	public static String pageSource;
	public static String title;
	
	public static void windowproperties(WebDriver driver) 
	{ 		
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
