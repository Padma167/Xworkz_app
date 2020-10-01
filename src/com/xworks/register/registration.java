package com.xworks.register;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registration {
	public static void register(WebDriver driver)
	{
		try {	
			driver.findElement(By.className("active")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("test167@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("psw")).sendKeys("pwd");
			Thread.sleep(1000);
			driver.findElement(By.id("psw-repeat")).sendKeys("pwd");
			Thread.sleep(1000);
			driver.findElement(By.id("courses")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='courses']/option[@value='selenium']")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("female")).click();
			Thread.sleep(1000);
			//html//input[@id='female']
			driver.findElement(By.className("registerbtn")).click();
			Thread.sleep(1000);
			
			List<WebElement> alllinks = driver.findElements(By.tagName("h1"));
			String h1 [] = new String[5];
			int i=0;
			for(WebElement link : alllinks)
			{
				h1[i] = link.getText();
			//	System.out.println(h1[i]);
				i++;
			}
			
			if(h1[1].equalsIgnoreCase("Registration is successful"))
			{
				System.out.println("Registration is successful");
			}
			else
			{
				System.out.println("Registration is unsuccessful");
			}
			driver.findElement(By.linkText("Go Back")).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Registration is unsuccessful");
			e.printStackTrace();
		}	
	}
}
