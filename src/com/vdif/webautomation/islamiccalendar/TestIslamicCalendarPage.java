/**
 * 
 */
package com.vdif.webautomation.islamiccalendar;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
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

public class TestIslamicCalendarPage
		extends HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook {

	private static IslamicCalendarComponent islamicCalendarComponent;
	private static HomePageComponent homePageComponent;
	private static PrayerTimesPageComponent prayerTimesPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Islamic Calendar Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testIslamicCalendarOnNovember2017() throws Exception {
		System.out.println("<------Testing Islamic Calendar On November 2017 On Islamic Calendar Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicCalendarComponent = new IslamicCalendarComponent();
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();

		islamicCalendarComponent.clickIslamicCalendarButton();
		islamicCalendarComponent.clickResetButtonOnIslamicCalendar();
		islamicCalendarComponent.selectMonthInDropDown("November");
		Thread.sleep(5000);
		islamicCalendarComponent.selectYearInDropDown("2017");
		Thread.sleep(5000);
		
		Thread.sleep(1000);
		String checkGregorianCalendarNovember2017 = islamicCalendarComponent.checkGregorianCalendarNovember2017();
		Assert.assertEquals(checkGregorianCalendarNovember2017, "Gregorian Calendar November 2017");

		String checkGregorianvsHijriCalendarText = islamicCalendarComponent.checkGregorianvsHijriCalendarText();
		Assert.assertEquals(checkGregorianvsHijriCalendarText, "Gregorian vs Hijri Calendar");

		Thread.sleep(1000);
		String checkNovember2017Text = islamicCalendarComponent.checkNovember2017Text();
		Assert.assertEquals(checkNovember2017Text, "November 2017");

		Thread.sleep(1000);
		String checkSafar1439Text = islamicCalendarComponent.checkSafar1439Text();
		Assert.assertEquals(checkSafar1439Text, "Safar 1439");

		Thread.sleep(1000);
		String checkRabiAlAwwal1439Text = islamicCalendarComponent.checkRabiAlAwwal1439Text();
		Assert.assertEquals(checkRabiAlAwwal1439Text, "Rabi Al-Awwal 1439");

		Thread.sleep(1000);
		String checkNovember8_2017Text = islamicCalendarComponent.checkNovember8_2017Text();
		Assert.assertEquals(checkNovember8_2017Text, "8");

		islamicCalendarComponent.clickOnSeePrayerTimesNovember();
		Thread.sleep(1000);
		prayerTimesPageComponent.checkLahorePunjabPakistanText();
		islamicCalendarComponent.clickIslamicCalendarButton();
	}

	@Test
	public void testIslamicCalendarOnAugust1992() throws Exception {
		System.out.println("<------Testing Islamic Calendar On August 1992 On Islamic Calendar Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicCalendarComponent = new IslamicCalendarComponent();
		homePageComponent = new HomePageComponent();
		homePageComponent.searchTopNavBar();

		islamicCalendarComponent.clickIslamicCalendarButton();
		islamicCalendarComponent.clickResetButtonOnIslamicCalendar();
		islamicCalendarComponent.selectMonthInDropDown("August");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		islamicCalendarComponent.selectYearInDropDown("1992");
		Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String checkGregorianCalendarAugust1992 = islamicCalendarComponent.checkGregorianCalendarAugust1992();
		Assert.assertEquals(checkGregorianCalendarAugust1992, "Gregorian Calendar August 1992");

		String checkAugust1992Text = islamicCalendarComponent.checkAugust1992Text();
		Assert.assertEquals(checkAugust1992Text, "August 1992");

		Thread.sleep(1000);
		String checkSafar1413Text = islamicCalendarComponent.checkSafar1413Text();
		Assert.assertEquals(checkSafar1413Text, "Safar 1413");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(1000);
		String checkRabiAlAwwal1413Text = islamicCalendarComponent.checkRabiAlAwwal1413Text();
		Assert.assertEquals(checkRabiAlAwwal1413Text, "Rabi Al-Awwal 1413");

		Thread.sleep(1000);
		String checkAugust15_1992Text = islamicCalendarComponent.checkAugust15_1992Text();
		Assert.assertEquals(checkAugust15_1992Text, "15");
	}

	@Test
	public void testViewPrayerTimeAndViewDateConverterCard() throws Exception {
		System.out
				.println("<------Testing ViewPrayerTime AND ViewDateConverter Card On Islamic Calendar Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicCalendarComponent = new IslamicCalendarComponent();
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();

		islamicCalendarComponent.clickIslamicCalendarButton();
		islamicCalendarComponent.checkOfferYourSalahOnTimeText();
		islamicCalendarComponent.clickOnViewPrayersTimeButton();
		prayerTimesPageComponent.checkLahorePunjabPakistanText();
		islamicCalendarComponent.clickIslamicCalendarButton();
		islamicCalendarComponent.checkSwitchBetGregorianAndHijriText();
		islamicCalendarComponent.clickOnViewDateConverterButton();
		homePageComponent.checkIslamicDateConverterGregorianCalendarConverter();
		islamicCalendarComponent.clickIslamicCalendarButton();

	}

	@Test(enabled = false) // because, now, this card is not present on Islamic
							// Calendar Page
	void testSpecialIslamicDaysCard() throws Exception {
		System.out.println("<------Testing Special Islamic Days Card On Islamic Calendar Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicCalendarComponent = new IslamicCalendarComponent();
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();

		islamicCalendarComponent.clickIslamicCalendarButton();
		islamicCalendarComponent.checkSpecialIslamicDaysText();
		islamicCalendarComponent.clickListOfSpecialIslamicDays();
	}

	@Test
	public void testKnowYourHijriDatesCardOnIslamicCalendarPage() throws Exception {
		System.out.println("<------Testing Know Your Hijri Dates Card On Islamic Calendar Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicCalendarComponent = new IslamicCalendarComponent();
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();

		islamicCalendarComponent.clickIslamicCalendarButton();
		String checkknowYourHijriDatesText = islamicCalendarComponent.checkknowYourHijriDatesText();
		Assert.assertEquals(checkknowYourHijriDatesText, "Know your Hijri dates!");
		islamicCalendarComponent.clickOnDateConverterButton();
		homePageComponent.checkIslamicDateConverterGregorianCalendarConverter();
		islamicCalendarComponent.clickIslamicCalendarButton();
	}

	@Test
	public void testUpcomingEventsCardOnIslamicCalendarPage() throws Exception {
		System.out.println("<------Testing Upcoming Events Card On Islamic Calendar Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicCalendarComponent = new IslamicCalendarComponent();
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();

		islamicCalendarComponent.clickIslamicCalendarButton();
		testUpcomingEventsCard();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
