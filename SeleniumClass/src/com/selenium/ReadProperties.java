package com.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
	
	public static String[] eleProperty(String locator) throws IOException {
		
		FileInputStream fis=new FileInputStream("object.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String usernamePro=pro.getProperty(locator);
		System.out.println(usernamePro);
		String objectProperty[]=usernamePro.split("#");
		return objectProperty;

	}
	
	public static void main(String[] args) throws IOException {
		String[] property=ReadProperties.eleProperty("actitime.login.username");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id(property[1])).sendKeys("admin");
	}

}
