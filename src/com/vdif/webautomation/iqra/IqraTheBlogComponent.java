/**
 * 
 */
package com.vdif.webautomation.iqra;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class IqraTheBlogComponent extends AbstractComponent {

	IqraTheBlogLocators iqraTheBlogLocators = PageFactory.initElements(driver, IqraTheBlogLocators.class);

	public void clickIqraTheBlogButton() throws Exception {
		iqraTheBlogLocators.iqraTheBlogButton.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public String checkH1Tag() {
		String h1Tag = iqraTheBlogLocators.h1Tag.getText();
		System.out.println(h1Tag);
		return h1Tag;
	}

	public void clickOnTabNamed(String data) throws Exception {
		Actions hover = new Actions(driver);
		WebElement element = iqraTheBlogLocators.tabNamed(data);
		hover.moveToElement(element).build().perform();
	}

	public String checkLatestArticlesText() {
		String latestArticlesOnHalalComicsText = iqraTheBlogLocators.latestArticlesOn___Text.getText();
		System.out.println(latestArticlesOnHalalComicsText);
		return latestArticlesOnHalalComicsText;
	}

	public String checkTitleOnImageNamed(String data) {
		String halalComicsTitleOnImage = iqraTheBlogLocators.titleOnImageNamed(data).getText();
		return halalComicsTitleOnImage;
	}

	public void clickAllLinkToCheckDetails() throws Exception {
		iqraTheBlogLocators.allLinkToCheckDetails.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public String checkHeadingOnThePageNamed(String data) {
		String halalComicsTextOnHalalComicsPage = iqraTheBlogLocators.checkHeadingOnThisPage(data).getText();
		return halalComicsTextOnHalalComicsPage;
	}

	public void clickOnOneArticle(String data) throws Exception {
		WebElement element = iqraTheBlogLocators.articleNameOnImage(data);
		element.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}

	public String articleHeadingOnArticlePage(String data) {
		String articleHeadingOnArticlePage = iqraTheBlogLocators.articleHeadingOnArticlePage(data).getText();
		return articleHeadingOnArticlePage;
	}

	public void selectAnOptionFromMoreTabNamed(String data) throws Exception {
		iqraTheBlogLocators.selectOptionFromMoreNamed(data).click();
		Thread.sleep(1000);
	}

	public void clickSearchIcon() throws Exception {
		iqraTheBlogLocators.searchIcon.click();
		Thread.sleep(1000);
	}

	public void enterTextToSearchInSearchField(String data) {
		iqraTheBlogLocators.overlaySearchField.clear();
		iqraTheBlogLocators.overlaySearchField.sendKeys(data);
	}

	public void pressEnterToSearch() throws Exception {
		iqraTheBlogLocators.overlaySearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	public String checkSearchResultForText() {
		String data = iqraTheBlogLocators.searchResultForText.getText();
		return data;
	}

	public String checkIslamText() {
		String data = iqraTheBlogLocators.islamText.getText();
		return data;
	}

	public void checkListOfArticleTags(ArrayList<String> listOfArticleTags, ArrayList<String> listOfh1ArticleTags)
			throws Exception {
		List<WebElement> parentRow = iqraTheBlogLocators.listOfArticleTags;
		checkList(listOfArticleTags, listOfh1ArticleTags, parentRow);
	}

	public void checkListOflistOfSearchResultTags(ArrayList<String> listOfArticleTags,
			ArrayList<String> listOfh1ArticleTags) throws Exception {
		List<WebElement> parentRow = iqraTheBlogLocators.listOfSearchResultTags;
		checkList(listOfArticleTags, listOfh1ArticleTags, parentRow);
	}

	private void checkList(ArrayList<String> listOfArticleTags, ArrayList<String> listOfh1ArticleTags,
			List<WebElement> parentRow) throws Exception {

		int count = 0;
		for (int i = 0; i < listOfArticleTags.size(); i++) {
			checkAssert(listOfArticleTags.get(count), parentRow.get(count).getText());
			parentRow.get(count).click();
			Thread.sleep(1000);
			String verifyTag = iqraTheBlogLocators.pTagToVerfiyArticlesTagsPageHeading();
			if (verifyTag.equals("NO ARTICLES FOUND")) {
				System.out.println("No Articles Found on page : " + listOfArticleTags.get(count));
			} else {
				checkAssert(iqraTheBlogLocators.pTagToVerfiyArticlesTagsPageHeading(),
						listOfh1ArticleTags.get(count).toUpperCase());
			}
			((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
			Thread.sleep(1000);
			count++;
		}

	}

}
