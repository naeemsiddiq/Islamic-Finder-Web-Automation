
/**
 * @author Naeem Siddiq
 *
 */
package com.vdif.webautomation.prayertimes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.homepage.HomePageLocators;

public class PrayerTimesPageComponent extends AbstractComponent {

	PrayerTimePageLocators prayerTimePageLocators = PageFactory.initElements(driver, PrayerTimePageLocators.class);
	HomePageLocators homePageLocators = PageFactory.initElements(driver, HomePageLocators.class);

	/**
	 ********/
	// For Prayer Times Lahore Card on Prayers Times Page

	public void clickPrayerTimesButton() throws Exception {
		WebElement element = prayerTimePageLocators.prayerTimesButton;
		scrollAndClick(element);
	}

	public void checkLahorePunjabPakistanText() {
		WebElement element = prayerTimePageLocators.lahorePunjabPakistanText;
		System.out.println(element.getText());
	}

	public void clickprayerTimesLinkOnPTLcard() throws Exception {
		prayerTimePageLocators.prayerTimesLinkOnPTLcard.click();
		Thread.sleep(1000);
	}

	public void clickpakistanLinkOnPTLcard() throws Exception {
		prayerTimePageLocators.pakistanLinkOnPTLcard.click();
		Thread.sleep(1000);
	}

	public void verifyPakistanLinkOnPTLcard() throws Exception {
		WebElement element = prayerTimePageLocators.verifyPakistanLinkOnPTLcard;
		checkAssert("Prayer Times in Pakistan", element.getText());
		Thread.sleep(1000);
	}

	public void clickOnGetLinkOnPrayerTimes() throws Exception {
		WebElement element = prayerTimePageLocators.getLinkPrayerTimesText;
		Thread.sleep(1000);
		scrollToLocateElement(element);
	}

	public void checkCopyOnGetLinkPrayerTimesText() throws Exception {
		WebElement element = prayerTimePageLocators.checkCopyOnGetLinkPrayerTimesText;
		scrollToLocateElement(element);
	}

	public String checkpTagOnPrayerTimesLahoreCard() throws Exception {
		WebElement element = prayerTimePageLocators.checkpTagOnPrayerTimesLahoreCard;
		checkAssert("Getting accurate prayer times for your desired location was never this easy" + "\nmore",
				element.getText());
		System.out.println(element.getText());
		return element.getText();
	}

	/**
	 ********/
	// For Prayer Times Today Card on Prayers Times Page

	public void clickWeeklyAndMonthlyView() throws Exception {
		WebElement element = prayerTimePageLocators.weeklyAndMonthlyView;
		scrollToLocateElement(element);
	}

	/**
	 ********/
	// For Weekly Monthly Yearly Card on Prayers Times Page

	public void clickWeeklyOnWMYCard() throws Exception {
		WebElement element = prayerTimePageLocators.weeklyOnWMYCard;
		scrollToLocateElement(element);
	}

	public String checkDayColumnOnWeekly() throws Exception {
		WebElement element = prayerTimePageLocators.dayColumnOnWeekly;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkFriColumnOnWeekly() throws Exception {
		WebElement element = prayerTimePageLocators.friColumnOnWeekly;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickMonthlyOnWMYCard() throws Exception {
		WebElement element = prayerTimePageLocators.monthlyOnWMYCard;
		scrollAndClick(element);
	}

	public void selectMonthFromTextFieldOnWMYCard() throws Exception {
		prayerTimePageLocators.monthTextFieldOnWMYcard.click();
		Thread.sleep(1000);
	}

	public void selectYearFromTextFieldOnWMYCard() throws Exception {
		prayerTimePageLocators.yearTextFieldOnWMYcard.sendKeys("2016");
		Thread.sleep(1000);
	}

	public String checkTextJumaAlAwwal1437() {
		WebElement element = prayerTimePageLocators.textJumaAlAwwal1437;
		System.out.println(element.getText());
		return element.getText();
	}

	/********       ********/
	// For Mosques in this city Card on Prayers Times Page

	public String checkMosquesInThisCityText() {
		WebElement element = prayerTimePageLocators.mosquesInThisCityText;
		System.out.println(element.getText());
		return element.getText();
	}

	public void clickSeeAllPlacesInLahore() throws Exception {
		WebElement element = prayerTimePageLocators.seeAllPlacesInLahore;
		scrollToLocateElement(element);
	}

	/**
	 * @throws Exception
	 *             ******
	 ********/
	// For Prayer Times in Top 10 Cities on Prayers Times Page

	public void searchTopNavBar(String cityName, String completeLocation) throws Exception {
		homePageLocators.topNavBarSearch.clear();
		homePageLocators.topNavBarSearch.sendKeys(cityName);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.linkText(completeLocation)).click();
		Thread.sleep(1000);
	}

	public void selectMonthFromDropDown(String month) throws Exception {
		Select dropdown = new Select(prayerTimePageLocators.dropDownMonth1);
		dropdown.selectByVisibleText(month);
		Thread.sleep(2000);
	}

	public void selectYearFromDropDown(String year) throws Exception {
		Select dropdown = new Select(prayerTimePageLocators.dropDownYear1);
		dropdown.selectByVisibleText(year);
		Thread.sleep(2000);
	}

	public void selectAdjustHijriDateFromSettingsPanel(String hijriDate) throws Exception {
		Select dropdown = new Select(prayerTimePageLocators.adjustHijriDateFromSettingsPanel);
		dropdown.selectByVisibleText(hijriDate);
		Thread.sleep(2000);
	}

	public void clickSaveAndUpdateButton() throws Exception {
		WebElement element = prayerTimePageLocators.saveAndUpdateButton;
		scrollAndClick(element);
		Thread.sleep(3000);
	}

	public void clickJumaAlAkhirah1426() throws Exception {
		WebElement element = prayerTimePageLocators.jumaAlAkhirah1426;
		scrollAndClick(element);
	}

	public void VerifyListOfMonth(ArrayList<String> listOfPrayerTimes) {
		List<WebElement> parentRow = prayerTimePageLocators.listOfMonthFields;
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < parentRow.size(); i++) {
			// arrayList.add('"' + parentRow.get(i).getText() + '"');
			System.out
					.println("runtime :  " + parentRow.get(i).getText() + "      saved : " + listOfPrayerTimes.get(i));
			Assert.assertEquals(parentRow.get(i).getText(), listOfPrayerTimes.get(i));
		}
		System.out.println("Array List : " + arrayList);

	}

