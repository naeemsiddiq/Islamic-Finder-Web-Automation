package com.vdif.webautomation.homepage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vdif.webautomation.HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook;

public class TestHomePage extends HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook {

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing Home Page Islamic Finder----------------------->>\n");
	}

	@Test(priority = 0)
	public void testTopNavBar() throws Exception {
		System.out.println("<------Testing Top NavBar------->\n");
		incrementAndOpenURLpage();
		checkLogo();
		HomePageComponent homePagecomponent = new HomePageComponent();

		homePagecomponent.searchTopNavBar();
		homePagecomponent.clickDropDownEnglish();
		homePagecomponent.clickArabic();
		homePagecomponent.clickDropDownArabic();
		homePagecomponent.clickEnglish();
		homePagecomponent.clickLoginText();
		homePagecomponent.clickHomeButton();
		homePagecomponent.openSettingspanel();
		String checkLocationText = homePagecomponent.checkLocationText();
		Assert.assertEquals(checkLocationText, "LOCATION");
		homePagecomponent.switchOffAutoPaddle();
		homePagecomponent.switchOnAutoPaddle();
		homePagecomponent.closeSettingspanel();
		homePagecomponent.closePrompt();
	}

	@Test(priority = 1)
	public void testPrayerTimesCardOnHomePage() throws Exception {
		System.out.println("<------Testing Prayer Times Cards on Home Page------->\n");
		incrementAndOpenURLpage();
		checkLogo();
		Thread.sleep(1000);
		testPrayerTimesCard();
	}

	@Test(priority = 2)
	public void testVerseOfTheDayCardOnHomePage() throws Exception {
		System.out.println("<------Testing Verse Of The Day Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		testVerseOfTheDayCard();
		homePagecomponent.clickHomeButton();

	}

	@Test(priority = 3)
	public void testPopularSurahAndVersesCardOnHomePage() throws Exception {
		System.out.println("<------Testing Popular Surah and Verses Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		String checkVerseOfTheDayText = homePagecomponent.checkPopularSurahAndVersesText();
		Assert.assertEquals(checkVerseOfTheDayText, "Popular Quranic Surahs and Verses");

		homePagecomponent.clickSurahYasinText();
		homePagecomponent.clickHomeButton();
		homePagecomponent.clickSurahBaqarahText();
		homePagecomponent.clickHomeButton();
		homePagecomponent.clickSurahNisaText();
		homePagecomponent.clickHomeButton();

	}

	@Test(priority = 4)
	public void testArticlesOnIqraCardOnHomePage() throws Exception {
		System.out.println("<------Testing Articles on Iqra Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		testArticlesOnIqraCard();
	}

	@Test(priority = 5)
	public void testIslamicGalleryCardOnHomePage() throws Exception {
		System.out.println("<------Testing Islamic Gallery Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		testIslamicGalleryCard();
		homePagecomponent.clickHomeButton();
	}

	@Test(priority = 6)
	public void testSeeYourMonthlyPrayerbookCardOnHomePage() throws Exception {
		System.out.println("<------Testing See Your Monthly Prayerbook Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		testSeeYourMonthlyPrayerbookCard();
		homePagecomponent.clickHomeButton();
	}

	@Test(priority = 7)
	public void testDuaOfTheDayCardOnHomePage() throws Exception {
		System.out.println("<------Testing Dua of the Day Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();

		homePagecomponent.searchTopNavBar();
		String checkDuaOfTheDayText = homePagecomponent.checkDuaOfTheDayText();
		Assert.assertEquals(checkDuaOfTheDayText, "Dua of the Day");

		homePagecomponent.openSharePanelOnDuaOfTheDayCard();
		homePagecomponent.clickHomeButton();
		homePagecomponent.clickOnReadAllDuasOnDuaOfTheDayCard();
		homePagecomponent.clickHomeButton();

	}

	@Test(priority = 8)
	public void testUpcomingEventCardOnHomePage() throws Exception {
		System.out.println("<------Testing Upcoming Event Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();

		homePagecomponent.searchTopNavBar();
		testUpcomingEventsCard();
	}

	@Test(enabled = false) // Now, This card in not on homepage.
	public void testTopPlacesInLahoreCardOnHomePage() throws Exception {
		System.out.println("<------Testing Top Places in Lahore Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();

		homePagecomponent.searchTopNavBar();
		String checkTopPlacesInLahoreText = homePagecomponent.checkTopPlacesInLahoreText();
		Assert.assertEquals(checkTopPlacesInLahoreText, "Top Places in Lahore");
		homePagecomponent.clickViewDetailsLinkOnTopPlacesCard();

		String h1Tag = homePagecomponent.checkH1Tag();
		checkAssert(h1Tag, "test");
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
		homePagecomponent.clickOnSeeMoreIslamicPlacesOnTopPlacesInLahoreCard();
		homePagecomponent.clickHomeButton();

	}

	@Test(priority = 9)
	public void testStayUpdatedCardOnHomePage() throws Exception {
		System.out.println("<------Testing Stay Updated Card on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePageComponent = new HomePageComponent();

		homePageComponent.enterNameInStayUpdatedCard();
		homePageComponent.enterEmailInStayUpdatedCard();
		homePageComponent.ClicksubscribeButtonInStayUpdatedCard();
		homePageComponent.verifyThankYouMessageInStayUpdatedCard();

	}

	@Test(priority = 10)
	public void testFooterOnHomePage() throws Exception {
		System.out.println("<------Testing Footer on Home Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		HomePageComponent homePagecomponent = new HomePageComponent();

		homePagecomponent.searchTopNavBar();
		homePagecomponent.clickOnfooterHomeLink();
		homePagecomponent.clickOnfooterDuaLink();
		homePagecomponent.checkDuasIslamicandQuranic_TextOnDuaPage();
		homePagecomponent.clickOnfooterPrayerTimesLink();
		homePagecomponent.checkPrayerTimesTextOnPrayerTimesPage();
		homePagecomponent.clickOnfooterIslamicPacesLink();
		homePagecomponent.checkNearByMosquesAndIslamicPlacesIPage();
		homePagecomponent.clickOnfooterQiblaDirectionLink();
		homePagecomponent.checkQiblaDirectionAndQiblaCompass();
		homePagecomponent.clickOnfooterWorldLink();
		homePagecomponent.checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage();
		homePagecomponent.clickOnfooterCalenderLink();
		homePagecomponent.checkIslamicCalendarOnCalenderPage();
		homePagecomponent.clickOnfooterIslamicDaysLink();
		homePagecomponent.checkSpecialIslamicDaysPageOnIslamicDaysPage();
		homePagecomponent.clickOnfooterDateConverterLink();
		homePagecomponent.checkIslamicDateConverterGregorianCalendarConverter();
		homePagecomponent.clickOnfooterIslamicGalleryLink();
		homePagecomponent.checkIsIslamicGalleryBestCollectionofIslamicPictures();
		homePagecomponent.clickOnfooterProductsLink();
		homePagecomponent.checkStayOnTopOfYourSalahOnProductPage();
		homePagecomponent.clickOnfooterAthanLink();
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
		homePagecomponent.clickIslamicFinderLogoToComeBackToHomePageFooter();
		homePagecomponent.clickOnfooterInspirationsLink();
		homePagecomponent.checkInspirationsForMuslims();
		homePagecomponent.clickOnfooterTasbeehLink();
		homePagecomponent.checkStayOnTopOfYourSalahOnTasbeehPage();
		homePagecomponent.clickOnfooterPrayerWidgetsLink();
		homePagecomponent.checkAddIslamicFinderServicestoYourSiteOnWidgetsPage();
		homePagecomponent.clickOnfooterRamadan2017Link();
		homePagecomponent.checkRamadanKareemOnRamadan2017Page();
		homePagecomponent.clickOnfooterHajj2017Link();
		homePagecomponent.checkHajj2017OnHajjPage();
		homePagecomponent.clickOnfooterAboutLink();
		homePagecomponent.checkAboutIslamicFinderPage();
		homePagecomponent.clickOnfooterIqraTheBlogLink();
		homePagecomponent.checkIQRAOnIqraTheBlogPage();
		homePagecomponent.clickOnfooterAdvertiseWithUsLink();
		homePagecomponent.checkAboutIslamicFinderOnAdvertiseWithUsPage();
		homePagecomponent.clickOnfooterTalkToUsLink();
		homePagecomponent.checkTalkToUsOnTalkUsPage();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}

}
