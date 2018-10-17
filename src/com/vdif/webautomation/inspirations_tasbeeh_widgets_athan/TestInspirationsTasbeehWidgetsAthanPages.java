/**
 * 
 */
package com.vdif.webautomation.inspirations_tasbeeh_widgets_athan;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
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

public class TestInspirationsTasbeehWidgetsAthanPages extends AbstractComponent {

	HomePageComponent homePagecomponent;
	InspirationsTasbeehWidgetsAthanComponent inspirationsTasbeehWidgetsComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Inspirations, Tasbeeh, Widgets and Athan Pages Islamic Finder----------------------->>\n");
	}

	@Test
	public void testInspirationsPage() throws Exception {
		System.out.println("<------Testing Inspirations Page------->\n");
		incrementAndOpenURLpage();
		inspirationsTasbeehWidgetsComponent = new InspirationsTasbeehWidgetsAthanComponent();
		homePagecomponent = new HomePageComponent();
		homePagecomponent.clickOnfooterInspirationsLink();
		String checkH1Tag = inspirationsTasbeehWidgetsComponent.checkH1Tag();
		checkAssert(checkH1Tag, "INSPIRATIONS FOR MUSLIMS");
		inspirationsTasbeehWidgetsComponent.clickAppStoreButton();
		switchTabandClose("Inspirations for Muslims - Quotes, Sayings & Duas. on the App Store");
		inspirationsTasbeehWidgetsComponent.clickPlayStoreButton();
		switchTabandClose("Inspirations for Muslims – Android Apps on Google Play");
		String checkshareWithYourLovedOnesText = inspirationsTasbeehWidgetsComponent.checkshareWithYourLovedOnesText();
		checkAssert(checkshareWithYourLovedOnesText, "SHARE WITH YOUR LOVED ONES");

		String checkshareWithWhatsApp = inspirationsTasbeehWidgetsComponent.checkshareWithWhatsApp();
		checkAssert(checkshareWithWhatsApp, "Share with Whatsapp");

		String checkpostOnFacebook = inspirationsTasbeehWidgetsComponent.checkpostOnFacebook();
		checkAssert(checkpostOnFacebook, "Post on Facebook");

		String checktweetWithTwitter = inspirationsTasbeehWidgetsComponent.checktweetWithTwitter();
		checkAssert(checktweetWithTwitter, "Tweet with Twitter");

		String checkaddOnInstagram = inspirationsTasbeehWidgetsComponent.checkaddOnInstagram();
		checkAssert(checkaddOnInstagram, "Add on Instagram");

		String checksendWithViber = inspirationsTasbeehWidgetsComponent.checksendWithViber();
		checkAssert(checksendWithViber, "Send with Viber");

		String checkgetANewInspirationEveryDayText = inspirationsTasbeehWidgetsComponent
				.checkgetANewInspirationEveryDayText();
		checkAssert(checkgetANewInspirationEveryDayText, "GET A NEW INSPIRATION EVERYDAY");

		String checkgetYourInspirationNowText = inspirationsTasbeehWidgetsComponent.checkgetYourInspirationNowText();
		checkAssert(checkgetYourInspirationNowText, "GET YOUR INSPIRATION NOW!");

	}

	@Test
	public void testTasbeehPage() throws Exception {
		System.out.println("<------Testing Tasbeeh Page------->\n");
		incrementAndOpenURLpage();
		inspirationsTasbeehWidgetsComponent = new InspirationsTasbeehWidgetsAthanComponent();
		homePagecomponent = new HomePageComponent();
		homePagecomponent.clickOnfooterTasbeehLink();

		String checkH1Tag = inspirationsTasbeehWidgetsComponent.checkH1Tag();
		checkAssert(checkH1Tag, "STAY ON TOP OF YOUR SALAH" + "\nWITH ALL NEW");

		inspirationsTasbeehWidgetsComponent.clickAppStoreButton();
		switchTabandClose("Athan: Prayer Times & Quran on the App Store");

		inspirationsTasbeehWidgetsComponent.clickPlayStoreButton();
		switchTabandClose("Athan: Prayer Time, Quran, Azan and Qibla Compass – Android Apps on Google Play");

		inspirationsTasbeehWidgetsComponent.clickLearnMoreLinkOnTop();
		checkH1Tag = inspirationsTasbeehWidgetsComponent.checkH1Tag();
		checkAssert(checkH1Tag, "Have You Offered Your Prayers Today?");
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

		String checkyourDhikrCompanionText = inspirationsTasbeehWidgetsComponent.checkyourDhikrCompanionText();
		checkAssert(checkyourDhikrCompanionText, "YOUR DHIKR COMPANION");

		String checkgetANewInspirationEverydayText = inspirationsTasbeehWidgetsComponent
				.checkgetANewInspirationEverydayText();
		checkAssert(checkgetANewInspirationEverydayText, "GET A NEW INSPIRATION EVERYDAY");

		inspirationsTasbeehWidgetsComponent.clicklearnMoreButtonOnBottom();
		checkH1Tag = inspirationsTasbeehWidgetsComponent.checkH1Tag();
		checkAssert(checkH1Tag, "INSPIRATIONS FOR MUSLIMS");
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
	}

	@Test
	public void testWidgetsPage() throws Exception {
		System.out.println("<------Testing Widgets Page------->\n");
		incrementAndOpenURLpage();
		inspirationsTasbeehWidgetsComponent = new InspirationsTasbeehWidgetsAthanComponent();
		homePagecomponent = new HomePageComponent();
		homePagecomponent.clickOnfooterPrayerWidgetsLink();

		String checkH1Tag = inspirationsTasbeehWidgetsComponent.checkH1Tag();
		checkAssert(checkH1Tag, "Add IslamicFinder Services to Your Site");

		String checkWidgetOnWidgetsPageNamed = inspirationsTasbeehWidgetsComponent
				.checkWidgetOnWidgetsPageNamed("1. Gregorian/Hijri calendar service in your web site");
		checkAssert(checkWidgetOnWidgetsPageNamed, "1. Gregorian/Hijri calendar service in your web site");

		checkWidgetOnWidgetsPageNamed = inspirationsTasbeehWidgetsComponent
				.checkWidgetOnWidgetsPageNamed("2. Hijri/Gregorian calendar service in your web site");
		checkAssert(checkWidgetOnWidgetsPageNamed, "2. Hijri/Gregorian calendar service in your web site");

		checkWidgetOnWidgetsPageNamed = inspirationsTasbeehWidgetsComponent
				.checkWidgetOnWidgetsPageNamed("3. Prayer times of your city");
		checkAssert(checkWidgetOnWidgetsPageNamed, "3. Prayer times of your city");

		checkWidgetOnWidgetsPageNamed = inspirationsTasbeehWidgetsComponent
				.checkWidgetOnWidgetsPageNamed("4. Gregorian/Hijri Date Converter");
		checkAssert(checkWidgetOnWidgetsPageNamed, "4. Gregorian/Hijri Date Converter");

		checkWidgetOnWidgetsPageNamed = inspirationsTasbeehWidgetsComponent
				.checkWidgetOnWidgetsPageNamed("5. Find prayer timings for your country");
		checkAssert(checkWidgetOnWidgetsPageNamed, "5. Find prayer timings for your country");

		checkWidgetOnWidgetsPageNamed = inspirationsTasbeehWidgetsComponent
				.checkWidgetOnWidgetsPageNamed("6. Special Islamic Days");
		checkAssert(checkWidgetOnWidgetsPageNamed, "6. Special Islamic Days");

	}

	@Test
	public void testAthanPage() throws Exception {
		System.out.println("<------Testing Athan Page------->\n");
		incrementAndOpenURLpage();
		inspirationsTasbeehWidgetsComponent = new InspirationsTasbeehWidgetsAthanComponent();
		homePagecomponent = new HomePageComponent();
		homePagecomponent.clickOnfooterAthanLink();

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		String h1Tag = inspirationsTasbeehWidgetsComponent.checkH1Tag();
		checkAssert(h1Tag, "Have You Offered Your Prayers Today?");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		inspirationsTasbeehWidgetsComponent.clickAppStoreButtonOnAthanPage();
		switchTabandClose("Athan: Prayer Times & Quran on the App Store");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		inspirationsTasbeehWidgetsComponent.clickPlayStoreButtonOnAthanPage();
		switchTabandClose("Athan: Prayer Time, Quran, Azan and Qibla Compass – Android Apps on Google Play");
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

	}

	// helper method to close the new TAB opened and go back to base TAB
	private void switchTabandClose(String pageTitleOnspecificPage) throws Exception {
		Set<String> windows = driver.getWindowHandles();
		String mainwindow = driver.getWindowHandle();

		for (String handle : windows) {
			driver.switchTo().window(handle);
			System.out.println("switched to " + driver.getTitle() + "  Window");
			String pagetitle = driver.getTitle();
			System.out.println("pageTitle  :  " + pagetitle);
			if (pagetitle.equalsIgnoreCase(pageTitleOnspecificPage)) {
				Thread.sleep(1500);
				driver.close();
				System.out.println("Closed the  '" + pagetitle + "' Tab now ...");
			}
		}
		driver.switchTo().window(mainwindow);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
