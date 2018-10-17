/**
 * 
 */
package com.vdif.webautomation.login_prayerbook;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook;
import com.vdif.webautomation.homepage.HomePageComponent;
import com.vdif.webautomation.prayertimes.PrayerTimesPageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */
public class TestLoginAndPrayerbook
		extends HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook {

	private static HomePageComponent homePageComponent;
	private static LoginAndPrayerbookComponent loginAndPrayerbookComponent;
	private static PrayerTimesPageComponent prayerTimesPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Login and Prayerbook Pages Islamic Finder----------------------->>\n");
	}

	@Test(priority = 0)
	public void testALogin() throws Exception {
		System.out.println("<------Testing Login ------->\n");
		incrementAndOpenURLpage();
		loginAndPrayerbookComponent = new LoginAndPrayerbookComponent();
		homePageComponent = new HomePageComponent();
		homePageComponent.searchTopNavBar();
		loginAndPrayerbookComponent.clickLoginButton();
		loginAndPrayerbookComponent.enterEmail("vdcheck123@gmail.com");
		loginAndPrayerbookComponent.enterPassword("test12345");
		loginAndPrayerbookComponent.clickLoginButtonOnLoginForm();

	}

	@Test(enabled=false)
	public void testBPrayerBookCard() throws Exception {
		System.out.println("<------Testing Prayerbook Card ------->\n");
		incrementAndOpenURLpage();
		loginAndPrayerbookComponent = new LoginAndPrayerbookComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();

		loginAndPrayerbookComponent.clickprayerbookButton();

		String h1Tag = loginAndPrayerbookComponent.h1Tag();
		checkAssert(h1Tag, "Prayerbook");

		String checkPrayerbookAllowsyoutoText = loginAndPrayerbookComponent.checkPrayerbookAllowsyoutoText();
		checkAssert(checkPrayerbookAllowsyoutoText,
				"Prayerbook allows you to stay on top of your prayer performance. Simply log your prayers with great ease on the Athan app and get the stats here.");

		String checkMonthlyPrayerStatsText = loginAndPrayerbookComponent.checkMonthlyPrayerStatsText();
		checkAssert(checkMonthlyPrayerStatsText, "Monthly Prayer Stats");
		prayerTimesPageComponent.selectYearFromDropDown("2017");
		prayerTimesPageComponent.selectMonthFromDropDown("November");

		String checkSafar1439RabiAlAwwal1439Text = loginAndPrayerbookComponent.checkSafar1439RabiAlAwwal1439Text();
		checkAssert(checkSafar1439RabiAlAwwal1439Text, "Safar 1439 - Rabi Al-Awwal 1439");

		loginAndPrayerbookComponent.checkListMonthlyPrayerStatsTable();

		// checkable on live//
		// String checkDate21stNovember2017 =
		// loginAndPrayerbookComponent.checkDate21stNovember2017();
		// checkAssert(checkDate21stNovember2017, "21");
		//
		// String checkDayTuesdayNovember2017 =
		// loginAndPrayerbookComponent.checkDayTuesdayNovember2017();
		// checkAssert(checkDayTuesdayNovember2017, "Tuesday");

		// loginAndPrayerbookComponent.checkListOfOfferedPrayerOn21stNovember2017();
	}

	@Test(priority = 2)
	public void testCPrayerTimesCardOnPrayerBookPage() throws Exception {
		System.out.println("<------Testing Prayer Times Cards on Prayerbook page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		testPrayerTimesCard();
	}

	@Test(priority = 3)
	public void testDArticlesOnIqraCardOnPrayerbookPage() throws Exception {
		System.out.println("<------Testing Articles on Iqra Card on Prayerbook Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		testArticlesOnIqraCard();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
