/**
 * 
 */
package com.vdif.webautomation.login_prayerbook;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class LoginAndPrayerbookComponent extends AbstractComponent {

	LoginAndPrayerbookLocators loginAndPrayerbookLocators = PageFactory.initElements(driver,
			LoginAndPrayerbookLocators.class);

	public void clickLoginButton() throws Exception {
		WebElement element = loginAndPrayerbookLocators.loginButton;
		scrollToLocateElement(element);
	}

	public void enterEmail(String email) throws Exception {
		loginAndPrayerbookLocators.usernameField.clear();
		loginAndPrayerbookLocators.usernameField.sendKeys(email);
		Thread.sleep(500);
	}

	public void enterPassword(String password) throws Exception {
		loginAndPrayerbookLocators.passwordField.clear();
		loginAndPrayerbookLocators.passwordField.sendKeys(password);
		Thread.sleep(500);
	}

	public void clickLoginButtonOnLoginForm() throws Exception {
		loginAndPrayerbookLocators.loginButtonOnLoginForm.click();
		Thread.sleep(1000);
	}

	public void clickprayerbookButton() throws Exception {
		loginAndPrayerbookLocators.prayerbookButton.click();
		Thread.sleep(1000);
	}

	/*
	 * ********************* For Prayer book page
	 */

	public String h1Tag() {
		String h1Tag = loginAndPrayerbookLocators.h1Tag.getText();
		return h1Tag;
	}

	public String checkPrayerbookAllowsyoutoText() {
		String text = loginAndPrayerbookLocators.prayerbookAllowsyoutoText.getText();
		return text;
	}

	public String checkMonthlyPrayerStatsText() {
		String text = loginAndPrayerbookLocators.monthlyPrayerStatsText.getText();
		return text;
	}

	public String checkSafar1439RabiAlAwwal1439Text() {
		String text = loginAndPrayerbookLocators.safar1439RabiAlAwwal1439Text.getText();
		return text;
	}

	public void checkListMonthlyPrayerStatsTable() {
		List<WebElement> monthlyPrayerStatsTable = loginAndPrayerbookLocators.monthlyPrayerStatsTable;
		System.out.println(monthlyPrayerStatsTable.size());

		for (int i = 0; i < monthlyPrayerStatsTable.size(); i++) {
			System.out.println(monthlyPrayerStatsTable.get(i).getText());
		}
	}

	public String checkDate21stNovember2017() {
		String text = loginAndPrayerbookLocators.date21stNovember2017.getText();
		return text;
	}

	public String checkDayTuesdayNovember2017() {
		String text = loginAndPrayerbookLocators.dayTuesdayNovember2017.getText();
		return text;
	}

	public void checkListOfOfferedPrayerOn21stNovember2017() {
		List<WebElement> offeredPrayers = loginAndPrayerbookLocators.offeredPrayers;
		System.out.println(offeredPrayers.size());
		if (offeredPrayers.size() == 6) {
			System.out.println("Offerd 5 Prayers on 21st November 2017");
		} else
			Assert.assertEquals(offeredPrayers.size(), "6");
	}

}
