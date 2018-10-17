/**
 * 
 */
package com.vdif.webautomation.duas;

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

public class DuasPageLocators {

	WebDriver driver;

	public DuasPageLocators(WebDriver ddriver) {
		this.driver = ddriver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Duas")
	WebElement duasButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Quranic')]")
	WebElement quranic_1Text;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Share')]")
	WebElement shareDuaButton;

	@FindBy(how = How.CLASS_NAME, using = "dua-type")
	List<WebElement> quranicDuasList;

	
}
