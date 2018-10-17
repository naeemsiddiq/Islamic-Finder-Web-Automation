/**
 * 
 */
package com.vdif.webautomation.prayertimes;

import java.util.ArrayList;
import java.util.Arrays;

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

public class TestTop3CitiesHijriPrayerTimes extends AbstractComponent {
	HomePageComponent homePagecomponent;
	PrayerTimesPageComponent prayerTimesPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Hijri Prayer Times in Top 3 Cities Islamic Finder----------------------->>\n");
	}

	@Test
	public void testHijriPrayerTimesInRiyadh() throws Exception {
		System.out.println("<------Testing Hijri Prayer Times in Riyadh------->\n");

		ArrayList<String> listOfPrayerTimes = new ArrayList<>(Arrays.asList("May", "Rajab", "Day", "Fajr", "Sunrise",
				"Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "5", "1", "Tue", "03:51 AM", "05:15 AM", "11:50 AM",
				"03:17 PM", "06:25 PM", "07:55 PM", "12:41 AM", "6", "2", "Wed", "03:50 AM", "05:14 AM", "11:50 AM",
				"03:17 PM", "06:26 PM", "07:56 PM", "12:42 AM", "7", "3", "Thu", "03:49 AM", "05:14 AM", "11:50 AM",
				"03:17 PM", "06:26 PM", "07:56 PM", "12:40 AM", "8", "4", "Fri", "03:48 AM", "05:13 AM", "11:50 AM",
				"03:17 PM", "06:27 PM", "07:57 PM", "12:41 AM", "9", "5", "Sat", "03:47 AM", "05:12 AM", "11:50 AM",
				"03:16 PM", "06:27 PM", "07:57 PM", "12:39 AM", "10", "6", "Sun", "03:46 AM", "05:12 AM", "11:50 AM",
				"03:16 PM", "06:28 PM", "07:58 PM", "12:40 AM", "11", "7", "Mon", "03:46 AM", "05:12 AM", "11:50 AM",
				"03:16 PM", "06:28 PM", "07:58 PM", "12:40 AM", "12", "8", "Tue", "03:45 AM", "05:11 AM", "11:50 AM",
				"03:16 PM", "06:29 PM", "07:59 PM", "12:39 AM", "13", "9", "Wed", "03:44 AM", "05:10 AM", "11:50 AM",
				"03:16 PM", "06:29 PM", "07:59 PM", "12:39 AM", "14", "10", "Thu", "03:43 AM", "05:10 AM", "11:50 AM",
				"03:15 PM", "06:30 PM", "08:00 PM", "12:38 AM", "15", "11", "Fri", "03:43 AM", "05:09 AM", "11:50 AM",
				"03:15 PM", "06:30 PM", "08:00 PM", "12:38 AM", "16", "12", "Sat", "03:42 AM", "05:09 AM", "11:50 AM",
				"03:15 PM", "06:31 PM", "08:01 PM", "12:37 AM", "17", "13", "Sun", "03:41 AM", "05:08 AM", "11:50 AM",
				"03:15 PM", "06:31 PM", "08:01 PM", "12:37 AM", "18", "14", "Mon", "03:41 AM", "05:08 AM", "11:50 AM",
				"03:15 PM", "06:32 PM", "08:02 PM", "12:38 AM", "19", "15", "Tue", "03:40 AM", "05:07 AM", "11:50 AM",
				"03:15 PM", "06:32 PM", "08:02 PM", "12:36 AM", "20", "16", "Wed", "03:39 AM", "05:07 AM", "11:50 AM",
				"03:14 PM", "06:33 PM", "08:03 PM", "12:37 AM", "21", "17", "Thu", "03:39 AM", "05:06 AM", "11:50 AM",
				"03:14 PM", "06:33 PM", "08:03 PM", "12:37 AM", "22", "18", "Fri", "03:38 AM", "05:06 AM", "11:50 AM",
				"03:14 PM", "06:34 PM", "08:04 PM", "12:36 AM", "23", "19", "Sat", "03:38 AM", "05:06 AM", "11:50 AM",
				"03:14 PM", "06:34 PM", "08:04 PM", "12:36 AM", "24", "20", "Sun", "03:37 AM", "05:05 AM", "11:50 AM",
				"03:14 PM", "06:35 PM", "08:05 PM", "12:35 AM", "25", "21", "Mon", "03:37 AM", "05:05 AM", "11:50 AM",
				"03:14 PM", "06:35 PM", "08:05 PM", "12:35 AM", "26", "22", "Tue", "03:37 AM", "05:05 AM", "11:50 AM",
				"03:14 PM", "06:35 PM", "08:05 PM", "12:35 AM", "27", "23", "Wed", "03:36 AM", "05:05 AM", "11:51 AM",
				"03:14 PM", "06:36 PM", "08:06 PM", "12:36 AM", "28", "24", "Thu", "03:36 AM", "05:04 AM", "11:51 AM",
				"03:14 PM", "06:37 PM", "08:07 PM", "12:35 AM", "29", "25", "Fri", "03:35 AM", "05:04 AM", "11:51 AM",
				"03:14 PM", "06:37 PM", "08:07 PM", "12:35 AM", "30", "26", "Sat", "03:35 AM", "05:04 AM", "11:51 AM",
				"03:14 PM", "06:37 PM", "08:07 PM", "12:35 AM", "31", "27", "Sun", "03:34 AM", "05:04 AM", "11:51 AM",
				"03:14 PM", "06:38 PM", "08:08 PM", "12:34 AM", "June", "Rajab", "Day", "", "", "", "", "", "", "1",
				"28", "Mon", "03:34 AM", "05:04 AM", "11:51 AM", "03:14 PM", "06:38 PM", "08:08 PM", "12:34 AM", "2",
				"29", "Tue", "03:34 AM", "05:03 AM", "11:52 AM", "03:14 PM", "06:39 PM", "08:09 PM", "12:35 AM"));
		incrementAndOpenURLpage();
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		prayerTimesPageComponent.searchTopNavBar("Riyadh", "Riyadh, Ar Riyāḑ, Saudi Arabia");
		enterOtherField(listOfPrayerTimes, "0");
	}

	@Test
	public void testHijriPrayerTimesInNewYork() throws Exception {
		System.out.println("<------Testing Hijri Prayer Times in New York------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("May", "Rajab", "Day", "Fajr",
				"Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "6", "1", "Wed", "04:22 AM", "05:49 AM",
				"12:53 PM", "04:46 PM", "07:57 PM", "09:24 PM", "01:33 AM", "7", "2", "Thu", "04:20 AM", "05:47 AM",
				"12:53 PM", "04:46 PM", "07:58 PM", "09:26 PM", "01:32 AM", "8", "3", "Fri", "04:19 AM", "05:46 AM",
				"12:53 PM", "04:47 PM", "07:59 PM", "09:27 PM", "01:31 AM", "9", "4", "Sat", "04:17 AM", "05:45 AM",
				"12:53 PM", "04:47 PM", "08:00 PM", "09:28 PM", "01:30 AM", "10", "5", "Sun", "04:16 AM", "05:44 AM",
				"12:53 PM", "04:47 PM", "08:01 PM", "09:30 PM", "01:31 AM", "11", "6", "Mon", "04:14 AM", "05:43 AM",
				"12:53 PM", "04:47 PM", "08:02 PM", "09:31 PM", "01:30 AM", "12", "7", "Tue", "04:13 AM", "05:42 AM",
				"12:53 PM", "04:48 PM", "08:03 PM", "09:33 PM", "01:29 AM", "13", "8", "Wed", "04:11 AM", "05:41 AM",
				"12:53 PM", "04:48 PM", "08:04 PM", "09:34 PM", "01:28 AM", "14", "9", "Thu", "04:10 AM", "05:40 AM",
				"12:53 PM", "04:48 PM", "08:05 PM", "09:35 PM", "01:27 AM", "15", "10", "Fri", "04:08 AM", "05:39 AM",
				"12:53 PM", "04:48 PM", "08:06 PM", "09:37 PM", "01:26 AM", "16", "11", "Sat", "04:07 AM", "05:38 AM",
				"12:53 PM", "04:49 PM", "08:07 PM", "09:38 PM", "01:27 AM", "17", "12", "Sun", "04:06 AM", "05:37 AM",
				"12:53 PM", "04:49 PM", "08:08 PM", "09:39 PM", "01:26 AM", "18", "13", "Mon", "04:04 AM", "05:36 AM",
				"12:53 PM", "04:49 PM", "08:09 PM", "09:41 PM", "01:25 AM", "19", "14", "Tue", "04:03 AM", "05:35 AM",
				"12:53 PM", "04:50 PM", "08:10 PM", "09:42 PM", "01:24 AM", "20", "15", "Wed", "04:02 AM", "05:34 AM",
				"12:53 PM", "04:50 PM", "08:11 PM", "09:43 PM", "01:25 AM", "21", "16", "Thu", "04:01 AM", "05:33 AM",
				"12:53 PM", "04:50 PM", "08:12 PM", "09:45 PM", "01:24 AM", "22", "17", "Fri", "04:00 AM", "05:33 AM",
				"12:53 PM", "04:50 PM", "08:13 PM", "09:46 PM", "01:23 AM", "23", "18", "Sat", "03:58 AM", "05:32 AM",
				"12:53 PM", "04:51 PM", "08:13 PM", "09:47 PM", "01:23 AM", "24", "19", "Sun", "03:57 AM", "05:31 AM",
				"12:53 PM", "04:51 PM", "08:14 PM", "09:49 PM", "01:22 AM", "25", "20", "Mon", "03:56 AM", "05:30 AM",
				"12:53 PM", "04:51 PM", "08:15 PM", "09:50 PM", "01:21 AM", "26", "21", "Tue", "03:55 AM", "05:30 AM",
				"12:53 PM", "04:51 PM", "08:16 PM", "09:51 PM", "01:22 AM", "27", "22", "Wed", "03:54 AM", "05:29 AM",
				"12:53 PM", "04:52 PM", "08:17 PM", "09:52 PM", "01:21 AM", "28", "23", "Thu", "03:53 AM", "05:28 AM",
				"12:53 PM", "04:52 PM", "08:18 PM", "09:53 PM", "01:20 AM", "29", "24", "Fri", "03:52 AM", "05:28 AM",
				"12:53 PM", "04:52 PM", "08:19 PM", "09:54 PM", "01:21 AM", "30", "25", "Sat", "03:52 AM", "05:27 AM",
				"12:54 PM", "04:53 PM", "08:19 PM", "09:56 PM", "01:21 AM", "31", "26", "Sun", "03:51 AM", "05:27 AM",
				"12:54 PM", "04:53 PM", "08:20 PM", "09:57 PM", "01:20 AM", "June", "Rajab", "Day", "", "", "", "", "",
				"", "1", "27", "Mon", "03:50 AM", "05:26 AM", "12:54 PM", "04:53 PM", "08:21 PM", "09:58 PM",
				"01:19 AM", "2", "28", "Tue", "03:49 AM", "05:26 AM", "12:54 PM", "04:53 PM", "08:22 PM", "09:59 PM",
				"01:20 AM", "3", "29", "Wed", "03:49 AM", "05:25 AM", "12:54 PM", "04:54 PM", "08:22 PM", "10:00 PM",
				"01:20 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("New York", "New York (NY), United States");
		enterOtherField(listOfPrayerTimes, "-1");
	}

	@Test
	public void testHijriPrayerTimesInSydney() throws Exception {
		System.out.println("<------Testing Hijri Prayer Times in Sydney------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("May", "Rajab", "Day", "Fajr",
				"Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "7", "1", "Thu", "05:10 AM", "06:33 AM",
				"11:52 AM", "02:48 PM", "05:10 PM", "06:30 PM", "01:10 AM", "8", "2", "Fri", "05:10 AM", "06:34 AM",
				"11:52 AM", "02:47 PM", "05:09 PM", "06:29 PM", "01:09 AM", "9", "3", "Sat", "05:11 AM", "06:35 AM",
				"11:52 AM", "02:47 PM", "05:08 PM", "06:29 PM", "01:10 AM", "10", "4", "Sun", "05:11 AM", "06:36 AM",
				"11:52 AM", "02:46 PM", "05:07 PM", "06:28 PM", "01:09 AM", "11", "5", "Mon", "05:12 AM", "06:36 AM",
				"11:52 AM", "02:45 PM", "05:06 PM", "06:27 PM", "01:10 AM", "12", "6", "Tue", "05:13 AM", "06:37 AM",
				"11:52 AM", "02:45 PM", "05:06 PM", "06:26 PM", "01:10 AM", "13", "7", "Wed", "05:13 AM", "06:38 AM",
				"11:52 AM", "02:44 PM", "05:05 PM", "06:26 PM", "01:09 AM", "14", "8", "Thu", "05:14 AM", "06:39 AM",
				"11:52 AM", "02:43 PM", "05:04 PM", "06:25 PM", "01:10 AM", "15", "9", "Fri", "05:14 AM", "06:39 AM",
				"11:52 AM", "02:43 PM", "05:03 PM", "06:25 PM", "01:09 AM", "16", "10", "Sat", "05:15 AM", "06:40 AM",
				"11:52 AM", "02:42 PM", "05:03 PM", "06:24 PM", "01:11 AM", "17", "11", "Sun", "05:16 AM", "06:41 AM",
				"11:52 AM", "02:42 PM", "05:02 PM", "06:23 PM", "01:10 AM", "18", "12", "Mon", "05:16 AM", "06:42 AM",
				"11:52 AM", "02:41 PM", "05:01 PM", "06:23 PM", "01:11 AM", "19", "13", "Tue", "05:17 AM", "06:42 AM",
				"11:52 AM", "02:41 PM", "05:01 PM", "06:22 PM", "01:11 AM", "20", "14", "Wed", "05:17 AM", "06:43 AM",
				"11:52 AM", "02:40 PM", "05:00 PM", "06:22 PM", "01:10 AM", "21", "15", "Thu", "05:18 AM", "06:44 AM",
				"11:52 AM", "02:40 PM", "04:59 PM", "06:22 PM", "01:11 AM", "22", "16", "Fri", "05:18 AM", "06:44 AM",
				"11:52 AM", "02:39 PM", "04:59 PM", "06:21 PM", "01:11 AM", "23", "17", "Sat", "05:19 AM", "06:45 AM",
				"11:52 AM", "02:39 PM", "04:58 PM", "06:21 PM", "01:12 AM", "24", "18", "Sun", "05:20 AM", "06:46 AM",
				"11:52 AM", "02:38 PM", "04:58 PM", "06:20 PM", "01:12 AM", "25", "19", "Mon", "05:20 AM", "06:46 AM",
				"11:52 AM", "02:38 PM", "04:57 PM", "06:20 PM", "01:11 AM", "26", "20", "Tue", "05:21 AM", "06:47 AM",
				"11:53 AM", "02:38 PM", "04:57 PM", "06:20 PM", "01:13 AM", "27", "21", "Wed", "05:21 AM", "06:48 AM",
				"11:53 AM", "02:37 PM", "04:57 PM", "06:19 PM", "01:13 AM", "28", "22", "Thu", "05:22 AM", "06:48 AM",
				"11:53 AM", "02:37 PM", "04:56 PM", "06:19 PM", "01:12 AM", "29", "23", "Fri", "05:22 AM", "06:49 AM",
				"11:53 AM", "02:37 PM", "04:56 PM", "06:19 PM", "01:12 AM", "30", "24", "Sat", "05:23 AM", "06:50 AM",
				"11:53 AM", "02:37 PM", "04:55 PM", "06:18 PM", "01:13 AM", "31", "25", "Sun", "05:23 AM", "06:50 AM",
				"11:53 AM", "02:36 PM", "04:55 PM", "06:18 PM", "01:13 AM", "June", "Rajab", "Day", "", "", "", "", "",
				"", "1", "26", "Mon", "05:24 AM", "06:51 AM", "11:53 AM", "02:36 PM", "04:55 PM", "06:18 PM",
				"01:13 AM", "2", "27", "Tue", "05:24 AM", "06:51 AM", "11:54 AM", "02:36 PM", "04:54 PM", "06:18 PM",
				"01:14 AM", "3", "28", "Wed", "05:25 AM", "06:52 AM", "11:54 AM", "02:36 PM", "04:54 PM", "06:18 PM",
				"01:14 AM", "4", "29", "Thu", "05:25 AM", "06:52 AM", "11:54 AM", "02:36 PM", "04:54 PM", "06:18 PM",
				"01:14 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Sydney", "Sydney, New South Wales, Australia");
		enterOtherField(listOfPrayerTimes, "-2");
	}

	private void enterOtherField(ArrayList<String> listOfPrayerTimes, String hijriDate) throws Exception {
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePagecomponent = new HomePageComponent();

		homePagecomponent.openSettingspanel();
		prayerTimesPageComponent.selectAdjustHijriDateFromSettingsPanel(hijriDate);
		prayerTimesPageComponent.clickSaveAndUpdateButton();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.selectMonthFromTextFieldOnWMYCard();
		prayerTimesPageComponent.selectMonthFromDropDown("August");
		prayerTimesPageComponent.selectYearFromDropDown("2005");
		prayerTimesPageComponent.clickJumaAlAkhirah1426(); 
		Thread.sleep(1000);
		prayerTimesPageComponent.selectMonthFromDropDown("Rajab");
		prayerTimesPageComponent.selectYearFromDropDown("1401");
		Thread.sleep(2000);
		prayerTimesPageComponent.VerifyListOfMonth(listOfPrayerTimes);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}
}
