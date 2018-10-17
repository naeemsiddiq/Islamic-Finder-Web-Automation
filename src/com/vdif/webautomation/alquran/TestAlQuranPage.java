/**
 * 
 */
package com.vdif.webautomation.alquran;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.hajj.HajjPageComponent;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestAlQuranPage extends AbstractComponent {

	AlQuranPageComponent alQuranPageComponent;
	HajjPageComponent hajjPageComponent;
	HomePageComponent homePageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing Al Quran Page Islamic Finder----------------------->>\n");
	}

	
	
	/*
	 * test SURAHS TAB on Al Quran Page
	 * 
	 */
	@Test(priority = 0)
	 public void testSurahLists_From_Surah_0_10_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_1_10 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(0, 10);
	 }

	@Test(priority = 1)
	 public void testSurahLists_From_Surah_10_20_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_11_20 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(10, 20);
	 }

	@Test(priority = 2)
	 public void testSurahLists_From_Surah_20_30_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_21_30 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(20, 30);
	 }

	@Test(priority = 3)
	 public void testSurahLists_From_Surah_30_40_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_31_40 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(30, 40);
	 }

	@Test(priority = 4)
	 public void testSurahLists_From_Surah_40_50_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_41_50 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(40, 50);
	 }

	@Test(priority = 5)
	 public void testSurahLists_From_Surah_50_60_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_51_60 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(50, 60);
	 }

	@Test(priority = 6)
	 public void testSurahLists_From_Surah_60_70_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_61_70 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(60, 70);
	 }

	@Test(priority = 7)
	 public void testSurahLists_From_Surah_70_80_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_71_80 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(70, 80);
	 }

	@Test(priority = 8)
	 public void testSurahLists_From_Surah_80_90_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_80_90 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(80, 90);
	 }

	@Test(priority = 9)
	 public void testSurahLists_From_Surah_90_100_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_91_100 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(91, 100);
	 }

	@Test(priority = 10)
	 public void testSurahLists_From_Surah_100_114_OnAlQuranPage() throws
	 Exception {
	 System.out.println("<------Testing Surah Lists From_Surah_101_114 On Al-Quran Page------->\n");
	 testSurahs_chunk_wise(100, 114);
	 }

	public void testSurahs_chunk_wise(int startFromSurah, int endToSurah) throws Exception {
		incrementAndOpenURLpage();

		implicicitwait2sec();

		homePageComponent = new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		hajjPageComponent = new HajjPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		hajjPageComponent.checkAlQuranWithTranslationTextOnAlQuranPage();
		alQuranPageComponent.checkSurahListAlQuranPage(startFromSurah, endToSurah);
	}

	/*
	 * test JUz TAB on Al Quran Page
	 * 
	 */

	@Test(priority = 11)
	 public void testJuzLists_From_Juz_0_10_OnAlQuranPage() throws Exception {
	 System.out.println("<------Testing Juz Lists From_Juz_1_10 On Al-Quran Page------->\n");
	 testJuz_chunk_wise(0, 10);
	 }

	@Test(priority = 12)
	 public void testJuzLists_From_Juz_10_20_OnAlQuranPage() throws Exception
	 {
	 System.out.println("<------Testing Juz Lists From_Juz_10_20 On Al-Quran Page------->\n");
	 testJuz_chunk_wise(10, 20);
	 }

	@Test(priority = 13)
	 public void testJuzLists_From_Juz_20_30_OnAlQuranPage() throws Exception
	 {
	 System.out.println("<------Testing Juz Lists From_Juz_20_20 On Al-Quran Page------->\n");
	 testJuz_chunk_wise(20, 30);
	 }

	public void testJuz_chunk_wise(int startFromJuz, int endToJuz) throws Exception {
		incrementAndOpenURLpage();
		implicicitwait2sec();

		homePageComponent = new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		alQuranPageComponent.clickJuzTab();
		alQuranPageComponent.checkJuzListAlQuranPage(startFromJuz, endToJuz);
	}

	/*
	 * test Translations TAB on Al Quran Page
	 * 
	 */

	@Test(priority = 14)
	public void testTranslationsLists_From_Translation_0_10_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Translations Lists From_Translation_1_10 On Al-Quran Page------->\n");
		testTranslations_chunk_Wise(0, 10);
	}

	@Test(priority = 15)
	public void testTranslationsLists_From_Translation_10_20_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Translations Lists From_Translation_11_20 On Al-Quran Page------->\n");
		testTranslations_chunk_Wise(10, 20);
	}

	@Test(priority = 16)
	public void testTranslationsLists_From_Translation_20_30_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Translations Lists From_Translation_21_30 On Al-Quran Page------->\n");
		testTranslations_chunk_Wise(20, 30);
	}

	@Test(priority = 17)
	public void testTranslationsLists_From_Translation_30_40_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Translations Lists From_Translation_31_40 On Al-Quran Page------->\n");
		testTranslations_chunk_Wise(30, 40);
	}

	@Test(priority = 18)
	public void testTranslationsLists_From_Translation_40_49_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Translations Lists From_Translation_41_49 On Al-Quran Page------->\n");
		testTranslations_chunk_Wise(40, 49);
	}

	public void testTranslations_chunk_Wise(int startFromTranslation, int endToTranslation) throws Exception {
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		homePageComponent = new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		alQuranPageComponent.clickTranslationsTab();
		alQuranPageComponent.checkTranslationsListAlQuranPage(startFromTranslation, endToTranslation);
	}

	/*
	 * test Topics TAB on Al Quran Page
	 * 
	 */

	@Test(priority = 19)
	public void testTopicsLists_From_Topic_0_10_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_0_10 On Al-Quran Page------->\n");
		testTopics_chunk_wise(0, 10);
	}

	@Test(priority = 20)
	public void testTopicsLists_From_Topic_10_20_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_11_20 On Al-Quran Page------->\n");
		testTopics_chunk_wise(10, 20);
	}

	@Test(priority = 21)
	public void testTopicsLists_From_Topic_20_30_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_21_30 On Al-Quran Page------->\n");
		testTopics_chunk_wise(20, 30);
	}

	@Test(priority = 22)
	public void testTopicsLists_From_Topic_30_40_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_31_40 On Al-Quran Page------->\n");
		testTopics_chunk_wise(30, 40);
	}

	@Test(priority = 23)
	public void testTopicsLists_From_Topic_40_50_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_41_50 On Al-Quran Page------->\n");
		testTopics_chunk_wise(40, 50);
	}

	@Test(priority = 24)
	public void testTopicsLists_From_Topic_50_60_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_51_60 On Al-Quran Page------->\n");
		testTopics_chunk_wise(50, 60);
	}

	@Test(priority = 25)
	public void testTopicsLists_From_Topic_60_70_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_61_70 On Al-Quran Page------->\n");
		testTopics_chunk_wise(60, 70);
	}

	@Test(priority = 26)
	public void testTopicsLists_From_Topic_70_80_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_71_80 On Al-Quran Page------->\n");
		testTopics_chunk_wise(70, 80);
	}

	@Test(priority = 27)
	public void testTopicsLists_From_Topic_80_90_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_81_90 On Al-Quran Page------->\n");
		testTopics_chunk_wise(80, 90);
	}

	@Test(priority = 28)
	public void testTopicsLists_From_Topic_90_100_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_91_100 On Al-Quran Page------->\n");
		testTopics_chunk_wise(90, 100);
	}

	@Test(priority = 29)
	public void testTopicsLists_From_Topic_100_110_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_101_110 On Al-Quran Page------->\n");
		testTopics_chunk_wise(100, 110);
	}

	@Test(priority = 30)
	public void testTopicsLists_From_Topic_110_120_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_111_120 On Al-Quran Page------->\n");
		testTopics_chunk_wise(110, 120);
	}

	@Test(priority = 31)
	public void testTopicsLists_From_Topic_120_130_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_121_130 On Al-Quran Page------->\n");
		testTopics_chunk_wise(120, 130);
	}

	@Test(priority = 32)
	public void testTopicsLists_From_Topic_130_140_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_131_140 On Al-Quran Page------->\n");
		testTopics_chunk_wise(130, 140);
	}

	@Test(priority = 33)
	public void testTopicsLists_From_Topic_140_150_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_141_150 On Al-Quran Page------->\n");
		testTopics_chunk_wise(140, 150);
	}

	@Test(priority = 34)
	public void testTopicsLists_From_Topic_150_160_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_151_160 On Al-Quran Page------->\n");
		testTopics_chunk_wise(150, 160);
	}

	@Test(priority = 35)
	public void testTopicsLists_From_Topic_160_170_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_161_170 On Al-Quran Page------->\n");
		testTopics_chunk_wise(160, 170);
	}

	@Test(priority = 36)
	public void testTopicsLists_From_Topic_170_180_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_171_180 On Al-Quran Page------->\n");
		testTopics_chunk_wise(170, 180);
	}

	@Test(priority = 37)
	public void testTopicsLists_From_Topic_180_190_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_181_190 On Al-Quran Page------->\n");
		testTopics_chunk_wise(180, 190);
	}

	@Test(priority = 38)
	public void testTopicsLists_From_Topic_190_200_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_190_200 On Al-Quran Page------->\n");
		testTopics_chunk_wise(190, 200);
	}

	@Test(priority = 39)
	public void testTopicsLists_From_Topic_200_210_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_201_210 On Al-Quran Page------->\n");
		testTopics_chunk_wise(200, 210);
	}

	@Test(priority = 40)
	public void testTopicsLists_From_Topic_210_220_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_211_220 On Al-Quran Page------->\n");
		testTopics_chunk_wise(210, 220);
	}

	@Test(priority = 41)
	public void testTopicsLists_From_Topic_220_230_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_221_230 On Al-Quran Page------->\n");
		testTopics_chunk_wise(220, 230);
	}

	@Test(priority = 42)
	public void testTopicsLists_From_Topic_230_240_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_231_240 On Al-Quran Page------->\n");
		testTopics_chunk_wise(230, 240);
	}

	@Test(priority = 43)
	public void testTopicsLists_From_Topic_240_250_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_241_250 On Al-Quran Page------->\n");
		testTopics_chunk_wise(240, 250);
	}

	@Test(priority = 44)
	public void testTopicsLists_From_Topic_250_260_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_251_260 On Al-Quran Page------->\n");
		testTopics_chunk_wise(250, 260);
	}

	@Test(priority = 45)
	public void testTopicsLists_From_Topic_260_270_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_261_270 On Al-Quran Page------->\n");
		testTopics_chunk_wise(260, 270);
	}

	@Test(priority = 46)
	public void testTopicsLists_From_Topic_270_282_OnAlQuranPage() throws Exception {
		System.out.println("<------Testing Topics Lists From_Topic_271_282 On Al-Quran Page------->\n");
		testTopics_chunk_wise(270, 282);
	}

	public void testTopics_chunk_wise(int startFromTopic, int endToTopic) throws Exception {
		incrementAndOpenURLpage();
		implicicitwait2sec();

		homePageComponent = new HomePageComponent();
		alQuranPageComponent = new AlQuranPageComponent();
		homePageComponent.searchTopNavBar();
		alQuranPageComponent.clickAlQuranLink();
		alQuranPageComponent.clickTopicsTab();
		alQuranPageComponent.checkTopicsListAlQuranPage(startFromTopic, endToTopic);

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
