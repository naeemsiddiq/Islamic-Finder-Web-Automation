/**
 * 
 */
package com.vdif.webautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author Naeem Siddiq
 *
 */
public class HelperClass_Home_PrayerTime_IslamicCalendar_SpecialIslamicDays_LoginAndPrayerbook
		extends AbstractComponent {

	protected static void testVerseOfTheDayCard() throws Exception {
		HomePageComponent homePagecomponent = new HomePageComponent();

		String checkVerseOfTheDayText = homePagecomponent.checkVerseOfTheDayText();
		Assert.assertEquals(checkVerseOfTheDayText, "Quranic Verse of the Day");

		String translatedInUrduText = homePagecomponent.checkTranslatedInUrduText();
		if (translatedInUrduText.equals("Translated in English"))
			Assert.assertEquals(translatedInUrduText, "Translated in English");
		else if (translatedInUrduText.equals("Translated in Urdu"))
			Assert.assertEquals(translatedInUrduText, "Translated in Urdu");

		homePagecomponent.openSharePanelOnVerseOfTheDayCard();
		homePagecomponent.closeSharePanelOnVerseOfTheDayCard();
		homePagecomponent.clickOnreciteAlQuranWithTranslation();
	}

	protected static void testPrayerTimesCard() throws Exception {
		HomePageComponent homePagecomponent = new HomePageComponent();
		homePagecomponent.searchTopNavBar();
		homePagecomponent.verifyListOfNamaz();
		homePagecomponent.checkLahorePunjabPakistanText();
		homePagecomponent.clickOnThisWeek();
		homePagecomponent.clickOnWrongLocation();
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
		homePagecomponent.checkUpcomingPrayersText();

		homePagecomponent.clickOnSeeMonthlyPrayerTime();
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

		homePagecomponent.verifyListOfCalculationMethodJMDSLatLng();
		homePagecomponent.openChangeSettingsPanel();
		homePagecomponent.closeSettingspanel();
	}

	protected void testArticlesOnIqraCard() throws Exception {
		HomePageComponent homePagecomponent = new HomePageComponent();
		String checkArticlesOnIqraText = homePagecomponent.checkArticlesOnIqraText();
		Assert.assertEquals(checkArticlesOnIqraText, "Articles on Iqra");
		homePagecomponent.openSeeAllPostsOnIqraCard();
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
	}

	protected static void testIslamicGalleryCard() throws Exception {
		HomePageComponent homePagecomponent = new HomePageComponent();
		String checkIslamicGalleryText = homePagecomponent.checkIslamicGalleryText();
		Assert.assertEquals(checkIslamicGalleryText, "Islamic Gallery");
		homePagecomponent.openSeeAllOnIslamicGalleryCard();
	}

	protected static void testSeeYourMonthlyPrayerbookCard() throws Exception {
		HomePageComponent homePagecomponent = new HomePageComponent();
		String checkYourMonthlyPrayerbookText = homePagecomponent.checkYourMonthlyPrayerbookText();
		Assert.assertEquals(checkYourMonthlyPrayerbookText, "See Your Monthly Prayerbook");
		homePagecomponent.clickloginButtonOnSeeYourMonthlyPrayerBook();
	}

	protected static void testUpcomingEventsCard() throws Exception {
		HomePageComponent homePageComponent = new HomePageComponent();
		String checkUpcomingEventText = homePageComponent.checkUpcomingEventText();
		Assert.assertEquals(checkUpcomingEventText, "UPCOMING ISLAMIC EVENT");
	}

}
