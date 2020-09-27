package com.xworks.register;

import org.openqa.selenium.WebDriver;

import com.xworks.register.locators.locatorTest;

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
	locatorTest.basicLocators(driver);                                                   
	
}

}
