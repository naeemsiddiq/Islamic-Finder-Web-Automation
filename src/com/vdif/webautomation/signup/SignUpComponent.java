/**
 * 
 */
package com.vdif.webautomation.signup;

import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class SignUpComponent extends AbstractComponent {

	SignUpLocators signUpLocators = PageFactory.initElements(driver, SignUpLocators.class);

	public void clickLoginButton() throws Exception {
		signUpLocators.loginButtonOnTop.click();
		Thread.sleep(1000);
	}

	public void EntersigUpNameInputField(String name) {
		signUpLocators.sigUpNameInputField.clear();
		signUpLocators.sigUpNameInputField.sendKeys(name);
	}

	public void EntersigUpEmailInputField(String email) {
		signUpLocators.sigUpEmailInputField.clear();
		signUpLocators.sigUpEmailInputField.sendKeys(email);
	}

	public void EntersigUpPasswordInputField(String password) {
		signUpLocators.sigUpPasswordInputField.clear();
		signUpLocators.sigUpPasswordInputField.sendKeys(password);
	}

	public void clickSignUpButton() throws Exception {
		signUpLocators.sigUpButton.click();
		Thread.sleep(1000);
	}
	
	public String checkActivateYourAccountText(){
		String text=signUpLocators.activateYourAccountText.getText();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
