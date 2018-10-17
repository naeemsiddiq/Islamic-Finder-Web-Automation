/**
 * 
 */
package com.vdif.webautomation.signup;

import java.util.UUID;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestSignUp extends AbstractComponent {

	SignUpComponent signUpComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing Sign Up Form Islamic Finder----------------------->>\n");
	}

	@Test
	public void testSigUpForm() throws Exception {
		System.out.println("<------Testing SignUp Page------->\n");
		incrementAndOpenURLpage();
		signUpComponent = new SignUpComponent();

		signUpComponent.clickLoginButton();
		signUpComponent.EntersigUpNameInputField("vdcheck");
		final String randomEmail = randomEmail();
		signUpComponent.EntersigUpEmailInputField(randomEmail);
		signUpComponent.EntersigUpPasswordInputField("test12345");
		signUpComponent.clickSignUpButton();
		String checkText = signUpComponent.checkActivateYourAccountText();
		checkAssert(checkText, "ACTIVATE YOUR ACCOUNT");
	}

	private static String randomEmail() {
		return "random-" + UUID.randomUUID().toString() + "@example.com";
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
