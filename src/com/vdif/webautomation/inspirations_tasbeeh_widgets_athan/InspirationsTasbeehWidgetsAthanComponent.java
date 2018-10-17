/**
 * 
 */
package com.vdif.webautomation.inspirations_tasbeeh_widgets_athan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class InspirationsTasbeehWidgetsAthanComponent extends AbstractComponent {

	InspirationsTasbeehWidgetsAthanLocators inspirationsTasbeehWidgetsAthanLocators = PageFactory.initElements(driver,
			InspirationsTasbeehWidgetsAthanLocators.class);

	/*
	 * ********************** For Inspirations Page
	 */

	public String checkH1Tag() {

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String tag = inspirationsTasbeehWidgetsAthanLocators.h1Tag.getText();
		System.out.println(tag);
		return tag;
	}

	public void clickAppStoreButton() throws Exception {
		WebElement element = inspirationsTasbeehWidgetsAthanLocators.appStoreButton;
		scrollToLocateElement(element);
		Thread.sleep(1000);
	}

	public void clickPlayStoreButton() throws Exception {
		WebElement element = inspirationsTasbeehWidgetsAthanLocators.playStoreButton;
		scrollAndClick(element);
		Thread.sleep(1000);
	}

	public String checkshareWithYourLovedOnesText() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.shareWithYourLovedOnesText.getText();
		System.out.println(tag);
		return tag;
	}

	public String checkshareWithWhatsApp() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.shareWithWhatsApp.getText();
		System.out.println(tag);
		return tag;
	}

	public String checkpostOnFacebook() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.postOnFacebook.getText();
		System.out.println(tag);
		return tag;
	}

	public String checktweetWithTwitter() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.tweetWithTwitter.getText();
		System.out.println(tag);
		return tag;
	}

	public String checkaddOnInstagram() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.addOnInstagram.getText();
		System.out.println(tag);
		return tag;
	}

	public String checksendWithViber() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.sendWithViber.getText();
		System.out.println(tag);
		return tag;
	}

	public String checkgetANewInspirationEveryDayText() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.getANewInspirationEveryDayText.getText();
		System.out.println(tag);
		return tag;
	}

	public String checkgetYourInspirationNowText() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.getYourInspirationNowText.getText();
		System.out.println(tag);
		return tag;
	}

	/*
	 * ********************** For Tasbeeh Page
	 */

	public void clickLearnMoreLinkOnTop() throws Exception {
		WebElement element = inspirationsTasbeehWidgetsAthanLocators.learnMoreLinkOnTop;
		scrollAndClick(element);
		Thread.sleep(1000);
	}

	public String checkyourDhikrCompanionText() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.yourDhikrCompanionText.getText();
		System.out.println(tag);
		return tag;
	}

	public String checkgetANewInspirationEverydayText() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.getANewInspirationEverydayText.getText();
		System.out.println(tag);
		return tag;
	}

	public void clicklearnMoreButtonOnBottom() throws Exception {
		WebElement element = inspirationsTasbeehWidgetsAthanLocators.learnMoreButtonOnBottom;
		scrollAndClick(element);
		Thread.sleep(1000);
	}

	/*
	 * ********************** For Widgets Page
	 */

	public String checkWidgetOnWidgetsPageNamed(String widgetName) {
		String tag = inspirationsTasbeehWidgetsAthanLocators.checkWidgetOnWidgetsPageNamed(widgetName);
		System.out.println(tag);
		return tag;
	}

	public String checkAnAppThatHelpsText(String data) {
		String tag = inspirationsTasbeehWidgetsAthanLocators.anAppThatHelpsText.getText();
		System.out.println(tag);
		return tag;
	}

	public void clickAppStoreButtonOnAthanPage() throws Exception {
		WebElement element = inspirationsTasbeehWidgetsAthanLocators.appStoreButtonOnAthanPage;
		scrollAndClick(element);
		Thread.sleep(1000);
	}

	public void clickPlayStoreButtonOnAthanPage() throws Exception {
		WebElement element = inspirationsTasbeehWidgetsAthanLocators.playStoreButtonOnAthanPage;
		element.click();
		Thread.sleep(1000);
	}

	public String checkExcellentAppText() {
		String tag = inspirationsTasbeehWidgetsAthanLocators.excellentAppText.getText();
		System.out.println(tag);
		return tag;
	}

}
