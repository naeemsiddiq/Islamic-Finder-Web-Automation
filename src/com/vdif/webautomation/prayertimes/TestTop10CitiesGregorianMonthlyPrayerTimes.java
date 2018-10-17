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

public class TestTop10CitiesGregorianMonthlyPrayerTimes extends AbstractComponent {
	HomePageComponent homePagecomponent;
	PrayerTimesPageComponent prayerTimesPageComponent;

	@BeforeClass
	public void setUp() throws Exception {
		callSetUp();
		System.out.println(
				"<<-----------------------Testing Prayer Times in Top 10 Cities Islamic Finder----------------------->>\n");
	}

	@Test
	public void testPrayerTimesInRiyadh() throws Exception {
		System.out.println("<------Testing Prayer Times in Riyadh------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "26", "Mon", "03:56 AM", "05:21 AM",
				"12:00 PM", "03:26 PM", "06:38 PM", "08:08 PM", "12:50 AM", "2", "27", "Tue", "03:57 AM", "05:21 AM",
				"12:00 PM", "03:26 PM", "06:37 PM", "08:07 PM", "12:49 AM", "3", "28", "Wed", "03:58 AM", "05:22 AM",
				"12:00 PM", "03:26 PM", "06:37 PM", "08:07 PM", "12:51 AM", "4", "29", "Thu", "03:58 AM", "05:22 AM",
				"12:00 PM", "03:26 PM", "06:36 PM", "08:06 PM", "12:50 AM", "5", "30", "Fri", "03:59 AM", "05:23 AM",
				"12:00 PM", "03:26 PM", "06:35 PM", "08:05 PM", "12:51 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "6", "1", "Sat", "04:00 AM", "05:23 AM", "12:00 PM", "03:26 PM", "06:35 PM", "08:05 PM",
				"12:51 AM", "7", "2", "Sun", "04:00 AM", "05:23 AM", "11:59 AM", "03:26 PM", "06:34 PM", "08:04 PM",
				"12:50 AM", "8", "3", "Mon", "04:01 AM", "05:24 AM", "11:59 AM", "03:26 PM", "06:33 PM", "08:03 PM",
				"12:51 AM", "9", "4", "Tue", "04:02 AM", "05:24 AM", "11:59 AM", "03:26 PM", "06:33 PM", "08:03 PM",
				"12:51 AM", "10", "5", "Wed", "04:02 AM", "05:24 AM", "11:59 AM", "03:26 PM", "06:33 PM", "08:03 PM",
				"12:51 AM", "11", "6", "Thu", "04:03 AM", "05:25 AM", "11:59 AM", "03:26 PM", "06:31 PM", "08:01 PM",
				"12:51 AM", "12", "7", "Fri", "04:03 AM", "05:26 AM", "11:59 AM", "03:26 PM", "06:30 PM", "08:00 PM",
				"12:52 AM", "13", "8", "Sat", "04:04 AM", "05:26 AM", "11:58 AM", "03:26 PM", "06:30 PM", "08:00 PM",
				"12:52 AM", "14", "9", "Sun", "04:05 AM", "05:27 AM", "11:58 AM", "03:26 PM", "06:29 PM", "07:59 PM",
				"12:53 AM", "15", "10", "Mon", "04:05 AM", "05:27 AM", "11:58 AM", "03:26 PM", "06:28 PM", "07:58 PM",
				"12:52 AM", "16", "11", "Tue", "04:06 AM", "05:27 AM", "11:58 AM", "03:26 PM", "06:27 PM", "07:57 PM",
				"12:53 AM", "17", "12", "Wed", "04:07 AM", "05:28 AM", "11:58 AM", "03:26 PM", "06:26 PM", "07:56 PM",
				"12:52 AM", "18", "13", "Thu", "04:07 AM", "05:28 AM", "11:57 AM", "03:26 PM", "06:25 PM", "07:55 PM",
				"12:53 AM", "19", "14", "Fri", "04:08 AM", "05:29 AM", "11:57 AM", "03:26 PM", "06:25 PM", "07:55 PM",
				"12:53 AM", "20", "15", "Sat", "04:08 AM", "05:29 AM", "11:57 AM", "03:25 PM", "06:24 PM", "07:54 PM",
				"12:52 AM", "21", "16", "Sun", "04:09 AM", "05:29 AM", "11:57 AM", "03:25 PM", "06:23 PM", "07:53 PM",
				"12:53 AM", "22", "17", "Mon", "04:10 AM", "05:30 AM", "11:57 AM", "03:25 PM", "06:22 PM", "07:52 PM",
				"12:54 AM", "23", "18", "Tue", "04:10 AM", "05:30 AM", "11:56 AM", "03:25 PM", "06:21 PM", "07:51 PM",
				"12:53 AM", "24", "19", "Wed", "04:11 AM", "05:31 AM", "11:56 AM", "03:25 PM", "06:20 PM", "07:50 PM",
				"12:54 AM", "25", "20", "Thu", "04:11 AM", "05:31 AM", "11:56 AM", "03:24 PM", "06:19 PM", "07:49 PM",
				"12:53 AM", "26", "21", "Fri", "04:12 AM", "05:31 AM", "11:55 AM", "03:24 PM", "06:18 PM", "07:48 PM",
				"12:54 AM", "27", "22", "Sat", "04:12 AM", "05:32 AM", "11:55 AM", "03:24 PM", "06:17 PM", "07:47 PM",
				"12:53 AM", "28", "23", "Sun", "04:13 AM", "05:32 AM", "11:55 AM", "03:24 PM", "06:16 PM", "07:46 PM",
				"12:54 AM", "29", "24", "Mon", "04:13 AM", "05:33 AM", "11:55 AM", "03:23 PM", "06:15 PM", "07:45 PM",
				"12:53 AM", "30", "25", "Tue", "04:14 AM", "05:33 AM", "11:54 AM", "03:23 PM", "06:14 PM", "07:44 PM",
				"12:54 AM", "31", "26", "Wed", "04:15 AM", "05:33 AM", "11:54 AM", "03:23 PM", "06:13 PM", "07:43 PM",
				"12:53 AM"));
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		prayerTimesPageComponent.searchTopNavBar("Riyadh", "Riyadh, Ar Riyāḑ, Saudi Arabia");
		enterOtherField(listOfPrayerTimes, "0");

	}

	@Test
	public void testPrayerTimesInNewYork() throws Exception {
		System.out.println("<------Testing Prayer Times in New York------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "25", "Mon", "04:23 AM", "05:51 AM",
				"01:03 PM", "04:58 PM", "08:13 PM", "09:42 PM", "01:39 AM", "2", "26", "Tue", "04:25 AM", "05:52 AM",
				"01:03 PM", "04:57 PM", "08:12 PM", "09:41 PM", "01:40 AM", "3", "27", "Wed", "04:26 AM", "05:53 AM",
				"01:02 PM", "04:57 PM", "08:11 PM", "09:39 PM", "01:41 AM", "4", "28", "Thu", "04:27 AM", "05:54 AM",
				"01:02 PM", "04:56 PM", "08:10 PM", "09:37 PM", "01:40 AM", "5", "29", "Fri", "04:29 AM", "05:55 AM",
				"01:02 PM", "04:56 PM", "08:08 PM", "09:36 PM", "01:42 AM", "6", "30", "Sat", "04:30 AM", "05:56 AM",
				"01:02 PM", "04:56 PM", "08:07 PM", "09:34 PM", "01:41 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "7", "1", "Sun", "04:31 AM", "05:57 AM", "01:02 PM", "04:55 PM", "08:06 PM", "09:33 PM",
				"01:42 AM", "8", "2", "Mon", "04:33 AM", "05:58 AM", "01:02 PM", "04:55 PM", "08:05 PM", "09:31 PM",
				"01:43 AM", "9", "3", "Tue", "04:34 AM", "05:59 AM", "01:02 PM", "04:54 PM", "08:04 PM", "09:30 PM",
				"01:44 AM", "10", "4", "Wed", "04:35 AM", "06:00 AM", "01:02 PM", "04:54 PM", "08:02 PM", "09:28 PM",
				"01:44 AM", "11", "5", "Thu", "04:37 AM", "06:00 AM", "01:02 PM", "04:53 PM", "08:01 PM", "09:26 PM",
				"01:45 AM", "12", "6", "Fri", "04:38 AM", "06:01 AM", "01:01 PM", "04:53 PM", "08:00 PM", "09:25 PM",
				"01:44 AM", "13", "7", "Sat", "04:40 AM", "06:02 AM", "01:01 PM", "04:52 PM", "07:58 PM", "09:23 PM",
				"01:46 AM", "14", "8", "Sun", "04:41 AM", "06:03 AM", "01:01 PM", "04:51 PM", "07:57 PM", "09:21 PM",
				"01:45 AM", "15", "9", "Mon", "04:42 AM", "06:04 AM", "01:01 PM", "04:51 PM", "07:56 PM", "09:20 PM",
				"01:46 AM", "16", "10", "Tue", "04:44 AM", "06:05 AM", "01:01 PM", "04:50 PM", "07:54 PM", "09:18 PM",
				"01:46 AM", "17", "11", "Wed", "04:45 AM", "06:06 AM", "01:00 PM", "04:49 PM", "07:53 PM", "09:16 PM",
				"01:47 AM", "18", "12", "Thu", "04:46 AM", "06:07 AM", "01:00 PM", "04:49 PM", "07:51 PM", "09:14 PM",
				"01:47 AM", "19", "13", "Fri", "04:47 AM", "06:08 AM", "01:00 PM", "04:48 PM", "07:50 PM", "09:13 PM",
				"01:48 AM", "20", "14", "Sat", "04:49 AM", "06:09 AM", "01:00 PM", "04:47 PM", "07:48 PM", "09:11 PM",
				"01:48 AM", "21", "15", "Sun", "04:50 AM", "06:10 AM", "01:00 PM", "04:47 PM", "07:47 PM", "09:09 PM",
				"01:49 AM", "22", "16", "Mon", "04:51 AM", "06:11 AM", "12:59 PM", "04:46 PM", "07:46 PM", "09:07 PM",
				"01:48 AM", "23", "17", "Tue", "04:53 AM", "06:12 AM", "12:59 PM", "04:45 PM", "07:44 PM", "09:05 PM",
				"01:50 AM", "24", "18", "Wed", "04:54 AM", "06:13 AM", "12:59 PM", "04:44 PM", "07:42 PM", "09:04 PM",
				"01:50 AM", "25", "19", "Thu", "04:55 AM", "06:14 AM", "12:59 PM", "04:43 PM", "07:41 PM", "09:02 PM",
				"01:49 AM", "26", "20", "Fri", "04:57 AM", "06:15 AM", "12:58 PM", "04:43 PM", "07:39 PM", "09:00 PM",
				"01:51 AM", "27", "21", "Sat", "04:58 AM", "06:16 AM", "12:58 PM", "04:42 PM", "07:38 PM", "08:58 PM",
				"01:50 AM", "28", "22", "Sun", "04:59 AM", "06:17 AM", "12:58 PM", "04:41 PM", "07:36 PM", "08:56 PM",
				"01:50 AM", "29", "23", "Mon", "05:00 AM", "06:18 AM", "12:57 PM", "04:40 PM", "07:35 PM", "08:54 PM",
				"01:51 AM", "30", "24", "Tue", "05:02 AM", "06:19 AM", "12:57 PM", "04:39 PM", "07:33 PM", "08:53 PM",
				"01:51 AM", "31", "25", "Wed", "05:03 AM", "06:20 AM", "12:57 PM", "04:38 PM", "07:32 PM", "08:51 PM",
				"01:52 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("New York", "New York (NY), United States");
		enterOtherField(listOfPrayerTimes, "-1");
	}

	@Test
	public void testPrayerTimesInSydney() throws Exception {
		System.out.println("<------Testing Prayer Times in Sydney------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "24", "Mon", "05:22 AM", "06:47 AM",
				"12:02 PM", "02:55 PM", "05:16 PM", "06:37 PM", "01:20 AM", "2", "25", "Tue", "05:21 AM", "06:47 AM",
				"12:02 PM", "02:56 PM", "05:17 PM", "06:38 PM", "01:19 AM", "3", "26", "Wed", "05:20 AM", "06:46 AM",
				"12:02 PM", "02:57 PM", "05:17 PM", "06:38 PM", "01:19 AM", "4", "27", "Thu", "05:20 AM", "06:45 AM",
				"12:02 PM", "02:57 PM", "05:18 PM", "06:39 PM", "01:18 AM", "5", "28", "Fri", "05:19 AM", "06:44 AM",
				"12:02 PM", "02:58 PM", "05:19 PM", "06:40 PM", "01:19 AM", "6", "29", "Sat", "05:18 AM", "06:43 AM",
				"12:02 PM", "02:58 PM", "05:20 PM", "06:40 PM", "01:18 AM", "7", "30", "Sun", "05:17 AM", "06:42 AM",
				"12:01 PM", "02:59 PM", "05:20 PM", "06:41 PM", "01:18 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "8", "1", "Mon", "05:16 AM", "06:41 AM", "12:01 PM", "02:59 PM", "05:21 PM", "06:41 PM",
				"01:17 AM", "9", "2", "Tue", "05:16 AM", "06:40 AM", "12:01 PM", "03:00 PM", "05:22 PM", "06:42 PM",
				"01:18 AM", "10", "3", "Wed", "05:15 AM", "06:39 AM", "12:01 PM", "03:00 PM", "05:22 PM", "06:43 PM",
				"01:16 AM", "11", "4", "Thu", "05:14 AM", "06:38 AM", "12:01 PM", "03:01 PM", "05:23 PM", "06:43 PM",
				"01:17 AM", "12", "5", "Fri", "05:13 AM", "06:37 AM", "12:01 PM", "03:01 PM", "05:24 PM", "06:44 PM",
				"01:16 AM", "13", "6", "Sat", "05:12 AM", "06:36 AM", "12:01 PM", "03:02 PM", "05:24 PM", "06:44 PM",
				"01:16 AM", "14", "7", "Sun", "05:11 AM", "06:35 AM", "12:00 PM", "03:02 PM", "05:25 PM", "06:45 PM",
				"01:15 AM", "15", "8", "Mon", "05:10 AM", "06:34 AM", "12:00 PM", "03:03 PM", "05:26 PM", "06:46 PM",
				"01:14 AM", "16", "9", "Tue", "05:09 AM", "06:33 AM", "12:00 PM", "03:03 PM", "05:27 PM", "06:46 PM",
				"01:15 AM", "17", "10", "Wed", "05:08 AM", "06:32 AM", "12:00 PM", "03:04 PM", "05:27 PM", "06:47 PM",
				"01:13 AM", "18", "11", "Thu", "05:07 AM", "06:31 AM", "12:00 PM", "03:04 PM", "05:28 PM", "06:47 PM",
				"01:14 AM", "19", "12", "Fri", "05:06 AM", "06:29 AM", "11:59 AM", "03:05 PM", "05:29 PM", "06:48 PM",
				"01:13 AM", "20", "13", "Sat", "05:05 AM", "06:28 AM", "11:59 AM", "03:05 PM", "05:29 PM", "06:49 PM",
				"01:13 AM", "21", "14", "Sun", "05:04 AM", "06:27 AM", "11:59 AM", "03:06 PM", "05:30 PM", "06:49 PM",
				"01:12 AM", "22", "15", "Mon", "05:03 AM", "06:26 AM", "11:59 AM", "03:06 PM", "05:31 PM", "06:50 PM",
				"01:11 AM", "23", "16", "Tue", "05:01 AM", "06:25 AM", "11:58 AM", "03:06 PM", "05:31 PM", "06:50 PM",
				"01:11 AM", "24", "17", "Wed", "05:00 AM", "06:24 AM", "11:58 AM", "03:07 PM", "05:32 PM", "06:51 PM",
				"01:10 AM", "25", "18", "Thu", "04:59 AM", "06:22 AM", "11:58 AM", "03:07 PM", "05:33 PM", "06:52 PM",
				"01:09 AM", "26", "19", "Fri", "04:58 AM", "06:21 AM", "11:58 AM", "03:08 PM", "05:33 PM", "06:52 PM",
				"01:09 AM", "27", "20", "Sat", "04:57 AM", "06:20 AM", "11:57 AM", "03:08 PM", "05:34 PM", "06:53 PM",
				"01:08 AM", "28", "21", "Sun", "04:56 AM", "06:19 AM", "11:57 AM", "03:08 PM", "05:35 PM", "06:54 PM",
				"01:09 AM", "29", "22", "Mon", "04:54 AM", "06:17 AM", "11:57 AM", "03:09 PM", "05:35 PM", "06:54 PM",
				"01:07 AM", "30", "23", "Tue", "04:53 AM", "06:16 AM", "11:56 AM", "03:09 PM", "05:36 PM", "06:55 PM",
				"01:06 AM", "31", "24", "Wed", "04:52 AM", "06:15 AM", "11:56 AM", "03:09 PM", "05:37 PM", "06:55 PM",
				"01:07 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Sydney", "Sydney, New South Wales, Australia");
		enterOtherField(listOfPrayerTimes, "-2");
	}

	@Test
	public void testPrayerTimesInJeddah() throws Exception {
		System.out.println("<------Testing Prayer Times in Jeddah------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "26", "Mon", "04:34 AM", "05:56 AM",
				"12:30 PM", "03:49 PM", "07:03 PM", "08:33 PM", "01:23 AM", "2", "27", "Tue", "04:34 AM", "05:56 AM",
				"12:30 PM", "03:49 PM", "07:02 PM", "08:32 PM", "01:22 AM", "3", "28", "Wed", "04:35 AM", "05:56 AM",
				"12:30 PM", "03:49 PM", "07:02 PM", "08:32 PM", "01:24 AM", "4", "29", "Thu", "04:36 AM", "05:57 AM",
				"12:30 PM", "03:49 PM", "07:01 PM", "08:31 PM", "01:23 AM", "5", "30", "Fri", "04:36 AM", "05:57 AM",
				"12:30 PM", "03:50 PM", "07:01 PM", "08:31 PM", "01:23 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "6", "1", "Sat", "04:37 AM", "05:58 AM", "12:29 PM", "03:50 PM", "07:00 PM", "08:30 PM",
				"01:24 AM", "7", "2", "Sun", "04:37 AM", "05:58 AM", "12:29 PM", "03:50 PM", "07:00 PM", "08:30 PM",
				"01:24 AM", "8", "3", "Mon", "04:38 AM", "05:58 AM", "12:29 PM", "03:50 PM", "06:59 PM", "08:29 PM",
				"01:25 AM", "9", "4", "Tue", "04:38 AM", "05:59 AM", "12:29 PM", "03:50 PM", "06:58 PM", "08:28 PM",
				"01:24 AM", "10", "5", "Wed", "04:38 AM", "05:59 AM", "12:29 PM", "03:50 PM", "06:58 PM", "08:28 PM",
				"01:24 AM", "11", "6", "Thu", "04:39 AM", "05:59 AM", "12:29 PM", "03:50 PM", "06:57 PM", "08:27 PM",
				"01:25 AM", "12", "7", "Fri", "04:40 AM", "06:00 AM", "12:29 PM", "03:50 PM", "06:56 PM", "08:26 PM",
				"01:24 AM", "13", "8", "Sat", "04:41 AM", "06:00 AM", "12:28 PM", "03:50 PM", "06:56 PM", "08:26 PM",
				"01:26 AM", "14", "9", "Sun", "04:41 AM", "06:00 AM", "12:28 PM", "03:50 PM", "06:55 PM", "08:25 PM",
				"01:25 AM", "15", "10", "Mon", "04:42 AM", "06:01 AM", "12:28 PM", "03:50 PM", "06:54 PM", "08:24 PM",
				"01:26 AM", "16", "11", "Tue", "04:42 AM", "06:01 AM", "12:28 PM", "03:51 PM", "06:53 PM", "08:23 PM",
				"01:25 AM", "17", "12", "Wed", "04:43 AM", "06:01 AM", "12:28 PM", "03:50 PM", "06:53 PM", "08:23 PM",
				"01:25 AM", "18", "13", "Thu", "04:43 AM", "06:02 AM", "12:27 PM", "03:50 PM", "06:52 PM", "08:22 PM",
				"01:26 AM", "19", "14", "Fri", "04:44 AM", "06:02 AM", "12:27 PM", "03:50 PM", "06:51 PM", "08:21 PM",
				"01:25 AM", "20", "15", "Sat", "04:44 AM", "06:02 AM", "12:27 PM", "03:50 PM", "06:50 PM", "08:20 PM",
				"01:26 AM", "21", "16", "Sun", "04:45 AM", "06:03 AM", "12:27 PM", "03:50 PM", "06:49 PM", "08:19 PM",
				"01:25 AM", "22", "17", "Mon", "04:45 AM", "06:03 AM", "12:26 PM", "03:50 PM", "06:49 PM", "08:19 PM",
				"01:25 AM", "23", "18", "Tue", "04:45 AM", "06:03 AM", "12:26 PM", "03:50 PM", "06:48 PM", "08:18 PM",
				"01:26 AM", "24", "19", "Wed", "04:46 AM", "06:04 AM", "12:26 PM", "03:50 PM", "06:47 PM", "08:17 PM",
				"01:25 AM", "25", "20", "Thu", "04:46 AM", "06:04 AM", "12:26 PM", "03:50 PM", "06:46 PM", "08:16 PM",
				"01:26 AM", "26", "21", "Fri", "04:47 AM", "06:04 AM", "12:25 PM", "03:50 PM", "06:45 PM", "08:15 PM",
				"01:25 AM", "27", "22", "Sat", "04:47 AM", "06:05 AM", "12:25 PM", "03:50 PM", "06:44 PM", "08:14 PM",
				"01:26 AM", "28", "23", "Sun", "04:48 AM", "06:05 AM", "12:25 PM", "03:49 PM", "06:44 PM", "08:14 PM",
				"01:26 AM", "29", "24", "Mon", "04:48 AM", "06:05 AM", "12:25 PM", "03:49 PM", "06:43 PM", "08:13 PM",
				"01:25 AM", "30", "25", "Tue", "04:49 AM", "06:05 AM", "12:24 PM", "03:49 PM", "06:42 PM", "08:12 PM",
				"01:26 AM", "31", "26", "Wed", "04:49 AM", "06:06 AM", "12:24 PM", "03:49 PM", "06:41 PM", "08:11 PM",
				"01:25 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Jeddah", "Jeddah, Makkah Province, Saudi Arabia");
		enterOtherField(listOfPrayerTimes, "0");
	}

	@Test
	public void testPrayerTimesInToronto() throws Exception {
		System.out.println("<------Testing Prayer Times in Toronto------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "25", "Mon", "04:31 AM", "06:06 AM",
				"01:25 PM", "05:24 PM", "08:42 PM", "10:18 PM", "01:54 AM", "2", "26", "Tue", "04:33 AM", "06:07 AM",
				"01:25 PM", "05:23 PM", "08:41 PM", "10:16 PM", "01:55 AM", "3", "27", "Wed", "04:35 AM", "06:08 AM",
				"01:25 PM", "05:23 PM", "08:40 PM", "10:15 PM", "01:56 AM", "4", "28", "Thu", "04:36 AM", "06:09 AM",
				"01:24 PM", "05:22 PM", "08:39 PM", "10:13 PM", "01:57 AM", "5", "29", "Fri", "04:38 AM", "06:10 AM",
				"01:24 PM", "05:22 PM", "08:37 PM", "10:11 PM", "01:57 AM", "6", "30", "Sat", "04:39 AM", "06:11 AM",
				"01:24 PM", "05:21 PM", "08:36 PM", "10:09 PM", "01:58 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "7", "1", "Sun", "04:41 AM", "06:12 AM", "01:24 PM", "05:21 PM", "08:35 PM", "10:08 PM",
				"01:59 AM", "8", "2", "Mon", "04:42 AM", "06:13 AM", "01:24 PM", "05:20 PM", "08:33 PM", "10:06 PM",
				"01:59 AM", "9", "3", "Tue", "04:44 AM", "06:14 AM", "01:24 PM", "05:20 PM", "08:32 PM", "10:04 PM",
				"02:00 AM", "10", "4", "Wed", "04:46 AM", "06:15 AM", "01:24 PM", "05:19 PM", "08:30 PM", "10:02 PM",
				"02:00 AM", "11", "5", "Thu", "04:47 AM", "06:16 AM", "01:24 PM", "05:18 PM", "08:29 PM", "10:00 PM",
				"02:01 AM", "12", "6", "Fri", "04:49 AM", "06:18 AM", "01:23 PM", "05:18 PM", "08:28 PM", "09:58 PM",
				"02:02 AM", "13", "7", "Sat", "04:50 AM", "06:19 AM", "01:23 PM", "05:17 PM", "08:26 PM", "09:56 PM",
				"02:02 AM", "14", "8", "Sun", "04:52 AM", "06:20 AM", "01:23 PM", "05:16 PM", "08:25 PM", "09:54 PM",
				"02:03 AM", "15", "9", "Mon", "04:53 AM", "06:21 AM", "01:23 PM", "05:16 PM", "08:23 PM", "09:53 PM",
				"02:03 AM", "16", "10", "Tue", "04:55 AM", "06:22 AM", "01:23 PM", "05:15 PM", "08:22 PM", "09:51 PM",
				"02:04 AM", "17", "11", "Wed", "04:56 AM", "06:23 AM", "01:23 PM", "05:14 PM", "08:20 PM", "09:49 PM",
				"02:04 AM", "18", "12", "Thu", "04:58 AM", "06:24 AM", "01:22 PM", "05:13 PM", "08:19 PM", "09:47 PM",
				"02:05 AM", "19", "13", "Fri", "05:00 AM", "06:25 AM", "01:22 PM", "05:13 PM", "08:17 PM", "09:45 PM",
				"02:05 AM", "20", "14", "Sat", "05:01 AM", "06:27 AM", "01:22 PM", "05:12 PM", "08:15 PM", "09:43 PM",
				"02:05 AM", "21", "15", "Sun", "05:03 AM", "06:28 AM", "01:22 PM", "05:11 PM", "08:14 PM", "09:41 PM",
				"02:06 AM", "22", "16", "Mon", "05:04 AM", "06:29 AM", "01:21 PM", "05:10 PM", "08:12 PM", "09:39 PM",
				"02:06 AM", "23", "17", "Tue", "05:06 AM", "06:30 AM", "01:21 PM", "05:09 PM", "08:11 PM", "09:37 PM",
				"02:07 AM", "24", "18", "Wed", "05:07 AM", "06:31 AM", "01:21 PM", "05:08 PM", "08:09 PM", "09:35 PM",
				"02:07 AM", "25", "19", "Thu", "05:08 AM", "06:32 AM", "01:21 PM", "05:07 PM", "08:07 PM", "09:33 PM",
				"02:07 AM", "26", "20", "Fri", "05:10 AM", "06:33 AM", "01:20 PM", "05:06 PM", "08:06 PM", "09:31 PM",
				"02:08 AM", "27", "21", "Sat", "05:11 AM", "06:34 AM", "01:20 PM", "05:06 PM", "08:04 PM", "09:29 PM",
				"02:08 AM", "28", "22", "Sun", "05:13 AM", "06:36 AM", "01:20 PM", "05:05 PM", "08:02 PM", "09:27 PM",
				"02:08 AM", "29", "23", "Mon", "05:14 AM", "06:37 AM", "01:19 PM", "05:04 PM", "08:00 PM", "09:25 PM",
				"02:08 AM", "30", "24", "Tue", "05:16 AM", "06:38 AM", "01:19 PM", "05:03 PM", "07:59 PM", "09:23 PM",
				"02:09 AM", "31", "25", "Wed", "05:17 AM", "06:39 AM", "01:19 PM", "05:02 PM", "07:57 PM", "09:21 PM",
				"02:09 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Toronto", "Toronto (ON), Canada");
		enterOtherField(listOfPrayerTimes, "-1");
	}

	@Test
	public void testPrayerTimesInDoha() throws Exception {
		System.out.println("<------Testing Prayer Times in Doha------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "26", "Mon", "03:35 AM", "05:00 AM",
				"11:41 AM", "03:08 PM", "06:20 PM", "07:50 PM", "12:30 AM", "2", "27", "Tue", "03:36 AM", "05:01 AM",
				"11:41 AM", "03:08 PM", "06:19 PM", "07:49 PM", "12:29 AM", "3", "28", "Wed", "03:37 AM", "05:01 AM",
				"11:41 AM", "03:08 PM", "06:18 PM", "07:48 PM", "12:30 AM", "4", "29", "Thu", "03:37 AM", "05:02 AM",
				"11:40 AM", "03:08 PM", "06:18 PM", "07:48 PM", "12:30 AM", "5", "30", "Fri", "03:38 AM", "05:02 AM",
				"11:40 AM", "03:08 PM", "06:17 PM", "07:47 PM", "12:31 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "6", "1", "Sat", "03:39 AM", "05:03 AM", "11:40 AM", "03:08 PM", "06:16 PM", "07:46 PM",
				"12:30 AM", "7", "2", "Sun", "03:39 AM", "05:03 AM", "11:40 AM", "03:08 PM", "06:16 PM", "07:46 PM",
				"12:30 AM", "8", "3", "Mon", "03:40 AM", "05:04 AM", "11:40 AM", "03:08 PM", "06:15 PM", "07:45 PM",
				"12:31 AM", "9", "4", "Tue", "03:41 AM", "05:04 AM", "11:40 AM", "03:08 PM", "06:14 PM", "07:44 PM",
				"12:32 AM", "10", "5", "Wed", "03:41 AM", "05:04 AM", "11:40 AM", "03:08 PM", "06:14 PM", "07:44 PM",
				"12:32 AM", "11", "6", "Thu", "03:42 AM", "05:05 AM", "11:40 AM", "03:08 PM", "06:13 PM", "07:43 PM",
				"12:31 AM", "12", "7", "Fri", "03:43 AM", "05:06 AM", "11:39 AM", "03:08 PM", "06:12 PM", "07:42 PM",
				"12:32 AM", "13", "8", "Sat", "03:43 AM", "05:06 AM", "11:39 AM", "03:08 PM", "06:11 PM", "07:41 PM",
				"12:31 AM", "14", "9", "Sun", "03:44 AM", "05:06 AM", "11:39 AM", "03:08 PM", "06:10 PM", "07:40 PM",
				"12:32 AM", "15", "10", "Mon", "03:45 AM", "05:07 AM", "11:39 AM", "03:08 PM", "06:09 PM", "07:39 PM",
				"12:33 AM", "16", "11", "Tue", "03:45 AM", "05:07 AM", "11:39 AM", "03:08 PM", "06:09 PM", "07:39 PM",
				"12:33 AM", "17", "12", "Wed", "03:46 AM", "05:08 AM", "11:38 AM", "03:08 PM", "06:08 PM", "07:38 PM",
				"12:32 AM", "18", "13", "Thu", "03:47 AM", "05:08 AM", "11:38 AM", "03:08 PM", "06:07 PM", "07:37 PM",
				"12:33 AM", "19", "14", "Fri", "03:47 AM", "05:09 AM", "11:38 AM", "03:07 PM", "06:06 PM", "07:36 PM",
				"12:32 AM", "20", "15", "Sat", "03:48 AM", "05:09 AM", "11:38 AM", "03:07 PM", "06:05 PM", "07:35 PM",
				"12:33 AM", "21", "16", "Sun", "03:49 AM", "05:09 AM", "11:37 AM", "03:07 PM", "06:04 PM", "07:34 PM",
				"12:34 AM", "22", "17", "Mon", "03:49 AM", "05:10 AM", "11:37 AM", "03:07 PM", "06:03 PM", "07:33 PM",
				"12:33 AM", "23", "18", "Tue", "03:50 AM", "05:10 AM", "11:37 AM", "03:06 PM", "06:02 PM", "07:32 PM",
				"12:34 AM", "24", "19", "Wed", "03:50 AM", "05:11 AM", "11:37 AM", "03:06 PM", "06:01 PM", "07:31 PM",
				"12:33 AM", "25", "20", "Thu", "03:51 AM", "05:11 AM", "11:36 AM", "03:06 PM", "06:00 PM", "07:30 PM",
				"12:34 AM", "26", "21", "Fri", "03:51 AM", "05:12 AM", "11:36 AM", "03:06 PM", "05:59 PM", "07:29 PM",
				"12:33 AM", "27", "22", "Sat", "03:52 AM", "05:12 AM", "11:36 AM", "03:05 PM", "05:58 PM", "07:28 PM",
				"12:34 AM", "28", "23", "Sun", "03:53 AM", "05:12 AM", "11:36 AM", "03:05 PM", "05:57 PM", "07:27 PM",
				"12:33 AM", "29", "24", "Mon", "03:53 AM", "05:13 AM", "11:35 AM", "03:05 PM", "05:56 PM", "07:26 PM",
				"12:34 AM", "30", "25", "Tue", "03:54 AM", "05:13 AM", "11:35 AM", "03:04 PM", "05:55 PM", "07:25 PM",
				"12:33 AM", "31", "26", "Wed", "03:54 AM", "05:14 AM", "11:35 AM", "03:04 PM", "05:54 PM", "07:24 PM",
				"12:34 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Doha", "Doha, Baladiyat ad Dawhah, Qatar");
		enterOtherField(listOfPrayerTimes, "0");
	}

	@Test
	public void testPrayerTimesInMelbourne() throws Exception {
		System.out.println("<------Testing Prayer Times in Melbourne------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "24", "Mon", "05:50 AM", "07:20 AM",
				"12:27 PM", "03:12 PM", "05:33 PM", "06:59 PM", "01:43 AM", "2", "25", "Tue", "05:49 AM", "07:19 AM",
				"12:27 PM", "03:13 PM", "05:34 PM", "06:59 PM", "01:44 AM", "3", "26", "Wed", "05:48 AM", "07:18 AM",
				"12:27 PM", "03:14 PM", "05:35 PM", "07:00 PM", "01:43 AM", "4", "27", "Thu", "05:48 AM", "07:17 AM",
				"12:27 PM", "03:14 PM", "05:36 PM", "07:01 PM", "01:44 AM", "5", "28", "Fri", "05:47 AM", "07:16 AM",
				"12:27 PM", "03:15 PM", "05:37 PM", "07:02 PM", "01:43 AM", "6", "29", "Sat", "05:46 AM", "07:15 AM",
				"12:27 PM", "03:16 PM", "05:37 PM", "07:02 PM", "01:43 AM", "7", "30", "Sun", "05:45 AM", "07:14 AM",
				"12:26 PM", "03:16 PM", "05:38 PM", "07:03 PM", "01:42 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "8", "1", "Mon", "05:44 AM", "07:13 AM", "12:26 PM", "03:17 PM", "05:39 PM", "07:04 PM",
				"01:41 AM", "9", "2", "Tue", "05:43 AM", "07:12 AM", "12:26 PM", "03:18 PM", "05:40 PM", "07:04 PM",
				"01:42 AM", "10", "3", "Wed", "05:42 AM", "07:11 AM", "12:26 PM", "03:18 PM", "05:41 PM", "07:05 PM",
				"01:41 AM", "11", "4", "Thu", "05:41 AM", "07:10 AM", "12:26 PM", "03:19 PM", "05:42 PM", "07:06 PM",
				"01:40 AM", "12", "5", "Fri", "05:40 AM", "07:08 AM", "12:26 PM", "03:20 PM", "05:42 PM", "07:07 PM",
				"01:40 AM", "13", "6", "Sat", "05:39 AM", "07:07 AM", "12:26 PM", "03:20 PM", "05:43 PM", "07:07 PM",
				"01:39 AM", "14", "7", "Sun", "05:38 AM", "07:06 AM", "12:25 PM", "03:21 PM", "05:44 PM", "07:08 PM",
				"01:40 AM", "15", "8", "Mon", "05:36 AM", "07:05 AM", "12:25 PM", "03:21 PM", "05:45 PM", "07:09 PM",
				"01:39 AM", "16", "9", "Tue", "05:35 AM", "07:04 AM", "12:25 PM", "03:22 PM", "05:46 PM", "07:10 PM",
				"01:38 AM", "17", "10", "Wed", "05:34 AM", "07:02 AM", "12:25 PM", "03:23 PM", "05:47 PM", "07:10 PM",
				"01:37 AM", "18", "11", "Thu", "05:33 AM", "07:01 AM", "12:25 PM", "03:23 PM", "05:48 PM", "07:11 PM",
				"01:38 AM", "19", "12", "Fri", "05:32 AM", "07:00 AM", "12:24 PM", "03:24 PM", "05:48 PM", "07:12 PM",
				"01:36 AM", "20", "13", "Sat", "05:31 AM", "06:58 AM", "12:24 PM", "03:24 PM", "05:49 PM", "07:13 PM",
				"01:37 AM", "21", "14", "Sun", "05:29 AM", "06:57 AM", "12:24 PM", "03:25 PM", "05:50 PM", "07:13 PM",
				"01:36 AM", "22", "15", "Mon", "05:28 AM", "06:56 AM", "12:24 PM", "03:26 PM", "05:51 PM", "07:14 PM",
				"01:35 AM", "23", "16", "Tue", "05:27 AM", "06:54 AM", "12:23 PM", "03:26 PM", "05:52 PM", "07:15 PM",
				"01:34 AM", "24", "17", "Wed", "05:26 AM", "06:53 AM", "12:23 PM", "03:27 PM", "05:53 PM", "07:16 PM",
				"01:35 AM", "25", "18", "Thu", "05:24 AM", "06:52 AM", "12:23 PM", "03:27 PM", "05:53 PM", "07:16 PM",
				"01:33 AM", "26", "19", "Fri", "05:23 AM", "06:50 AM", "12:23 PM", "03:28 PM", "05:54 PM", "07:17 PM",
				"01:32 AM", "27", "20", "Sat", "05:22 AM", "06:49 AM", "12:22 PM", "03:28 PM", "05:55 PM", "07:18 PM",
				"01:33 AM", "28", "21", "Sun", "05:20 AM", "06:48 AM", "12:22 PM", "03:29 PM", "05:56 PM", "07:19 PM",
				"01:32 AM", "29", "22", "Mon", "05:19 AM", "06:46 AM", "12:22 PM", "03:29 PM", "05:57 PM", "07:19 PM",
				"01:31 AM", "30", "23", "Tue", "05:17 AM", "06:45 AM", "12:21 PM", "03:30 PM", "05:58 PM", "07:20 PM",
				"01:30 AM", "31", "24", "Wed", "05:16 AM", "06:43 AM", "12:21 PM", "03:30 PM", "05:58 PM", "07:21 PM",
				"01:30 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Melbourne", "Melbourne, Victoria, Australia");
		enterOtherField(listOfPrayerTimes, "-2");
	}

	@Test
	public void testPrayerTimesInKualaLumpur() throws Exception {
		System.out.println("<------Testing Prayer Times in KualaLumpur------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "25", "Mon", "05:51 AM", "07:11 AM",
				"01:20 PM", "04:42 PM", "07:28 PM", "08:40 PM", "02:22 AM", "2", "26", "Tue", "05:51 AM", "07:11 AM",
				"01:20 PM", "04:42 PM", "07:28 PM", "08:40 PM", "02:22 AM", "3", "27", "Wed", "05:51 AM", "07:11 AM",
				"01:20 PM", "04:42 PM", "07:27 PM", "08:40 PM", "02:23 AM", "4", "28", "Thu", "05:51 AM", "07:11 AM",
				"01:20 PM", "04:41 PM", "07:27 PM", "08:40 PM", "02:23 AM", "5", "29", "Fri", "05:52 AM", "07:11 AM",
				"01:20 PM", "04:41 PM", "07:27 PM", "08:39 PM", "02:23 AM", "6", "30", "Sat", "05:52 AM", "07:11 AM",
				"01:20 PM", "04:41 PM", "07:27 PM", "08:39 PM", "02:23 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "7", "1", "Sun", "05:52 AM", "07:11 AM", "01:20 PM", "04:40 PM", "07:27 PM", "08:39 PM",
				"02:23 AM", "8", "2", "Mon", "05:52 AM", "07:11 AM", "01:19 PM", "04:40 PM", "07:27 PM", "08:39 PM",
				"02:23 AM", "9", "3", "Tue", "05:52 AM", "07:11 AM", "01:19 PM", "04:39 PM", "07:26 PM", "08:38 PM",
				"02:22 AM", "10", "4", "Wed", "05:52 AM", "07:11 AM", "01:19 PM", "04:39 PM", "07:26 PM", "08:38 PM",
				"02:22 AM", "11", "5", "Thu", "05:52 AM", "07:11 AM", "01:19 PM", "04:39 PM", "07:26 PM", "08:38 PM",
				"02:22 AM", "12", "6", "Fri", "05:52 AM", "07:11 AM", "01:19 PM", "04:38 PM", "07:26 PM", "08:37 PM",
				"02:22 AM", "13", "7", "Sat", "05:52 AM", "07:11 AM", "01:19 PM", "04:38 PM", "07:25 PM", "08:37 PM",
				"02:23 AM", "14", "8", "Sun", "05:52 AM", "07:11 AM", "01:19 PM", "04:37 PM", "07:25 PM", "08:37 PM",
				"02:23 AM", "15", "9", "Mon", "05:52 AM", "07:11 AM", "01:18 PM", "04:36 PM", "07:25 PM", "08:36 PM",
				"02:23 AM", "16", "10", "Tue", "05:52 AM", "07:11 AM", "01:18 PM", "04:36 PM", "07:25 PM", "08:36 PM",
				"02:23 AM", "17", "11", "Wed", "05:52 AM", "07:10 AM", "01:18 PM", "04:35 PM", "07:24 PM", "08:35 PM",
				"02:22 AM", "18", "12", "Thu", "05:52 AM", "07:10 AM", "01:18 PM", "04:35 PM", "07:24 PM", "08:35 PM",
				"02:22 AM", "19", "13", "Fri", "05:52 AM", "07:10 AM", "01:18 PM", "04:34 PM", "07:24 PM", "08:35 PM",
				"02:22 AM", "20", "14", "Sat", "05:52 AM", "07:10 AM", "01:17 PM", "04:33 PM", "07:23 PM", "08:34 PM",
				"02:21 AM", "21", "15", "Sun", "05:52 AM", "07:10 AM", "01:17 PM", "04:33 PM", "07:23 PM", "08:34 PM",
				"02:21 AM", "22", "16", "Mon", "05:52 AM", "07:10 AM", "01:17 PM", "04:32 PM", "07:23 PM", "08:33 PM",
				"02:21 AM", "23", "17", "Tue", "05:52 AM", "07:10 AM", "01:17 PM", "04:31 PM", "07:22 PM", "08:33 PM",
				"02:22 AM", "24", "18", "Wed", "05:52 AM", "07:09 AM", "01:16 PM", "04:31 PM", "07:22 PM", "08:32 PM",
				"02:22 AM", "25", "19", "Thu", "05:52 AM", "07:09 AM", "01:16 PM", "04:30 PM", "07:22 PM", "08:32 PM",
				"02:22 AM", "26", "20", "Fri", "05:52 AM", "07:09 AM", "01:16 PM", "04:29 PM", "07:21 PM", "08:32 PM",
				"02:21 AM", "27", "21", "Sat", "05:52 AM", "07:09 AM", "01:15 PM", "04:28 PM", "07:21 PM", "08:31 PM",
				"02:21 AM", "28", "22", "Sun", "05:51 AM", "07:09 AM", "01:15 PM", "04:27 PM", "07:21 PM", "08:31 PM",
				"02:21 AM", "29", "23", "Mon", "05:51 AM", "07:08 AM", "01:15 PM", "04:27 PM", "07:20 PM", "08:30 PM",
				"02:20 AM", "30", "24", "Tue", "05:51 AM", "07:08 AM", "01:15 PM", "04:26 PM", "07:20 PM", "08:30 PM",
				"02:20 AM", "31", "25", "Wed", "05:51 AM", "07:08 AM", "01:14 PM", "04:25 PM", "07:20 PM", "08:29 PM",
				"02:20 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Kuala Lumpur", "Kuala Lumpur, Kuala Lumpur, Malaysia");
		enterOtherField(listOfPrayerTimes, "-1");
	}

	@Test
	public void testPrayerTimesInLondon() throws Exception {
		System.out.println("<------Testing Prayer Times in London------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "25", "Mon", "02:46 AM", "05:24 AM",
				"01:07 PM", "05:17 PM", "08:49 PM", "11:13 PM", "12:47 AM", "2", "26", "Tue", "02:46 AM", "05:25 AM",
				"01:07 PM", "05:16 PM", "08:47 PM", "11:12 PM", "12:45 AM", "3", "27", "Wed", "02:47 AM", "05:27 AM",
				"01:07 PM", "05:15 PM", "08:46 PM", "11:11 PM", "12:46 AM", "4", "28", "Thu", "02:47 AM", "05:28 AM",
				"01:07 PM", "05:15 PM", "08:44 PM", "11:10 PM", "12:46 AM", "5", "29", "Fri", "02:48 AM", "05:30 AM",
				"01:07 PM", "05:14 PM", "08:42 PM", "11:08 PM", "12:46 AM", "6", "30", "Sat", "02:48 AM", "05:31 AM",
				"01:07 PM", "05:13 PM", "08:41 PM", "11:05 PM", "12:45 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "7", "1", "Sun", "02:49 AM", "05:33 AM", "01:07 PM", "05:12 PM", "08:39 PM", "11:02 PM",
				"12:45 AM", "8", "2", "Mon", "02:49 AM", "05:35 AM", "01:07 PM", "05:11 PM", "08:37 PM", "10:58 PM",
				"12:45 AM", "9", "3", "Tue", "03:06 AM", "05:36 AM", "01:07 PM", "05:10 PM", "08:35 PM", "10:55 PM",
				"12:55 AM", "10", "4", "Wed", "03:10 AM", "05:38 AM", "01:06 PM", "05:09 PM", "08:33 PM", "10:52 PM",
				"12:57 AM", "11", "5", "Thu", "03:13 AM", "05:39 AM", "01:06 PM", "05:09 PM", "08:31 PM", "10:48 PM",
				"12:59 AM", "12", "6", "Fri", "03:16 AM", "05:41 AM", "01:06 PM", "05:08 PM", "08:29 PM", "10:45 PM",
				"12:59 AM", "13", "7", "Sat", "03:19 AM", "05:42 AM", "01:06 PM", "05:07 PM", "08:27 PM", "10:42 PM",
				"01:01 AM", "14", "8", "Sun", "03:22 AM", "05:44 AM", "01:06 PM", "05:06 PM", "08:25 PM", "10:38 PM",
				"01:03 AM", "15", "9", "Mon", "03:25 AM", "05:46 AM", "01:06 PM", "05:05 PM", "08:24 PM", "10:35 PM",
				"01:04 AM", "16", "10", "Tue", "03:28 AM", "05:47 AM", "01:05 PM", "05:03 PM", "08:22 PM", "10:32 PM",
				"01:06 AM", "17", "11", "Wed", "03:31 AM", "05:49 AM", "01:05 PM", "05:02 PM", "08:20 PM", "10:29 PM",
				"01:06 AM", "18", "12", "Thu", "03:34 AM", "05:50 AM", "01:05 PM", "05:01 PM", "08:17 PM", "10:26 PM",
				"01:07 AM", "19", "13", "Fri", "03:37 AM", "05:52 AM", "01:05 PM", "05:00 PM", "08:15 PM", "10:23 PM",
				"01:09 AM", "20", "14", "Sat", "03:40 AM", "05:54 AM", "01:04 PM", "04:59 PM", "08:13 PM", "10:19 PM",
				"01:11 AM", "21", "15", "Sun", "03:43 AM", "05:55 AM", "01:04 PM", "04:58 PM", "08:11 PM", "10:16 PM",
				"01:11 AM", "22", "16", "Mon", "03:45 AM", "05:57 AM", "01:04 PM", "04:57 PM", "08:09 PM", "10:13 PM",
				"01:13 AM", "23", "17", "Tue", "03:48 AM", "05:58 AM", "01:04 PM", "04:55 PM", "08:07 PM", "10:10 PM",
				"01:13 AM", "24", "18", "Wed", "03:51 AM", "06:00 AM", "01:03 PM", "04:54 PM", "08:05 PM", "10:07 PM",
				"01:15 AM", "25", "19", "Thu", "03:53 AM", "06:02 AM", "01:03 PM", "04:53 PM", "08:03 PM", "10:04 PM",
				"01:15 AM", "26", "20", "Fri", "03:56 AM", "06:03 AM", "01:03 PM", "04:52 PM", "08:01 PM", "10:01 PM",
				"01:17 AM", "27", "21", "Sat", "03:58 AM", "06:05 AM", "01:03 PM", "04:50 PM", "07:58 PM", "09:58 PM",
				"01:18 AM", "28", "22", "Sun", "04:01 AM", "06:06 AM", "01:02 PM", "04:49 PM", "07:56 PM", "09:55 PM",
				"01:18 AM", "29", "23", "Mon", "04:03 AM", "06:08 AM", "01:02 PM", "04:48 PM", "07:54 PM", "09:52 PM",
				"01:20 AM", "30", "24", "Tue", "04:06 AM", "06:09 AM", "01:02 PM", "04:46 PM", "07:52 PM", "09:49 PM",
				"01:20 AM", "31", "25", "Wed", "04:08 AM", "06:11 AM", "01:01 PM", "04:45 PM", "07:50 PM", "09:46 PM",
				"01:22 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("London", "London, England, United Kingdom");
		enterOtherField(listOfPrayerTimes, "-1");
	}

	@Test
	public void testPrayerTimesInParis() throws Exception {
		System.out.println("<------Testing Prayer Times in Paris------->\n");
		incrementAndOpenURLpage();

		ArrayList<String> listOfPrayerTimes = new ArrayList<String>(Arrays.asList("August", "Jumada Al-Akhirah", "Day",
				"Fajr", "Sunrise", "Dhuhr", "Asr", "Maghrib", "Isha", "Qiyam", "1", "25", "Mon", "04:58 AM", "06:22 AM",
				"01:58 PM", "06:04 PM", "09:31 PM", "10:57 PM", "02:29 AM", "2", "26", "Tue", "05:00 AM", "06:23 AM",
				"01:57 PM", "06:03 PM", "09:30 PM", "10:55 PM", "02:30 AM", "3", "27", "Wed", "05:02 AM", "06:25 AM",
				"01:57 PM", "06:03 PM", "09:28 PM", "10:53 PM", "02:30 AM", "4", "28", "Thu", "05:04 AM", "06:26 AM",
				"01:57 PM", "06:02 PM", "09:27 PM", "10:51 PM", "02:31 AM", "5", "29", "Fri", "05:06 AM", "06:27 AM",
				"01:57 PM", "06:01 PM", "09:25 PM", "10:49 PM", "02:31 AM", "6", "30", "Sat", "05:07 AM", "06:29 AM",
				"01:57 PM", "06:01 PM", "09:24 PM", "10:47 PM", "02:32 AM", "August", "Rajab", "Day", "", "", "", "",
				"", "", "7", "1", "Sun", "05:09 AM", "06:30 AM", "01:57 PM", "06:00 PM", "09:22 PM", "10:45 PM",
				"02:32 AM", "8", "2", "Mon", "05:11 AM", "06:32 AM", "01:57 PM", "05:59 PM", "09:20 PM", "10:43 PM",
				"02:34 AM", "9", "3", "Tue", "05:13 AM", "06:33 AM", "01:57 PM", "05:58 PM", "09:19 PM", "10:40 PM",
				"02:35 AM", "10", "4", "Wed", "05:15 AM", "06:34 AM", "01:57 PM", "05:58 PM", "09:17 PM", "10:38 PM",
				"02:35 AM", "11", "5", "Thu", "05:17 AM", "06:36 AM", "01:56 PM", "05:57 PM", "09:15 PM", "10:36 PM",
				"02:35 AM", "12", "6", "Fri", "05:19 AM", "06:37 AM", "01:56 PM", "05:56 PM", "09:14 PM", "10:34 PM",
				"02:36 AM", "13", "7", "Sat", "05:21 AM", "06:39 AM", "01:56 PM", "05:55 PM", "09:12 PM", "10:32 PM",
				"02:38 AM", "14", "8", "Sun", "05:23 AM", "06:40 AM", "01:56 PM", "05:54 PM", "09:10 PM", "10:29 PM",
				"02:38 AM", "15", "9", "Mon", "05:24 AM", "06:41 AM", "01:56 PM", "05:53 PM", "09:08 PM", "10:27 PM",
				"02:38 AM", "16", "10", "Tue", "05:26 AM", "06:43 AM", "01:56 PM", "05:52 PM", "09:07 PM", "10:25 PM",
				"02:39 AM", "17", "11", "Wed", "05:28 AM", "06:44 AM", "01:55 PM", "05:52 PM", "09:05 PM", "10:23 PM",
				"02:39 AM", "18", "12", "Thu", "05:30 AM", "06:46 AM", "01:55 PM", "05:51 PM", "09:03 PM", "10:20 PM",
				"02:41 AM", "19", "13", "Fri", "05:32 AM", "06:47 AM", "01:55 PM", "05:50 PM", "09:01 PM", "10:18 PM",
				"02:41 AM", "20", "14", "Sat", "05:34 AM", "06:48 AM", "01:55 PM", "05:49 PM", "08:59 PM", "10:16 PM",
				"02:41 AM", "21", "15", "Sun", "05:35 AM", "06:50 AM", "01:55 PM", "05:48 PM", "08:57 PM", "10:14 PM",
				"02:41 AM", "22", "16", "Mon", "05:37 AM", "06:51 AM", "01:54 PM", "05:46 PM", "08:55 PM", "10:11 PM",
				"02:43 AM", "23", "17", "Tue", "05:39 AM", "06:53 AM", "01:54 PM", "05:45 PM", "08:53 PM", "10:09 PM",
				"02:43 AM", "24", "18", "Wed", "05:41 AM", "06:54 AM", "01:54 PM", "05:44 PM", "08:51 PM", "10:07 PM",
				"02:43 AM", "25", "19", "Thu", "05:43 AM", "06:55 AM", "01:53 PM", "05:43 PM", "08:50 PM", "10:04 PM",
				"02:44 AM", "26", "20", "Fri", "05:44 AM", "06:57 AM", "01:53 PM", "05:42 PM", "08:48 PM", "10:02 PM",
				"02:44 AM", "27", "21", "Sat", "05:46 AM", "06:58 AM", "01:53 PM", "05:41 PM", "08:46 PM", "10:00 PM",
				"02:46 AM", "28", "22", "Sun", "05:48 AM", "07:00 AM", "01:53 PM", "05:40 PM", "08:44 PM", "09:57 PM",
				"02:46 AM", "29", "23", "Mon", "05:50 AM", "07:01 AM", "01:52 PM", "05:39 PM", "08:42 PM", "09:55 PM",
				"02:46 AM", "30", "24", "Tue", "05:51 AM", "07:03 AM", "01:52 PM", "05:37 PM", "08:40 PM", "09:53 PM",
				"02:46 AM", "31", "25", "Wed", "05:53 AM", "07:04 AM", "01:52 PM", "05:36 PM", "08:38 PM", "09:50 PM",
				"02:48 AM"));

		prayerTimesPageComponent = new PrayerTimesPageComponent();

		prayerTimesPageComponent.searchTopNavBar("Paris", "Paris, Île-de-France, France");
		enterOtherField(listOfPrayerTimes, "-1");
	}

	private void enterOtherField(ArrayList<String> listOfPrayerTimes, String hijriDate) throws Exception {
		prayerTimesPageComponent = new PrayerTimesPageComponent();
		homePagecomponent = new HomePageComponent();

		homePagecomponent.openSettingspanel();
		prayerTimesPageComponent.selectAdjustHijriDateFromSettingsPanel(hijriDate);
		prayerTimesPageComponent.clickSaveAndUpdateButton();
		prayerTimesPageComponent.clickPrayerTimesButton();
		prayerTimesPageComponent.clickMonthlyOnWMYCard();
		prayerTimesPageComponent.selectMonthFromDropDown("August");
		prayerTimesPageComponent.selectYearFromDropDown("2005");
		Thread.sleep(1000);
		prayerTimesPageComponent.VerifyListOfMonth(listOfPrayerTimes);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		callTearDown();
	}

}
