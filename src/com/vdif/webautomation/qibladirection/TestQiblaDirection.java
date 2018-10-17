/**
 * 
 */
package com.vdif.webautomation.qibladirection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

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

public class TestQiblaDirection extends AbstractComponent {
	HomePageComponent homePagecomponent;
	QiblaDirectionComponent qiblaDirectionComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Qibla Direction Page Islamic Finder----------------------->>\n");
	}

	@Test
	public void testQiblaDirectionAndQiblaCompassFromLahore() throws Exception {
		System.out.println("<------Testing Qibla Direction And Qibla Compass From Lahore------->\n");
		incrementAndOpenURLpage();

		qiblaDirectionComponent = new QiblaDirectionComponent();
		homePagecomponent = new HomePageComponent();

		ArrayList<String> listMapDetails = new ArrayList<>(
				Arrays.asList("Qibla Direction", "100° from North towards West", "Latitude", "31.4888", "Longitude",
						"74.36860000000001", "Distance", "3599 km"));

		homePagecomponent.searchTopNavBar();
		qiblaDirectionComponent.clickQiblaDirectionButton();
		qiblaDirectionComponent.checkListOfMapDetails(listMapDetails);

	}

	@Test
	public void testQiblaDirectionAndQiblaCompassFromKarachi() throws Exception {
		System.out.println("<------Testing Qibla Direction And Qibla Compass From Karachi------->\n");
		incrementAndOpenURLpage();

		qiblaDirectionComponent = new QiblaDirectionComponent();
		homePagecomponent = new HomePageComponent();

		ArrayList<String> listMapDetails = new ArrayList<>(
				Arrays.asList("Qibla Direction", "92° from North towards West", "Latitude", "24.9206", "Longitude",
						"67.07029999999997", "Distance", "2808 km"));

		qiblaDirectionComponent.searchKarachiFromTopNavBar();
		qiblaDirectionComponent.clickQiblaDirectionButton();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(1500);
		qiblaDirectionComponent.checkListOfMapDetails(listMapDetails);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
