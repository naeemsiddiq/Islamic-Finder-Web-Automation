/**
 * 
 */
package com.vdif.webautomation.islamicgallery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

public class IslamicGalleryLocators {

	WebDriver driver;
	public IslamicGalleryLocators(WebDriver idriver){
		this.driver=idriver;
	}
	
	@FindBy(how = How.TAG_NAME, using = "h1")
	WebElement h1Tag;

	@FindBy(how = How.LINK_TEXT, using = "Islamic Gallery")
	WebElement islamicGalleryLink;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Categories')]")
	WebElement categoriesDropDown;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Eid Ul Adha')]")
	WebElement eidhulAdhaInDropDown;

	@FindBy(how = How.XPATH, using = "//a[contains(@title,'Page 2')]")
	WebElement pageNo2;

}

