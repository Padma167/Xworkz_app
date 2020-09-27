package com.xworks.register.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorTest {
	
	public static void basicLocators(WebDriver driver) 
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:8080/xworkz-selenium/");
		driver.manage().window().maximize();		
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
		 
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		int size = alllinks.size();
		System.out.println(size);
		for(WebElement link : alllinks)
		{
			System.out.println(link.getText());
		}
	driver.close();	
	}
}
