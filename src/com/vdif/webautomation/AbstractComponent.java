package com.vdif.webautomation;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

//Naeem Siddiq

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AbstractComponent {

	protected static WebDriver driver = null;
	protected static boolean isPageOpened = false;
	protected static int testCounter = 0;
	protected static String BASE_URL = "https:/alpha.islamicfinder.org/";
	protected static String LIVE_URL = "https://www.islamicfinder.org/";

	protected void callSetUp() {
		if (driver == null) {
			driver = DriverFactory.getDriver();
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
	}

	protected static void callTearDown() {
		System.out.println("<---------------------------After Class--------------------------->");
		System.out.println("driver= : " + driver + "     ispageOpened :  : " + isPageOpened + "   testCounter  :   : "
				+ testCounter);
		driver.quit();
		driver = null;
		isPageOpened = false;
		testCounter = 0;
		System.out.println("<---------------------------For New Class--------------------------->");
		System.out.println("driver= : " + driver + "     ispageOpened :  : " + isPageOpened + "   testCounter  :   : "
				+ testCounter);
	}

	protected static void openPage(String url) {
		if (!isPageOpened) {
			driver.get(url);
			isPageOpened = true;
		}
	}

	protected static void incrementAndOpenURLpage() {
		testCounter++;
		openPage(BASE_URL);
		implicicitwait4sec();
	}

	protected static void checkLogo() {
		driver.findElement(By.className("am-logo"));
		implicicitwait4sec();
	}

	protected static void scrollToLocateElement(WebElement element) throws Exception {
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false)", element);
 		element.click();
		System.out.println(element.getText());
		Thread.sleep(1500);
	}

	protected static void scrollAndClick(WebElement element) throws InterruptedException {
		// Scroll
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.perform();
		System.err.println(driver.getTitle());
		System.err.println(element.getText());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		Thread.sleep(1000);
	}

	protected static void checkAssert(String string1, String string2) throws Exception {
		Assert.assertEquals(string1, string2);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}

	protected static void implicicitwait2sec() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	protected static void implicicitwait3sec() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	protected static void implicicitwait4sec() {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

}
