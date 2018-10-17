/**
 * 
 */
package com.vdif.webautomation.iqra;

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

public class IqraTheBlogLocators {
	WebDriver driver;

	public IqraTheBlogLocators(WebDriver idriver) {
		this.driver = idriver;
	}

	/*
	 * ********Common locators On Iqra Page
	 */
	@FindBy(how = How.LINK_TEXT, using = "Iqra - The Blog")
	WebElement iqraTheBlogButton;

	public WebElement tabNamed(String data) {
		WebElement heading = driver.findElement(By.xpath("//a[contains(text()," + "'" + data + "'" + ")]"));
		System.out.println(heading.getText());
		return heading;
	}

	public WebElement titleOnImageNamed(String data) {
		WebElement heading = driver.findElement(By.xpath("//div[contains(text()," + "'" + data + "'" + ")]"));
		System.out.println(heading.getText());
		return heading;
	}

	public WebElement checkHeadingOnThisPage(String data) {
		WebElement heading = driver.findElement(By.xpath("//p[contains(text()," + "'" + data + "'" + ")]"));
		System.out.println(heading.getText());
		return heading;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All')] ")
	WebElement allLinkToCheckDetails;

	@FindBy(how = How.TAG_NAME, using = "h1")
	WebElement h1Tag;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'latest articles on')]")
	WebElement latestArticlesOn___Text;

	public WebElement articleNameOnImage(String data) {
		WebElement heading = driver.findElement(By.xpath("//h1[contains(text()[2]," + "'" + data + "'" + ")]"));
		System.out.println(heading.getText());
		return heading;
	}

	public WebElement articleHeadingOnArticlePage(String data) {
		WebElement heading = driver.findElement(By.xpath("//h1[contains(text()," + "'" + data + "'" + ")]"));
		System.out.println(heading.getText());
		return heading;
	}

	@FindBy(how = How.XPATH, using = "//*[@class='article-tags']/div/a")
	List<WebElement> listOfArticleTags;

	@FindBy(how = How.XPATH, using = "/html/body/div[5]/section/div[1]/div[1]/div[2]/div[2]/div/ul/li/a")  //                 //*[contains(@class,'search-result-tags')]/a
	List<WebElement> listOfSearchResultTags;	
	
	
	
	public String pTagToVerfiyArticlesTagsPageHeading() {
		//WebElement heading = driver.findElement(By.xpath("//p[contains(text()," + "'" + data + "'" + ")]"));
		WebElement heading = driver.findElement(By.xpath("//div[contains(@class,'grey-heading')]/p"));
		return heading.getText();
	}


	public WebElement selectOptionFromMoreNamed(String data) {
		WebElement heading = driver.findElement(By.xpath("//a[contains(text()," + "'" + data + "'" + ")]"));
		System.out.println(heading.getText());
		return heading;
	}

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'is-inline-block') and contains(@src,'icon-search.png')]")
	WebElement searchIcon;

	@FindBy(how = How.XPATH, using = "//*[contains(@id,'overlay-search-field')]")
	WebElement overlaySearchField;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Search results for')]")
	WebElement searchResultForText;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Islam')]")
	WebElement islamText;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
