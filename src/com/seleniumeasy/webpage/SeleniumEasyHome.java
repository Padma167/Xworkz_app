package com.seleniumeasy.webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumEasyHome {

	public static void seleniumEasyselectors(WebDriver driver)
	{
	try {
		driver.get("https://www.seleniumeasy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@href='/'][contains(text(),'Selenium')]")).click();
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
