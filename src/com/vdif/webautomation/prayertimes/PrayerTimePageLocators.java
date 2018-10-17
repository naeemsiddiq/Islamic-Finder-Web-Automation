/**
 * 
 */
package com.vdif.webautomation.prayertimes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Naeem Siddiq
 *
 */
public class PrayerTimePageLocators {

	WebDriver driver;

	public PrayerTimePageLocators(WebDriver pdriver) {
		this.driver = pdriver;
	}

	/********       ********/
	// For Prayer Times Lahore Card on Prayers Times Page

	@FindBy(how = How.LINK_TEXT, using = "Prayer Times")
	WebElement prayerTimesButton;

	@FindBy(how = How.XPATH, using = "//small[contains(text(),'Lahore, Punjab, Pakistan')]")
	WebElement lahorePunjabPakistanText;

	@FindBy(how = How.XPATH, using = "//nav/ul/li/a[contains(text(),'Prayer Times')]")
	WebElement prayerTimesLinkOnPTLcard;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Pakistan')]")
	WebElement pakistanLinkOnPTLcard;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Prayer Times in')]")
	WebElement verifyPakistanLinkOnPTLcard;

	@FindBy(how = How.XPATH, using = "//span[contains(text()[1],'Get link')]")
	WebElement getLinkPrayerTimesText;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Copy')]")
	WebElement checkCopyOnGetLinkPrayerTimesText;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Getting accurate prayer times for your desired location was never this easy')]")
	WebElement checkpTagOnPrayerTimesLahoreCard;

	/********       ********/
	// For Prayer Times Today Card on Prayers Times Page

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Weekly and Monthly view')]")
	WebElement weeklyAndMonthlyView;

	/********       ********/
	// For Weekly Monthly Yearly Card on Prayers Times Page

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Weekly')]")
	WebElement weeklyOnWMYCard;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Day')]")
	WebElement dayColumnOnWeekly;

	@FindBy(how = How.XPATH, using = "//td[contains(text(),'Fri')]")
	WebElement friColumnOnWeekly;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Monthly')]")
	WebElement monthlyOnWMYCard;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Monthly')]")
	WebElement monthTextFieldOnWMYcard;

	@FindBy(how = How.XPATH, using = "//*[@id='monthly']/div/div/div[2]/div/div[2]/select[2]")
	WebElement yearTextFieldOnWMYcard;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Jumada Al-Awwal 1437')]")
	WebElement textJumaAlAwwal1437;

	/********       ********/
	// For Mosques in this city Card on Prayers Times Page

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Mosques in this city')]")
	WebElement mosquesInThisCityText;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'See all places in')]")
	WebElement seeAllPlacesInLahore;

	/********       ********/
	// For Prayer Times in Top 10 Cities on Prayers Times Page

	@FindBy(how = How.XPATH, using = "//select[@name='month']")
	WebElement dropDownMonth;
	
	@FindBy(how = How.XPATH, using = "//select[contains(@class,'calendar-dropdown-month')]")
	WebElement dropDownMonth1;

	@FindBy(how = How.XPATH, using = "//select[@name='year']")
	WebElement dropDownYear;

	@FindBy(how = How.XPATH, using = "//select[contains(@class,'calendar-dropdown-year')]")
	WebElement dropDownYear1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='monthly-prayers']/tbody/tr/td")
	List<WebElement> listOfMonthFields;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),' Jumada Al-Akhirah 1426')]")
	WebElement jumaAlAkhirah1426;

	@FindBy(how = How.ID, using = "preferenceHijriAdjustement")
	WebElement adjustHijriDateFromSettingsPanel;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save & Update')]")
	WebElement saveAndUpdateButton;

	/********       ********/
	// For Yearly Prayer Times on Prayers Times Page

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Yearly')]")
	WebElement yearlyButton;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Month')]")
	WebElement monthLabelOnPopUp;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'print-options')]")
	WebElement dropdown;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Gregorian')]")
	WebElement gregorianLabelOnPopUp;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Year')]")
	WebElement yearLabelOnPopUp;

	@FindBy(how = How.XPATH, using = "//label[contains(text(),'Hijri')]")
	WebElement hijriLabelOnPopUp;

	@FindBy(how = How.XPATH, using = "//input[@value='Print']")
	WebElement printButton;

	@FindBy(how = How.XPATH, using = "//button[@class='cancel']")
	WebElement cancelButton;

	@FindBy(how = How.XPATH, using = "//h3[contains(text()[2],'Monthly Prayer Times in')]")
	WebElement monthlyPrayerTimesIn;

	@FindBy(how = How.XPATH, using = "//table[@class='zero-margin']/tbody/tr/td")
	List<WebElement> listOfYearlyPrayerTimes;

	public WebElement prayerTimesInSpecificCity(String city) {
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'" + city + "')]"));
		return element;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id='popup-yearly-print']/button/span")
	WebElement closeYearlyPopUpOnPrayerTimesPage;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'settingsContainer')]/div/span")
	List<WebElement> listOf_CM_JM_DS_LL;

}
