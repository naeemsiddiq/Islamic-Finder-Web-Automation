/**
 * 
 */
package com.vdif.webautomation.talktous;

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

public class TestTalkToUsPage extends AbstractComponent {

	TalkToUsComponent talkToUsComponent;
	HomePageComponent homePageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out
				.println("<<-----------------------Testing Talk to Us Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testTalkToUsPage() throws Exception {
		System.out.println("<------Testing Talk to Us Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		talkToUsComponent = new TalkToUsComponent();
		homePageComponent = new HomePageComponent();

		talkToUsComponent.clickTalkToUsButton();
		String checkH1Tag = talkToUsComponent.checkH1Tag();
		Assert.assertEquals(checkH1Tag, "Talk to us");

		talkToUsComponent.enterNameField("Naeem Siddiq");
		talkToUsComponent.enterEmailField("m.naeem283@yahoo.com");
		talkToUsComponent.enterSubjectField("Testing");
		talkToUsComponent.enterMessageField(
				"Assalam-o-Alikum!!\n\nHope you are fine.\nIt's Naeem Siddiq here, Test automation developer at venturedive.com\n\n#IgnoreThisMessage #hahahahaah");
		// talkToUsComponent.checkBoxIAmNotARobot();
		talkToUsComponent.clickSubmitForm();
		String captchaErrorMessage = talkToUsComponent.verifyCaptCHAErrorMessageText();
		Assert.assertEquals(captchaErrorMessage, "Captcha missing");

	}

	@Test
	public void testAboutIslamicFinder() throws Exception {
		System.out.println("<------Testing About IslamicFinder on Talk to us Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		talkToUsComponent = new TalkToUsComponent();
		homePageComponent = new HomePageComponent();

		talkToUsComponent.clickTalkToUsButton();
		talkToUsComponent.clickAboutIslamicFinderLink();

		String checkH1Tag = talkToUsComponent.checkH1Tag();
		Assert.assertEquals(checkH1Tag, "About IslamicFinder");

		String checkWeServeAsPlatformText = talkToUsComponent.checkWeServeAsPlatformText();
		Assert.assertEquals(checkWeServeAsPlatformText, "We serve as a platform for Muslim communities in more than");

		String checkStayConnectedWithUsText = talkToUsComponent.checkStayConnectedWithUsText();
		Assert.assertEquals(checkStayConnectedWithUsText, "Stay connected with us");

		String checkSayHelloText = talkToUsComponent.checkSayHelloText();
		Assert.assertEquals(checkSayHelloText, "Say hello!");

		talkToUsComponent.clickContactUsButtonOnBottom();
		checkH1Tag = talkToUsComponent.checkH1Tag();
		Assert.assertEquals(checkH1Tag, "Talk to us");
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

	}

	@Test
	public void testAdvertiseWithUs() throws Exception {
		System.out.println("<------Testing Advertise With Us on Talk to us Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		talkToUsComponent = new TalkToUsComponent();
		homePageComponent = new HomePageComponent();

		talkToUsComponent.clickTalkToUsButton();
		talkToUsComponent.clickAdvertiseWithUsLink();

		String checkIslamicFinderWebsiteText = talkToUsComponent.checkIslamicFinderWebsiteText();
		Assert.assertEquals(checkIslamicFinderWebsiteText, "Islamicfinder.org Website");

		String checkAthanSmartphoneAppText = talkToUsComponent.checkAthanSmartphoneAppText();
		Assert.assertEquals(checkAthanSmartphoneAppText, "Athan Smartphone App");

		String checkRatesAndOpportunitiesText = talkToUsComponent.checkRatesAndOpportunitiesText();
		Assert.assertEquals(checkRatesAndOpportunitiesText, "Rates & Opportunities");

		talkToUsComponent.clickContactUsButtonOnBottom11();
		String checkH1Tag = talkToUsComponent.checkH1Tag();
		Assert.assertEquals(checkH1Tag, "Contact Us For Ads");
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
