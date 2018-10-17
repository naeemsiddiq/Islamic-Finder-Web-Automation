/**
 * 
 */
package com.vdif.webautomation.hajj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class HajjPageLocators {

	WebDriver driver;

	public HajjPageLocators(WebDriver hdriver) {
		this.driver = hdriver;
	}

	/********       ********/
	// For Top NavBar On Hajj Page

	@FindBy(how = How.LINK_TEXT, using = "Hajj 2017")
	WebElement hajjPageButton;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Iqra')]")
	WebElement iqraLink;

	@FindBy(how = How.LINK_TEXT, using = "Islamic Gallery")
	WebElement islamicGalleryLink;

	@FindBy(how = How.LINK_TEXT, using = "Al Quran")
	WebElement alQuranLink;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Al Quran with Translation')]")
	WebElement alQuranWithTranslationTextOnAlQuranPage;

	@FindBy(how = How.LINK_TEXT, using = "Islamic Calendar")
	WebElement islamicCalendarLink;

	@FindBy(how = How.LINK_TEXT, using = "Duas")
	WebElement duasLink;

	/********       ********/
	// For Side NavBar On Hajj Page

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Hajj 2017')]")
	WebElement Hajj2017Text;

	@FindBy(how = How.XPATH, using = "//*[@id='day-0']/a/div[2]/h3")
	WebElement commencementOfHajjLink;

	@FindBy(how = How.LINK_TEXT, using = "Go Back")
	WebElement goBackButtonOnHajjPage;

	@FindBy(how = How.XPATH, using = "//*[@id='day-1']/a/div[2]/h3")
	WebElement aDayAtMinaLink;

	@FindBy(how = How.XPATH, using = "//*[@id='day-2']/a/div[2]/h3")
	WebElement aDayOfArafatLink;

	@FindBy(how = How.XPATH, using = "//*[@id='day-3']/a/div[2]/h3")
	WebElement ramyJamaratLink;

	@FindBy(how = How.XPATH, using = "//*[@id='day-4']/a/div[2]/h3")
	WebElement endOfHajjLink;

	/********       ********/
	// For Hajj Live Card On Hajj Page

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Hajj Live')]")
	WebElement hajjLiveText;

	@FindBy(how = How.XPATH, using = "//*[@id='second']/div/div[1]/div/h4")
	WebElement hajjDuaText;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View All Duas')]")
	WebElement viewAllDuasButton;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Find Duas During Hajj 2017, Eid Ul Adha & Sacrifice')]")
	WebElement findDuasDuringHajj2017Text;

	/********       ********/
	// For Other Card On Hajj Page

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'The History and Importance of Islamic Calendar')]")
	WebElement theHistoryAndImportanceOfIslamicCalendarText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'SURAH BAQARAH, VERSE 125 (2:125)')]")
	WebElement surahBaqarahVerse125Text;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'hajj')]")
	WebElement hajjText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'The story behind the stoning of Satan during Hajj')]")
	WebElement theStoryBehindTheStoningOfSatanDuringHajjText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'SURAH BAQARAH, VERSE 196 (2:196)')]")
	WebElement surahBaqarahVerse196Text;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Seek help through prayers!')]")
	WebElement seekHelpThroughPrayersText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Common mistakes made on the Day of Arafah')]")
	WebElement commonMistakesMadeOnTheDayOfArafahText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Smile :)')]")
	WebElement smileText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'Eid ul Adha: Celebrating it in a responsible way')]")
	WebElement eidulAdhaCelebratingItInAResponsibleWayText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'SURAH MAAIDA, VERSE 1 (5:1)')]")
	WebElement surahMaaidaVerse1Text;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pilgrimage, Eid Ul Adha and Sacrifice')]")
	WebElement pilgimageEidUlAdhaText;

	@FindBy(how = How.XPATH, using = "//h5[contains(text(),'End of Hajj')]")
	WebElement commencementOfHajj;

}
