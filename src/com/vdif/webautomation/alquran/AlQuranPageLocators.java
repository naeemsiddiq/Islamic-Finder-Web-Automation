/**
 * 
 */
package com.vdif.webautomation.alquran;

import java.util.List;

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

public class AlQuranPageLocators {

	WebDriver driver;

	public AlQuranPageLocators(WebDriver adriver) {
		this.driver = adriver;
	}

	@FindBy(how = How.LINK_TEXT, using = "Al Quran")
	WebElement alQuarnButton;

	@FindBy(how = How.XPATH, using = "//*[@id='surahs']/div/div")
	List<WebElement> surahsListAlQuranPage;

	public WebElement surahsListAlQuranPage(int surahIndex) throws Exception {
		WebElement element = driver.findElement(By.xpath("//*[@id='surahs']/div/div[" + surahIndex + "]"));
		return element;
	}

	@FindBy(how = How.TAG_NAME, using = "h1")
	WebElement h1Tag;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Juz')]")
	WebElement juzTab;

	@FindBy(how = How.XPATH, using = "//*[@id='juzz']/div/div")
	List<WebElement> juzListAlQuranPage;

	public WebElement juzListAlQuranPage(int juzIndex) throws Exception {
		WebElement element = driver.findElement(By.xpath("//*[@id='juzz']/div/div[" + juzIndex + "]"));
		return element;
	}

	public WebElement topicsListAlQuranPage(int topicsIndex) throws Exception {
		WebElement element = driver.findElement(By.xpath("//*[@id='topics']/div/div[" + topicsIndex + "]"));
		return element;
	}

	public WebElement translationsListAlQuranPage(int translationsIndex) throws Exception {
		WebElement element = driver.findElement(By.xpath("//*[@id='translations']/div/div[" + translationsIndex + "]"));
		return element;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Translations')]")
	WebElement translationsTab;

	@FindBy(how = How.XPATH, using = "//*[@id='translations']/div/div")
	List<WebElement> translationsListAlQuranPage;

	@FindBy(how = How.XPATH, using = "//*[@id='topics']/div/div")
	List<WebElement> topicsListAlQuranPage;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Topics')]")
	WebElement topicsTab;

}
