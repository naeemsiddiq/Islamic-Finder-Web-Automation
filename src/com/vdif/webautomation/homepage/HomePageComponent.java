/**
 * 
 */
package com.vdif.webautomation.homepage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author Naeem Siddiq
 *
 */
public class HomePageComponent extends AbstractComponent {

	HomePageLocators homePageLocators = PageFactory.initElements(driver, HomePageLocators.class);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement waitElement;

	/// For Top NavBar

	public String checkH1Tag() {
		String element = homePageLocators.h1Tag.getText();
		return element;
	}

	public void searchTopNavBar() throws Exception {

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		WebElement element=homePageLocators.topNavBarSearch;
		
		Actions action = new Actions(driver);
		action.moveToElement(element);
		action.perform();
		System.err.println(driver.getTitle());
		System.err.println(element.getText());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		
		element.sendKeys(homePageLocators.lahore);
		Thread.sleep(3000);
		driver.findElement(By.linkText("Lahore, Punjab, Pakistan")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		
		
	}

	public void openSettingspanel() throws Exception {
		homePageLocators.openSettingPanel.click();
		Thread.sleep(1000);
	}

	public String checkLocationText() {
		String checkLocationText = homePageLocators.checkLocationText.getText();
		System.out.println(checkLocationText);
		return checkLocationText;
	}

	public void switchOffAutoPaddle() {
		homePageLocators.switchAutoPaddle.click();
	}

	public void switchOnAutoPaddle() {
		homePageLocators.switchAutoPaddle.click();
	}

	public void closeSettingspanel() throws Exception {
		Thread.sleep(1000);
		WebElement element = homePageLocators.closeSettingPanel;
		scrollAndClick(element);
	}

	public void closePrompt() {
		homePageLocators.closePrompt.click();
	}

	public void clickDropDownEnglish() throws Exception {
		homePageLocators.clickDropDownEnglish.click();
		Thread.sleep(1000);
	}

	public void clickArabic() throws Exception {
		homePageLocators.clickArabic.click();
		Thread.sleep(1000);
	}

	public void clickDropDownArabic() throws Exception {
		homePageLocators.clickDropDownArabic.click();
		Thread.sleep(1000);
	}

	public void clickEnglish() throws Exception {
		homePageLocators.clickEnglish.click();
		Thread.sleep(1000);
	}

	public void clickLoginText() throws Exception {
		homePageLocators.clickLogin.click();
		Thread.sleep(1000);
	}

	public void clickHomeButton() throws Exception {
		WebElement element = homePageLocators.homeButton;
		scrollAndClick(element);
	}

	/********       ********/
	// For Prayer Times Card on Home Page
	public void clickOnPrayerTimesToday() {
		homePageLocators.prayerTimesToday.click();
	}

	public String checkLahorePunjabPakistanText() {
		WebElement element = homePageLocators.lahorePunjabPakistan;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnThisWeek() {
		homePageLocators.clickOnThisWeek.click();
	}

	public void clickOnWrongLocation() {
		homePageLocators.wrongLocation.click();
	}

	public String checkUpcomingPrayersText() {
		WebElement element = homePageLocators.upcomingPrayers;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnSeeMonthlyPrayerTime() {
		homePageLocators.seeMonthlyPrayers.click();
	}

	public void verifyListOfNamaz() throws Exception {
		ArrayList<String> headingOnTopUps = new ArrayList<>(Arrays.asList("Fajr (Morning)", "Sunrise", "Dhuhr (Noon)",
				"Asr (Late Afternoon)", "Maghrib (Evening)", "Isha (Night)", "Qiyam"));
		ArrayList<String> closePopUpPath = new ArrayList<>(Arrays.asList("popup-fajr-info", "popup-sunrise-info",
				"popup-dhuhr-info", "popup-asr-info", "popup-maghrib-info", "popup-isha-info", "popup-qiyam-info"));
		List<WebElement> listOfPrayerName = homePageLocators.listOfPrayerNames;
		for (int i = 0; i < listOfPrayerName.size(); i++) {
			listOfPrayerName.get(i).click();
			Assert.assertEquals(checkHeadingOnTopUps(headingOnTopUps.get(i)), headingOnTopUps.get(i));
			closePopUp(closePopUpPath.get(i));
		}

	}

	public void verifyListOfCalculationMethodJMDSLatLng() throws Exception {

		ArrayList<String> closePopUpPath = new ArrayList<>(
				Arrays.asList("popup-calculation-info", "popup-latlng-info", "popup-daylight-info"));
		ArrayList<String> headingOnTopUps = new ArrayList<>(
				Arrays.asList("Calculation Method", "Latitude and Longitude", "Daylight Saving Time"));

		List<WebElement> parentRow = homePageLocators.listOf_CalculationMethod_JM_DS_LatLng;
		for (int i = 0; i < parentRow.size() - 1; i++) {
			System.out.println(parentRow.get(i).findElement(By.tagName("span")).getText());
			parentRow.get(i).findElement(By.tagName("span")).click();
			checkAssert(headingOnTopUps.get(i), checkHeadingOnTopUps(headingOnTopUps.get(i)));
			closePopUp(closePopUpPath.get(i));
			System.out.println(parentRow.get(i).findElement(By.tagName("p")).getText());
		}

	}

	public void closePopUp(String path) {
		WebElement element = homePageLocators.popUpclosePath(path);
		element.click();
	}

	public String checkHeadingOnTopUps(String path) {
		String element = homePageLocators.headingOnTopUp(path);
		return element;
	}

	public void openChangeSettingsPanel() throws Exception {
		WebElement element = homePageLocators.openChangeSettings;
		scrollAndClick(element);
	}

	/********       ********/
	// For Verse Of The Day Card on Home Page
	public String checkVerseOfTheDayText() {
		WebElement element = homePageLocators.verseOfTheDayText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkTranslatedInUrduText() {
		WebElement element = homePageLocators.translatedInUrduText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSharePanelOnVerseOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.openSharePanelOnVerseOfTheDayCard;
		scrollAndClick(element);
	}

	public void closeSharePanelOnVerseOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.closeSharePanelOnVerseOfTheDayCard;
		scrollAndClick(element);
	}

	public void clickOnreciteAlQuranWithTranslation() throws Exception {
		WebElement element = homePageLocators.reciteAlQuranWithTranslation;
		scrollAndClick(element);
	}

	/********       ********/
	// For Popular Surah and Verses Card on Home Page

	public String checkPopularSurahAndVersesText() {
		WebElement element = homePageLocators.popularSurahAndVersesText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickSurahYasinText() throws Exception {
		WebElement element = homePageLocators.surahYasinText;
		scrollAndClick(element);
	}

	public void clickSurahBaqarahText() throws Exception {
		WebElement element = homePageLocators.surahBaqarahText;
		scrollAndClick(element);
	}

	public void clickSurahNisaText() throws Exception {
		WebElement element = homePageLocators.surahNisaText;
		scrollAndClick(element);
	}

	/********       ********/
	// For Articles on Iqra Card on Home Page

	public String checkArticlesOnIqraText() {
		WebElement element = homePageLocators.articlesOnIqraText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSeeAllPostsOnIqraCard() throws Exception {
		WebElement element = homePageLocators.seeAllPostsText;
		Thread.sleep(1000);
		scrollAndClick(element);
	}

	/********       ********/
	// For Islamic Gallery Card on Home Page

	public String checkIslamicGalleryText() {
		WebElement element = homePageLocators.islamicGalleryText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSeeAllOnIslamicGalleryCard() throws Exception {
		WebElement element = homePageLocators.seeAllText;
		scrollAndClick(element);
	}

	/********       ********/
	// For Islamic Gallery Card on Home Page

	public String checkYourMonthlyPrayerbookText() {
		WebElement element = homePageLocators.seeYourMonthlyPrayerbookText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickloginButtonOnSeeYourMonthlyPrayerBook() throws Exception {
		WebElement element = homePageLocators.loginButtonOnSeeYourMonthlyPrayerBook;
		scrollAndClick(element);
	}

	/********       ********/
	// For Dua of the Day Card on Home Page

	public String checkDuaOfTheDayText() {
		WebElement element = homePageLocators.duaOfTheDayText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void openSharePanelOnDuaOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.openSharePanelOnDuaOfTheDayCard;
		scrollAndClick(element);
	}

	public void clickOnReadAllDuasOnDuaOfTheDayCard() throws Exception {
		WebElement element = homePageLocators.readAllDuas;
		scrollAndClick(element);
	}

	/********       ********/
	// For Upcoming Event Card on Home Page

	public String checkUpcomingEventText() {
		WebElement element = homePageLocators.upcomingEventText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnLearnMoreButtonOnUpcomingEventCard() throws Exception {
		WebElement element = homePageLocators.learnMoreButtonOnUpcomingEventCard;
		scrollAndClick(element);
	}

	public void clickOnSeeAllIslamicDaysOnUpcomingEventCard() throws Exception {
		WebElement element = homePageLocators.seeAllIslamicDays;
		scrollAndClick(element);
	}

	/********       ********/
	// For Top Places in Lahore Card on Home Page

	public String checkTopPlacesInLahoreText() {
		WebElement element = homePageLocators.topPlacesInLahoreText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnSeeMoreIslamicPlacesOnTopPlacesInLahoreCard() throws Exception {
		WebElement element = homePageLocators.seeMoreIslamicPlacesOnTopPlacesInLahoreCard;
		scrollAndClick(element);
	}

	/********       ********/
	// For Stay Updated Card on Home Page

	public void enterNameInStayUpdatedCard() {
		homePageLocators.nameInStayUpdatedCard.clear();
		homePageLocators.nameInStayUpdatedCard.sendKeys("VD_CHECK");
	}

	public void enterEmailInStayUpdatedCard() throws Exception {
		homePageLocators.emailInStayUpdatedCard.clear();
		homePageLocators.emailInStayUpdatedCard.sendKeys("vdcheck123@gmail.com");
	}

	public void ClicksubscribeButtonInStayUpdatedCard() throws Exception {
		homePageLocators.subscribeButtonInStayUpdatedCard.click();
		Thread.sleep(1500);
	}

	public void verifyThankYouMessageInStayUpdatedCard() throws Exception {
		WebElement element = homePageLocators.thankYouMessageInStayUpdatedCard;
		scrollAndClick(element);
	}

	/********       ********/
	// For Top Places in Lahore Card on Home Page

	public void clickOnfooterHomeLink() throws Exception {
		WebElement element = homePageLocators.footerHomeLink;
		scrollAndClick(element);
	}

	public void clickOnfooterDuaLink() throws Exception {
		WebElement element = homePageLocators.footerDuaLink;
		scrollAndClick(element);
	}

	public void checkDuasIslamicandQuranic_TextOnDuaPage() throws Exception {
		WebElement element = homePageLocators.checkDuasIslamicandQuranic_TextOnDuaPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Duas - Islamic and Quranic Duas in Arabic with Translation");
	}

	public void clickOnfooterPrayerTimesLink() throws Exception {
		WebElement element = homePageLocators.footerPrayerTimesLink;
		scrollAndClick(element);
	}

	public void checkPrayerTimesTextOnPrayerTimesPage() throws Exception {
		WebElement element = homePageLocators.checkPrayerTimesTextOnPrayerTimesPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Prayer Times in Lahore");
	}

	public void clickOnfooterIslamicPacesLink() throws Exception {
		WebElement element = homePageLocators.footerIslamicPacesLink;
		scrollToLocateElement(element);
	}

	public void checkNearByMosquesAndIslamicPlacesIPage() throws Exception {
		WebElement element = homePageLocators.checkNearByMosquesAndIslamicPlacesIPage;
		System.out.println(element.getText());
	}

	public void clickOnfooterQiblaDirectionLink() throws Exception {
		WebElement element = homePageLocators.footerQiblaDirectionLink;
		scrollToLocateElement(element);
	}

	public void checkQiblaDirectionAndQiblaCompass() throws Exception {
		WebElement element = homePageLocators.checkQiblaDirectionAndQiblaCompass;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Qibla Direction and Qibla Compass in Lahore");
	}

	public void clickOnfooterWorldLink() throws Exception {
		WebElement element = homePageLocators.footerWorldLink;
		scrollAndClick(element);
	}

	public void checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage() throws Exception {
		WebElement element = homePageLocators.checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Find Prayer Times in your Country");
	}

	public void clickOnfooterCalenderLink() throws Exception {
		WebElement element = homePageLocators.footerCalenderLink;
		scrollAndClick(element);
	}

	public void checkIslamicCalendarOnCalenderPage() throws Exception {
		WebElement element = homePageLocators.checkIslamicCalendarOnCalenderPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Islamic Calendar 2018 - Hijri Calendar");
	}

	public void clickOnfooterIslamicDaysLink() throws Exception {
		WebElement element = homePageLocators.footerIslamicDaysLink;
		scrollAndClick(element);
	}

	public String checkSpecialIslamicDaysPageOnIslamicDaysPage() throws Exception {
		WebElement element = homePageLocators.checkSpecialIslamicDaysPage;
		return element.getText();
	}

	public void clickOnfooterDateConverterLink() throws Exception {
		WebElement element = homePageLocators.footerDateConverterLink;
		scrollAndClick(element);
	}

	public void checkIslamicDateConverterGregorianCalendarConverter() throws Exception {
		WebElement element = homePageLocators.checkIslamicDateConverterGregorianCalendarConverter;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Islamic Date Converter - Gregorian Calendar Converter");
	}

	public void clickOnfooterIslamicGalleryLink() throws Exception {
		WebElement element = homePageLocators.footerIslamicGalleryLink;
		scrollAndClick(element);
	}

	public void checkIsIslamicGalleryBestCollectionofIslamicPictures() throws Exception {
		WebElement element = homePageLocators.checkIsIslamicGalleryBestCollectionofIslamicPictures;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Islamic Gallery - Best Collection of Islamic Pictures");
	}

	public void clickOnfooterProductsLink() throws Exception {
		WebElement element = homePageLocators.footerProductsLink;
		scrollAndClick(element);
	}

	public void checkStayOnTopOfYourSalahOnProductPage() throws Exception {
		WebElement element = homePageLocators.checkStayOnTopOfYourSalahOnProductPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "STAY ON TOP OF YOUR SALAH\nWITH ALL NEW");
	}

	public void clickOnfooterAthanLink() throws Exception {
		WebElement element = homePageLocators.footerAthanLink;
		scrollAndClick(element);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void clickIslamicFinderLogoToComeBackToHomePageFooter() throws Exception {
		WebElement element = homePageLocators.clickIslamicFinderLogoToComeBackToHomePageFooter;
		scrollAndClick(element);
	}

	public void clickOnfooterInspirationsLink() throws Exception {
		WebElement element = homePageLocators.footerInspirationsLink;
		scrollAndClick(element);
	}

	public void checkInspirationsForMuslims() throws Exception {
		WebElement element = homePageLocators.checkInspirationsForMuslims;
		Thread.sleep(1000);
		checkAssert(element.getText(), "INSPIRATIONS FOR MUSLIMS");
	}

	public void clickOnfooterTasbeehLink() throws Exception {
		WebElement element = homePageLocators.footerTasbeehLink;
		scrollAndClick(element);
	}

	public void checkStayOnTopOfYourSalahOnTasbeehPage() throws Exception {
		WebElement element = homePageLocators.checkStayOnTopOfYourSalahOnTasbeehPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "STAY ON TOP OF YOUR SALAH\nWITH ALL NEW");
	}

	public void clickOnfooterPrayerWidgetsLink() throws Exception {
		WebElement element = homePageLocators.footerPrayerWidgetsLink;
		scrollAndClick(element);
	}

	public void checkAddIslamicFinderServicestoYourSiteOnWidgetsPage() throws Exception {
		WebElement element = homePageLocators.checkAddIslamicFinderServicestoYourSiteOnWidgetsPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Add IslamicFinder Services to Your Site");
	}

	public void clickOnfooterRamadan2017Link() throws Exception {
		WebElement element = homePageLocators.footerRamadan2017Link;
		scrollAndClick(element);
	}

	public void checkRamadanKareemOnRamadan2017Page() throws Exception {
		WebElement element = homePageLocators.checkRamadanKareemOnRamadan2017Page;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Ramadan Kareem");
	}

	public void clickOnfooterHajj2017Link() throws Exception {
		WebElement element = homePageLocators.footerHajj2017Link;
		scrollAndClick(element);
	}

	public void checkHajj2017OnHajjPage() throws Exception {
		WebElement element = homePageLocators.checkHajj2017OnHajjPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Hajj 2017\nPilgrimage, Eid Ul Adha and Sacrifice");
	}

	public void clickOnfooterAboutLink() throws Exception {
		WebElement element = homePageLocators.footerAboutLink;
		scrollAndClick(element);
	}

	public void checkAboutIslamicFinderPage() throws Exception {
		WebElement element = homePageLocators.checkAboutIslamicFinderPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "About IslamicFinder");
	}

	public void clickOnfooterIqraTheBlogLink() throws Exception {
		WebElement element = homePageLocators.footerIqraTheBlogLink;
		scrollAndClick(element);
	}

	public void checkIQRAOnIqraTheBlogPage() throws Exception {
		WebElement element = homePageLocators.checkIQRAOnIqraTheBlogPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "IQRA");
	}

	public void clickOnfooterAdvertiseWithUsLink() throws Exception {
		WebElement element = homePageLocators.footerAdvertiseWithUsLink;
		scrollAndClick(element);
	}

	public void checkAboutIslamicFinderOnAdvertiseWithUsPage() throws Exception {
		WebElement element = homePageLocators.checkAboutIslamicFinderOnAdvertiseWithUsPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "About IslamicFinder");
	}

	public void clickOnfooterTalkToUsLink() throws Exception {
		WebElement element = homePageLocators.footerTalkToUsLink;
		scrollAndClick(element);
	}

	public void checkTalkToUsOnTalkUsPage() throws Exception {
		WebElement element = homePageLocators.checkTalkToUsOnTalkUsPage;
		Thread.sleep(1000);
		checkAssert(element.getText(), "Talk to us");
	}

	public void clickViewDetailsLinkOnTopPlacesCard() throws Exception {
		WebElement element = homePageLocators.viewDetailsLinkOnTopPlacesCard;
		scrollAndClick(element);
	}

	public String checkTestLinkOnTopPlacesCard() throws Exception {
		String element = homePageLocators.testLinkOnTopPlacesCard.getText();
		System.out.println(element);
		return element;
	}

	public void openSharePanelOnIslamicGallery() throws Exception {
		WebElement element = homePageLocators.shareButtonOnIslamicGallery;
		scrollAndClick(element);
	}

	public String checkShareTextOnSharePanel() throws Exception {
		String element = homePageLocators.shareTextOnSharePanel.getText();
		System.out.println(element);
		return element;
	}

}
