/**
 * 
 */
package com.vdif.webautomation.zakatcalculator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class ZakatCalculatorComponent extends AbstractComponent {

	ZakatCalculatorLocators zakatCalculatorLocators = PageFactory.initElements(driver, ZakatCalculatorLocators.class);

	public void clickZakatCalculatorLink() throws Exception {
		zakatCalculatorLocators.zakatCalculatorLink.click();
		Thread.sleep(1000);
	}

	public String checkGettingStartedText() {
		String check = zakatCalculatorLocators.gettingStartedText.getText();
		return check;
	}

	public void selectDropDownBaseOnNisabCriteria(String data) {
		Select dropdown = new Select(zakatCalculatorLocators.dropDownBaseOnNisabCriteria);
		dropdown.selectByVisibleText(data);
	}

	public void enterNisabValueIputField(String data) {
		zakatCalculatorLocators.nisabValueIputField.clear();
		zakatCalculatorLocators.nisabValueIputField.sendKeys(data);
	}

	public void clickStartButton() throws Exception {
		zakatCalculatorLocators.startButton.click();
		Thread.sleep(1000);
	}

	public void enterGold20KGramsInputField(String data) {
		zakatCalculatorLocators.gold20KGramsInputField.clear();
		zakatCalculatorLocators.gold20KGramsInputField.sendKeys(data);
	}

	public void enterGold20KAmountInputField(String data) {
		zakatCalculatorLocators.gold20KAmountInputField.clear();
		zakatCalculatorLocators.gold20KAmountInputField.sendKeys(data);
	}

	public void clickContinueButton() throws Exception {
		zakatCalculatorLocators.continueButton.click();
		Thread.sleep(1000);
	}

	public void enterCashInHandsInputField(String data) {
		zakatCalculatorLocators.cashInHandsInputField.clear();
		zakatCalculatorLocators.cashInHandsInputField.sendKeys(data);
	}

	public void enterCashInBanksInputField(String data) {
		zakatCalculatorLocators.cashInBanksInputField.clear();
		zakatCalculatorLocators.cashInBanksInputField.sendKeys(data);
	}

	public void enterCashInBusinessInputField(String data) {
		zakatCalculatorLocators.cashInBusinessInputField.clear();
		zakatCalculatorLocators.cashInBusinessInputField.sendKeys(data);
	}

	public void enterRentalIncomeInputField(String data) {
		zakatCalculatorLocators.rentalIncomeInputField.clear();
		zakatCalculatorLocators.rentalIncomeInputField.sendKeys(data);
	}

	public void enterPropertyValueInputField(String data) {
		zakatCalculatorLocators.propertyValueInputField.clear();
		zakatCalculatorLocators.propertyValueInputField.sendKeys(data);
	}

	public void enterStocksInputField(String data) {
		zakatCalculatorLocators.stocksInputField.clear();
		zakatCalculatorLocators.stocksInputField.sendKeys(data);
	}

	public void clickContinueButton2() throws Exception {
		zakatCalculatorLocators.continueButton2.click();
		Thread.sleep(1000);
	}

	public void enterFamilyDebtInputField(String data) {
		zakatCalculatorLocators.familyDebtInputField.clear();
		zakatCalculatorLocators.familyDebtInputField.sendKeys(data);
	}

	public void enterOthersDebtInputField(String data) {
		zakatCalculatorLocators.othersDebtInputField.clear();
		zakatCalculatorLocators.othersDebtInputField.sendKeys(data);
	}

	public void enterCreditCardPaymentInputField(String data) {
		zakatCalculatorLocators.creditCardPaymentInputField.clear();
		zakatCalculatorLocators.creditCardPaymentInputField.sendKeys(data);
	}

	public void enterHomePaymentInputField(String data) {
		zakatCalculatorLocators.homePaymentInputField.clear();
		zakatCalculatorLocators.homePaymentInputField.sendKeys(data);
	}

	public void enterCarPaymentInputField(String data) {
		zakatCalculatorLocators.carPaymentInputField.clear();
		zakatCalculatorLocators.carPaymentInputField.sendKeys(data);
	}

	public void enterBusinessPaymentInputField(String data) {
		zakatCalculatorLocators.businessPaymentInputField.clear();
		zakatCalculatorLocators.businessPaymentInputField.sendKeys(data);
	}

	public void clickCalculateButton() throws Exception {
		zakatCalculatorLocators.calculateButton.click();
		Thread.sleep(1000);
	}
	
	public String verifyTotalAmount(String data){
		WebElement element=zakatCalculatorLocators.verifyAmount(data);
		System.out.println(element.getText());
		return element.getText();
	}
	
	public String checkZakatNotApplicableMessage() {
		String check = zakatCalculatorLocators.zakatNotApplicableMessage.getText();
		System.out.println(check);
		return check;
	}
	
	public String checkZakatPayableMessage() {
		String check = zakatCalculatorLocators.zakatPayableMessage.getText();
		System.out.println(check);
		return check;
	}
	
	public String checkZakatPayableAmount() {
		String check = zakatCalculatorLocators.zakatPayableAmount.getText();
		System.out.println(check);
		return check;
	}
	

}
