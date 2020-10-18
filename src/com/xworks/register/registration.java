package com.xworks.register;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class registration {
	public static void register(WebDriver driver)
	{
		try {	
					driver.get("http://localhost:8080/xworkz-selenium/");
					driver.manage().window().maximize();
			driver.findElement(By.className("active")).click();
			Thread.sleep(1000);
			if(driver.findElement(By.id("email")).isEnabled())
			{	// used to check submit buttons - form validations
			driver.findElement(By.id("email")).sendKeys("test167@gmail.com");
			Thread.sleep(1000);
			}
			driver.findElement(By.id("psw")).sendKeys("pwd");
			Thread.sleep(1000);
			driver.findElement(By.id("psw-repeat")).sendKeys("pwd");
			Thread.sleep(1000);
			WebElement coursesdropdown = driver.findElement(By.id("courses"));
			if(coursesdropdown.isDisplayed())
			{
			coursesdropdown.click();
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("//select[@id='courses']/option[@value='selenium']")).click();
			Thread.sleep(1000);
			Select select=new Select(coursesdropdown);
			List<WebElement> options = select.getOptions();
			List<String> courselist = new ArrayList<>(); 
			List<String> sortedCourselist = new ArrayList<>(); 
			System.out.println("Before sorting");
			for(WebElement link : options) {
				courselist.add(link.getText());
				sortedCourselist.add(link.getText());
				System.out.println(link.getText());
			}
			Collections.sort(sortedCourselist);
			
			System.out.println("After sorting");
			for(String course: sortedCourselist)
				System.out.println(course);
			
			if(courselist ==sortedCourselist)
				System.out.println("Dropdownoptions are sorted");
			else
				System.out.println("Dropdownoptions are not sorted");
			
			if(!driver.findElement(By.id("female")).isSelected())
			{// can be used for check box also
			driver.findElement(By.id("female")).click();
			Thread.sleep(1000);
			}
			driver.findElement(By.className("registerbtn")).click();
			Thread.sleep(1000);
			int i=0;
			List<WebElement> alllinks = driver.findElements(By.tagName("h1"));
			String h1 [] = new String[3];
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
