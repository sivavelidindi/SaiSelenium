package com.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//nav//a[contains(text(),'STAYS')]")).click();
		
		driver.findElement(By.xpath("//span[text()='IRCTC Hotels']")).click();
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> ie=allwindows.iterator();
		String window1=ie.next();
		String window2=ie.next();
		driver.switchTo().window(window2);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		driver.switchTo().window(window1);
		
		driver.switchTo().window(window2);
		
		driver.close();
		
		driver.quit();
		
	}

}
