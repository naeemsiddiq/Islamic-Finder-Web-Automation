/**
 * 
 */
package com.vdif.webautomation.islamicgallery;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestIslamicGallery extends AbstractComponent {

	private static IslamicGalleryComponent islamicGalleryComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Islamic Gallery Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testIslamicGalleryPage() throws Exception {
		System.out.println("<------Testing Islamic Gallery Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);

		islamicGalleryComponent = new IslamicGalleryComponent();
		islamicGalleryComponent.clickIslamicGalleryLink();

		String checkh1Tag = islamicGalleryComponent.checkH1Tag();
		checkAssert("Islamic Gallery - Best Collection of Islamic Pictures", checkh1Tag);

		islamicGalleryComponent.clickCategoriesDropDown();
		islamicGalleryComponent.clickEidhulAdhaInDropDown();

		checkh1Tag = islamicGalleryComponent.checkH1Tag();
		checkAssert("Eid Ul Adha", checkh1Tag);

		islamicGalleryComponent.clickPageNo2();
		// Verifying the URL of this page Number 2
		String URL = driver.getCurrentUrl();
		checkAssert(URL, "https://alpha.islamicfinder.org/islamic-gallery/category-eid-ul-adha/2/");

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
