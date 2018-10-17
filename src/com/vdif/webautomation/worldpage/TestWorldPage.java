/**
 * 
 */
package com.vdif.webautomation.worldpage;

import java.util.ArrayList;
import java.util.Arrays;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestWorldPage extends AbstractComponent {

	private static HomePageComponent homePageComponent;
	private static WorldPageComponent worldPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing World Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testCountriesNamesOnWorldPage() throws Exception {
		System.out.println("<------Testing Countries Names World Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> worldCountriesNameList = new ArrayList<>(Arrays.asList("Algeria", "Angola", "Benin",
				"Botswana", "Burkina Faso", "Burundi", "Cameroon", "Cape Verde", "Central African Republic", "Chad",
				"Comoros", "Congo", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Ethiopia", "Gabon", "Gambia",
				"Ghana", "Guinea", "Guinea-Bissau", "Ivory Coast", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar",
				"Malawi", "Mali", "Mauritania", "Mauritius", "Mayotte", "Morocco", "Mozambique", "Namibia", "Niger",
				"Nigeria", "Republic of the Congo", "Réunion", "Rwanda", "Saint Helena", "São Tomé and Príncipe",
				"Senegal", "Seychelles", "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Swaziland",
				"Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe", "Antarctica",
				"French Southern Territories", "South Georgia and the South Sandwich Islands", "Afghanistan", "Armenia",
				"Asia", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "British Indian Ocean Territory", "Brunei",
				"Cambodia", "China", "Christmas Island", "Cocos [Keeling] Islands", "Georgia",
				"Hashemite Kingdom of Jordan", "Hong Kong", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan",
				"Kazakhstan", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Macao", "Malaysia", "Maldives", "Mongolia",
				"Myanmar [Burma]", "Nepal", "North Korea", "Oman", "Pakistan", "Palestine", "Philippines", "Qatar",
				"Republic of Korea", "Saudi Arabia", "Singapore", "Sri Lanka", "Syria", "Taiwan", "Tajikistan",
				"Thailand", "Turkey", "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen", "Åland",
				"Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia and Herzegovina", "Bulgaria", "Croatia",
				"Cyprus", "Czech Republic", "Denmark", "Estonia", "Europe", "Faroe Islands", "Finland", "France",
				"Germany", "Gibraltar", "Greece", "Guernsey", "Hungary", "Iceland", "Ireland", "Isle of Man", "Italy",
				"Jersey", "Kosovo", "Latvia", "Liechtenstein", "Luxembourg", "Macedonia", "Malta", "Monaco",
				"Montenegro", "Netherlands", "Norway", "Poland", "Portugal", "Republic of Lithuania",
				"Republic of Moldova", "Romania", "Russia", "San Marino", "Serbia", "Slovak Republic", "Slovenia",
				"Spain", "Svalbard and Jan Mayen", "Sweden", "Switzerland", "Ukraine", "United Kingdom", "Vatican City",
				"Anguilla", "Antigua and Barbuda", "Aruba", "Bahamas", "Barbados", "Belize", "Bermuda",
				"Bonaire, Sint Eustatius, and Saba", "British Virgin Islands", "Canada", "Cayman Islands", "Costa Rica",
				"Cuba", "Curaçao", "Dominica", "Dominican Republic", "El Salvador", "Greenland", "Grenada",
				"Guadeloupe", "Guatemala", "Haiti", "Honduras", "Jamaica", "Martinique", "Mexico", "Montserrat",
				"Nicaragua", "Panama", "Puerto Rico", "Saint Kitts and Nevis", "Saint Lucia", "Saint Martin",
				"Saint Pierre and Miquelon", "Saint Vincent and the Grenadines", "Saint-Barthélemy", "Sint Maarten",
				"Trinidad and Tobago", "Turks and Caicos Islands", "U.S. Virgin Islands", "United States",
				"American Samoa", "Australia", "Cook Islands", "East Timor", "Federated States of Micronesia", "Fiji",
				"French Polynesia", "Guam", "Kiribati", "Marshall Islands", "Nauru", "New Caledonia", "New Zealand",
				"Niue", "Norfolk Island", "Northern Mariana Islands", "Palau", "Papua New Guinea", "Pitcairn Islands",
				"Samoa", "Solomon Islands", "Tokelau", "Tonga", "Tuvalu", "U.S. Minor Outlying Islands", "Vanuatu",
				"Wallis and Futuna", "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador",
				"Falkland Islands", "French Guiana", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"));

		worldPageComponent = new WorldPageComponent();
		homePageComponent = new HomePageComponent();

		homePageComponent.clickOnfooterWorldLink();
		homePageComponent.checkFindPrayerTimesAndIslamicPlacesInYourCountryOnWorldPage();
		worldPageComponent.checkListOfCountries(worldCountriesNameList);

	}

	@Test
	public void testSaudiArabiaOnWorldPage() throws Exception {
		System.out.println("<------Testing Saudi Arabia On World Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		ArrayList<String> topCitiesInSaudiArabia = new ArrayList<>(Arrays.asList("Abha", "Buraidah", "Dammam",
				"Dhahran", "Jeddah", "Madina", "Makkah", "Riyadh", "Tabouk", "Abqaiq", "Yanbu al Sinaiyah", "Hofuf",
				"Jubail", "Qatif", "Jiddah", "Rahimah", "Dhahran International", "Tanajib", "Jedda", "Udhailiyah"));
		worldPageComponent = new WorldPageComponent();
		homePageComponent = new HomePageComponent();
		homePageComponent.clickOnfooterWorldLink();

		worldPageComponent.searchCountry("Saudi Arabia");
		worldPageComponent.clickSaudiArabiaLink();
		worldPageComponent.checkListOfTopCitiesInCountry(topCitiesInSaudiArabia);
		Thread.sleep(1000);
		worldPageComponent.clickJeddahCitySaudiArabiaLink();
		String h1Tag = worldPageComponent.checkH1Tag();
		checkAssert("Prayer Times in Jeddah", h1Tag);
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

		worldPageComponent.searchCityInputField("Abal Dud");
		worldPageComponent.clickabalDudCitySaudiArabiaLink();
		h1Tag = worldPageComponent.checkH1Tag();
		checkAssert("Prayer Times in Abal Dud", h1Tag);

	}

	@Test
	public void testUnitedStatesOnWorldPage() throws Exception {
		System.out.println("<------Testing United States On World Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		ArrayList<String> topCitiesInUnitedStates = new ArrayList<>(Arrays.asList("Anchorage, AK", "Atlanta, GA", "Chicago, IL",
				"Dallas, TX", "Denver, CO", "Detroit, MI", "Honolulu, HI", "Houston, TX", "Los Angeles, CA", "Miami, FL", "New York, NY", "San Diego, CA",
				"San Francisco, CA", "Seattle, WA", "Washington, DC", "Boston, MA", "Redmond, WA", "Kingston, WA", "Philadelphia, PA",
				"Minneapolis, MN", "Nashville, TN", "Brooklyn, NY", "Orlando, FL", "Bellevue, WA", "Columbus, OH"));
		worldPageComponent = new WorldPageComponent();
		homePageComponent = new HomePageComponent();
		homePageComponent.clickOnfooterWorldLink();

		worldPageComponent.searchCountry("United States");
		worldPageComponent.clickUnitedStatesLink();
		worldPageComponent.checkListOfTopCitiesInCountry(topCitiesInUnitedStates);
		Thread.sleep(1000);
		worldPageComponent.clickAnchorageCityUnitedStatesLink();
		String h1Tag = worldPageComponent.checkH1Tag();
		checkAssert("Prayer Times in Anchorage, AK", h1Tag);
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");

		worldPageComponent.searchCityInputField("abbot");
		worldPageComponent.clickabbotCityUnitedStatesLink();
		h1Tag = worldPageComponent.checkH1Tag();
		checkAssert("Prayer Times in Abbot, ME", h1Tag);

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
