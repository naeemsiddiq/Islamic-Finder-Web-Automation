/**
 * 
 */
package com.vdif.webautomation.zakatcalculator;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestZakatCalculatorPage extends AbstractComponent {

	ZakatCalculatorComponent zakatCalculatorComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Zakat Calculator Page Islamic Finder----------------------->>");
	}

	@Test
	public void testZakatCalculatorForZakatNotApplicableCase1() throws Exception {
		System.out.println("<------Testing Zakat Calculator For Zakat Not Applicable Case1------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		zakatCalculatorComponent = new ZakatCalculatorComponent();
		zakatCalculatorComponent.clickZakatCalculatorLink();

		String checkGettingStartedText = zakatCalculatorComponent.checkGettingStartedText();
		Assert.assertEquals(checkGettingStartedText, "Getting started");

		zakatCalculatorComponent.selectDropDownBaseOnNisabCriteria("Gold");
		zakatCalculatorComponent.enterNisabValueIputField("4560");
		zakatCalculatorComponent.clickStartButton();
		zakatCalculatorComponent.enterGold20KGramsInputField("10");
		zakatCalculatorComponent.enterGold20KAmountInputField("45600");
		zakatCalculatorComponent.clickContinueButton();
		zakatCalculatorComponent.enterCashInHandsInputField("100000");
		zakatCalculatorComponent.enterCashInBanksInputField("15000");
		zakatCalculatorComponent.enterCashInBusinessInputField("20000");
		zakatCalculatorComponent.enterRentalIncomeInputField("15000");
		zakatCalculatorComponent.enterPropertyValueInputField("150000");
		zakatCalculatorComponent.enterStocksInputField("5000");
		zakatCalculatorComponent.clickContinueButton2();
		zakatCalculatorComponent.enterFamilyDebtInputField("150000");
		zakatCalculatorComponent.enterOthersDebtInputField("150000");
		zakatCalculatorComponent.enterCreditCardPaymentInputField("5000");
		zakatCalculatorComponent.enterHomePaymentInputField("25000");
		zakatCalculatorComponent.enterCarPaymentInputField("20000");
		zakatCalculatorComponent.enterBusinessPaymentInputField("20000");
		zakatCalculatorComponent.clickCalculateButton();
		String verifyTotalAmount = zakatCalculatorComponent.verifyTotalAmount("-19400.00");
		Assert.assertEquals(verifyTotalAmount, "-19400.00");

		String checkZakatNotApplicableMessage = zakatCalculatorComponent.checkZakatNotApplicableMessage();
		Assert.assertEquals(checkZakatNotApplicableMessage, "Zakat is not applicable on your current possessions.");
	}

	@Test
	public void testZakatCalculatorForZakatNotApplicableCase2() throws Exception {
		System.out.println("<------Testing Zakat Calculator For Zakat Not Applicable Case 2------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		zakatCalculatorComponent = new ZakatCalculatorComponent();
		zakatCalculatorComponent.clickZakatCalculatorLink();

		String checkGettingStartedText = zakatCalculatorComponent.checkGettingStartedText();
		Assert.assertEquals(checkGettingStartedText, "Getting started");

		zakatCalculatorComponent.selectDropDownBaseOnNisabCriteria("Gold");
		zakatCalculatorComponent.enterNisabValueIputField("4560");
		zakatCalculatorComponent.clickStartButton();
		zakatCalculatorComponent.enterGold20KGramsInputField("20");
		zakatCalculatorComponent.enterGold20KAmountInputField("91200");
		zakatCalculatorComponent.clickContinueButton();
		zakatCalculatorComponent.enterCashInHandsInputField("100200");
		zakatCalculatorComponent.enterCashInBanksInputField("17000");
		zakatCalculatorComponent.enterCashInBusinessInputField("18000");
		zakatCalculatorComponent.enterRentalIncomeInputField("19000");
		zakatCalculatorComponent.enterPropertyValueInputField("146000");
		zakatCalculatorComponent.enterStocksInputField("3000");
		zakatCalculatorComponent.clickContinueButton2();
		zakatCalculatorComponent.enterFamilyDebtInputField("50000");
		zakatCalculatorComponent.enterOthersDebtInputField("100000");
		zakatCalculatorComponent.enterCreditCardPaymentInputField("3000");
		zakatCalculatorComponent.enterHomePaymentInputField("23000");
		zakatCalculatorComponent.enterCarPaymentInputField("22000");
		zakatCalculatorComponent.enterBusinessPaymentInputField("20000");
		zakatCalculatorComponent.clickCalculateButton();
		String verifyTotalAmount = zakatCalculatorComponent.verifyTotalAmount("267600.00");
		Assert.assertEquals(verifyTotalAmount, "267600.00");

		String checkZakatNotApplicableMessage = zakatCalculatorComponent.checkZakatNotApplicableMessage();
		Assert.assertEquals(checkZakatNotApplicableMessage, "Zakat is not applicable on your current possessions.");
	}

	@Test
	public void testZakatCalculatorForZakatApplicable() throws Exception {
		System.out.println("<------Testing Zakat Calculator For Zakat Applicable------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		zakatCalculatorComponent = new ZakatCalculatorComponent();
		zakatCalculatorComponent.clickZakatCalculatorLink();

		String checkGettingStartedText = zakatCalculatorComponent.checkGettingStartedText();
		Assert.assertEquals(checkGettingStartedText, "Getting started");

		zakatCalculatorComponent.selectDropDownBaseOnNisabCriteria("Gold");
		zakatCalculatorComponent.enterNisabValueIputField("4560");
		zakatCalculatorComponent.clickStartButton();
		zakatCalculatorComponent.enterGold20KGramsInputField("20");
		zakatCalculatorComponent.enterGold20KAmountInputField("91200");
		zakatCalculatorComponent.clickContinueButton();
		zakatCalculatorComponent.enterCashInHandsInputField("100200");
		zakatCalculatorComponent.enterCashInBanksInputField("14000");
		zakatCalculatorComponent.enterCashInBusinessInputField("18000");
		zakatCalculatorComponent.enterRentalIncomeInputField("17000");
		zakatCalculatorComponent.enterPropertyValueInputField("170000");
		zakatCalculatorComponent.enterStocksInputField("3000");
		zakatCalculatorComponent.clickContinueButton2();
		zakatCalculatorComponent.enterCreditCardPaymentInputField("6000");
		zakatCalculatorComponent.enterHomePaymentInputField("23000");
		zakatCalculatorComponent.enterCarPaymentInputField("19000");
		zakatCalculatorComponent.enterBusinessPaymentInputField("20000");
		zakatCalculatorComponent.clickCalculateButton();
		String verifyTotalAmount = zakatCalculatorComponent.verifyTotalAmount("436600.00");
		Assert.assertEquals(verifyTotalAmount, "436600.00");

		String checkZakatPayableMessage = zakatCalculatorComponent.checkZakatPayableMessage();
		Assert.assertEquals(checkZakatPayableMessage, "Payable Zakat (2.5%)");

		String checkZakatPayableAmount = zakatCalculatorComponent.checkZakatPayableAmount();
		Assert.assertEquals(checkZakatPayableAmount, "10,915");

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}

}
