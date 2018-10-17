/**
 * 
 */
package com.vdif.webautomation.qibladirection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class QiblaDirectionComponent extends AbstractComponent {

	QiblaDirectionLocators qiblaDirectionLocators = PageFactory.initElements(driver, QiblaDirectionLocators.class);

	public void clickQiblaDirectionButton() throws Exception {
		qiblaDirectionLocators.clickQiblaDirectionButton.click();
		Thread.sleep(1000);
	}

	public void searchKarachiFromTopNavBar() throws Exception {
		qiblaDirectionLocators.topNavBarSearch.clear();
		qiblaDirectionLocators.topNavBarSearch.sendKeys(qiblaDirectionLocators.karachi);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Karachi, Sindh, Pakistan")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);

		// qiblaDirectionLocators.searchKarachifromSearch.click();
	}

	public void checkListOfMapDetails(ArrayList<String> listMapDetails) {
		System.out.println("size of list 111:    " + listMapDetails.size());
		int count = 0;
		List<WebElement> parentRow = qiblaDirectionLocators.listOfMapDetails;
		System.out.println("parentRow : " + parentRow.size());
		for (WebElement element : parentRow) {
			int innerCounter = 0;
			List<WebElement> childRow = element.findElements(By.tagName("p"));
			for (WebElement childElement : childRow) {
				if (innerCounter == 0) {
					Assert.assertEquals(childElement.getText(), listMapDetails.get(count));
					innerCounter++;
				} else {
					Assert.assertEquals(childElement.getText(), listMapDetails.get(count + 1));
					innerCounter = 0;
				}
				System.out.println(childElement.getText());
			}

			count = count + 2;
		}
	}

}
