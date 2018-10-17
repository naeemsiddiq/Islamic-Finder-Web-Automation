/**
 * 
 */
package com.vdif.webautomation.specialislamicdays;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestSpecialIslamicDays
		extends HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook {

	private static SpecialIslamicDaysComponent specialIslamicDaysComponent;
	private static HomePageComponent homePageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Special Islamic Days Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testUpcomingEventsCardOnSpecialIslamicDaysPage() throws Exception {
		System.out.println("<------Testing Upcoming Events Card On Special Islamic Days Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		homePageComponent = new HomePageComponent();
		specialIslamicDaysComponent = new SpecialIslamicDaysComponent();
		homePageComponent.searchTopNavBar();

		specialIslamicDaysComponent.clickSpecialIslamicDaysButton();
		homePageComponent.checkSpecialIslamicDaysPageOnIslamicDaysPage();
		testUpcomingEventsCard();
	}

	@Test
	public void testSpecialIslamicDaysCardOnSpecialIslamicDays() throws Exception {
		System.out.println("<------Testing Special Islamic Days Card On Special Islamic Days Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		homePageComponent = new HomePageComponent();
		specialIslamicDaysComponent = new SpecialIslamicDaysComponent();
		homePageComponent.searchTopNavBar();

		specialIslamicDaysComponent.clickSpecialIslamicDaysButton();

		specialIslamicDaysComponent.clickArrowRight();

		String checkGregorianYear2018Text = specialIslamicDaysComponent.checkGregorianYearText();
		AssertJUnit.assertEquals(checkGregorianYear2018Text, "2018");

		String checkHijriYear1439Text = specialIslamicDaysComponent.checkHijriYearText();
		AssertJUnit.assertEquals(checkHijriYear1439Text, "1439 - 1440 A.H");

		specialIslamicDaysComponent.clickArrowLeft();

		String checkGregorianYear2017Text = specialIslamicDaysComponent.checkGregorianYearText();
		AssertJUnit.assertEquals(checkGregorianYear2017Text, "2017");

		String checkHijriYear1438Text = specialIslamicDaysComponent.checkHijriYearText();
		AssertJUnit.assertEquals(checkHijriYear1438Text, "1438 - 1439 A.H");

		String checkAllSpecialIslamicDays = specialIslamicDaysComponent.checkAllSpecialIslamicDays();
		AssertJUnit.assertEquals(checkAllSpecialIslamicDays, "All Special Islamic Days");
		specialIslamicDaysComponent.clickListOfSpecialIslamicDays();

	}

	// because this card is not on alpha
	@Test(enabled = false)
	public void testAllIslamicEventsCardOnSpecialIslamicDays() throws Exception {
		System.out.println("<------Testing All Islamic Events Card On Special Islamic Days Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		homePageComponent = new HomePageComponent();
		specialIslamicDaysComponent = new SpecialIslamicDaysComponent();
		homePageComponent.searchTopNavBar();

		specialIslamicDaysComponent.clickSpecialIslamicDaysButton();
		specialIslamicDaysComponent.checkAllIslamicEventsText();
		specialIslamicDaysComponent.clickListOfAllIslamicEvents();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
