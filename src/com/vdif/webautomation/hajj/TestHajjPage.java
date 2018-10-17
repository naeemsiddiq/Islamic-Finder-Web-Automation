/**
 * 
 */
package com.vdif.webautomation.hajj;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
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

public class TestHajjPage extends AbstractComponent {

	private static HomePageComponent homePageComponent;
	private static HajjPageComponent hajjPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing Hajj 2017 Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testTopNavBarOnHajj2017Page() throws Exception {
		System.out.println("<------Testing Top NavBar On Hajj Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		homePageComponent = new HomePageComponent();
		hajjPageComponent = new HajjPageComponent();

		hajjPageComponent.clickHajj2017PageButton();
		checkLogo();
		hajjPageComponent.clickIqraPageLink();
		homePageComponent.checkIQRAOnIqraTheBlogPage(); // checkedIqraTextOnIqraPage
		hajjPageComponent.clickHajj2017PageButton();
		hajjPageComponent.clickIslamicGalleryLink();
		homePageComponent.checkIsIslamicGalleryBestCollectionofIslamicPictures();
		hajjPageComponent.clickHajj2017PageButton();
		hajjPageComponent.clickAlQuranLink();
		String check = hajjPageComponent.checkAlQuranWithTranslationTextOnAlQuranPage();
		Assert.assertEquals(check, "Al Quran with Translation");
		hajjPageComponent.clickHajj2017PageButton();
		hajjPageComponent.clickIslamicCalenderLink();
		homePageComponent.checkIslamicCalendarOnCalenderPage();    // MUST CHANE THE YEAR EVERY YEAR eg: in 2019 change its path from 2018 to 2019
		hajjPageComponent.clickHajj2017PageButton();
		hajjPageComponent.clickDuasPageLink();
		homePageComponent.checkDuasIslamicandQuranic_TextOnDuaPage();
		hajjPageComponent.clickHajj2017PageButton();

	}

	@Test
	public void testSideNavBarOnHajj2017Page() throws Exception {
		System.out.println("<------Testing Side NavBar On Hajj Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		hajjPageComponent = new HajjPageComponent();
		hajjPageComponent.clickHajj2017PageButton();
		hajjPageComponent.checkHajj2017Text();
		hajjPageComponent.clickCommencementOfHajjLink();
		hajjPageComponent.clickGoBackButtonOnHajjPage();
		hajjPageComponent.clickADayAtMinaLink();
		hajjPageComponent.clickGoBackButtonOnHajjPage();
		hajjPageComponent.clickADayOfArafatLink();
		hajjPageComponent.clickGoBackButtonOnHajjPage();
		hajjPageComponent.clickRamyJamaratLink();
		hajjPageComponent.clickGoBackButtonOnHajjPage();
		hajjPageComponent.clickEndOfHajjLink();
		hajjPageComponent.clickGoBackButtonOnHajjPage();

	}

	/********       ********/
	// For Hajj Live Card On Hajj Page

	@Test
	public void testHajjLiveCardOnHajj2017Page() throws Exception {
		System.out.println("<------Testing Hajj Live Card On Hajj Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		hajjPageComponent = new HajjPageComponent();
		Thread.sleep(1000);
		hajjPageComponent.clickHajj2017PageButton();
		String checkHajjLiveText = hajjPageComponent.checkHajjLiveText();
		Assert.assertEquals(checkHajjLiveText, "HAJJ LIVE");
		String checkHajjDuaText = hajjPageComponent.checkHajjDuaText();
		Assert.assertEquals(checkHajjDuaText,
				"لَبَّيْكَ اللَّهُمَّ لَبَّيْكَ، لَبَّيْكَ لا شَرِيكَلَكَ لَبَّيْكَ، انَّالْحَمْدَ، وَالنِّعْمَةَ، لَكَ وَالْمُلْكَ، لا شَرِيكَلَكَ");
		hajjPageComponent.clickViewAllDuasButton();
//		String checkFindDuasDuringHajj2017Text = hajjPageComponent.checkFindDuasDuringHajj2017Text();
//		Assert.assertEquals(checkFindDuasDuringHajj2017Text, "Find Duas During Hajj 2017, Eid Ul Adha & Sacrifice");
		((JavascriptExecutor)driver).executeScript("window.history.go(-1)");
	}

	/********       ********/
	// For Other Card On Hajj Page

	@Test(enabled=false)     // because it is completely automated on content and content is different on alpha,codefreeze and live
	public void testOtherCardOnHajj2017Page() throws Exception {
		System.out.println("<------Testing Other Card Card On Hajj Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		hajjPageComponent = new HajjPageComponent();
		hajjPageComponent.clickHajj2017PageButton();
		hajjPageComponent.checkTheHistoryAndImportanceOfIslamicCalendarText();
		hajjPageComponent.checkSurahBaqarahVerse125Text();
		hajjPageComponent.checkHajjText();
		hajjPageComponent.checkSurahBaqarahVerse196Text();
		hajjPageComponent.checkSurahMaaidaVerse1Text();

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}

}
