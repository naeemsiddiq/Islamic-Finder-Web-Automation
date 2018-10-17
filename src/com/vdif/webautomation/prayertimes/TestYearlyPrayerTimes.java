/**
 * 
 */
package com.vdif.webautomation.prayertimes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import org.testng.annotations.BeforeClass;
import com.vdif.webautomation.AbstractComponent;
import com.vdif.webautomation.homepage.HomePageComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class TestYearlyPrayerTimes extends AbstractComponent {
	HomePageComponent homePagecomponent;
	PrayerTimesPageComponent prayerTimesPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Yearly Prayer Times Islamic Finder----------------------->>\n");
	}

	@Test
	public void testMonthGregorianHijriPrayerTimes() throws Exception {
		System.out.println("<------Testing Month Gregorian Hijri Prayer Times------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("May", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "01", "9", "Tue", "03:49 AM", "05:18 AM",
				"12:00 PM", "04:46 PM", "06:42 PM", "08:11 PM", "02", "10", "Wed", "03:48 AM", "05:17 AM", "12:00 PM",
				"04:46 PM", "06:43 PM", "08:12 PM", "03", "11", "Thu", "03:47 AM", "05:16 AM", "12:00 PM", "04:46 PM",
				"06:43 PM", "08:13 PM", "04", "12", "Fri", "03:46 AM", "05:15 AM", "12:00 PM", "04:46 PM", "06:44 PM",
				"08:14 PM", "05", "13", "Sat", "03:45 AM", "05:14 AM", "12:00 PM", "04:47 PM", "06:45 PM", "08:15 PM",
				"06", "14", "Sun", "03:44 AM", "05:13 AM", "12:00 PM", "04:47 PM", "06:46 PM", "08:16 PM", "07", "15",
				"Mon", "03:42 AM", "05:12 AM", "12:00 PM", "04:47 PM", "06:46 PM", "08:17 PM", "08", "16", "Tue",
				"03:41 AM", "05:12 AM", "12:00 PM", "04:48 PM", "06:47 PM", "08:18 PM", "09", "17", "Wed", "03:40 AM",
				"05:11 AM", "12:00 PM", "04:48 PM", "06:48 PM", "08:19 PM", "10", "18", "Thu", "03:39 AM", "05:10 AM",
				"11:59 AM", "04:48 PM", "06:48 PM", "08:20 PM", "11", "19", "Fri", "03:38 AM", "05:09 AM", "11:59 AM",
				"04:49 PM", "06:49 PM", "08:21 PM", "12", "20", "Sat", "03:37 AM", "05:08 AM", "11:59 AM", "04:49 PM",
				"06:50 PM", "08:22 PM", "13", "21", "Sun", "03:36 AM", "05:08 AM", "11:59 AM", "04:49 PM", "06:50 PM",
				"08:23 PM", "14", "22", "Mon", "03:35 AM", "05:07 AM", "11:59 AM", "04:49 PM", "06:51 PM", "08:24 PM",
				"15", "23", "Tue", "03:34 AM", "05:06 AM", "11:59 AM", "04:50 PM", "06:52 PM", "08:25 PM", "16", "24",
				"Wed", "03:33 AM", "05:06 AM", "11:59 AM", "04:50 PM", "06:52 PM", "08:26 PM", "17", "25", "Thu",
				"03:32 AM", "05:05 AM", "11:59 AM", "04:50 PM", "06:53 PM", "08:27 PM", "18", "26", "Fri", "03:31 AM",
				"05:04 AM", "11:59 AM", "04:51 PM", "06:54 PM", "08:27 PM", "19", "27", "Sat", "03:31 AM", "05:04 AM",
				"11:59 AM", "04:51 PM", "06:54 PM", "08:28 PM", "20", "28", "Sun", "03:30 AM", "05:03 AM", "12:00 PM",
				"04:51 PM", "06:55 PM", "08:29 PM", "21", "29", "Mon", "03:29 AM", "05:03 AM", "12:00 PM", "04:52 PM",
				"06:56 PM", "08:30 PM", "22", "30", "Tue", "03:28 AM", "05:02 AM", "12:00 PM", "04:52 PM", "06:56 PM",
				"08:31 PM", "May", "Rajab", "Day", "", "", "", "", "", "", "23", "1", "Wed", "03:27 AM", "05:02 AM",
				"12:00 PM", "04:52 PM", "06:57 PM", "08:32 PM", "24", "2", "Thu", "03:27 AM", "05:01 AM", "12:00 PM",
				"04:53 PM", "06:58 PM", "08:33 PM", "25", "3", "Fri", "03:26 AM", "05:01 AM", "12:00 PM", "04:53 PM",
				"06:58 PM", "08:34 PM", "26", "4", "Sat", "03:25 AM", "05:00 AM", "12:00 PM", "04:53 PM", "06:59 PM",
				"08:35 PM", "27", "5", "Sun", "03:25 AM", "05:00 AM", "12:00 PM", "04:54 PM", "07:00 PM", "08:36 PM",
				"28", "6", "Mon", "03:24 AM", "05:00 AM", "12:00 PM", "04:54 PM", "07:00 PM", "08:36 PM", "29", "7",
				"Tue", "03:23 AM", "04:59 AM", "12:00 PM", "04:54 PM", "07:01 PM", "08:37 PM", "30", "8", "Wed",
				"03:23 AM", "04:59 AM", "12:00 PM", "04:55 PM", "07:01 PM", "08:38 PM", "31", "9", "Thu", "03:22 AM",
				"04:59 AM", "12:01 PM", "04:55 PM", "07:02 PM", "08:39 PM"));

		ArrayList<String> hijriMonthList = new ArrayList<String>(Arrays.asList("December", "Safar", "Day", "Fajr",
				"Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "21", "1", "Fri", "05:31 AM", "06:56 AM", "12:00 PM",
				"03:26 PM", "05:03 PM", "06:30 PM", "22", "2", "Sat", "05:31 AM", "06:57 AM", "12:01 PM", "03:26 PM",
				"05:04 PM", "06:31 PM", "23", "3", "Sun", "05:32 AM", "06:57 AM", "12:01 PM", "03:27 PM", "05:04 PM",
				"06:31 PM", "24", "4", "Mon", "05:32 AM", "06:58 AM", "12:02 PM", "03:27 PM", "05:05 PM", "06:32 PM",
				"25", "5", "Tue", "05:33 AM", "06:58 AM", "12:02 PM", "03:28 PM", "05:05 PM", "06:32 PM", "26", "6",
				"Wed", "05:33 AM", "06:59 AM", "12:03 PM", "03:29 PM", "05:06 PM", "06:33 PM", "27", "7", "Thu",
				"05:33 AM", "06:59 AM", "12:03 PM", "03:29 PM", "05:06 PM", "06:33 PM", "28", "8", "Fri", "05:34 AM",
				"07:00 AM", "12:04 PM", "03:30 PM", "05:07 PM", "06:34 PM", "29", "9", "Sat", "05:34 AM", "07:00 AM",
				"12:04 PM", "03:30 PM", "05:08 PM", "06:34 PM", "30", "10", "Sun", "05:35 AM", "07:00 AM", "12:05 PM",
				"03:31 PM", "05:08 PM", "06:35 PM", "31", "11", "Mon", "05:35 AM", "07:01 AM", "12:05 PM", "03:32 PM",
				"05:09 PM", "06:36 PM", "January", "Safar", "Day", "", "", "", "", "", "", "01", "12", "Tue",
				"05:35 AM", "07:01 AM", "12:06 PM", "03:32 PM", "05:10 PM", "06:36 PM", "02", "13", "Wed", "05:36 AM",
				"07:01 AM", "12:06 PM", "03:33 PM", "05:10 PM", "06:37 PM", "03", "14", "Thu", "05:36 AM", "07:01 AM",
				"12:07 PM", "03:34 PM", "05:11 PM", "06:38 PM", "04", "15", "Fri", "05:36 AM", "07:02 AM", "12:07 PM",
				"03:35 PM", "05:12 PM", "06:38 PM", "05", "16", "Sat", "05:36 AM", "07:02 AM", "12:08 PM", "03:35 PM",
				"05:12 PM", "06:39 PM", "06", "17", "Sun", "05:37 AM", "07:02 AM", "12:08 PM", "03:36 PM", "05:13 PM",
				"06:40 PM", "07", "18", "Mon", "05:37 AM", "07:02 AM", "12:09 PM", "03:37 PM", "05:14 PM", "06:40 PM",
				"08", "19", "Tue", "05:37 AM", "07:02 AM", "12:09 PM", "03:38 PM", "05:15 PM", "06:41 PM", "09", "20",
				"Wed", "05:37 AM", "07:02 AM", "12:09 PM", "03:38 PM", "05:16 PM", "06:42 PM", "10", "21", "Thu",
				"05:37 AM", "07:02 AM", "12:10 PM", "03:39 PM", "05:16 PM", "06:42 PM", "11", "22", "Fri", "05:37 AM",
				"07:02 AM", "12:10 PM", "03:40 PM", "05:17 PM", "06:43 PM", "12", "23", "Sat", "05:37 AM", "07:02 AM",
				"12:11 PM", "03:41 PM", "05:18 PM", "06:44 PM", "13", "24", "Sun", "05:37 AM", "07:02 AM", "12:11 PM",
				"03:42 PM", "05:19 PM", "06:45 PM", "14", "25", "Mon", "05:37 AM", "07:02 AM", "12:11 PM", "03:43 PM",
				"05:20 PM", "06:45 PM", "15", "26", "Tue", "05:37 AM", "07:02 AM", "12:12 PM", "03:44 PM", "05:21 PM",
				"06:46 PM", "16", "27", "Wed", "05:37 AM", "07:02 AM", "12:12 PM", "03:44 PM", "05:22 PM", "06:47 PM",
				"17", "28", "Thu", "05:37 AM", "07:02 AM", "12:13 PM", "03:45 PM", "05:22 PM", "06:48 PM", "18", "29",
				"Fri", "05:37 AM", "07:02 AM", "12:13 PM", "03:46 PM", "05:23 PM", "06:49 PM", "19", "30", "Sat",
				"05:37 AM", "07:01 AM", "12:13 PM", "03:47 PM", "05:24 PM", "06:49 PM"));

		homePagecomponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePagecomponent.searchTopNavBar();

		// Adjust Hijri Date
		homePagecomponent.openSettingspanel();
		prayerTimesPageComponent.selectAdjustHijriDateFromSettingsPanel("-1");
		prayerTimesPageComponent.clickSaveAndUpdateButton();
		//

		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickYearlyButton();
		prayerTimesPageComponent.clickmonthLabelOnPopUp();
		prayerTimesPageComponent.clickgregorianLabelOnPopUp();
		prayerTimesPageComponent.selectMonthFromDropDownOnPopUp("May");
		prayerTimesPageComponent.selectYearFromDropDownOnPopUp("2012");
		prayerTimesPageComponent.clickprintButton();
		Thread.sleep(20000);
		
		
		switchTab(listOfPrayerTimes, "Month");

		// Now checking Hijri Month

		prayerTimesPageComponent.clickhijriLabelOnPopUp();
		prayerTimesPageComponent.selectMonthFromDropDownOnPopUp("Safar");
		prayerTimesPageComponent.selectYearFromDropDownOnPopUp("1400");
		prayerTimesPageComponent.clickprintButton();
		switchTab(hijriMonthList, "Month");

		prayerTimesPageComponent.clickCloseYearlyPopUpOnPrayerTimesPage();
	}

	@Test
	public void testYearlyGregorianHijriPrayerTimes() throws Exception {
		System.out.println("<------Testing Yearly Gregorian Hijri Prayer Times------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfGregorianPrayerTimes = new ArrayList<String>(Arrays.asList("Date", "Fajr", "Sunrise",
				"Dhuhar", "Asr", "Maghrib", "Isha", "1", "05:35 AM", "07:01 AM"));
		ArrayList<String> listOfHijriPrayerTimes = new ArrayList<String>(
				Arrays.asList("Date", "Fajr", "Sunrise", "Dhuhar", "Asr", "Maghrib", "Isha", "1", "05:03 AM",
						"06:25 AM", "11:47 AM", "03:30 PM", "05:08 PM", "06:31 PM"));

		homePagecomponent = new HomePageComponent();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePagecomponent.searchTopNavBar();

		// Adjust Hijri Date
		homePagecomponent.openSettingspanel();
		prayerTimesPageComponent.selectAdjustHijriDateFromSettingsPanel("-1");
		prayerTimesPageComponent.clickSaveAndUpdateButton();
		//

		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickYearlyButton();
		prayerTimesPageComponent.clickyearLabelOnPopUp();
