package com.selenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");
		
		//To work with multiple elements
		
		List<WebElement> allTagRefs=driver.findElements(By.tagName("a"));
		
		List<WebElement> allTextRefs=driver.findElements(By.xpath("//input[@type='text']"));
		
		Iterator<WebElement> ie=allTextRefs.iterator();
		
		while(ie.hasNext()) {
		ie.next().sendKeys("test");
		}
		
		Iterator<WebElement> ie2=allTagRefs.iterator();
		
		while(ie2.hasNext()) {
			System.out.println(ie2.next().getText());
		}
	}

}
