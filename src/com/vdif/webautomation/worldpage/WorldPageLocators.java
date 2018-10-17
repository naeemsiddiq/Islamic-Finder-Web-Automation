/**
 * 
 */
package com.vdif.webautomation.worldpage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class WorldPageLocators {
	WebDriver driver;

	public WorldPageLocators(WebDriver wdriver) {
		this.driver = wdriver;
	}

	@FindBy(how = How.TAG_NAME, using = "h1")
	WebElement h1Tag;

	@FindBy(how = How.XPATH, using = "//div[contains(@class,'large-10')]/a")
	List<WebElement> listOfCountriesName;

	@FindBy(how = How.XPATH, using = "//input[contains(@id,'searchcountries')]")
	WebElement searchCountriesInputField;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Saudi Arabia')]")
	WebElement saudiArabiaLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'United States')]")
	WebElement unitedStatesLink;

	@FindBy(how = How.XPATH, using = "//a[contains(@class,'underlined') and contains(@title,'Prayer Times')]")
	List<WebElement> listOfTopCitiesInCountry;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Anchorage, AK')]")
	WebElement anchorageCityUnitedStatesLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Jeddah')]")
	WebElement jeddahCitySaudiArabiaLink;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'searchcities')]")
	WebElement searchCityInputField;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Abbot')]")
	WebElement abbotCityUnitedStatesLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Abal Dud')]")
	WebElement abalDudCitySaudiArabiaLink;

}
