/**
 * 
 */
package com.vdif.webautomation.specialislamicdays;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class SpecialIslamicDaysComponent extends AbstractComponent {

	SpecialIslamicDaysLocators specialIslamicDaysLocators = PageFactory.initElements(driver,
			SpecialIslamicDaysLocators.class);

	public void clickSpecialIslamicDaysButton() throws Exception {
		specialIslamicDaysLocators.specialIslamicDaysButton.click();
		Thread.sleep(1000);
	}

	public String checkAllSpecialIslamicDays() {
		WebElement element = specialIslamicDaysLocators.allSpecialIslamicDaysText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkGregorianYearText() {
		WebElement element = specialIslamicDaysLocators.gregorianYearText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkHijriYearText() {
		WebElement element = specialIslamicDaysLocators.hijriYearText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickArrowRight() throws Exception {
		specialIslamicDaysLocators.arrowRight.click();
		Thread.sleep(1000);
	}

	public void clickArrowLeft() throws Exception {
		specialIslamicDaysLocators.arrowLeft.click();
		Thread.sleep(1000);
	}

	public void clickListOfSpecialIslamicDays() throws Exception {
		ArrayList<String> listOfAllIslamicDays = new ArrayList<String>(Arrays.asList("Ramadan", "Laylatul Qadr",
				"Eid ul Fitr", "Dhul Hijjah", "Arafa", "Eid ul Adha", "Ashoora"));
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
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
	}

	public String checkAllIslamicEventsText() {
		WebElement element = specialIslamicDaysLocators.allIslamicEventsText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickListOfAllIslamicEvents() throws Exception {
		ArrayList<String> listOfAllIslamicEvents = new ArrayList<String>(
				Arrays.asList("Ramadan 2018 Dates and Timetable", "Eid al Fitr 2018 Date", "Eid al Adha 2018 Date",
						"Eid al Adha 2016 Date", "Hajj 2018 Date"));
		ArrayList<String> listOfh1OfAllIslamicEvents = new ArrayList<String>(
				Arrays.asList("Ramadan 2018 Dates and Timetable", "Eid al Fitr 2018 Date", "Eid al Adha 2018 Date",
						"Eid al Adha 2016 Date", "Hajj 2018 Date"));

		for (int i = 0; i < listOfAllIslamicEvents.size(); i++) {
			clickOnIslamicDayFromList(listOfAllIslamicEvents.get(i), listOfh1OfAllIslamicEvents.get(i));
		}

	}

}
