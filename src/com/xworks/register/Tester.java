package com.xworks.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.amazon.home.amazonHome;
import com.amazon.home.priceCompareMobilePhone;
import com.cleartrip.book.cleartripHome;
import com.facebook.signup.signup;
import com.magento.website.magentologout;
import com.magento.website.magentoLinks;
import com.magento.website.magentologin;

public class Tester {

	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//select chrome driver in folder and click ctrl+shift+right click -> select copy as path
//		useOfDrivers.launchBrowser(driver);
	//Alt+shift+m

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
//		windowProperties.windowproperties(driver);
//		locatorTest.basicLocators(driver);
//		signup.signupFacebook(driver);
//		registration.register(driver);
//		login.login_to_xworks(driver);
//		amazonHome.amazonHomeLocators(driver);
//		priceCompareMobilePhone.getPriceFromAmazon(driver);
//		priceCompareMobilePhone.getPriceFromFlipkart(driver);
//		priceCompareMobilePhone.priceComparision();
//		magentologin.login_to_magento(driver);
//		magentologout.logout_from_magento(driver);
//		magentoLinks.magento_find_links(driver);
		cleartripHome.cleartripBooking(driver);
	driver.close();
	
}
}