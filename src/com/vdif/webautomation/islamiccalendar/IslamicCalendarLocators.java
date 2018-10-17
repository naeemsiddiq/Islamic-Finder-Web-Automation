/**
 * 
 */
package com.vdif.webautomation.islamiccalendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

public class IslamicCalendarLocators {

	WebDriver driver;

	public IslamicCalendarLocators(WebDriver idriver) {
		this.driver = idriver;
	}

	
	
	/********       ********/
	// For Islamic Calendar in November 2017
	@FindBy(how = How.LINK_TEXT, using ="Islamic Calendar 2018")
	WebElement clickIslamicCalendarButton;
	
	@FindBy(how = How.XPATH, using ="//span[contains(text(),'Reset')]")
	WebElement clickResetButton;
	
	@FindBy(how = How.XPATH, using = "//select[@class='calendar-dropdown-month']")
	WebElement monthDropDown;
	
	@FindBy(how = How.XPATH, using = "//select[@class='calendar-dropdown-year']")
	WebElement yearDropDown;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Gregorian Calendar November 2017')]")
	WebElement gregorianCalendarNovember2017;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Gregorian vs Hijri Calendar')]")
	WebElement gregorianvsHijriCalendarText;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'November 2017')]")
	WebElement november2017Text;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Safar 1439')]")
	WebElement safar1439Text;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Rabi Al-Awwal 1439')]")
	WebElement rabiAlAwwal1439Text;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'8')]")
	WebElement november8_2017Text;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'See prayer times of')]")
	WebElement seePrayerTimesOfNovember;
	
	/********       ********/
	// For Islamic Calendar in August 1992
	

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Gregorian Calendar August 1992') and contains(@id,'main-heading-text')]")
	WebElement gregorianCalendarAugust1992;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'August 1992')]")
	WebElement august1992Text;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Safar 1413')]")
	WebElement safar1413Text;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Rabi Al-Awwal 1413')]")
	WebElement rabiAlAwwal1413Text;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'15')]")
	WebElement august15_1992Text;
	
	/********       ********/
	// For ViewPrayerTime AND ViewDateConverter Card
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'OFFER YOUR SALAH ON TIME NOW')]")
	WebElement offerYourSalahOnTimeText;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'VIEW PRAYER TIMES')]")
	WebElement viewPrayersTimeButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'SWITCH BETWEEN GREGORIAN AND HIJRI DATES')]")
	WebElement switchBetGregorianAndHijriText;
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'VIEW DATE')]")
	WebElement viewDateConverterButton;
	
	/********       ********/
	// For Special Islamic Days Card
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Special Islamic Days')]")
	WebElement specialIslamicDaysText;
	
	
	/********       ********/
	// For Know your Hijri dates! Card
	
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Know your Hijri dates!')]")
	WebElement knowYourHijriDatesText;
	
	@FindBy(how = How.LINK_TEXT, using = "Date Converter")
	WebElement dateConverterButton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
