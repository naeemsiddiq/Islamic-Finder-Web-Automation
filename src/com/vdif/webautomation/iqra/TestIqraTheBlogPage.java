/**
 * 
 */
package com.vdif.webautomation.iqra;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.ArrayList;
import java.util.Arrays;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestIqraTheBlogPage extends AbstractComponent {

	IqraTheBlogComponent iqraTheBlogComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Iqra The Blog Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testHalalComicsTabOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing Halal Comics Tab On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(
				Arrays.asList("Moral Strips", "Motivation", "Comics", "Inspirational Stories", "Reviving Sunnah"));
		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(
				Arrays.asList("moral-strips", "motivation","comics", "inspirational-stories", "reviving-sunnah"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");
		iqraTheBlogComponent.clickOnTabNamed("Halal Comics");

		String latestArticlesOnHalalComicsText = iqraTheBlogComponent.checkLatestArticlesText();
		checkAssert(latestArticlesOnHalalComicsText, "LATEST ARTICLES ON HALAL COMICS");

		String checkHalalComicsTitleOnImage = iqraTheBlogComponent.checkTitleOnImageNamed("Halal Comics");
		checkAssert(checkHalalComicsTitleOnImage, "HALAL COMICS");

		iqraTheBlogComponent.clickAllLinkToCheckDetails();

		String checkHalalComicsTextOnHalalComicsPage = iqraTheBlogComponent.checkHeadingOnThePageNamed("Halal Comics");
		checkAssert(checkHalalComicsTextOnHalalComicsPage, "HALAL COMICS");

		iqraTheBlogComponent.clickOnOneArticle("Reviving the Sunnah");

		String checkRevivingTheSunnahArticleText = iqraTheBlogComponent
				.articleHeadingOnArticlePage("Reviving the Sunnah");
		checkAssert(checkRevivingTheSunnahArticleText, "Reviving the Sunnah");

		iqraTheBlogComponent.checkListOfArticleTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@Test(enabled = false)
	public void testUpdatesAndFeaturesTabOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing Updates And Features Tab On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(Arrays.asList("Prayers", "Calendar", "Hijri",
				"Special Days", "Places", "Qibla", "Salah", "Islamic Calendar", "Gregorian"));
		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(Arrays.asList("prayers", "calendar", "hijri",
				"special-days", "places", "qibla", "salah", "islamic-calendar", "gregorian-"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");
		iqraTheBlogComponent.clickOnTabNamed("Updates & Features");

		String latestArticlesOnHalalComicsText = iqraTheBlogComponent.checkLatestArticlesText();
		checkAssert(latestArticlesOnHalalComicsText, "LATEST ARTICLES ON UPDATES AND-FEATURES");

		String checkUpdatesAndFeaturesTitleOnImage = iqraTheBlogComponent.checkTitleOnImageNamed("Updates & Features");
		checkAssert(checkUpdatesAndFeaturesTitleOnImage, "UPDATES & FEATURES");

		iqraTheBlogComponent.clickAllLinkToCheckDetails();

		String checkUpdatesAndFeaturesTextOnUpdatesAndFeaturesPage = iqraTheBlogComponent
				.checkHeadingOnThePageNamed("Updates And Features");
		checkAssert(checkUpdatesAndFeaturesTextOnUpdatesAndFeaturesPage, "UPDATES AND FEATURES");

		iqraTheBlogComponent.clickOnOneArticle("All you need to know about IslamicFinder’s new look!");

		String checkAllYouNeedToKnowArticleText = iqraTheBlogComponent
				.articleHeadingOnArticlePage("All you need to know about IslamicFinder’s new look!");
		checkAssert(checkAllYouNeedToKnowArticleText, "All you need to know about IslamicFinder’s new look!");

		iqraTheBlogComponent.checkListOfArticleTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@Test(enabled = false)
	public void testLifestyleTabOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing Lifestyle Tab On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(Arrays.asList("best islamic business ideas",
				"muslimah millionaire", "halal business opportunities", "dua for starting a business", "urban halal",
				"islamic investors", "successful business tips", "keys to a successful business"));

		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(Arrays.asList("best-islamic-business-ideas",
				"muslimah-millionaire", "halal-business-opportunities", "dua-for-starting-a-business", "urban-halal",
				"islamic-investors", "successful-business-tips", "keys-to-a-successful-business"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");
		iqraTheBlogComponent.clickOnTabNamed("Lifestyle");

		String latestArticlesOnLifestyleText = iqraTheBlogComponent.checkLatestArticlesText();
		checkAssert(latestArticlesOnLifestyleText, "LATEST ARTICLES ON LIFESTYLE");

		String checkLifestyleTitleOnImage = iqraTheBlogComponent.checkTitleOnImageNamed("Lifestyle");
		checkAssert(checkLifestyleTitleOnImage, "LIFESTYLE");

		iqraTheBlogComponent.clickAllLinkToCheckDetails();

		String checkLifestyleTextOnLifestylePage = iqraTheBlogComponent.checkHeadingOnThePageNamed("Lifestyle");
		checkAssert(checkLifestyleTextOnLifestylePage, "LIFESTYLE");

		iqraTheBlogComponent.clickOnOneArticle("How to be an Entrepreneur the Halal way?");

		String checkEntrepreneurText = iqraTheBlogComponent
				.articleHeadingOnArticlePage("How to be an Entrepreneur the Halal way?");
		checkAssert(checkEntrepreneurText, "How to be an Entrepreneur the Halal way?");

		iqraTheBlogComponent.checkListOfArticleTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@Test(enabled = false)
	public void testKnowledgeTabOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing Knowledge Tab On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(
				Arrays.asList("Quran", "jinn pictures", "jinn video", "types of jinn", "how do jinns look like",
						"how to control jinn", "black magic jinn", "jinn in Islam"));

		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(
				Arrays.asList("quran", "jinn-pictures", "jinn-video", "types-of-jinn", "how-do-jinns-look-like",
						"how-to-control-jinn", "black-magic-jinn", "jinn-in-islam"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");
		iqraTheBlogComponent.clickOnTabNamed("Knowledge");

		String latestArticlesOnKnowledgeText = iqraTheBlogComponent.checkLatestArticlesText();
		checkAssert(latestArticlesOnKnowledgeText, "LATEST ARTICLES ON KNOWLEDGE");

		String checkKnowledgeTitleOnImage = iqraTheBlogComponent.checkTitleOnImageNamed("Knowledge");
		checkAssert(checkKnowledgeTitleOnImage, "KNOWLEDGE");

		iqraTheBlogComponent.clickAllLinkToCheckDetails();

		String checkKnowledgeTextOnKnowledgePage = iqraTheBlogComponent.checkHeadingOnThePageNamed("Knowledge");
		checkAssert(checkKnowledgeTextOnKnowledgePage, "KNOWLEDGE");

		iqraTheBlogComponent.clickOnOneArticle("Are jinn around us?");

		String checkEntrepreneurText = iqraTheBlogComponent.articleHeadingOnArticlePage("Are jinn around us?");
		checkAssert(checkEntrepreneurText, "Are jinn around us?");

		iqraTheBlogComponent.checkListOfArticleTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@Test(enabled = false)
	public void testSpiritualityTabOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing Spirituality Tab On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(Arrays.asList("Quran",
				"Islamic solution for depression", "dua for depression in Islam", "Islamic cure for depression anxiety",
				"quran surah for depression", "surah for depression", "dua for depression and anxiety",
				"dua for depression in urdu", "surah for stress and anxiety", "surah to calm the heart",
				"dua for anxiety and fear", "dua for peace of mind and happiness", "dua for happiness in life"));

		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(Arrays.asList("quran",
				"islamic-solution-for-depression", "dua-for-depression-in-islam", "islamic-cure-for-depression-anxiety",
				"quran-surah-for-depression", "surah-for-depression", "dua-for-depression-and-anxiety",
				"dua-for-depression-in-urdu", "surah-for-stress-and-anxiety", "surah-to-calm-the-heart",
				"dua-for-anxiety-and-fear", "dua-for-peace-of-mind-and-happiness", "dua-for-happiness-in-life"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");
		iqraTheBlogComponent.clickOnTabNamed("Spirituality");

		String latestArticlesOnSpiritualityText = iqraTheBlogComponent.checkLatestArticlesText();
		checkAssert(latestArticlesOnSpiritualityText, "LATEST ARTICLES ON SPIRITUALITY");

		String checkSpiritualityTitleOnImage = iqraTheBlogComponent.checkTitleOnImageNamed("Spirituality");
		checkAssert(checkSpiritualityTitleOnImage, "SPIRITUALITY");

		iqraTheBlogComponent.clickAllLinkToCheckDetails();

		String checkSpiritualityTextOnSpiritualityPage = iqraTheBlogComponent
				.checkHeadingOnThePageNamed("Spirituality");
		checkAssert(checkSpiritualityTextOnSpiritualityPage, "SPIRITUALITY");

		iqraTheBlogComponent.clickOnOneArticle("Reading the Quran to combat Depression");

		String checkReadingTheQuranText = iqraTheBlogComponent
				.articleHeadingOnArticlePage("Reading the Quran to combat Depression");
		checkAssert(checkReadingTheQuranText, "Reading the Quran to combat Depression");

		iqraTheBlogComponent.checkListOfArticleTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@Test(enabled = false)
	public void testMoreCurrentAffairsTabOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing More Current Affairs Tab On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(Arrays.asList("Quran", "earthquake iran iraq",
				"earthquake", "earthquake iran", "earthquake iraq", "natural disaster"));

		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(Arrays.asList("quran", "earthquake-iran-iraq",
				"earthquake", "earthquake-iran", "earthquake-iraq", "natural-disaster"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");
		iqraTheBlogComponent.clickOnTabNamed("More");

		iqraTheBlogComponent.selectAnOptionFromMoreTabNamed("Current Affairs");

		String checkCurrentAffairsTextOnCurrentAffairsPage = iqraTheBlogComponent
				.checkHeadingOnThePageNamed("Current Affairs");
		checkAssert(checkCurrentAffairsTextOnCurrentAffairsPage, "CURRENT AFFAIRS");

		iqraTheBlogComponent.clickOnOneArticle("Earthquake hits Iran & Iraq!");

		String checkReadingTheQuranText = iqraTheBlogComponent
				.articleHeadingOnArticlePage("Earthquake hits Iran & Iraq!");
		checkAssert(checkReadingTheQuranText, "Earthquake hits Iran & Iraq!");

		iqraTheBlogComponent.checkListOfArticleTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@Test(enabled = false)
	public void testSearchFieldOnIqraTheBlogPage() throws Exception {
		System.out.println("<------Testing Search Field On Iqra The Blog Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> listOfArticleTags = new ArrayList<String>(Arrays.asList("ISLAMIC CALENDAR",
				"PUNISHMENT FOR TELLING LIES IN ISLAM", "LYING IN ISLAM HADITH", "LYING IN ISLAM MAJOR SIN",
				"WHEN IS IT PERMISSIBLE TO LIE IN ISLAM", "IS LYING HARAM IN ISLAM", "DOES ISLAM ALLOW LYING",
				"ISLAMIC SOLUTION FOR DEPRESSION", "DUA FOR DEPRESSION IN ISLAM", "HOW TO OVERCOME SADNESS IN ISLAM"));

		ArrayList<String> listOfh1ArticleTags = new ArrayList<String>(Arrays.asList("islamic-calendar",
				"punishment-for-telling-lies-in-islam", "lying-in-islam-hadith", "lying-in-islam-major-sin",
				"when-is-it-permissible-to-lie-in-islam", "is-lying-haram-in-islam", "does-islam-allow-lying",
				"islamic-solution-for-depression", "dua-for-depression-in-islam", "how-to-overcome-sadness-in-islam"));

		iqraTheBlogComponent = new IqraTheBlogComponent();
		iqraTheBlogComponent.clickIqraTheBlogButton();

		String checkH1Tag = iqraTheBlogComponent.checkH1Tag();
		checkAssert(checkH1Tag, "IQRA");

		iqraTheBlogComponent.clickSearchIcon();
		iqraTheBlogComponent.enterTextToSearchInSearchField("Islam");
		iqraTheBlogComponent.pressEnterToSearch();
		String checkSearchResultForText = iqraTheBlogComponent.checkSearchResultForText();
		checkAssert(checkSearchResultForText, "Search results for");

		String checkIslamText = iqraTheBlogComponent.checkIslamText();
		checkAssert(checkIslamText, "ISLAM");

		iqraTheBlogComponent.checkListOflistOfSearchResultTags(listOfArticleTags, listOfh1ArticleTags);

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
