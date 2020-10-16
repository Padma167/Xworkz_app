package com.cleartrip.book;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cleartripHome 
{
	public static void cleartripBooking(WebDriver driver) 
	{
		try {
			driver.get("https://www.cleartrip.com/");
			driver.manage().window().maximize();
			if(driver.findElement(By.xpath("//input[@id='RoundTrip']")).isSelected())
			{
				Thread.sleep(2000);
				System.out.println("Round trip is selected");
				Thread.sleep(2000);
			}
			else
			{
				Thread.sleep(2000);
				System.out.println("Round trip is not selected by default");
				driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
				Thread.sleep(2000);
				System.out.println("Round trip is now selected");
			}
			
			if(driver.findElement(By.xpath("//input[@id='ReturnDate']")).isDisplayed())
			{
				System.out.println("Retrun on date is displayed");
			}
			else
			{
				System.out.println("Retrun on is not displayed");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
