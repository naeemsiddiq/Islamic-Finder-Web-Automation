/**
 * 
 */
package com.vdif.webautomation.dateconverter;

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

public class TestDateConverter extends AbstractComponent {

	private static HomePageComponent homePageComponent;
	private static DateConverterComponent dateConverterComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Date Converter Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testGregorianToHijriDateConverted() throws Exception {
		System.out.println("<------Testing Gregorian to Hijri Date Converted on Date Converter Page------->\n");
		incrementAndOpenURLpage();

		dateConverterComponent = new DateConverterComponent();
		homePageComponent = new HomePageComponent();
		homePageComponent.searchTopNavBar();

		dateConverterComponent.clickDateConverterButton();
		homePageComponent.checkIslamicDateConverterGregorianCalendarConverter();
		String check_GH_HG_Text = dateConverterComponent.check_GH_HG_Text();
		checkAssert(check_GH_HG_Text, "Gregorian to Hijri Converter");

		dateConverterComponent.selectDayFromDropDown("17");
		dateConverterComponent.selectMonthInDropDown("August");
		dateConverterComponent.selectYearInDropDown("2010");
		dateConverterComponent.clickConvertDateButton();
		Thread.sleep(1500);
		String checkDateConvertedDateText = dateConverterComponent.checkDateConvertedDateText();
		checkAssert(checkDateConvertedDateText, "7th Ramadan, 1431h");

		String checkDateConvertedDayText = dateConverterComponent.checkDateConvertedDayText();
		checkAssert(checkDateConvertedDayText, "Tuesday");

	}

	@Test
	public void testHijriToGregorianDateConverted() throws Exception {
		System.out.println("<------Testing Hijri to Gregorian Date Converted on Date Converter Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		dateConverterComponent = new DateConverterComponent();
		homePageComponent = new HomePageComponent();
		homePageComponent.searchTopNavBar();

		dateConverterComponent.clickDateConverterButton();
		homePageComponent.checkIslamicDateConverterGregorianCalendarConverter();
		dateConverterComponent.clickSwitchDateConverter();

		String check_GH_HG_Text = dateConverterComponent.check_GH_HG_Text();
		checkAssert(check_GH_HG_Text, "Hijri to Gregorian Converter");

		dateConverterComponent.selectDayFromDropDown("16");
		dateConverterComponent.selectMonthInDropDown("Jumada Al-Akhirah");
		dateConverterComponent.selectYearInDropDown("1419");
		dateConverterComponent.clickConvertDateButton();
		Thread.sleep(1500);
		String checkDateConvertedDateText = dateConverterComponent.checkDateConvertedDateText();
		checkAssert(checkDateConvertedDateText, "07 October, 1998");

		String checkDateConvertedDayText = dateConverterComponent.checkDateConvertedDayText();
		checkAssert(checkDateConvertedDayText, "Wednesday");

		dateConverterComponent.clickGoToIslamicCalendarButton();
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}

}
