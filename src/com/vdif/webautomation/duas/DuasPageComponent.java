/**
 * 
 */
package com.vdif.webautomation.duas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class DuasPageComponent extends AbstractComponent {

	DuasPageLocators duasPageLocators = PageFactory.initElements(driver, DuasPageLocators.class);
	ArrayList<String> duasList;
	int counter;

	public void clickDuasButton() throws Exception {
		WebElement element = duasPageLocators.duasButton;
		scrollToLocateElement(element);
	}

	public String checkQuranic_1Text() {
		WebElement element = duasPageLocators.quranic_1Text;
		System.out.println(element.getText());
		return element.getText();
	}

	void openSharePanelOnDuasPage() throws Exception {
		WebElement element = duasPageLocators.shareDuaButton;
		scrollToLocateElement(element);
	}

	public void duasListOnDuasPage() throws Exception {
		duasList = new ArrayList<String>(Arrays.asList("When Waking Up", "When Wearing a Garment",
				"Before Entering Toilet", "After Leaving Toilet", "When Starting Ablution", "Upon Completing Ablution",
				"When Leaving Home", "Upon Entering Home", "On hearing Athan", "During Athan", "After Athan",
				"For Travel", "While Returning from Travel", "When Going to Mosque", "Upon Entering Mosque",
				"Upon Leaving Mosque", "After Salah Tasbeeh", "Darood -e- Ibrahimi", "When Beginning a Meal",
				"After Finishing a Meal", "When Beginning the Fast- Seher", "While Opening Fast",
				"When Dining at Someones House", "When Given a Drink", "Upon Drinking Milk", "Upon Sneezing",
				"When One Sees Someone Sneezing", "When Entering Market", "Upon Sighting the Crescent Moon",
				"During Hajj", "When at Mount Safa and Mount Marwah", "For Rain", "When it Rains", "After Rainfall",
				"When Visiting the Sick", "When Visiting the Graves", "Remembrance After Prayer", "Morning Remembrance",
				"Evening Remembrance", "Before Sleeping"));

		List<WebElement> duasListElements = duasPageLocators.quranicDuasList;
		counter = 0;
		System.out.println(duasListElements.size());
		for (WebElement element : duasListElements) {
			Assert.assertEquals(element.getText(), duasList.get(counter));
			scrollToLocateElementDuasPage(element);
			counter++;
		}
	}

	public String duasHeading(String duasHeading) {
		WebElement duasHeading1 = driver.findElement(By.xpath("//*[contains(text()," + "'" + duasHeading + "'" + ")]"));
		System.out.println("Duas Heading:   " + duasHeading1.getText());
		return duasHeading1.getText();
	}

	private void scrollToLocateElementDuasPage(WebElement element) throws Exception {

		System.out.println("Scrolling to element : " + element.getText());

		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'instant', block: 'end', inline: 'nearest'})", element);
		System.out.println("scrolled to element: " + element.getText());
		Thread.sleep(500);
		WebElement element2 = driver.findElement(
				By.xpath("//a[contains(text(),'" + element.getText() + "') and contains(@class, 'dua-type')]"));
		System.out.println("got Element 2:  " + element2.getText());
		element2.click();
		Thread.sleep(1000);
		String duasHeadingOnclick = duasHeading(duasList.get(counter));
		
		if (element2.getText().equals("During Hajj"))
			Assert.assertEquals(duasHeadingOnclick, "Find Duas During Hajj 2017, Eid Ul Adha & Sacrifice");
		else
			Assert.assertEquals(duasHeadingOnclick, "Duas " + duasList.get(counter));
		
		Thread.sleep(500);
	}

}
