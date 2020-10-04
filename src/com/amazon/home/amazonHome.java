package com.amazon.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class amazonHome {
	public static void amazonHomeLocators(WebDriver driver)
	{
		try {
			driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-menu-id='5']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("eBook Readers & Accessories")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/71cN1J7EpHL._AC_UY218_.jpg']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='variation_color_name']/ul/li[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='variation_color_name']/ul/li[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='variation_color_name']/ul/li[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='nav-xshop']/a[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='nav-xshop']/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@data-menu-id='6']")).click();
			Thread.sleep(2000);
			
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
