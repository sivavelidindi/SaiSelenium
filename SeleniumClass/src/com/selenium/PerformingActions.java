package com.selenium;

import org.openqa.selenium.WebDriver;

import com.reusable.Reusable;

public class PerformingActions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = Reusable.driver();

		driver.get("http://demo.actitime.com");

		Thread.sleep(3000);

		driver.quit();

	}

	public static void main() {

	}
}