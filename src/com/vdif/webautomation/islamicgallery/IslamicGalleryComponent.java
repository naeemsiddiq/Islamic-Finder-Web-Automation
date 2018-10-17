/**
 * 
 */
package com.vdif.webautomation.islamicgallery;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class IslamicGalleryComponent extends AbstractComponent {

	IslamicGalleryLocators islamicGalleryLocators = PageFactory.initElements(driver, IslamicGalleryLocators.class);

	public String checkH1Tag() {
		String h1Tag = islamicGalleryLocators.h1Tag.getText();
		return h1Tag;
	}

	public void clickIslamicGalleryLink() throws Exception {
		WebElement element = islamicGalleryLocators.islamicGalleryLink;
		scrollAndClick(element);
		Thread.sleep(1000);
	}

	public void clickCategoriesDropDown() throws Exception {
		islamicGalleryLocators.categoriesDropDown.click();
		Thread.sleep(1000);
	}

	public void clickEidhulAdhaInDropDown() throws Exception {
		islamicGalleryLocators.eidhulAdhaInDropDown.click();
		Thread.sleep(1000);
	}

	public void clickPageNo2() throws Exception {
		WebElement element = islamicGalleryLocators.pageNo2;
		scrollToLocateElement(element);
	}

}
