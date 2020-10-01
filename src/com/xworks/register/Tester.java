package com.xworks.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

	
	
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select chrome driver in folder and click ctrl+shift+right click -> select copy as path
	//	windowproperties();
//		useOfDrivers.launchBrowser(driver);
//		System.out.println("Control back to main method");
	//Alt+shift+m
//	windowProperties.windowproperties(driver);
//	locatorTest.basicLocators(driver);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/xworkz-selenium/");
		driver.manage().window().maximize();
		
		registration.register(driver);
		login.login_to_xworks(driver);
		driver.close();
	
}
}