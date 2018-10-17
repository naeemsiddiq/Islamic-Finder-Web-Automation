/**
 * 
 */
package com.vdif.webautomation.signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 * {Associate Software Engineer}
 */

public class SignUpLocators {
	
	WebDriver driver;
	public SignUpLocators(WebDriver sdriver){
		this.driver=sdriver;
	}
	
	@FindBy(how=How.XPATH,using="//a[@href='/login/']")
	WebElement loginButtonOnTop;
	
	@FindBy(how=How.XPATH,using="//input[contains(@class,'signup-name')]")
	WebElement sigUpNameInputField;
	
	@FindBy(how=How.XPATH,using="//input[contains(@class,'signup-email')]")
	WebElement sigUpEmailInputField;
	
	@FindBy(how=How.XPATH,using="//input[contains(@class,'signup-password')]")
	WebElement sigUpPasswordInputField;
	
	@FindBy(how=How.XPATH,using="//input[contains(@value,'Sign up')]")
	WebElement sigUpButton;
	
	@FindBy(how=How.XPATH,using="//h3[contains(text()[2],'Activate your account')]")
	WebElement activateYourAccountText;
	
}
