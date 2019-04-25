package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// To initialize the browser
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// To Maximize the browser
		driver.manage().window().maximize();
		// To Achieve synronizatin
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// To launch the browser
		driver.navigate().to("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		// To perform action tasks
		driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
		// To navigate back button
		driver.navigate().back();
		// To navigate forward button
		driver.navigate().forward();
		// To quit
		driver.quit();
	}

}
