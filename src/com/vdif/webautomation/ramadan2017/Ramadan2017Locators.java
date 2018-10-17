/**
 * 
 */
package com.vdif.webautomation.ramadan2017;

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

public class Ramadan2017Locators {

	WebDriver driver;

	public Ramadan2017Locators(WebDriver rdriver) {
		this.driver = rdriver;
	}
	
	
	public WebElement checkByLinkText(String data){
		WebElement element=driver.findElement(By.linkText(data));
		return element;
	}
	

	@FindBy(how = How.LINK_TEXT, using = "CALCULATE NOW")
	WebElement zakatCalculateNowButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'content')]/div/div")
	List<WebElement> ramadanContentList;
	
	public String checkH1Tag(String data){
		String element=driver.findElement(By.xpath("//h1[contains(text(),"+"'"+data+"'"+")]")).getText();
		return element;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
