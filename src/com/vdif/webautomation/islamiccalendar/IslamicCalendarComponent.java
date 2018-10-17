/**
 * 
 */
package com.vdif.webautomation.islamiccalendar;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class IslamicCalendarComponent extends AbstractComponent {

	IslamicCalendarLocators islamicCalendarLocators = PageFactory.initElements(driver, IslamicCalendarLocators.class);

	public void clickIslamicCalendarButton() throws Exception {
		WebElement element = islamicCalendarLocators.clickIslamicCalendarButton;
		scrollToLocateElement(element);
	}

	public void clickResetButtonOnIslamicCalendar() throws Exception {
		islamicCalendarLocators.clickResetButton.click();
		Thread.sleep(1000);
	}

	/********       ********/
	// For Islamic Calendar in November 2017

	public void selectMonthInDropDown(String month) throws Exception {
		WebElement selectMonthFromDropDown = islamicCalendarLocators.monthDropDown;
		Select dropdown = new Select(selectMonthFromDropDown);
		dropdown.selectByVisibleText(month);
	}

	public void selectYearInDropDown(String year) throws Exception {
		WebElement selectYearFromDropDown = islamicCalendarLocators.yearDropDown;
		Select dropdown = new Select(selectYearFromDropDown);
		dropdown.selectByVisibleText(year);
	}

	public String checkGregorianCalendarNovember2017() throws Exception {
		WebElement element = islamicCalendarLocators.gregorianCalendarNovember2017;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkGregorianvsHijriCalendarText() throws Exception {
		WebElement element = islamicCalendarLocators.gregorianvsHijriCalendarText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkNovember2017Text() throws Exception {
		WebElement element = islamicCalendarLocators.november2017Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSafar1439Text() throws Exception {
		WebElement element = islamicCalendarLocators.safar1439Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkRabiAlAwwal1439Text() throws Exception {
		WebElement element = islamicCalendarLocators.rabiAlAwwal1439Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkNovember8_2017Text() throws Exception {
		WebElement element = islamicCalendarLocators.november8_2017Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnSeePrayerTimesNovember() throws Exception {
		WebElement element = islamicCalendarLocators.seePrayerTimesOfNovember;
		scrollAndClick(element);
	}

	/********       ********/
	// For Islamic Calendar in August 1992

	public String checkGregorianCalendarAugust1992() throws Exception {
		WebElement element = islamicCalendarLocators.gregorianCalendarAugust1992;
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'instant', block: 'end', inline: 'nearest'})", element);
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkAugust1992Text() throws Exception {
		WebElement element = islamicCalendarLocators.august1992Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkSafar1413Text() throws Exception {
		WebElement element = islamicCalendarLocators.safar1413Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkRabiAlAwwal1413Text() throws Exception {
		WebElement element = islamicCalendarLocators.rabiAlAwwal1413Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkAugust15_1992Text() throws Exception {
		WebElement element = islamicCalendarLocators.august15_1992Text;
		System.out.println(element.getText());
		return element.getText();
	}

	/********       ********/
	// For ViewPrayerTime AND ViewDateConverter Card

	public String checkOfferYourSalahOnTimeText() throws Exception {
		WebElement element = islamicCalendarLocators.offerYourSalahOnTimeText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnViewPrayersTimeButton() throws Exception {
		WebElement element = islamicCalendarLocators.viewPrayersTimeButton;
		scrollAndClick(element);
	}

	public String checkSwitchBetGregorianAndHijriText() throws Exception {
		WebElement element = islamicCalendarLocators.switchBetGregorianAndHijriText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickOnViewDateConverterButton() throws Exception {
		WebElement element = islamicCalendarLocators.viewDateConverterButton;
		scrollAndClick(element);
	}

	/********       ********/
	// For Special Islamic Days Card

	public String checkSpecialIslamicDaysText() throws Exception {
		WebElement element = islamicCalendarLocators.specialIslamicDaysText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickListOfSpecialIslamicDays() throws Exception {
		ArrayList<String> listOfAllIslamicDays = new ArrayList<String>(
				Arrays.asList("Ramadan", "Laylat al qadr", "Eid ul Fitr", "Hajj", "Arafa", "Eid ul Adha", "Ashura"));
		ArrayList<String> listOfh1OfAllIslamicDays = new ArrayList<String>(Arrays.asList("Ramadan", "Laylat al qadr",
				"Eid ul Fitr", "Hajj 2017", "Go Back", "Go Back", "Day of Ashura 2017, 10 Muharram 1439"));

		for (int i = 0; i < listOfAllIslamicDays.size(); i++) {
			clickOnIslamicDayFromList(listOfAllIslamicDays.get(i), listOfh1OfAllIslamicDays.get(i));
		}

	}

	private void clickOnIslamicDayFromList(String islamicDay, String h1OfThatDay) throws Exception {
		WebElement element = driver.findElement(By.linkText(islamicDay));
		scrollToLocateElement(element);
		WebElement elementh1 = driver.findElement(By.xpath("//*[contains(text()," + "'" + h1OfThatDay + "'" + ")]"));
		System.out.println(elementh1.getText());
		clickIslamicCalendarButton();
	}

	/********       ********/
	// For Know your Hijri dates! Card
	
	public String checkknowYourHijriDatesText() throws Exception {
		WebElement element = islamicCalendarLocators.knowYourHijriDatesText;
		System.out.println(element.getText());
		return element.getText();
	}
	
	public void clickOnDateConverterButton() throws Exception {
		WebElement element = islamicCalendarLocators.dateConverterButton;
		scrollToLocateElement(element);
	}	
	

}
