/**
 * 
 */
package com.vdif.webautomation.inspirations_tasbeeh_widgets_athan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class InspirationsTasbeehWidgetsAthanLocators {

	WebDriver driver;

	public InspirationsTasbeehWidgetsAthanLocators(WebDriver itwdriver) {
		this.driver = itwdriver;
	}

	/*
	 * **********************
	 * For Inspirations Page
	 */
	
	@FindBy(how = How.TAG_NAME, using = "h1")
	WebElement h1Tag;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'badge-apple.png')]")
	WebElement appStoreButton;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'badge-google.png')]")
	WebElement playStoreButton;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Share with your loved ones')]")
	WebElement shareWithYourLovedOnesText;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Share with Whatsapp')]")
	WebElement shareWithWhatsApp;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Post on Facebook')]")
	WebElement postOnFacebook;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Tweet with Twitter')]")
	WebElement tweetWithTwitter;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Add on Instagram')]")
	WebElement addOnInstagram;

	@FindBy(how=How.XPATH,using="//span[contains(text(),'Send with Viber')]")
	WebElement sendWithViber;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'GET A NEW INSPIRATION EVERYDAY')]")
	WebElement getANewInspirationEveryDayText;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'GET YOUR INSPIRATION NOW!')]")
	WebElement getYourInspirationNowText;
	
	/*
	 * **********************
	 * For Tasbeeh Page
	 */
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Learn More') and contains(@class,'download-link')]")
	WebElement learnMoreLinkOnTop;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'YOUR DHIKR COMPANION')]")
	WebElement yourDhikrCompanionText;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'GET A NEW INSPIRATION EVERYDAY')]")
	WebElement getANewInspirationEverydayText;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Learn More') and contains(@class,'download-btn')]")
	WebElement learnMoreButtonOnBottom;
	
	/*
	 * **********************
	 * For Widgets Page
	 */
	
	public String checkWidgetOnWidgetsPageNamed(String widgetName){
		String element=driver.findElement(By.xpath("//strong[contains(text(),"+"'"+widgetName+"'"+")]")).getText();
		return element; 
	}
	
	/*
	 * ****************** For Athan Page
	 */

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'An app that helps you build a prayer habit.')]")
	WebElement anAppThatHelpsText;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'appstore-inverted.svg')]")
	WebElement appStoreButtonOnAthanPage;

	@FindBy(how = How.XPATH, using = "//img[contains(@src,'playstore-inverted.svg')]")
	WebElement playStoreButtonOnAthanPage;
	

	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'EXCELLENT APP')]")
	WebElement excellentAppText;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
