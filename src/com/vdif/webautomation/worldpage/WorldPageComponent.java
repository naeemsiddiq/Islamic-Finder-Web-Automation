/**
 * 
 */
package com.vdif.webautomation.worldpage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class WorldPageComponent extends AbstractComponent {

	WorldPageLocators worldPageLocators = PageFactory.initElements(driver, WorldPageLocators.class);

	public String checkH1Tag() {
		String h1Tag = worldPageLocators.h1Tag.getText();
		return h1Tag;
	}

	public void checkListOfCountries(ArrayList<String> worldCountriesNameList) throws Exception {
		ArrayList<String> countriesNamesList = new ArrayList<String>();
		List<WebElement> listOfCountries = worldPageLocators.listOfCountriesName;

		for (int i = 0; i < listOfCountries.size(); i++) {
			// countriesNamesList.add('"' + listOfCountries.get(i).getText() +
			// '"');
			checkAssert(worldCountriesNameList.get(i), listOfCountries.get(i).getText());
		}
		System.out.println(countriesNamesList);
	}

	public void searchCountry(String countryName) throws Exception {
		worldPageLocators.searchCountriesInputField.clear();
		worldPageLocators.searchCountriesInputField.sendKeys(countryName);
		Thread.sleep(1000);
	}

	public void clickSaudiArabiaLink() throws Exception {
		worldPageLocators.saudiArabiaLink.click();
		Thread.sleep(1000);
	}

	public void clickUnitedStatesLink() throws Exception {
		worldPageLocators.unitedStatesLink.click();
		Thread.sleep(1000);
	}

	public void checkListOfTopCitiesInCountry(ArrayList<String> topCitiesInCountries) throws Exception {
		ArrayList<String> citiesNamesList = new ArrayList<String>();
		List<WebElement> listOfTopCities = worldPageLocators.listOfTopCitiesInCountry;

		for (int i = 0; i < listOfTopCities.size(); i++) {
			// citiesNamesList.add('"' + listOfTopCities.get(i).getText() +
			// '"');
			checkAssert(topCitiesInCountries.get(i), listOfTopCities.get(i).getText());
		}
		System.out.println(citiesNamesList);
	}

	public void clickAnchorageCityUnitedStatesLink() throws Exception {
		worldPageLocators.anchorageCityUnitedStatesLink.click();
		Thread.sleep(1000);
	}

	public void clickJeddahCitySaudiArabiaLink() throws Exception {
		worldPageLocators.jeddahCitySaudiArabiaLink.click();
		Thread.sleep(1000);
	}

	public void searchCityInputField(String cityName) throws Exception {
		worldPageLocators.searchCityInputField.clear();
		worldPageLocators.searchCityInputField.sendKeys(cityName);
		Thread.sleep(1000);
	}

	public void clickabbotCityUnitedStatesLink() throws Exception {
		worldPageLocators.abbotCityUnitedStatesLink.click();
		Thread.sleep(1000);
	}

	public void clickabalDudCitySaudiArabiaLink() throws Exception {
		worldPageLocators.abalDudCitySaudiArabiaLink.click();
		Thread.sleep(1000);
	}

}
