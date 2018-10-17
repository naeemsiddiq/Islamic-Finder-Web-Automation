/**
 * 
 */
package com.vdif.webautomation.ramadan2017;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestRamadan2017 extends AbstractComponent {

	Ramadan2017Component ramadan2017Component;
	HomePageComponent homePageComponent;

	@BeforeClass
	public void setup() {
		callSetUp();
		System.out.println("<<-----------------------Testing Ramadan Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testTopCardOfRamadanPage() throws Exception {
		System.out.println("<------Testing Top Card of Ramadan Page------->\n");
	//	BASE_URL = "https:/codefreeze.islamicfinder.org/";
		isPageOpened=false;
		incrementAndOpenURLpage();
		homePageComponent = new HomePageComponent();
		homePageComponent.searchTopNavBar();
		homePageComponent.clickOnfooterRamadan2017Link();
	//	checkButtonsOnRamadan2017Page("Prayer Times", "Prayer Times");
		checkButtonsOnRamadan2017Page("Al Quran", "Al Quran with Translation");
		checkButtonsOnRamadan2017Page("Duas", "Duas - Islamic and Quranic Duas in Arabic with Translation");
		checkButtonsOnRamadan2017Page("Places", "Nearby Mosques and Islamic Places in");

	}

	@Test(enabled=false)
	public void testOtherCardsOnRamadanPage() throws Exception {
		System.out.println("<------Testing Other Cards On Ramadan Page------->\n");
		BASE_URL = "https:/www.islamicfinder.org/";
		isPageOpened=false;
		incrementAndOpenURLpage();
		homePageComponent = new HomePageComponent();
		ramadan2017Component = new Ramadan2017Component();
		homePageComponent.clickOnfooterRamadan2017Link();
		ramadan2017Component.checkRamadanContentList();
	}

	private void checkButtonsOnRamadan2017Page(String data, String h1Tag) throws Exception {
		ramadan2017Component = new Ramadan2017Component();
		ramadan2017Component.checkByLinkText(data);
		if (h1Tag.equals("Prayer Times")) {
			checkAssert(driver.findElement(By.xpath("//h1[contains(text(),'" + h1Tag + "')]")).getText(),
					h1Tag + " Lahore");
		} else if (h1Tag.equals("Nearby Mosques and Islamic Places in"))
			checkAssert(driver.findElement(By.xpath("//h1[contains(text(),'" + h1Tag + "')]")).getText(),
					h1Tag + " Lahore");
		else
			checkAssert(driver.findElement(By.xpath("//h1[contains(text(),'" + h1Tag + "')]")).getText(), h1Tag);

		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

	}

	@AfterClass
	public static void tearDown() throws Exception {
//		BASE_URL = "https:/alpha.islamicfinder.org/";
		callTearDown();
	}

}
