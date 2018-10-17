/**
 * 
 */
package com.vdif.webautomation.talktous;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TalkToUsComponent extends AbstractComponent {

	TalkToUsLocators talkToUsLocators = PageFactory.initElements(driver, TalkToUsLocators.class);

	public void clickTalkToUsButton() throws Exception {
		talkToUsLocators.talkToUsButton.click();
		Thread.sleep(1000);
	}

	public String checkH1Tag() {
		WebElement element = talkToUsLocators.h1Tag;
		System.out.println(element.getText());
		return element.getText();
	}

	public void enterNameField(String name) {
		talkToUsLocators.nameEditField.clear();
		talkToUsLocators.nameEditField.sendKeys(name);
	}

	public void enterEmailField(String email) {
		talkToUsLocators.emailEditField.clear();
		talkToUsLocators.emailEditField.sendKeys(email);
	}

	public void enterSubjectField(String subject) {
		talkToUsLocators.subjectEditField.clear();
		talkToUsLocators.subjectEditField.sendKeys(subject);
	}

	public void enterMessageField(String message) {
		talkToUsLocators.messageEditField.clear();
		talkToUsLocators.messageEditField.sendKeys(message);
	}

	// public void checkBoxIAmNotARobot() throws Exception{
	// talkToUsLocators.checkBoxIAmNotARobot.click();
	// Thread.sleep(1000);
	// }

	public void clickSubmitForm() throws Exception {
		talkToUsLocators.submitForm.click();
		Thread.sleep(1000);
	}

	public String verifyCaptCHAErrorMessageText() {
		WebElement element = talkToUsLocators.captCHAerrorMessageText;
		System.out.println(element.getText());
		return element.getText();
	}

	/*
	 * ******************** For About IslamicFinder
	 */

	public void clickAboutIslamicFinderLink() throws Exception {
		talkToUsLocators.aboutIslamicFinderLink.click();
		Thread.sleep(1000);
	}

	public String checkWeServeAsPlatformText() {
		String text = talkToUsLocators.weServeAsPlatformText.getText();
		return text;
	}
	
	public String checkStayConnectedWithUsText() {
		String text = talkToUsLocators.stayConnectedWithUsText.getText();
		return text;
	}
	
	public String checkSayHelloText() {
		String text = talkToUsLocators.sayHelloText.getText();
		return text;
	}
	
	public void clickContactUsButtonOnBottom() throws Exception{
		WebElement element=talkToUsLocators.contactUsButtonOnBottom;
		scrollAndClick(element); 
	}
	
	/*
	 * ******************** For Advertise With Us
	 */
	
	public void clickAdvertiseWithUsLink() throws Exception{
		talkToUsLocators.advertiseWithUsLink.click();
		Thread.sleep(1000);
	}
	
	public String checkIslamicFinderWebsiteText() {
		String text = talkToUsLocators.islamicFinderWebsiteText.getText();
		return text;
	}
	
	public String checkAthanSmartphoneAppText() {
		String text = talkToUsLocators.athanSmartphoneAppText.getText();
		return text;
	}
	
	public String checkRatesAndOpportunitiesText() {
		String text = talkToUsLocators.ratesAndOpportunitiesText.getText();
		return text;
	}
	
	public String checkTalkToUsForMoreText() {
		String text = talkToUsLocators.talkToUsForMoreText.getText();
		return text;
	}
	
	public void clickContactUsButtonOnBottom11() throws Exception{
		WebElement element=talkToUsLocators.contactUsButtonOnBottom11;
		scrollAndClick(element);
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
