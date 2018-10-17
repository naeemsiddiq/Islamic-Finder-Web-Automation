/**
 * 
 */
package com.vdif.webautomation.specialislamicdays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class SpecialIslamicDaysLocators {

	WebDriver driver;

	public SpecialIslamicDaysLocators(WebDriver sdriver) {
		this.driver = sdriver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Special Islamic Days")
	WebElement specialIslamicDaysButton;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'All Special Islamic Days')]")
	WebElement allSpecialIslamicDaysText;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'gregorian-year')]")
	WebElement gregorianYearText;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'hijri-years')]")
	WebElement hijriYearText;
	
	@FindBy(how = How.XPATH, using = "//*[contains(@class,'fa-arrow-right')]")
	WebElement arrowRight;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'fa-arrow-left')]")
	WebElement arrowLeft;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text()[2],'All Islamic Events')]")
	WebElement allIslamicEventsText;
	

	
	
	
	
	

	
}
