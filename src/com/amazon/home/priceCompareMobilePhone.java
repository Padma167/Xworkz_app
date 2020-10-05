package com.amazon.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class priceCompareMobilePhone {
	public static int Avalue = 0;
	public static int Fvalue = 0;

	public static void getPriceFromAmazon(WebDriver driver)
	{
		
		try {
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung note 10 lite\n");
			Thread.sleep(2000);
			String winHandleBefore = driver.getWindowHandle();
			driver.findElement(By.xpath("//span[starts-with(text(),'Samsung Galaxy Note10 Lite (Aura Glow, 8GB RAM, 128GB Storage)')]")).click();
			Thread.sleep(2000);
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);}
			    
			String price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
			Thread.sleep(2000);
			
			System.out.println("Price:"+price);
			Avalue = Integer.parseInt(price.replaceAll("[^0-9]", ""));
			Avalue= Avalue/100;
			System.out.println("Price:"+Avalue);
			driver.close();
			driver.switchTo().window(winHandleBefore);
			driver.close();
			//img[contains(@src,'519UN3SlJWL')]
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getPriceFromFlipkart(WebDriver driver)
	{
		try {
			String winHandleBefore = driver.getWindowHandle();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("samsung note 10 lite\n");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-id='MOBFZ4AJAZFZPZHA']/div/a[@class='_31qSD5']")).click();
			Thread.sleep(2000);
			for(String winHandle : driver.getWindowHandles()){
			    driver.switchTo().window(winHandle);}
			String price = driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']")).getText();
			Thread.sleep(2000);
			System.out.println("Price:"+price);
			Fvalue = Integer.parseInt(price.replaceAll("[^0-9]", ""));
			System.out.println("Price:"+Fvalue);
			driver.close();
			driver.switchTo().window(winHandleBefore);	
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void priceComparision()
	{
		if(Avalue>Fvalue)
			System.out.println("Price in Flipkat("+Fvalue+")is cheaper than price in Amazon("+Avalue+") for the selected phone");
		else if(Fvalue>Avalue)
			System.out.println("Price in Amazon("+Avalue+")is cheaper than price in Flipkart("+Fvalue+") for the selected phone");
		else
			System.out.println("Prices are equal");
	}
	
}