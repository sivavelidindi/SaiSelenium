package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroupdownDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium jar files\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");

		WebElement ele = driver.findElement(By.id("month"));

		Select sel = new Select(ele);
		
		//to select value of the month by using index
		
		sel.selectByIndex(0);
		
		//To select month by using value
		
		sel.selectByValue("2");
		
		//To select month by using visible text
		
		sel.selectByVisibleText("Jun");
		
		//To find the location of year
		WebElement yearRef=driver.findElement(By.id("year"));

		Select selYear=new Select(yearRef);
		
		
		//To get all the options
		List<WebElement> selYearRefs=selYear.getOptions();
		
		
		//for iterating over selYearRefs what we needs to do
		
		Iterator<WebElement> ie= selYearRefs.iterator();
		
		ArrayList<String> al=new ArrayList<>();
		while(ie.hasNext()) {
			WebElement indYearRef=ie.next();
			String yearText=indYearRef.getText();
			al.add(yearText);
			System.out.println(yearText);
		}
		
		System.out.println(al.contains("1964"));
	}

}
