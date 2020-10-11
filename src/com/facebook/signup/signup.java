package com.facebook.signup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signup {
	public static void signupFacebook(WebDriver driver) {
		try {
			Thread.sleep(3000);
	
		driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		driver.get("https://m.facebook.com/reg/");
		driver.findElement(By.xpath("//input[@id='firstname_input']")).sendKeys("test");
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();		

		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("16");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jul");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1989");
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//input[@id='contactpoint_step_input']")).sendKeys("9087656512");
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//input[@id='Female']")).click();
		driver.findElement(By.xpath("//div[9]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Welcome@123");
		
	//	driver.switchTo().window(mainWindow);
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}