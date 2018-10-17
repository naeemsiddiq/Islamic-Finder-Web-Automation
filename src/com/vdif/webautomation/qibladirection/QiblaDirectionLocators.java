/**
 * 
 */
package com.vdif.webautomation.qibladirection;

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

public class QiblaDirectionLocators {

	WebDriver driver;

	public QiblaDirectionLocators(WebDriver qdriver) {
		this.driver = qdriver;
	}

	String karachi = "Karachi";

	@FindBy(how = How.ID, using = "small-search")
	WebElement topNavBarSearch;

	@FindBy(how = How.CSS, using = "#onbtr-1 > div > div.search-retults-container > div > a:nth-child(1)")
	WebElement searchKarachifromSearch;

	@FindBy(how = How.LINK_TEXT, using = "Qibla Direction")
	WebElement clickQiblaDirectionButton;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'map-details')]/div")
	List<WebElement> listOfMapDetails;
}
