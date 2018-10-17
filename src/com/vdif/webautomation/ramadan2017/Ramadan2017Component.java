/**
 * 
 */
package com.vdif.webautomation.ramadan2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class Ramadan2017Component extends AbstractComponent {

	Ramadan2017Locators ramadan2017Locators = PageFactory.initElements(driver, Ramadan2017Locators.class);

	public String checkh1Tag(String data) {
		String h1Tag = ramadan2017Locators.checkH1Tag(data);
		return h1Tag;
	}

	public void clickZakatCalculateNowButton() throws Exception {
		WebElement element = ramadan2017Locators.zakatCalculateNowButton;
		scrollAndClick(element);
	}
	
	public void checkByLinkText(String data) throws Exception{
		WebElement element=ramadan2017Locators.checkByLinkText(data);
		element.click();
	}

	public void checkRamadanContentList() throws Exception {
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(
				"How Muslims around the world dress up for Eid-ul Fitr",
				"Tips to stay energized during the last 10 days of Ramadan",
				"Eid-ul-Fitr: A Time of Joy and Celebration for Muslims", "What is Fitrana and why you should give it?",
				"Following the footsteps of Prophet Muhammad (PBUH) while observing the last ten days of Ramadan",
				"History and health benefits of Henna", "10 foods you must try this Ramadan",
				"6 Eid Gift Ideas for Children", "Ali ibn Abi Talib-A role model for the mankind",
				"Is it possible to determine the date of Layla tul Qadar?", "All you need to know about Itikaf",
				"10 things you shouldn’t complain about in Ramadan", "5 ways to be charitable in Ramadan",
				"Zakat Calculator", "Battle of Badr: A glance at the first battle of Islam", "5 quick meals for Iftar",
				"Salat-ul Tasbih: Method and Rewards", "The best Azkaar for Ramadan",
				"Why you should have dates in Ramadan", "Zakat calculation and its significance",
				"How to stay hydrated in Ramadan?"));
		System.out.println(arrayList.size());

		List<WebElement> ramadanContentList = ramadan2017Locators.ramadanContentList;

		for (int i = 0; i < ramadanContentList.size(); i++) {
			String getpText = ramadanContentList.get(i).findElement(By.tagName("div")).findElement(By.tagName("p"))
					.getText();
			checkAssert(getpText, arrayList.get(i));
			System.out.println(getpText);
			WebElement element = ramadanContentList.get(i);
			if (getpText.equals("10 foods you must try this Ramadan")) {
			} else if (getpText.equals("Zakat Calculator")) {
				clickZakatCalculateNowButton();
				checkAssert(checkh1Tag(arrayList.get(i)), arrayList.get(i));
				((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
			} else {
				scrollToLocateElement(element);
				checkAssert(checkh1Tag(arrayList.get(i)), arrayList.get(i));
				((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
			}

		}
	}

}
