package com.vdif.webautomation;

// Naeem Siddiq

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public static WebDriver getDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System. setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		return  new ChromeDriver(options);
	}

}
