package com.xworks.register;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	
	public static void login_to_xworks(WebDriver driver)
	{
	try {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("email")).sendKeys("test167@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("psw")).sendKeys("pwd");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		List<WebElement> alllinks = driver.findElements(By.tagName("h1"));
		
		alllinks.forEach(element -> System.out.println(element.getText()));
		
		String h1 [] = new String[3];
		int i=0;
		for(WebElement link : alllinks)
		{
			h1[i] = link.getText();
		//	System.out.println(h1[i]);
			i++;
		}
		
		if(h1[1].equalsIgnoreCase("Login is successful"))
		{
			System.out.println("Login is successful");
		}
		else
		{
			System.out.println("Login is unsuccessful");
		}
		driver.findElement(By.linkText("Go Back")).click();
	} catch (InterruptedException e) 
	{
		// TODO Auto-generated catch block
		System.out.println("Login is unsuccessful");
		e.printStackTrace();
	}
	}
}
