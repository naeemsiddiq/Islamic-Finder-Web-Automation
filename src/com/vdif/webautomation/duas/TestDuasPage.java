/**
 * 
 */
package com.vdif.webautomation.duas;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestDuasPage extends AbstractComponent {

	DuasPageComponent duasPageComponent;
	HomePageComponent homePageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println("<<-----------------------Testing Duas Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testQuranicDuasCardOnDuasPage() throws Exception {
		System.out.println("<------Testing Quranic Duas List On Duas Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		duasPageComponent = new DuasPageComponent();
		homePageComponent = new HomePageComponent();
		duasPageComponent.clickDuasButton();
		homePageComponent.checkDuasIslamicandQuranic_TextOnDuaPage();
		duasPageComponent.checkQuranic_1Text();
		duasPageComponent.openSharePanelOnDuasPage();
		homePageComponent.closeSharePanelOnVerseOfTheDayCard();
	}

	@Test
	public void testQuranicDuasListOnDuasPage() throws Exception {
		System.out.println("<------Testing Quranic Duas List On Duas Page------->\n");
		incrementAndOpenURLpage();
		Thread.sleep(1000);
		duasPageComponent = new DuasPageComponent();
		homePageComponent = new HomePageComponent();
		duasPageComponent.clickDuasButton();
		duasPageComponent.duasListOnDuasPage();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
