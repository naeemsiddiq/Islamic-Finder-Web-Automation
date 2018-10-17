/**
 * 
 */
package com.vdif.webautomation.login_prayerbook;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

public class LoginAndPrayerbookLocators {
	
	WebDriver driver;
	public LoginAndPrayerbookLocators(WebDriver lpdriver){
		this.driver=lpdriver;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Login")
	WebElement loginButton;
	
	@FindBy(how=How.XPATH,using="//input[@name='username']")
	WebElement usernameField;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']")
	WebElement loginButtonOnLoginForm;
	
	@FindBy(how=How.LINK_TEXT,using="Prayerbook")
	WebElement prayerbookButton;
	
	@FindBy(how=How.TAG_NAME,using="h1")
	WebElement h1Tag;
	
	@FindBy(how=How.XPATH,using="//p[contains(text(),'Prayerbook allows you to stay on top of your prayer performance.')]")
	WebElement prayerbookAllowsyoutoText;
	
	@FindBy(how=How.XPATH,using="//h3[contains(text(),'Monthly Prayer Stats')]")
	WebElement monthlyPrayerStatsText;
	
	@FindBy(how=How.XPATH,using="//green[contains(@id,'hijriMonth')]/span")
	WebElement safar1439RabiAlAwwal1439Text;
	
	@FindBy(how=How.XPATH,using="//table[contains(@class,'prayer-count')]/tbody/tr/td")
	List<WebElement> monthlyPrayerStatsTable;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'21')]")
	WebElement date21stNovember2017;
	
	@FindBy(how=How.XPATH,using="//td[contains(text(),'Tuesday')]")
	WebElement dayTuesdayNovember2017;
	
	@FindBy(how=How.XPATH,using="//td[contains(@class,'offered')]")
	List<WebElement> offeredPrayers;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
