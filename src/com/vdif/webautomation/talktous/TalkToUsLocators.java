/**
 * 
 */
package com.vdif.webautomation.talktous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TalkToUsLocators {
	WebDriver driver;

	public TalkToUsLocators(WebDriver tdriver) {
		this.driver = tdriver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Talk to us")
	WebElement talkToUsButton;
	
	@FindBy(how=How.TAG_NAME,using="h1")
	WebElement h1Tag;
	
	@FindBy(how=How.ID,using="name")
	WebElement nameEditField;
	
	@FindBy(how=How.ID,using="email")
	WebElement emailEditField;
	
	@FindBy(how=How.ID,using="subject")
	WebElement subjectEditField;
	
	@FindBy(how=How.ID,using="message")
	WebElement messageEditField;
	
//	@FindBy(how=How.XPATH,using="//*[@id='recaptcha-anchor']/div[5]")
//	WebElement checkBoxIAmNotARobot;
	
	@FindBy(how=How.XPATH,using="//input[contains(@type,'submit')]")
	WebElement submitForm;
	
	@FindBy(how=How.ID,using="captcha.errors")
	WebElement captCHAerrorMessageText;
	
	
	/*
	 * ********************
	 *  For About IslamicFinder
	 */
	
	@FindBy(how=How.LINK_TEXT,using="About IslamicFinder")
	WebElement aboutIslamicFinderLink;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'We serve as a platform for Muslim communities in more than')]")
	WebElement weServeAsPlatformText;
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Stay connected with us')]")
	WebElement stayConnectedWithUsText;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Say hello!')]")
	WebElement sayHelloText;
	
	@FindBy(how=How.XPATH,using="//a[contains(@href,'/feedback/') and contains(text(),'Contact Us')]")
	WebElement contactUsButtonOnBottom;
	
	
	/*
	 * ******************** For Advertise With Us
	 */
	
	
	@FindBy(how=How.LINK_TEXT,using="Advertise With Us")
	WebElement advertiseWithUsLink;
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Islamicfinder.org Website')]")
	WebElement islamicFinderWebsiteText;
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Athan Smartphone App')]")
	WebElement athanSmartphoneAppText;
	
	@FindBy(how=How.XPATH,using="//h2[contains(text(),'Rates & Opportunities')]")
	WebElement ratesAndOpportunitiesText;
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Talk to us for more')]")
	WebElement talkToUsForMoreText;
	
	@FindBy(how=How.XPATH,using="//a[contains(@class,'button') and contains(text(),'Contact Us')]")
	WebElement contactUsButtonOnBottom11;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
