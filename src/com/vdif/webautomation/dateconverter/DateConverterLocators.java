/**
 * 
 */
package com.vdif.webautomation.dateconverter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

public class DateConverterLocators {

	WebDriver driver;
	
	public DateConverterLocators(WebDriver ddriver){
		this.driver=ddriver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Date Converter")
	WebElement dateConverterButton;

	@FindBy(how=How.TAG_NAME,using="h3")
	WebElement GH_HG_Text;
	
	@FindBy(how=How.XPATH,using="//h6[contains(text(),'Select a date to convert')]")
	WebElement selectADateToConvert;

	@FindBy(how=How.ID,using="days")
	WebElement daysDropDown;
	
	@FindBy(how=How.ID,using="months")
	WebElement monthsDropDown;
	
	@FindBy(how=How.ID,using="years")
	WebElement yearsDropDown;
	
	@FindBy(how=How.XPATH,using="//button[contains(text(),'Convert')]")
	WebElement convertDateButton;
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'date-converted-date')]")
	WebElement dateConvertedDateText;

	@FindBy(how=How.XPATH,using="//*[contains(@class,'date-converted-day')]")
	WebElement dateConvertedDayText;
	
	@FindBy(how=How.ID,using="date-convertor-switch")
	WebElement switchDateConverter;
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'Go To Islamic Calendar')]")
	WebElement goToIslamicCalendarButton;
	
}
