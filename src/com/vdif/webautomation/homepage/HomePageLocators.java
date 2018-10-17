/**
 * 
 */
package com.vdif.webautomation.homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Naeem Siddiq
 *
 */
public class HomePageLocators {

	WebDriver driver;

	public HomePageLocators(WebDriver lDriver) {
		this.driver = lDriver;
	}

	/// For Top NavBar
	String lahore = "Lahore";

	
	@FindBy(how = How.TAG_NAME, using = "h1")
	WebElement h1Tag;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@id,'small-search')]")
	public
	WebElement topNavBarSearch;

	@FindBy(how = How.XPATH, using = "//a[@href='/my-location/1172451/']") ///xpath of lahore that contains href=/my-location/1172451/
	public
	WebElement searchCityfromSearch;

	@FindBy(how = How.XPATH, using = "//*[@id='onbtr-2']/img")
	WebElement openSettingPanel;

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'LOCATION')]")
	WebElement checkLocationText;

	@FindBy(how = How.XPATH, using = "//label[@class='switch-paddle']")
	WebElement switchAutoPaddle;

	@FindBy(how = How.XPATH, using = "//button[contains(@class,'circular')]")
	WebElement closePrompt;

	@FindBy(how = How.XPATH, using = "/html/body/header/section/div[1]/div[1]/button/span")
	WebElement closeSettingPanel;

	@FindBy(how = How.XPATH, using = "//i[contains(text(),'English')]")
	WebElement clickDropDownEnglish;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'العربية')]")
	WebElement clickArabic;

	@FindBy(how = How.XPATH, using = "//i[contains(text(),'العربية')]")
	WebElement clickDropDownArabic;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'English')]")
	WebElement clickEnglish;

	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Login')]")
	WebElement clickLogin;

	/********       ********/
	// For Prayer Times Card on Home Page
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Prayer Times')]")
	WebElement prayerTimesToday;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Lahore, Punjab, Pakistan')]")
	WebElement lahorePunjabPakistan;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'This Week')]")
	WebElement clickOnThisWeek;

	@FindBy(how = How.LINK_TEXT, using = "Wrong Location?")
	WebElement wrongLocation;

	@FindBy(how = How.LINK_TEXT, using = "Home")
	WebElement homeButton;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Upcoming Prayer')]")
	WebElement upcomingPrayers;

	@FindBy(how = How.LINK_TEXT, using = "SEE MONTHLY PRAYER TIMES")
	WebElement seeMonthlyPrayers;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'settingsContainer')]/div")
	List<WebElement> listOf_CalculationMethod_JM_DS_LatLng;

	@FindBy(how = How.LINK_TEXT, using = "CHANGE SETTINGS")
	WebElement openChangeSettings;

	/********       ********/
	// For Verse Of The Day Card on Home Page

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Quranic Verse of the Day')]")
	WebElement verseOfTheDayText;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Translated in Urdu')]")
	WebElement translatedInUrduText;

	@FindBy(how = How.XPATH, using = "//button[contains(text()[2],'Share')]")
	WebElement openSharePanelOnVerseOfTheDayCard;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'at-expanded-menu-container')]/button/span")
	WebElement closeSharePanelOnVerseOfTheDayCard;

	@FindBy(how = How.LINK_TEXT, using = "RECITE AL QURAN WITH TRANSLATION")
	WebElement reciteAlQuranWithTranslation;

	/********       ********/
	// For Popular Surah and Verses Card on Home Page

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Popular Quranic Surahs and Verses')]")
	WebElement popularSurahAndVersesText;

	@FindBy(how = How.LINK_TEXT, using = "Surah Yasin")
	WebElement surahYasinText;

	@FindBy(how = How.LINK_TEXT, using = "Surah Baqarah")
	WebElement surahBaqarahText;

	@FindBy(how = How.LINK_TEXT, using = "Surah Nisa")
	WebElement surahNisaText;

	/********       ********/
	// For Articles on Iqra Card on Home Page

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Articles on Iqra')]")
	WebElement articlesOnIqraText;

	@FindBy(how = How.LINK_TEXT, using = "SEE ALL IQRA POSTS")
	WebElement seeAllPostsText;

	/********       ********/
	// For Islamic Gallery Card on Home Page

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Islamic Gallery')]")
	WebElement islamicGalleryText;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'SEE ALL ISLAMIC IMAGES')]")
	WebElement seeAllText;

	/********       ********/
	// For See Your Monthly Prayerbook Card on Home Page

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'See Your Monthly Prayerbook')]")
	WebElement seeYourMonthlyPrayerbookText;

	@FindBy(how = How.LINK_TEXT, using = "LOGIN")
	WebElement loginButtonOnSeeYourMonthlyPrayerBook;

	/********       ********/
	// For Dua of the Day Card on Home Page

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Dua of the Day')]")
	WebElement duaOfTheDayText;

	@FindBy(how = How.XPATH, using = "//a[contains(text()[2],'Share')]")
	WebElement openSharePanelOnDuaOfTheDayCard;

	@FindBy(how = How.LINK_TEXT, using = "READ ALL ISLAMIC DUAS")
	WebElement readAllDuas;

	/********       ********/
	// For Upcoming Event Card on Home Page

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Upcoming Islamic Event')]")
	WebElement upcomingEventText;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Learn More') and contains(@class,'special')]")
	WebElement learnMoreButtonOnUpcomingEventCard;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'See all Islamic days')]")
	WebElement seeAllIslamicDays;

	/********       ********/
	// For Stay Updated Card on Home Page

	@FindBy(how = How.XPATH, using = "//*[@id='name']")
	WebElement nameInStayUpdatedCard;

	@FindBy(how = How.XPATH, using = "//*[@id='email']")
	WebElement emailInStayUpdatedCard;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-column']/form/div/div[1]/div/div[3]/input")
	WebElement subscribeButtonInStayUpdatedCard;
	
	@FindBy(how = How.XPATH, using = "//*[@id='main-column']/form/div/div[1]/p[2]")
	WebElement thankYouMessageInStayUpdatedCard;
	
	
	
	
	/********       ********/
	// For Top Places in Lahore Card on Home Page

	@FindBy(how = How.XPATH, using = "//*[@id='card-place-list']/div/div/div[1]/div/h3/div[2]/p")
	WebElement topPlacesInLahoreText;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'See More Islamic Places')]")
	WebElement seeMoreIslamicPlacesOnTopPlacesInLahoreCard;
	
	
	/********       ********/
	// For Footer
	
	@FindBy(how = How.XPATH, using = "//ul/a[contains(text(),'Home')]")
	WebElement footerHomeLink;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[1]/ul/li[1]/a")
	WebElement footerDuaLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Duas - Islamic and Quranic Duas in Arabic with Translation')]")
	WebElement checkDuasIslamicandQuranic_TextOnDuaPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[1]/ul/li[2]/a")
	WebElement footerPrayerTimesLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Prayer Times')]")
	WebElement checkPrayerTimesTextOnPrayerTimesPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[1]/ul/li[3]/a")
	WebElement footerIslamicPacesLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Nearby Mosques and Islamic Places in')]")
	WebElement checkNearByMosquesAndIslamicPlacesIPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[1]/ul/li[4]/a")
	WebElement footerQiblaDirectionLink;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text()[1],'Qibla Direction and Qibla Compass')]")
	WebElement checkQiblaDirectionAndQiblaCompass;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[1]/ul/li[5]/a")
	WebElement footerWorldLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Find Prayer Times in your Country')]")
	WebElement checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[2]/ul/li[1]/a")
	WebElement footerCalenderLink;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Islamic Calendar 2018 - Hijri Calendar')]")
	WebElement checkIslamicCalendarOnCalenderPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/a")
	WebElement footerIslamicDaysLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Special Islamic Days')]")
	WebElement checkSpecialIslamicDaysPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[2]/ul/li[4]/a")
	WebElement footerDateConverterLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Islamic Date Converter - Gregorian Calendar Converter')]")
	WebElement checkIslamicDateConverterGregorianCalendarConverter;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[2]/ul/li[5]/a")
	WebElement footerIslamicGalleryLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Islamic Gallery - Best Collection of Islamic Pictures')]")
	WebElement checkIsIslamicGalleryBestCollectionofIslamicPictures;
	//
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[3]/ul/a")
	WebElement footerProductsLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'STAY ON TOP OF YOUR SALAH')]")
	WebElement checkStayOnTopOfYourSalahOnProductPage;

	@FindBy(how = How.XPATH, using = "/html/body/div[21]/footer/div[1]/div/div/div[1]/div/div[3]/ul/li[1]/a")
	WebElement footerAthanLink;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'am-logo')]") 
	WebElement clickIslamicFinderLogoToComeBackToHomePageFooter;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[3]/ul/li[2]/a")
	WebElement footerInspirationsLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Inspirations for Muslims')]")
	WebElement checkInspirationsForMuslims;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[3]/ul/li[3]/a")
	WebElement footerTasbeehLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'STAY ON TOP OF YOUR SALAH')]")
	WebElement checkStayOnTopOfYourSalahOnTasbeehPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[3]/ul/li[4]/a")
	WebElement footerPrayerWidgetsLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Add IslamicFinder Services to Your Site')]")
	WebElement checkAddIslamicFinderServicestoYourSiteOnWidgetsPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[3]/ul/li[5]/a")
	WebElement footerRamadan2017Link;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Ramadan Kareem')]")
	WebElement checkRamadanKareemOnRamadan2017Page;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[3]/ul/li[6]/a")
	WebElement footerHajj2017Link;	
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Hajj 2017')]")
	WebElement checkHajj2017OnHajjPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[4]/ul/a")
	WebElement footerAboutLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'About IslamicFinder')]")
	WebElement checkAboutIslamicFinderPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[4]/ul/li[1]/a")
	WebElement footerIqraTheBlogLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'IQRA')]")
	WebElement checkIQRAOnIqraTheBlogPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[4]/ul/li[2]/a")
	WebElement footerAdvertiseWithUsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'About IslamicFinder')]")
	WebElement checkAboutIslamicFinderOnAdvertiseWithUsPage;
	
	@FindBy(how = How.XPATH, using = "/html/body/footer/div[1]/div/div/div[1]/div/div[4]/ul/li[3]/a")
	WebElement footerTalkToUsLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Talk to us')]")
	WebElement checkTalkToUsOnTalkUsPage;

	public String headingOnTopUp(String path) {
		WebElement element=driver.findElement(By.xpath("//strong[contains(text(),'"+path+"')]"));
		System.out.println(element.getText());
		return element.getText();
	}

	public WebElement popUpclosePath(String path) {
		WebElement element=driver.findElement(By.xpath("//*[@id='"+path+"']/button/span"));
		System.out.println(element.getText());
		return element;
	}
	
	public WebElement popUpNamazName(String path) {
		WebElement element=driver.findElement(By.xpath("//span[contains(text(),'"+path+"')] "));
		System.out.println(element.getText());
		return element;
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'todayPrayerNameContainer')]/span")
	List<WebElement> listOfPrayerNames;
	
	
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'test')]")
	WebElement testLinkOnTopPlacesCard;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Details') and contains(@href,'/world/view-place/15/')]")
	WebElement viewDetailsLinkOnTopPlacesCard;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Share') and contains(@class,'text-secondary')]")
	WebElement shareButtonOnIslamicGallery;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@id,'at-expanded-menu-title')]")
	WebElement shareTextOnSharePanel;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
