package com.magento.website;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class magentoLinks {
	public static void magento_find_links(WebDriver driver)
	{
		driver.get("https://magento.com");
		driver.manage().window().maximize();
		int i=0;
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int size = alllinks.size();
		System.out.println("Size:"+ size);
		String h1 [] = new String[size];
		for(WebElement link : alllinks)
		{
			h1[i] = link.getText();
			System.out.println(h1[i] + ":"+ link);
			if(link.getText().equals("My Account"))
			{
				System.out.println("My account found");
				link.click();
			}
				
			i++;
		}
	}
}
