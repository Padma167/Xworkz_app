package com.xworks.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.amazon.home.priceCompareMobilePhone;
import com.facebook.signup.signup;

public class Tester {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select chrome driver in folder and click ctrl+shift+right click -> select copy as path
//		useOfDrivers.launchBrowser(driver);
	//Alt+shift+m
//	windowProperties.windowproperties(driver);
//	locatorTest.basicLocators(driver);
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		signup.signupFacebook(driver);
		
		/*		driver.get("http://localhost:8080/xworkz-selenium/");
		registration.register(driver);
		login.login_to_xworks(driver);
		amazonHome.amazonHomeLocators(driver);*/
	/*	try {
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		priceCompareMobilePhone.getPriceFromAmazon(driver);
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		priceCompareMobilePhone.getPriceFromFlipkart(driver);
		priceCompareMobilePhone.priceComparision();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//driver.close();
		}
	*/	driver.close();
	
}
}