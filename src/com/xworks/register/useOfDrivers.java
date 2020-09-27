package com.xworks.register;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class useOfDrivers {
	public static Scanner sc;
	 //Ctrl+2 hands up and then "L"
	
	public static void launchBrowser(WebDriver driver) {
		
		String flag = "yes";
		do
		{
			System.out.println("Choose the browser option \n1. Chrome\n2.Firefox");
			sc = new Scanner(System.in);
			int browser = sc.nextInt();
			System.out.println("The user choice is: "+browser);
		switch(browser)
		{
			case 1:
			System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			break;
			
			case 2:
			System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver-v0.27.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			break;
			
			default: 
				System.out.println("Invalid choice");
				break;
		}
		System.out.println("Do you want to continue? Yes/No");
		flag = sc.next();
		}while(flag.equalsIgnoreCase("Yes"));
		sc.close();
	}
}