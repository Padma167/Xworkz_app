package com.xworks.register.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locatorTest {
	
	public static void basicLocators(WebDriver driver) 
	{ 
		WebElement registerlink = driver.findElement(By.className("active"));	
		registerlink.click();
		WebElement emailtext = driver.findElement(By.id("email"));
		emailtext.sendKeys("padma167@gmail.com");
		WebElement emailtext1 = driver.findElement(By.id(""));
		emailtext1.sendKeys("padma167@gmail.com");
		WebElement Loginlink = driver.findElement(By.linkText("Login"));
		Loginlink.click();
		WebElement Loginlink1 = driver.findElement(By.partialLinkText("Log"));
		Loginlink1.click();
		
		By xpath = By.xpath("path");
		WebElement password = driver.findElement(xpath);
		password.sendKeys("password@123");
		 
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		int size = alllinks.size();
		System.out.println(size);
		for(WebElement link : alllinks)
		{
			System.out.println(link.getText());
		}
		
	}
	

}
