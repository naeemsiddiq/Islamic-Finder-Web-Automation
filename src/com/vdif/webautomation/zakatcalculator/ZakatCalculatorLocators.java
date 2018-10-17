/**
 * 
 */
package com.vdif.webautomation.zakatcalculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class ZakatCalculatorLocators {

	WebDriver driver;

	public ZakatCalculatorLocators(WebDriver zdriver) {
		this.driver = zdriver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Zakat Calculator")
	WebElement zakatCalculatorLink;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Getting started')]")
	WebElement gettingStartedText;

	@FindBy(how = How.XPATH, using = "//select[contains(@class,'nisab-criteria')]")
	WebElement dropDownBaseOnNisabCriteria;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'nisab-value')]")
	WebElement nisabValueIputField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Start')]")
	WebElement startButton;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'20c') and contains(@placeholder,'Grams')]")
	WebElement gold20KGramsInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'20cf') and contains(@placeholder,'Price/10g')]")
	WebElement gold20KAmountInputField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Continue')]")
	WebElement continueButton;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'cashinhands')]")
	WebElement cashInHandsInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'cashinbank')]")
	WebElement cashInBanksInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'cashinbusiness')]")
	WebElement cashInBusinessInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'rentalincome')]")
	WebElement rentalIncomeInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'propertyvalue')]")
	WebElement propertyValueInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'stocks')]")
	WebElement stocksInputField;

	@FindBy(how = How.XPATH, using = "//button[contains(@data-tab,'zt3') and contains(text(),'Continue')]")
	WebElement continueButton2;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'familydebt')]")
	WebElement familyDebtInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'othersdebt')]")
	WebElement othersDebtInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'creditcardpayment')]")
	WebElement creditCardPaymentInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'homepayment')]")
	WebElement homePaymentInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'carpayment')]")
	WebElement carPaymentInputField;

	@FindBy(how = How.XPATH, using = "//input[contains(@class,'businesspayment')]")
	WebElement businessPaymentInputField;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Calculate')]")
	WebElement calculateButton;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Zakat is not applicable on your current possessions.')]")
	WebElement zakatNotApplicableMessage;

	public WebElement verifyAmount(String data){		
		WebElement totalAmount=driver.findElement(By.xpath("//strong[contains(text()," +"'"+ data +"'" + ")]"));
		return totalAmount;
	}
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Payable Zakat (2.5%)')]")
	WebElement zakatPayableMessage;
	
	@FindBy(how = How.XPATH, using = "//p[contains(@class,'xxl')]")
	WebElement zakatPayableAmount;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