//		prayerTimesPageComponent.clickgregorianLabelOnPopUp();
//		prayerTimesPageComponent.selectYearFromDropDownOnPopUp("2011");
//		prayerTimesPageComponent.clickprintButton();
//		switchTab(listOfGregorianPrayerTimes, "Year");

		// Now checking Hijri Year

		prayerTimesPageComponent.clickhijriLabelOnPopUp();
		prayerTimesPageComponent.selectYearFromDropDownOnPopUp("1401");
		prayerTimesPageComponent.clickprintButton();
		switchTab(listOfHijriPrayerTimes, "Year");
		prayerTimesPageComponent.clickCloseYearlyPopUpOnPrayerTimesPage();

	}

	private void switchTab(ArrayList<String> listOfPrayerTimes, String MonthOrYear) throws Exception {
		ArrayList<String> listOfGregorianAndHijriRules = new ArrayList<>(Arrays.asList("Calculation Method",
				"University Of Islamic Sciences, Karachi", "Fajr 18.0 degrees, Isha 18.0 degrees", "Juristic Method",
				"Hanafi", "Daylight Saving", "Auto", "Latitude/Longitude", "31.4888, 74.3686"));
		prayerTimesPageComponent = new PrayerTimesPageComponent();

		String currentTab = driver.getWindowHandle();
		for (String tab : driver.getWindowHandles()) {
			if (!tab.equals(currentTab)) {
				driver.switchTo().window(tab);
			}
		}
		if (MonthOrYear.equals("Month"))
			prayerTimesPageComponent.VerifyListOfMonth(listOfPrayerTimes);
		else if (MonthOrYear.equals("Year")) {
			prayerTimesPageComponent.VerifyListOfYearlyPrayerTimes(listOfPrayerTimes);
			prayerTimesPageComponent.VerifyListOf_CM_JM_DS_LL(listOfGregorianAndHijriRules);
		}

		driver.close();
		driver.switchTo().window(currentTab);

	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
