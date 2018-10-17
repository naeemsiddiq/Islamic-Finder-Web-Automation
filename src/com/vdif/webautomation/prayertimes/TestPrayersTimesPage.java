
/**
 * @author Naeem Siddiq
 *
 */
package com.vdif.webautomation.prayertimes;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook;
import com.vdif.webautomation.homepage.HomePageComponent;

public class TestPrayersTimesPage
		extends HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook {

	private static HomePageComponent homePageComponent;
	private static PrayerTimesPageComponent prayerTimesPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Prayers Time Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testPrayerTimeLahoreCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Prayer Times Lahore Card ------->\n");
		incrementAndOpenURLpage();
		checkLogo();

		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		homePageComponent.checkPrayerTimesTextOnPrayerTimesPage();
		prayerTimesPageComponent.checkLahorePunjabPakistanText();
		homePageComponent.clickOnWrongLocation();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickprayerTimesLinkOnPTLcard();
		homePageComponent.checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickpakistanLinkOnPTLcard();
		prayerTimesPageComponent.verifyPakistanLinkOnPTLcard();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickOnGetLinkOnPrayerTimes();
		prayerTimesPageComponent.checkCopyOnGetLinkPrayerTimesText();
		prayerTimesPageComponent.checkpTagOnPrayerTimesLahoreCard();
	}

	@Test
	public void testPrayerTimesCardOnPayerTimesPage() throws Exception {
		System.out.println("<------Testing Prayer Times Cards on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		homePageComponent.clickOnPrayerTimesToday();
		homePageComponent.checkUpcomingPrayersText();
		prayerTimesPageComponent.clickWeeklyAndMonthlyView();
		prayerTimesPageComponent.clickPrayerTimesButton();
		homePageComponent.verifyListOfCalculationMethodJMDSLatLng();
		homePageComponent.openChangeSettingsPanel();
		homePageComponent.closeSettingspanel();

	}

	@Test
	public void testVerseOfTheDayCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Verse Of The Day Card on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		testVerseOfTheDayCard();
		prayerTimesPageComponent.clickPrayerTimesButton();

	}


	@Test
	public void testIslamicGalleryCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Islamic Gallery Card on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		testIslamicGalleryCard();
		prayerTimesPageComponent.clickPrayerTimesButton();
	}

	@Test
	public void testSeeYourMonthlyPrayerbookCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing See Your Monthly Prayerbook Card on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		testSeeYourMonthlyPrayerbookCard();
		prayerTimesPageComponent.clickPrayerTimesButton();
	}

	@Test
	public void testDuaOfTheDayCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Dua of the Day Card on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		String checkDuaOfTheDayText = homePageComponent.checkDuaOfTheDayText();
		Assert.assertEquals(checkDuaOfTheDayText, "Dua of the Day");

		homePageComponent.openSharePanelOnDuaOfTheDayCard();
		prayerTimesPageComponent.clickPrayerTimesButton();
		homePageComponent.clickOnReadAllDuasOnDuaOfTheDayCard();
		prayerTimesPageComponent.clickPrayerTimesButton();

	}

	@Test
	public void testArticlesOnIqraCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Articles on Iqra Card on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		testArticlesOnIqraCard();
		prayerTimesPageComponent.clickPrayerTimesButton();
	}

	@Test
	public void testMosquesInThisCityCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Mosques in this city on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.checkMosquesInThisCityText();
		prayerTimesPageComponent.clickPrayerTimesButton();
	}

	@Test
	public void testWeeklyMonthlyYearlyCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Mosques in this city on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickWeeklyOnWMYCard();
		prayerTimesPageComponent.checkDayColumnOnWeekly();
		prayerTimesPageComponent.checkFriColumnOnWeekly();
		prayerTimesPageComponent.clickMonthlyOnWMYCard();
		prayerTimesPageComponent.selectMonthFromDropDown("March");
		prayerTimesPageComponent.selectYearFromDropDown("2016");
		Thread.sleep(1000);
		String checkTextJumaAlAwwal1437 = prayerTimesPageComponent.checkTextJumaAlAwwal1437();
		Assert.assertEquals(checkTextJumaAlAwwal1437, "Jumada Al-Awwal 1437");
	}

	@Test
	public void testPrayerTimesInOtherCitiesCardOnPrayerTimesPage() throws Exception {
		System.out.println("<------Testing Mosques in this city on Prayer Times Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePageComponent.searchTopNavBar();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickPrayerTimesInSpecificCity("Faisalabad");
		String h1Tag = homePageComponent.checkH1Tag();
		checkAssert(h1Tag, "Prayer Times in Faisalabad");

		Thread.sleep(1000);
		prayerTimesPageComponent.clickPrayerTimesInSpecificCity("Islamabad");
		h1Tag = homePageComponent.checkH1Tag();
		checkAssert(h1Tag, "Prayer Times in Islamabad");
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
