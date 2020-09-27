package com.xworks.register;

import org.openqa.selenium.WebDriver;

public class Tester {

	public static String pageSource;
	public static String title;
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select chrome driver in folder and click ctrl+shift+right click -> select copy as path
	//	windowproperties();
		useOfDrivers.launchBrowser(driver);
		System.out.println("Control back to main method");
	}

	public static void windowproperties() { //Alt+shift+m
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/xworkz-selenium/");		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
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
