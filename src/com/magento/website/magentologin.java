package com.magento.website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class magentologin {
	public static void login_to_magento(WebDriver driver)
	{
		driver.get("https://magento.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='icon']//div[@class='account-icon icon-container']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vineetanand61@gmail.com");
		driver.findElement(By.xpath("//fieldset[@class='fieldset fieldset-inline login']//input[@id='pass']")).sendKeys("Welcome123");
		driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]")).click();
	}
}
