package com.xworks.register.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cssSelectors {
	public static void cssLocators(WebDriver driver)
	{
		//css selectors
		
		//How to use Tag and ID
		//		<input id='email'>
		driver.findElement(By.cssSelector("input#email"));
		driver.findElement(By.cssSelector("#email"));
		//How to use tag and class name
		driver.findElement(By.cssSelector("a.active"));
		driver.findElement(By.cssSelector(".active"));
		//How to use tag and attribute
		// <input name='bottle'>
		driver.findElement(By.cssSelector("input[name='bottle']"));
		//How to use tag, class and attribute
		//< input class='bangalore' name='value'>]
		driver.findElement(By.cssSelector("input.bangalore[name='bottle']"));
	}
}
