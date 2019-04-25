package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckPoints {

	public static void titleVerification() throws InterruptedException {

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
		String expectedTitle = "actiTIME - Enter Time-Track";
		Thread.sleep(3000);
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title Matches");
			System.out.println("Login Successful");
		}
	}

	public static void textVerification() throws InterruptedException {

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
		String expectedText = "Switch to actiPLANS";
		WebElement actualWebElement = driver.findElement(By.xpath("//span[contains(text(),'Switch to actiP')]"));
		String actualText = actualWebElement.getText();
		System.out.println(actualText);
		if (expectedText.equals(actualText)) {
			System.out.println("Text Matches");
			System.out.println("Login Successful");
		}
	}

	public static void urlVerification() throws InterruptedException {

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
		Thread.sleep(3000);
		String expectedUrl = "https://demo.actitime.com/user/submit_tt.do";
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualUrl);
		if (expectedUrl.equals(actualUrl)) {
			System.out.println("Url Matches");
			System.out.println("Login Successful");
		}
	}

	public static void checkBoxVerification() {

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
		// To find the location fof checkbox
		WebElement checkBoxLocation = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean status = checkBoxLocation.isSelected();
		System.out.println(status);
		if (status == false) {
			checkBoxLocation.click();
			boolean checkBoxStatusAC = checkBoxLocation.isSelected();
			System.out.println(checkBoxStatusAC);
		}
	}

	public static void elementVerification() {

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
		// To find the location for checkbox
		WebElement checkBoxLocation = driver.findElement(By.id("keepLoggedInCheckBox"));
		boolean status = checkBoxLocation.isDisplayed();
		System.out.println(status);

	}

	public static void main(String[] args) throws InterruptedException {
		//titleVerification();
		//textVerification();
		urlVerification();
		//checkBoxVerification();
		//elementVerification();

	}

}
