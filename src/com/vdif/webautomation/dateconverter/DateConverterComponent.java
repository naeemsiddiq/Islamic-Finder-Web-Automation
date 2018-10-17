/**
 * 
 */
package com.vdif.webautomation.dateconverter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class DateConverterComponent extends AbstractComponent {

	DateConverterLocators dateConverterLocators = PageFactory.initElements(driver, DateConverterLocators.class);

	public void clickDateConverterButton() throws Exception {
		dateConverterLocators.dateConverterButton.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public String check_GH_HG_Text() {
		WebElement element = dateConverterLocators.GH_HG_Text;
		System.out.println(element.getText());
		return element.getText();
	}

	public void selectDayFromDropDown(String day) throws InterruptedException {
		WebElement element = dateConverterLocators.daysDropDown;
		Select dropdown = new Select(element); 
		dropdown.selectByVisibleText(day);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void selectMonthInDropDown(String month) throws Exception {
		WebElement selectMonthFromDropDown = dateConverterLocators.monthsDropDown;
		Select dropdown = new Select(selectMonthFromDropDown);
		dropdown.selectByVisibleText(month);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void selectYearInDropDown(String year) throws Exception {
		WebElement selectYearFromDropDown = dateConverterLocators.yearsDropDown;
		Select dropdown = new Select(selectYearFromDropDown);
		dropdown.selectByVisibleText(year);
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public void clickConvertDateButton() throws Exception {
		dateConverterLocators.convertDateButton.click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public String checkDateConvertedDateText() {
		WebElement element = dateConverterLocators.dateConvertedDateText;
		System.out.println(element.getText());
		return element.getText();
	}

	public String checkDateConvertedDayText() {
		WebElement element = dateConverterLocators.dateConvertedDayText;
		System.out.println(element.getText());
		return element.getText();
	}
	
	public void clickSwitchDateConverter() throws Exception {
		dateConverterLocators.switchDateConverter.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	public void clickGoToIslamicCalendarButton() throws Exception {
		WebElement element=dateConverterLocators.goToIslamicCalendarButton;
		scrollAndClick(element);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
