package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		//To find the location
		WebElement userNameRef=driver.findElement(By.id("username"));
		//To perform action on userNameRef
		userNameRef.sendKeys("admin");
		//To find the location of password field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//To find the lcoation of login button and perform action
		driver.findElement(By.linkText("Login")).click();
		//To wait for the browser to load
		Thread.sleep(3000);
		//To find the location of logout button and perform action
		driver.findElement(By.id("logoutLink")).click();
	}

}