	/**
	 * @throws Exception
	 *             ******
	 ********/
	// For Yearly Prayer Times on Prayers Times Page

	public void selectMonthFromDropDownOnPopUp(String month) throws Exception {
		WebElement element = prayerTimePageLocators.dropdown;
		Select dropdown = new Select(element.findElement(By.name("month")));
		dropdown.selectByVisibleText(month);
		Thread.sleep(1000);
	}

	public void selectYearFromDropDownOnPopUp(String year) throws Exception {
		WebElement element = prayerTimePageLocators.dropdown;
		Select dropdown = new Select(element.findElement(By.name("year")));
		dropdown.selectByVisibleText(year);
		Thread.sleep(1000);
	}

	public void clickYearlyButton() throws Exception {
		WebElement element = prayerTimePageLocators.yearlyButton;
		scrollToLocateElement(element);
	}

	public void clickmonthLabelOnPopUp() throws Exception {
		prayerTimePageLocators.monthLabelOnPopUp.click();
		Thread.sleep(500);
	}

	public void clickgregorianLabelOnPopUp() throws Exception {
		prayerTimePageLocators.gregorianLabelOnPopUp.click();
		Thread.sleep(500);
	}

	public void clickyearLabelOnPopUp() throws Exception {
		prayerTimePageLocators.yearLabelOnPopUp.click();
		Thread.sleep(500);
	}

	public void clickhijriLabelOnPopUp() throws Exception {
		prayerTimePageLocators.hijriLabelOnPopUp.click();
		Thread.sleep(500);
	}

	public void clickprintButton() throws Exception {
		prayerTimePageLocators.printButton.click();
		Thread.sleep(3000);
	}

	public void clickcancelButton() throws Exception {
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		prayerTimePageLocators.cancelButton.click();
		Thread.sleep(1000);
	}

	public void VerifyListOfYearlyPrayerTimes(ArrayList<String> listOfPrayerTimes) {
		List<WebElement> parentRow = prayerTimePageLocators.listOfYearlyPrayerTimes;
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < listOfPrayerTimes.size(); i++) {
			// arrayList.add('"' + parentRow.get(i).getText() + '"');
			System.out.println("runtime  :  "+parentRow.get(i).getText() +"  saved : "+ listOfPrayerTimes.get(i));
			Assert.assertEquals(parentRow.get(i).getText(), listOfPrayerTimes.get(i));
		}
		System.out.println("Final Array List : " + arrayList);
	}

	public void clickPrayerTimesInSpecificCity(String city) throws Exception {
		WebElement element = prayerTimePageLocators.prayerTimesInSpecificCity(city);
		System.out.println(element.getText());
		scrollAndClick(element);
	}

	public void VerifyListOf_CM_JM_DS_LL(ArrayList<String> listOfPrayerTimes) {
		List<WebElement> parentRow = prayerTimePageLocators.listOf_CM_JM_DS_LL;
		System.out.println(parentRow.size());
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < parentRow.size()-2; i++) {
			// arrayList.add('"' + parentRow.get(i).getText() + '"');
			// System.out.println("Array List : " + arrayList);
			System.out.println("runtime : " + parentRow.get(i).getText() + "     saved  : " + listOfPrayerTimes.get(i));
			Assert.assertEquals(parentRow.get(i).getText(), listOfPrayerTimes.get(i));
		}
		System.out.println("Final Array List : " + arrayList);
	}

	public void clickCloseYearlyPopUpOnPrayerTimesPage() throws Exception {
		prayerTimePageLocators.closeYearlyPopUpOnPrayerTimesPage.click();
		Thread.sleep(1000);
	}

}
