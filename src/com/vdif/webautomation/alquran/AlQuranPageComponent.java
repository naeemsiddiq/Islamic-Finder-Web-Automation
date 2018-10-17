/**
 * 
 */
package com.vdif.webautomation.alquran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.vdif.webautomation.AbstractComponent;

/**
 * @author {Naeem Siddiq}
 *
 *         {Associate Software Engineer}
 */

public class AlQuranPageComponent extends AbstractComponent {

	AlQuranPageLocators alQuranPageLocators = PageFactory.initElements(driver, AlQuranPageLocators.class);
	ArrayList<String> surahsClickEvent;

	public void clickAlQuranLink() throws Exception {
		alQuranPageLocators.alQuarnButton.click();
		implicicitwait2sec();
	}

	public void checkSurahListAlQuranPage(int startFromSurah, int endToSurah) throws Exception {

		ArrayList<String> surahsCount = new ArrayList<String>(Arrays.asList("1.", "2.", "3.", "4.", "5.", "6.", "7.",
				"8.", "9.", "10.", "11.", "12.", "13.", "14.", "15.", "16.", "17.", "18.", "19.", "20.", "21.", "22.",
				"23.", "24.", "25.", "26.", "27.", "28.", "29.", "30.", "31.", "32.", "33.", "34.", "35.", "36.", "37.",
				"38.", "39.", "40.", "41.", "42.", "43.", "44.", "45.", "46.", "47.", "48.", "49.", "50.", "51.", "52.",
				"53.", "54.", "55.", "56.", "57.", "58.", "59.", "60.", "61.", "62.", "63.", "64.", "65.", "66.", "67.",
				"68.", "69.", "70.", "71.", "72.", "73.", "74.", "75.", "76.", "77.", "78.", "79.", "80.", "81.", "82.",
				"83.", "84.", "85.", "86.", "87.", "88.", "89.", "90.", "91.", "92.", "93.", "94.", "95.", "96.", "97.",
				"98.", "99.", "100.", "101.", "102.", "103.", "104.", "105.", "106.", "107.", "108.", "109.", "110.",
				"111.", "112.", "113.", "114."));

		ArrayList<String> surahsTitle = new ArrayList<String>(Arrays.asList("Surah Fatiha", "Surah Baqarah",
				"Surah Imran", "Surah Nisa", "Surah Maidah", "Surah Anam ", "Surah Araf ", "Surah Anfal ",
				"Surah Taubah ", "Surah Yunus", "Surah Hud", "Surah Yusuf", "Surah Raad", "Surah Ibrahim", "Surah Hijr",
				"Surah Nahl", "Surah Isra", "Surah Kahf", "Surah Maryam", "Surah Taha", "Surah Anbiya", "Surah Hajj",
				"Surah Muminun", "Surah Noor", "Surah Furqan", "Surah Shuara", "Surah Naml", "Surah Qasas",
				"Surah Ankabut", "Surah Rum", "Surah Luqman", "Surah Sajdah", "Surah Ahzab", "Surah Saba",
				"Surah Fatir", "Surah Yaseen", "Surah Saffat", "Surah Sad", "Surah Zumar", "Surah Ghafir",
				"Surah Fussilat", "Surah Shura", "Surah Zukhruf", "Surah Dukhan", "Surah Jathiyah", "Surah Ahqaf",
				"Surah Muhammad", "Surah Fath", "Surah Hujurat", "Surah Qaf", "Surah Dhariyat", "Surah Tur",
				"Surah Najm", "Surah Qamar", "Surah Rahman", "Surah Waqiah", "Surah Hadid", "Surah Mujadila",
				"Surah Hashr", "Surah Mumtahana", "Surah Saff", "Surah Jumah", "Surah Munafiqoon", "Surah Taghabun",
				"Surah Talaq", "Surah Tahrim", "Surah Mulk", "Surah Qalam", "Surah Haqqah", "Surah Maarij", "Surah Nuh",
				"Surah Jinn", "Surah Muzammil", "Surah Mudathir", "Surah Qiyamah", "Surah Insan", "Surah Mursalat",
				"Surah Naba", "Surah Naziat", "Surah Abasa", "Surah Takwir", "Surah Infitar", "Surah Mutaffifin",
				"Surah Inshiqaq", "Surah Burooj", "Surah Tariq", "Surah Ala", "Surah Ghashiya", "Surah Fajr",
				"Surah Balad", "Surah Shams", "Surah Layl", "Surah Duha", "Surah Sharh", "Surah Teen", "Surah Alaq",
				"Surah Qadr", "Surah Bayyinah", "Surah Zalzalah", "Surah Adiyat", "Surah Qariah", "Surah Takathur",
				"Surah Asr", "Surah Humazah", "Surah Feel", "Surah Quraish", "Surah Maun", "Surah Kauthar",
				"Surah Kafiroon", "Surah Nasr", "Surah Masad", "Surah Ikhlas", "Surah Falaq", "Surah Nas"));

		ArrayList<String> surahsStatus = new ArrayList<String>(Arrays.asList("(The Opening)", "(The Cow)",
				"(The Family of Imraan)", "(The Women)", "(The Table)", "(The Cattle)", "(The Heights)",
				"(The Spoils of War)", "(The Repentance)", "(Jonas)", "(Hud)", "(Joseph)", "(The Thunder)", "(Abraham)",
				"(The Rock)", "(The Bee)", "(The Night Journey)", "(The Cave)", "(Mary)", "(Taa-Haa)", "(The Prophets)",
				"(The Pilgrimage)", "(The Believers)", "(The Light)", "(The Criterion)", "(The Poets)", "(The Ant)",
				"(The Stories)", "(The Spider)", "(The Romans)", "(Luqman)", "(The Prostration)", "(The Clans)",
				"(Sheba)", "(The Originator)", "(Yaseen)", "(Those drawn up in Ranks)", "(The letter Saad)",
				"(The Groups)", "(The Forgiver)", "(Explained in detail)", "(Consultation)", "(Ornaments of gold)",
				"(The Smoke)", "(Crouching)", "(The Dunes)", "(Muhammad)", "(The Victory)", "(The Inner Apartments)",
				"(The letter Qaaf)", "(The Winnowing Winds)", "(The Mount)", "(The Star)", "(The Moon)",
				"(The Beneficent)", "(The Inevitable)", "(The Iron)", "(The Pleading Woman)", "(The Exile)",
				"(She that is to be examined)", "(The Ranks)", "(Friday)", "(The Hypocrites)", "(Mutual Disillusion)",
				"(Divorce)", "(The Prohibition)", "(The Sovereignty)", "(The Pen)", "(The Reality)",
				"(The Ascending Stairways)", "(Noah)", "(The Jinn)", "(The Enshrouded One)", "(The Cloaked One)",
				"(The Resurrection)", "(Man)", "(The Emissaries)", "(The Announcement)", "(Those who drag forth)",
				"(He frowned)", "(The Overthrowing)", "(The Cleaving)", "(Defrauding)", "(The Splitting Open)",
				"(The Constellations)", "(The Morning Star)", "(The Most High)", "(The Overwhelming)", "(The Dawn)",
				"(The City)", "(The Sun)", "(The Night)", "(The Morning Hours)", "(The Consolation)", "(The Fig)",
				"(The Clot)", "(The Power, Fate)", "(The Evidence)", "(The Earthquake)", "(The Chargers)",
				"(The Calamity)", "(Competition)", "(The Declining Day, Epoch)", "(The Traducer)", "(The Elephant)",
				"(Quraysh)", "(Almsgiving)", "(Abundance)", "(The Disbelievers)", "(Divine Support)",
				"(The Palm Fibre)", "(Sincerity)", "(The Dawn)", "(Mankind)"));

		ArrayList<String> surahsLocation = new ArrayList<String>(Arrays.asList("Makki", "Madni", "Madni", "Madni",
				"Madni", "Makki", "Makki", "Madni", "Madni", "Makki", "Makki", "Makki", "Madni", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Makki", "Madni", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Makki", "Makki", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Madni",
				"Madni", "Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Makki", "Madni", "Madni", "Madni",
				"Madni", "Madni", "Madni", "Madni", "Madni", "Madni", "Madni", "Makki", "Makki", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Makki", "Makki", "Makki", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Madni", "Makki", "Makki", "Makki", "Makki",
				"Makki", "Makki", "Makki", "Makki", "Makki", "Makki", "Madni", "Makki", "Makki", "Makki", "Makki"));

		ArrayList<String> surahsTotalAyat = new ArrayList<String>(Arrays.asList("7 Ayaat", "286 Ayaat", "200 Ayaat",
				"176 Ayaat", "120 Ayaat", "165 Ayaat", "206 Ayaat", "75 Ayaat", "129 Ayaat", "109 Ayaat", "123 Ayaat",
				"111 Ayaat", "43 Ayaat", "52 Ayaat", "99 Ayaat", "128 Ayaat", "111 Ayaat", "110 Ayaat", "98 Ayaat",
				"135 Ayaat", "112 Ayaat", "78 Ayaat", "118 Ayaat", "64 Ayaat", "77 Ayaat", "227 Ayaat", "93 Ayaat",
				"88 Ayaat", "69 Ayaat", "60 Ayaat", "34 Ayaat", "30 Ayaat", "73 Ayaat", "54 Ayaat", "45 Ayaat",
				"83 Ayaat", "182 Ayaat", "88 Ayaat", "75 Ayaat", "85 Ayaat", "54 Ayaat", "53 Ayaat", "89 Ayaat",
				"59 Ayaat", "37 Ayaat", "35 Ayaat", "38 Ayaat", "29 Ayaat", "18 Ayaat", "45 Ayaat", "60 Ayaat",
				"49 Ayaat", "62 Ayaat", "55 Ayaat", "78 Ayaat", "96 Ayaat", "29 Ayaat", "22 Ayaat", "24 Ayaat",
				"13 Ayaat", "14 Ayaat", "11 Ayaat", "11 Ayaat", "18 Ayaat", "12 Ayaat", "12 Ayaat", "30 Ayaat",
				"52 Ayaat", "52 Ayaat", "44 Ayaat", "28 Ayaat", "28 Ayaat", "20 Ayaat", "56 Ayaat", "40 Ayaat",
				"31 Ayaat", "50 Ayaat", "40 Ayaat", "46 Ayaat", "42 Ayaat", "29 Ayaat", "19 Ayaat", "36 Ayaat",
				"25 Ayaat", "22 Ayaat", "17 Ayaat", "19 Ayaat", "26 Ayaat", "30 Ayaat", "20 Ayaat", "15 Ayaat",
				"21 Ayaat", "11 Ayaat", "8 Ayaat", "8 Ayaat", "19 Ayaat", "5 Ayaat", "8 Ayaat", "8 Ayaat", "11 Ayaat",
				"11 Ayaat", "8 Ayaat", "3 Ayaat", "9 Ayaat", "5 Ayaat", "4 Ayaat", "7 Ayaat", "3 Ayaat", "6 Ayaat",
				"3 Ayaat", "5 Ayaat", "4 Ayaat", "5 Ayaat", "6 Ayaat"));

		ArrayList<String> h1HeadingToVerifySurah = new ArrayList<String>(
				Arrays.asList("Read Surah Fatiha with translation", "Read Surah Baqarah with translation",
						"Read Surah Imran with translation", "Read Surah Nisa with translation",
						"Read Surah Maidah with translation", "Read Surah Anam with translation",
						"Read Surah Araf with translation", "Read Surah Anfal with translation",
						"Read Surah Taubah with translation", "Read Surah Yunus with translation",
						"Read Surah Hud with translation", "Read Surah Yusuf with translation",
						"Read Surah Raad with translation", "Read Surah Ibrahim with translation",
						"Read Surah Hijr with translation", "Read Surah Nahl with translation",
						"Read Surah Isra with translation", "Read Surah Kahf with translation",
						"Read Surah Maryam with translation", "Read Surah Taha with translation",
						"Read Surah Anbiya with translation", "Read Surah Hajj with translation",
						"Read Surah Muminun with translation", "Read Surah Noor with translation",
						"Read Surah Furqan with translation", "Read Surah Shuara with translation",
						"Read Surah Naml with translation", "Read Surah Qasas with translation",
						"Read Surah Ankabut with translation", "Read Surah Rum with translation",
						"Read Surah Luqman with translation", "Read Surah Sajdah with translation",
						"Read Surah Ahzab with translation", "Read Surah Saba with translation",
						"Read Surah Fatir with translation", "Read Surah Yaseen with translation",
						"Read Surah Saffat with translation", "Read Surah Sad with translation",
						"Read Surah Zumar with translation", "Read Surah Ghafir with translation",
						"Read Surah Fussilat with translation", "Read Surah Shura with translation",
						"Read Surah Zukhruf with translation", "Read Surah Dukhan with translation",
						"Read Surah Jathiyah with translation", "Read Surah Ahqaf with translation",
						"Read Surah Muhammad with translation", "Read Surah Fath with translation",
						"Read Surah Hujurat with translation", "Read Surah Qaf with translation",
						"Read Surah Dhariyat with translation", "Read Surah Tur with translation",
						"Read Surah Najm with translation", "Read Surah Qamar with translation",
						"Read Surah Rahman with translation", "Read Surah Waqiah with translation",
						"Read Surah Hadid with translation", "Read Surah Mujadila with translation",
						"Read Surah Hashr with translation", "Read Surah Mumtahana with translation",
						"Read Surah Saff with translation", "Read Surah Jumah with translation",
						"Read Surah Munafiqoon with translation", "Read Surah Taghabun with translation",
						"Read Surah Talaq with translation", "Read Surah Tahrim with translation",
						"Read Surah Mulk with translation", "Read Surah Qalam with translation",
						"Read Surah Haqqah with translation", "Read Surah Maarij with translation",
						"Read Surah Nuh with translation", "Read Surah Jinn with translation",
						"Read Surah Muzammil with translation", "Read Surah Mudathir with translation",
						"Read Surah Qiyamah with translation", "Read Surah Insan with translation",
						"Read Surah Mursalat with translation", "Read Surah Naba with translation",
						"Read Surah Naziat with translation", "Read Surah Abasa with translation",
						"Read Surah Takwir with translation", "Read Surah Infitar with translation",
						"Read Surah Mutaffifin with translation", "Read Surah Inshiqaq with translation",
						"Read Surah Burooj with translation", "Read Surah Tariq with translation",
						"Read Surah Ala with translation", "Read Surah Ghashiya with translation",
						"Read Surah Fajr with translation", "Read Surah Balad with translation",
						"Read Surah Shams with translation", "Read Surah Layl with translation",
						"Read Surah Duha with translation", "Read Surah Sharh with translation",
						"Read Surah Teen with translation", "Read Surah Alaq with translation",
						"Read Surah Qadr with translation", "Read Surah Bayyinah with translation",
						"Read Surah Zalzalah with translation", "Read Surah Adiyat with translation",
						"Read Surah Qariah with translation", "Read Surah Takathur with translation",
						"Read Surah Asr with translation", "Read Surah Humazah with translation",
						"Read Surah Feel with translation", "Read Surah Quraish with translation",
						"Read Surah Maun with translation", "Read Surah Kauthar with translation",
						"Read Surah Kafiroon with translation", "Read Surah Nasr with translation",
						"Read Surah Masad with translation", "Read Surah Ikhlas with translation",
						"Read Surah Falaq with translation", "Read Surah Nas with translation"));

		for (int i = startFromSurah; i < endToSurah; i++) {

			WebElement surahElement = alQuranPageLocators.surahsListAlQuranPage(i + 1);
			String surahCount = surahElement.findElement(By.className("small-9")).findElement(By.tagName("p"))
					.getText();
			Assert.assertEquals(surahCount, surahsCount.get(i));
			String surahTitle = surahElement.findElement(By.className("small-9")).findElement(By.tagName("a"))
					.getText();
			Assert.assertEquals(surahTitle, surahsTitle.get(i));
			String surahStatus = surahElement.findElement(By.className("small-12")).findElement(By.tagName("p"))
					.getText();
			Assert.assertEquals(surahStatus, surahsStatus.get(i));
			int count = 0;
			List<WebElement> childRow = surahElement.findElements(By.className("small-6"));
			for (WebElement childElement : childRow) {
				String surahLocationAndTotalAyats = childElement.findElement(By.tagName("p"))
						.findElement(By.tagName("small")).getText();
				if (count == 0) {
					Assert.assertEquals(surahLocationAndTotalAyats, surahsLocation.get(i));
					count++;
				} else {
					Assert.assertEquals(surahLocationAndTotalAyats, surahsTotalAyat.get(i));
					count = 0;
				}
			}
			// checkSurahClick(parentRow.get(i).findElement(By.className("small-9")).findElement(By.tagName("a")));
			sscrollToLocateElement(surahElement.findElement(By.className("small-9")).findElement(By.tagName("a")));
			// checking heading h1 on each surah page
			Assert.assertEquals(alQuranPageLocators.h1Tag.getText(), h1HeadingToVerifySurah.get(i));
			((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
		}

		// System.out.println(surahsClickEvent);

		implicicitwait2sec();
	}

	public void clickJuzTab() throws Exception {
		WebElement element = alQuranPageLocators.juzTab;
		sscrollToLocateElement(element);
		implicicitwait2sec();
	}

	public void checkJuzListAlQuranPage(int startFromJuz, int endToJuz) throws Exception {

		ArrayList<String> juzTitle = new ArrayList<String>(Arrays.asList("Juz 1 (Alaf Lam Meem)", "Juz 2 (Sayaqool)",
				"Juz 3 (Tilkal Rusull)", "Juz 4 (Lan Tana Loo)", "Juz 5 (Wal Mohsanat)", "Juz 6 (La Yuhibbullah)",
				"Juz 7 (Wa Iza Samiu)", "Juz 8 (Wa Lau Annana)", "Juz 9 (Qalal Malao)", "Juz 10 (Wa A'lamu)",
				"Juz 11 (Yatazeroon)", "Juz 12 (Wa Mamin Da'abat)", "Juz 13 (Wa Ma Ubrioo)", "Juz 14 (Rubama)",
				"Juz 15 (Subhanallazi)", "Juz 16 (Qal Alam)", "Juz 17 (Aqtarabo)", "Juz 18 (Qadd Aflaha)",
				"Juz 19 (Wa Qalallazina)", "Juz 20 (A'man Khalaq)", "Juz 21 (Utlu Ma Oohi)", "Juz 22 (Wa Manyaqnut)",
				"Juz 23 (Wa Mali)", "Juz 24 (Faman Azlam)", "Juz 25 (Elahe Yuruddo)", "Juz 26 (Ha'a Meem)",
				"Juz 27 (Qala Fama Khatbukum)", "Juz 28 (Qadd Sami Allah)", "Juz 29 (Tabarakallazi)",
				"Juz 30 (Amma Yatasa'aloon)"));

		ArrayList<String> juzReference = new ArrayList<String>(Arrays.asList(
				"Surah Al-Faatiha 1:1 to Surah Al Baqarah 2:141", "Surah Al Baqarah 2:142 to Surah Al-Baqara 2:252",
				"Surah Al-Baqara 2:253 to Surah Aal-i-Imraan 3:92", "Surah Aal-i-Imraan 3:93 to Surah An-Nisaa 4:23",
				"Surah An-Nisaa 4:24 to Surah An-Nisaa 4:147", "Surah An-Nisaa 4:148 to Surah Al-Maaida 5:81",
				"Surah Al-Maaida 5:83 to Surah Al-An'aam 6:110", "Surah Al-An'aam 6:111 to Surah Al-A'raaf 7:87",
				"Surah Al-A'raaf 7:88 to Surah Al-Anfaal 8:40", "Surah Al-Anfaal 8:41 to Surah At-Tawba 9:92",
				"Surah At-Tawba 9:93 to Surah Hud 11:5", "Surah Hud 11:6 to Surah Yusuf 12:52",
				"Surah Yusuf 12:53 to Surah Ibrahim 14:52", "Surah Al-Hijr 15:2 to Surah An-Nahl 16:128",
				"Surah Al-Israa 17:1 to Surah Al-Kahf 18:74", "Surah Al-Kahf 18:75 to Surah Taa-Haa 20:135",
				"Surah Al-Anbiyaa 21:21 to Surah Al-Hajj 22:78", "Surah Al-Muminoon 23:1 to Surah Al-Furqaan 25:20",
				"Surah Al-Furqaan 25:21 to Surah An-Naml 27:55", "Surah An-Naml 27:60 to Surah Al-Ankaboot 29:45",
				"Surah Al-Ankaboot 29:45 to Surah Al-Ahzaab 33:30", "Surah Al-Ahzaab 33:31 to Surah Yaseen 36:27",
				"Surah Yaseen 36:22 to Surah Az-Zumar 39:31", "Surah Az-Zumar 39:32 to Surah Fussilat 41:46",
				"Surah Fussilat 41:47 to Surah Al-Jaathiya 45:37", "Surah Al-Ahqaf 46:1 to Surah Adh-Dhaariyat 51:30",
				"Surah Adh-Dhaariyat 51:31 to Surah Al-Hadid 57:29", "Surah Al-Mujaadila 58:1 to Surah At-Tahrim 66:12",
				"Surah Al-Mulk 67:1 to Surah Al-Mursalaat 77:50", "Surah An-Naba 78:1 to Surah An-Naas 114:6"));

		ArrayList<String> h1HeadingToVerifyJuz = new ArrayList<String>(
				Arrays.asList("Read Surah Fatiha with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Baqarah with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Baqarah with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Imran with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Nisa with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Nisa with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Maidah with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Anam with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Araf with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Anfal with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Taubah with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Hud with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Yusuf with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Hijr with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Isra with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Kahf with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Anbiya with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Muminun with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Furqan with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Naml with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Ankabut with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Ahzab with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Yaseen with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Zumar with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Fussilat with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Ahqaf with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Dhariyat with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Mujadila with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Mulk with Urdu translation by Fateh Muhammad Jalandhry",
						"Read Surah Naba with Urdu translation by Fateh Muhammad Jalandhry"));

		System.out.println(juzTitle.size() + "   " + juzReference.size());

		for (int i = startFromJuz; i < endToJuz; i++) {

			WebElement juzElement = alQuranPageLocators.juzListAlQuranPage(i + 1);

			List<WebElement> childRow = juzElement.findElements(By.className("small-12"));
			// System.out.println(childRow.size());
			int helpCount = 0;
			for (int j = 0; j < childRow.size(); j++) {
				if (helpCount == 0) {
					String juzTitle1 = childRow.get(j).findElement(By.tagName("p")).getText();
					Assert.assertEquals(juzTitle1, juzTitle.get(i));
					helpCount++;
				} else {
					String juzReference1 = childRow.get(j).findElement(By.tagName("p")).getText();
					Assert.assertEquals(juzReference1, juzReference.get(i));
					sscrollToLocateElement(childRow.get(j).findElement(By.tagName("p")));
					// checking heading h1 on each Juz page
					Assert.assertEquals(alQuranPageLocators.h1Tag.getText(), h1HeadingToVerifyJuz.get(i));
					((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
					implicicitwait2sec();
					clickJuzTab();
					helpCount = 0;
				}
			}
		}

		System.out.println("Juz : " + surahsClickEvent);
		implicicitwait2sec();
	}

	public void clickTranslationsTab() throws Exception {
		WebElement element = alQuranPageLocators.translationsTab;
		sscrollToLocateElement(element);
		implicicitwait2sec();
	}

	public void checkTranslationsListAlQuranPage(int startFromTranslation, int endToTranslation) throws Exception {
		ArrayList<String> translationTitle = new ArrayList<String>(Arrays.asList("Arabic", "Arabic", "Bengali",
				"Bengali", "Bosnian", "Chinese", "Chinese", "Czech", "Czech", "Dutch", "English", "English", "English",
				"English", "French", "German", "German", "German", "German", "Hindi", "Hindi", "Indonesian",
				"Indonesian", "Indonesian", "Italian", "Malay", "Malayalam", "Malayalam", "Norwegian", "Pashto",
				"Russian", "Russian", "Russian", "Sindhi", "Somali", "Spanish", "Swedish", "Tamil", "Thai", "Turkish",
				"Turkish", "Turkish", "Turkish", "Turkish", "Urdu", "Urdu", "Urdu", "Uyghur", "Uzbek"));

		ArrayList<String> h1HeadingToVerifyTranslation = new ArrayList<String>(Arrays.asList(
				"Read Surah Fatiha with Arabic translation by Jalal ad-Din al-Mahalli and Jalal ad-Din as-Suyuti",
				"Read Surah Fatiha with Arabic translation by King Fahad Quran Complex",
				"Read Surah Fatiha with Bengali translation by Zohurul Hoque",
				"Read Surah Fatiha with Bengali translation by Muhiuddin Khan",
				"Read Surah Fatiha with Bosnian translation by Mustafa Mlivo",
				"Read Surah Fatiha with Chinese translation by Ma Jian",
				"Read Surah Fatiha with Chinese translation by Ma Jian",
				"Read Surah Fatiha with Czech translation by Preklad I. Hrbek",
				"Read Surah Fatiha with Czech translation by A. R. Nykl",
				"Read Surah Fatiha with Dutch translation by Salomo Keyzer",
				"Read Surah Fatiha with English translation by Abdul Majid Daryabadi",
				"Read Surah Fatiha with English translation by Muhammad Taqi-ud-Din al-Hilali and Muhammad Muhsin Khan",
				"Read Surah Fatiha with English translation by Mohammed Marmaduke William Pickthall",
				"Read Surah Fatiha with English translation by Saheeh International",
				"Read Surah Fatiha with French translation by Muhammad Hamidullah",
				"Read Surah Fatiha with German translation by Abu Rida Muhammad ibn Ahmad ibn Rassoul",
				"Read Surah Fatiha with German translation by A. S. F. Bubenheim and N. Elyas",
				"Read Surah Fatiha with German translation by Adel Theodor Khoury",
				"Read Surah Fatiha with German translation by Amir Zaidan",
				"Read Surah Fatiha with Hindi translation by Muhammad Farooq Khan and Muhammad Ahmed",
				"Read Surah Fatiha with Hindi translation by Suhel Farooq Khan and Saifur Rahman Nadwi",
				"Read Surah Fatiha with Indonesian translation by Indonesian Ministry of Religious Affairs",
				"Read Surah Fatiha with Indonesian translation by Muhammad Quraish Shihab et al.",
				"Read Surah Fatiha with Indonesian translation by Jalal ad-Din al-Mahalli and Jalal ad-Din as-Suyuti",
				"Read Surah Fatiha with Italian translation by Hamza Roberto Piccardo",
				"Read Surah Fatiha with Malay translation by Abdullah Muhammad Basmeih",
				"Read Surah Fatiha with Malayalam translation by Cheriyamundam Abdul Hameed and Kunhi Mohammed Parappoor",
				"Read Surah Fatiha with Malayalam translation by Muhammad Karakunnu and Vanidas Elayavoor",
				"Read Surah Fatiha with Norwegian translation by Einar Berg",
				"Read Surah Fatiha with Pashto translation by Abdulwali Khan",
				"Read Surah Fatiha with Russian translation by Abu Adel",
				"Read Surah Fatiha with Russian translation by Ministry of Awqaf, Egypt",
				"Read Surah Fatiha with Russian translation by Elmir Kuliev",
				"Read Surah Fatiha with Sindhi translation by Taj Mehmood Amroti",
				"Read Surah Fatiha with Somali translation by Mahmud Muhammad Abduh",
				"Read Surah Fatiha with Spanish translation by Muhammad Isa García",
				"Read Surah Fatiha with Swedish translation by Knut Bernström",
				"Read Surah Fatiha with Tamil translation by Jan Turst Foundation",
				"Read Surah Fatiha with Thai translation by King Fahad Quran Complex",
				"Read Surah Fatiha with Turkish translation by Abdulbaki Golpinarli",
				"Read Surah Fatiha with Turkish translation by Alİ Bulaç",
				"Read Surah Fatiha with Turkish translation by Muhammet Abay",
				"Read Surah Fatiha with Turkish translation by Diyanet Isleri",
				"Read Surah Fatiha with Turkish translation by Suleyman Ates",
				"Read Surah Fatiha with Urdu translation by Abul A'ala Maududi",
				"Read Surah Fatiha with Urdu translation by Fateh Muhammad Jalandhry",
				"Read Surah Fatiha with Urdu translation by Muhammad Junagarhi",
				"Read Surah Fatiha with Uyghur translation by Muhammad Saleh",
				"Read Surah Fatiha with Uzbek translation by Muhammad Sodik Muhammad Yusuf"));

		for (int i = startFromTranslation; i < endToTranslation; i++) {

			WebElement translationElement = alQuranPageLocators.translationsListAlQuranPage(i + 1);

			List<WebElement> childRow = translationElement.findElements(By.className("small-12"));
			int helpCount = 0;
			for (int j = 0; j < childRow.size(); j++) {
				if (helpCount == 0) {
					String translationsTitle1 = childRow.get(j).findElement(By.tagName("a")).getText();
					Assert.assertEquals(translationsTitle1, translationTitle.get(i));
					sscrollToLocateElement(childRow.get(j).findElement(By.tagName("a")));
					// checking heading h1 on each Translations page
					Assert.assertEquals(alQuranPageLocators.h1Tag.getText(), h1HeadingToVerifyTranslation.get(i));
					((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
					implicicitwait2sec();
					clickTranslationsTab();
					helpCount++;
				} else {
					helpCount = 0;
				}
			}
		}

		System.out.println("Translations : " + surahsClickEvent);

	}

	public void clickTopicsTab() throws Exception {
		WebElement element = alQuranPageLocators.topicsTab;
		sscrollToLocateElement(element);
		implicicitwait2sec();
	}

	public void checkTopicsListAlQuranPage(int startFromTopic, int endToTopic) throws Exception {

		ArrayList<String> topicsTitleList = new ArrayList<String>(Arrays.asList("Aaron (Haroon)", "Ablution (Wudu)",
				"Abraham (Ibrahim)", "Abrogation", "Abu Lahab (Abd al-Uzza)", "Acacia flowers", "Ad", "Adam",
				"Adversity", "Aging", "Ahmad", "Al Rass", "Allah", "Alliances", "Angels", "Anger", "Ants", "Apes",
				"Apostacy", "Arguments/Attacks", "Armor", "Astronomy", "Atoms", "Azar", "Baal", "Badr", "Bakkah",
				"Beasts", "Bedouin", "Bees", "Behavior", "Belief", "Believers", "Bible", "Biology", "Birds",
				"Borders (jurisdictional boundaries)", "Botany", "Booty", "Builders", "Burial", "Business",
				"Byzantines", "Cain and Abel", "Calendar", "Canaan", "Cattle", "Captives", "Charity", "Chastity",
				"Children", "Christians", "Churches", "Clothing", "Commandments", "Communications", "Conservation",
				"Contract Law", "Corruption", "Cosmology", "Covenants", "Creation of everything", "Creatures",
				"Crystal", "Customs", "Danger", "Date palms", "Dates", "David", "Death", "Deities", "Disbelievers",
				"Disciples (of Jesus)", "Divers", "Diversity", "Divorce", "Dogs", "Donkeys", "Earth", "Earthquake",
				"Elephant", "Elijah", "Elisha", "Embryology", "Evolution", "Ezra", "Family", "Fasting", "Fig",
				"Fighting", "Fire", "Food", "Forgetting", "Friends", "Future", "Gabriel", "Games of Chance",
				"Geographic locations and History", "Ginger", "Goddesses of the pagan Arabs",
				"Gods of pre-Islamic Arabs", "Gog and Magog", "Gold", "Golden armlets", "Golden Calf", "Goliath",
				"Gospel", "Government", "Grain", "Grave", "Greetings", "Guardianship", "Hagar", "Hajj", "Haman",
				"Harut and Marut", "Health rules", "Hearing", "Heaven", "Hell (the fire, the blazing flame)", "History",
				"Homosexuality", "Honey", "Horses", "Housing", "Hud", "Humankind", "Hunayn", "Hunting",
				"Hur'in (a.k.a. Houries)", "Hydrology", "Hypocrites", "Iblis (Satan)", "Idolatry", "Idris",
				"Immorality", "Imposters", "Imran", "In sha' Allah", "Inheritance", "Intoxicants", "Iram", "Iron",
				"Isaac", "Ishmael", "Jacob (Israel)", "Jesus", "Jews", "Jihad (fighting, striving,struggling)", "Jinn",
				"Job", "John the Baptist", "Jonah", "Jordan", "Joseph", "Judgement", "Kabah", "Killing", "Knowledge",
				"Kufr (denial of the truth)", "Language", "Laws given by Allah and the Prophet", "Life", "Lion",
				"Literacy", "Litigants", "Livestock", "Locusts", "Lot", "Lote tree", "Love", "Luqman",
				"Madyan (Midian)", "Magians", "Manna", "Marriage", "Mary", "Materialism", "Mecca", "Medinah",
				"Menstruation", "Metallurgy", "Milk", "Mineralogy", "Mockery", "Monastic asceticism", "Monks", "Months",
				"Moses", "Mosque", "Mountains", "Muhammad", "Mules", "Native peoples", "Necessity",
				"Nepotism disallowed", "Night", "Noah", "Nuclear physics", "Oaths", "Old Testament", "Olive",
				"Olive trees", "Oppression", "Orphans", "Patriarchy", "Pearls", "Pen", "Persecuted", "Persecutors",
				"Pharaoh", "Piety", "Pollution", "Poets", "Pomegranates", "Prayer", "Pregnancy", "Privacy", "Prophet",
				"Psalms", "Qarun", "Quail", "Quran", "Quraysh", "Ramadhan", "Record of personal deeds", "Red Sea",
				"Refugees", "Religion", "Religious", "Resurrection", "Revelation", "Ruby", "Sabbath", "Sabians",
				"Sacrifice", "Salih", "Samaritan", "Saul", "Sea", "Sex", "Sexes", "Sheba", "Ships", "Shu'ayb", "Sight",
				"Silk", "Silver", "Sin", "Sinai Mt.", "Skin", "Sky", "Slaves", "Solomon", "Sorcery", "Spider",
				"Spouses", "Stealing", "Swine", "Synagogues", "Tabuk", "Ten Commandments", "Thamud", "Time", "Torah",
				"Treachery", "Tree", "Trees", "Trinity", "Tubba", "Twelve tribes", "Two Horned One", "Uhud", "Usury",
				"Water", "Weather", "Widows", "Wills", "Wine", "Wools", "Women", "Zachariah"));

		System.out.println("Saved   :   " + topicsTitleList.size());

		ArrayList<String> topicsAvailableAyatsList = new ArrayList<String>(Arrays.asList("20 Ayaats", "3 Ayaats",
				"49 Ayaats", "2 Ayaats", "2 Ayaats", "1 Ayat", "18 Ayaats", "19 Ayaats", "58 Ayaats", "5 Ayaats",
				"1 Ayat", "2 Ayaats", "23 Ayaats", "7 Ayaats", "39 Ayaats", "1 Ayat", "1 Ayat", "3 Ayaats", "19 Ayaats",
				"2 Ayaats", "1 Ayat", "25 Ayaats", "4 Ayaats", "1 Ayat", "1 Ayat", "1 Ayat", "1 Ayat", "7 Ayaats",
				"6 Ayaats", "1 Ayat", "12 Ayaats", "3 Ayaats", "4 Ayaats", "5 Ayaats", "4 Ayaats", "9 Ayaats", "1 Ayat",
				"3 Ayaats", "5 Ayaats", "1 Ayat", "1 Ayat", "2 Ayaats", "1 Ayat", "1 Ayat", "2 Ayaats", "1 Ayat",
				"6 Ayaats", "2 Ayaats", "55 Ayaats", "3 Ayaats", "33 Ayaats", "14 Ayaats", "1 Ayat", "5 Ayaats",
				"39 Ayaats", "3 Ayaats", "2 Ayaats", "7 Ayaats", "3 Ayaats", "3 Ayaats", "6 Ayaats", "4 Ayaats",
				"3 Ayaats", "1 Ayat", "4 Ayaats", "1 Ayat", "6 Ayaats", "1 Ayat", "15 Ayaats", "27 Ayaats", "1 Ayat",
				"16 Ayaats", "2 Ayaats", "1 Ayat", "3 Ayaats", "13 Ayaats", "1 Ayat", "2 Ayaats", "17 Ayaats",
				"12 Ayaats", "1 Ayat", "2 Ayaats", "2 Ayaats", "5 Ayaats", "2 Ayaats", "1 Ayat", "1 Ayat", "5 Ayaats",
				"1 Ayat", "17 Ayaats", "2 Ayaats", "15 Ayaats", "3 Ayaats", "10 Ayaats", "5 Ayaats", "2 Ayaats",
				"3 Ayaats", "2 Ayaats", "1 Ayat", "3 Ayaats", "1 Ayat", "1 Ayat", "4 Ayaats", "1 Ayat", "8 Ayaats",
				"2 Ayaats", "11 Ayat", "2 Ayaats", "2 Ayaats", "12 Ayaats", "1 Ayat", "5 Ayaats", "1 Ayat", "12 Ayaats",
				"6 Ayaats", "1 Ayat", "12 Ayaats", "1 Ayat", "27 Ayaats", "200 Ayaats", "3 Ayaats", "3 Ayaats",
				"2 Ayaats", "2 Ayaats", "1 Ayat", "5 Ayaats", "25 Ayaats", "1 Ayat", "1 Ayat", "4 Ayaats", "4 Ayaats",
				"7 Ayaats", "62 Ayaats", "2 Ayaats", "2 Ayaats", "2 Ayaats", "2 Ayaats", "1 Ayat", "1 Ayat", "7 Ayaats",
				"5 Ayaats", "1 Ayat", "1 Ayat", "13 Ayaats", "10 Ayaats", "11 Ayat", "23 Ayaats", "15 Ayaats",
				"24 Ayaats", "32 Ayaats", "4 Ayaats", "5 Ayaats", "6 Ayaats", "5 Ayaats", "6 Ayaats", "135 Ayaats",
				"12 Ayaats", "22 Ayaats", "7 Ayaats", "14 Ayaats", "1 Ayat", "1 Ayat", "17 Ayaats", "1 Ayat", "1 Ayat",
				"1 Ayat", "1 Ayat", "2 Ayaats", "17 Ayaats", "3 Ayaats", "6 Ayat", "1 Ayat", "13 Ayaats", "1 Ayat",
				"2 Ayaats", "18 Ayaats", "23 Ayaats", "29 Ayaats", "5 Ayaats", "4 Ayaats", "1 Ayat", "4 Ayaats",
				"2 Ayaats", "2 Ayaats", "2 Ayaats", "1 Ayat", "3 Ayaats", "2 Ayaats", "57 Ayaats", "2 Ayaats",
				"19 Ayaats", "15 Ayaats", "1 Ayat", "2 Ayaats", "2 Ayaats", "1 Ayat", "1 Ayat", "47 Ayaats", "2 Ayaats",
				"6 Ayaats", "1 Ayat", "1 Ayat", "1 Ayat", "6 Ayaats", "7 Ayaats", "1 Ayat", "6 Ayaats", "2 Ayaats",
				"3 Ayaats", "1 Ayat", "39 Ayaats", "1 Ayat", "1 Ayat", "4 Ayaats", "1 Ayat", "31 Ayat", "8 Ayaats",
				"5 Ayaats", "12 Ayaats", "2 Ayaats", "3 Ayaats", "1 Ayat", "68 Ayaats", "1 Ayat", "2 Ayaats",
				"4 Ayaats", "3 Ayaats", "1 Ayat", "18 Ayaats", "4 Ayaats", "118 Ayaats", "23 Ayaats", "1 Ayat",
				"5 Ayaats", "3 Ayaats", "1 Ayat", "5 Ayaats", "3 Ayaats", "2 Ayaats", "33 Ayaats", "9 Ayaats",
				"26 Ayaats", "2 Ayaats", "20 Ayaats", "4 Ayaats", "1 Ayat", "4 Ayaats", "3 Ayaats", "3 Ayaats",
				"4 Ayaats", "2 Ayaats", "2 Ayaats", "15 Ayaats", "10 Ayaats", "1 Ayat", "1 Ayat", "1 Ayat", "2 Ayaats",
				"1 Ayat", "1 Ayat", "1 Ayat", "2 Ayaats", "34 Ayaats", "1 Ayat", "13 Ayaats", "1 Ayat", "4 Ayaats",
				"7 Ayaats", "2 Ayaats", "2 Ayaats", "2 Ayaats", "1 Ayat", "4 Ayaats", "6 Ayaats", "11 Ayat",
				"80 Ayaats", "2 Ayaats", "4 Ayaats", "2 Ayaats", "1 Ayat", "7 Ayaats", "13 Ayaats"));

		ArrayList<String> topicsh1HeadingList = new ArrayList<String>(Arrays.asList(
				"Read Quranic Verses about Aaron (Haroon)", "Read Quranic Verses about Ablution (Wudu)",
				"Read Quranic Verses about Abraham (Ibrahim)", "Read Quranic Verses about Abrogation",
				"Read Quranic Verses about Abu Lahab (Abd al-Uzza)", "Read Quranic Verses about Acacia flowers",
				"Read Quranic Verses about Ad", "Read Quranic Verses about Adam", "Read Quranic Verses about Adversity",
				"Read Quranic Verses about Aging", "Read Quranic Verses about Ahmad",
				"Read Quranic Verses about Al Rass", "Read Quranic Verses about Allah",
				"Read Quranic Verses about Alliances", "Read Quranic Verses about Angels",
				"Read Quranic Verses about Anger", "Read Quranic Verses about Ants", "Read Quranic Verses about Apes",
				"Read Quranic Verses about Apostacy", "Read Quranic Verses about Arguments/Attacks",
				"Read Quranic Verses about Armor", "Read Quranic Verses about Astronomy",
				"Read Quranic Verses about Atoms", "Read Quranic Verses about Azar", "Read Quranic Verses about Baal",
				"Read Quranic Verses about Badr", "Read Quranic Verses about Bakkah",
				"Read Quranic Verses about Beasts", "Read Quranic Verses about Bedouin",
				"Read Quranic Verses about Bees", "Read Quranic Verses about Behavior",
				"Read Quranic Verses about Belief", "Read Quranic Verses about Believers",
				"Read Quranic Verses about Bible", "Read Quranic Verses about Biology",
				"Read Quranic Verses about Birds", "Read Quranic Verses about Borders (jurisdictional boundaries)",
				"Read Quranic Verses about Botany", "Read Quranic Verses about Booty",
				"Read Quranic Verses about Builders", "Read Quranic Verses about Burial",
				"Read Quranic Verses about Business", "Read Quranic Verses about Byzantines",
				"Read Quranic Verses about Cain and Abel", "Read Quranic Verses about Calendar",
				"Read Quranic Verses about Canaan", "Read Quranic Verses about Cattle",
				"Read Quranic Verses about Captives", "Read Quranic Verses about Charity",
				"Read Quranic Verses about Chastity", "Read Quranic Verses about Children",
				"Read Quranic Verses about Christians", "Read Quranic Verses about Churches",
				"Read Quranic Verses about Clothing", "Read Quranic Verses about Commandments",
				"Read Quranic Verses about Communications", "Read Quranic Verses about Conservation",
				"Read Quranic Verses about Contract Law", "Read Quranic Verses about Corruption",
				"Read Quranic Verses about Cosmology", "Read Quranic Verses about Covenants",
				"Read Quranic Verses about Creation of everything", "Read Quranic Verses about Creatures",
				"Read Quranic Verses about Crystal", "Read Quranic Verses about Customs",
				"Read Quranic Verses about Danger", "Read Quranic Verses about Date palms",
				"Read Quranic Verses about Dates", "Read Quranic Verses about David", "Read Quranic Verses about Death",
				"Read Quranic Verses about Deities", "Read Quranic Verses about Disbelievers",
				"Read Quranic Verses about Disciples (of Jesus)", "Read Quranic Verses about Divers",
				"Read Quranic Verses about Diversity", "Read Quranic Verses about Divorce",
				"Read Quranic Verses about Dogs", "Read Quranic Verses about Donkeys",
				"Read Quranic Verses about Earth", "Read Quranic Verses about Earthquake",
				"Read Quranic Verses about Elephant", "Read Quranic Verses about Elijah",
				"Read Quranic Verses about Elisha", "Read Quranic Verses about Embryology",
				"Read Quranic Verses about Evolution", "Read Quranic Verses about Ezra",
				"Read Quranic Verses about Family", "Read Quranic Verses about Fasting",
				"Read Quranic Verses about Fig", "Read Quranic Verses about Fighting", "Read Quranic Verses about Fire",
				"Read Quranic Verses about Food", "Read Quranic Verses about Forgetting",
				"Read Quranic Verses about Friends", "Read Quranic Verses about Future",
				"Read Quranic Verses about Gabriel", "Read Quranic Verses about Games of Chance",
				"Read Quranic Verses about Geographic locations and History", "Read Quranic Verses about Ginger",
				"Read Quranic Verses about Goddesses of the pagan Arabs",
				"Read Quranic Verses about Gods of pre-Islamic Arabs", "Read Quranic Verses about Gog and Magog",
				"Read Quranic Verses about Gold", "Read Quranic Verses about Golden armlets",
				"Read Quranic Verses about Golden Calf", "Read Quranic Verses about Goliath",
				"Read Quranic Verses about Gospel", "Read Quranic Verses about Government",
				"Read Quranic Verses about Grain", "Read Quranic Verses about Grave",
				"Read Quranic Verses about Greetings", "Read Quranic Verses about Guardianship",
				"Read Quranic Verses about Hagar", "Read Quranic Verses about Hajj", "Read Quranic Verses about Haman",
				"Read Quranic Verses about Harut and Marut", "Read Quranic Verses about Health rules",
				"Read Quranic Verses about Hearing", "Read Quranic Verses about Heaven",
				"Read Quranic Verses about Hell (the fire, the blazing flame)", "Read Quranic Verses about History",
				"Read Quranic Verses about Homosexuality", "Read Quranic Verses about Honey",
				"Read Quranic Verses about Horses", "Read Quranic Verses about Housing",
				"Read Quranic Verses about Hud", "Read Quranic Verses about Humankind",
				"Read Quranic Verses about Hunayn", "Read Quranic Verses about Hunting",
				"Read Quranic Verses about Hur'in (a.k.a. Houries)", "Read Quranic Verses about Hydrology",
				"Read Quranic Verses about Hypocrites", "Read Quranic Verses about Iblis (Satan)",
				"Read Quranic Verses about Idolatry", "Read Quranic Verses about Idris",
				"Read Quranic Verses about Immorality", "Read Quranic Verses about Imposters",
				"Read Quranic Verses about Imran", "Read Quranic Verses about In sha' Allah",
				"Read Quranic Verses about Inheritance", "Read Quranic Verses about Intoxicants",
				"Read Quranic Verses about Iram", "Read Quranic Verses about Iron", "Read Quranic Verses about Isaac",
				"Read Quranic Verses about Ishmael", "Read Quranic Verses about Jacob (Israel)",
				"Read Quranic Verses about Jesus", "Read Quranic Verses about Jews",
				"Read Quranic Verses about Jihad (fighting, striving, struggling)", "Read Quranic Verses about Jinn",
				"Read Quranic Verses about Job", "Read Quranic Verses about John the Baptist",
				"Read Quranic Verses about Jonah", "Read Quranic Verses about Jordan",
				"Read Quranic Verses about Joseph", "Read Quranic Verses about Judgement",
				"Read Quranic Verses about Kabah", "Read Quranic Verses about Killing",
				"Read Quranic Verses about Knowledge", "Read Quranic Verses about Kufr (denial of the truth)",
				"Read Quranic Verses about Language", "Read Quranic Verses about Laws given by Allah and the Prophet",
				"Read Quranic Verses about Life", "Read Quranic Verses about Lion",
				"Read Quranic Verses about Literacy", "Read Quranic Verses about Litigants",
				"Read Quranic Verses about Livestock", "Read Quranic Verses about Locusts",
				"Read Quranic Verses about Lot", "Read Quranic Verses about Lote tree",
				"Read Quranic Verses about Love", "Read Quranic Verses about Luqman",
				"Read Quranic Verses about Madyan (Midian)", "Read Quranic Verses about Magians",
				"Read Quranic Verses about Manna", "Read Quranic Verses about Marriage",
				"Read Quranic Verses about Mary", "Read Quranic Verses about Materialism",
				"Read Quranic Verses about Mecca", "Read Quranic Verses about Medinah",
				"Read Quranic Verses about Menstruation", "Read Quranic Verses about Metallurgy",
				"Read Quranic Verses about Milk", "Read Quranic Verses about Mineralogy",
				"Read Quranic Verses about Mockery", "Read Quranic Verses about Monastic asceticism",
				"Read Quranic Verses about Monks", "Read Quranic Verses about Months",
				"Read Quranic Verses about Moses", "Read Quranic Verses about Mosque",
				"Read Quranic Verses about Mountains", "Read Quranic Verses about Muhammad",
				"Read Quranic Verses about Mules", "Read Quranic Verses about Native peoples",
				"Read Quranic Verses about Necessity", "Read Quranic Verses about Nepotism disallowed",
				"Read Quranic Verses about Night", "Read Quranic Verses about Noah",
				"Read Quranic Verses about Nuclear physics", "Read Quranic Verses about Oaths",
				"Read Quranic Verses about Old Testament", "Read Quranic Verses about Olive",
				"Read Quranic Verses about Olive trees", "Read Quranic Verses about Oppression",
				"Read Quranic Verses about Orphans", "Read Quranic Verses about Patriarchy",
				"Read Quranic Verses about Pearls", "Read Quranic Verses about Pen",
				"Read Quranic Verses about Persecuted", "Read Quranic Verses about Persecutors",
				"Read Quranic Verses about Pharaoh", "Read Quranic Verses about Piety",
				"Read Quranic Verses about Pollution", "Read Quranic Verses about Poets",
				"Read Quranic Verses about Pomegranates", "Read Quranic Verses about Prayer",
				"Read Quranic Verses about Pregnancy", "Read Quranic Verses about Privacy",
				"Read Quranic Verses about Prophet", "Read Quranic Verses about Psalms",
				"Read Quranic Verses about Qarun", "Read Quranic Verses about Quail", "Read Quranic Verses about Quran",
				"Read Quranic Verses about Quraysh", "Read Quranic Verses about Ramadhan",
				"Read Quranic Verses about Record of personal deeds", "Read Quranic Verses about Red Sea",
				"Read Quranic Verses about Refugees", "Read Quranic Verses about Religion",
				"Read Quranic Verses about Religious", "Read Quranic Verses about Resurrection",
				"Read Quranic Verses about Revelation", "Read Quranic Verses about Ruby",
				"Read Quranic Verses about Sabbath", "Read Quranic Verses about Sabians",
				"Read Quranic Verses about Sacrifice", "Read Quranic Verses about Salih",
				"Read Quranic Verses about Samaritan", "Read Quranic Verses about Saul",
				"Read Quranic Verses about Sea", "Read Quranic Verses about Sex", "Read Quranic Verses about Sexes",
				"Read Quranic Verses about Sheba", "Read Quranic Verses about Ships",
				"Read Quranic Verses about Shu'ayb", "Read Quranic Verses about Sight",
				"Read Quranic Verses about Silk", "Read Quranic Verses about Silver", "Read Quranic Verses about Sin",
				"Read Quranic Verses about Sinai Mt.", "Read Quranic Verses about Skin",
				"Read Quranic Verses about Sky", "Read Quranic Verses about Slaves",
				"Read Quranic Verses about Solomon", "Read Quranic Verses about Sorcery",
				"Read Quranic Verses about Spider", "Read Quranic Verses about Spouses",
				"Read Quranic Verses about Stealing", "Read Quranic Verses about Swine",
				"Read Quranic Verses about Synagogues", "Read Quranic Verses about Tabuk",
				"Read Quranic Verses about Ten Commandments", "Read Quranic Verses about Thamud",
				"Read Quranic Verses about Time", "Read Quranic Verses about Torah",
				"Read Quranic Verses about Treachery", "Read Quranic Verses about Tree",
				"Read Quranic Verses about Trees", "Read Quranic Verses about Trinity",
				"Read Quranic Verses about Tubba", "Read Quranic Verses about Twelve tribes",
				"Read Quranic Verses about Two Horned One", "Read Quranic Verses about Uhud",
				"Read Quranic Verses about Usury", "Read Quranic Verses about Water",
				"Read Quranic Verses about Weather", "Read Quranic Verses about Widows",
				"Read Quranic Verses about Wills", "Read Quranic Verses about Wine", "Read Quranic Verses about Wools",
				"Read Quranic Verses about Women", "Read Quranic Verses about Zachariah"));

		surahsClickEvent = new ArrayList<String>();

		for (int i = startFromTopic; i < endToTopic; i++) {

			WebElement topicElement = alQuranPageLocators.topicsListAlQuranPage(i + 1);

			List<WebElement> childRow = topicElement.findElements(By.className("small-12"));

			int helpcount = 0;
			for (int j = 0; j < childRow.size(); j++) {
				if (helpcount == 0) {
					String topicsTitle = childRow.get(j).findElement(By.tagName("a")).getText();
					Assert.assertEquals(topicsTitle, topicsTitleList.get(i));

					helpcount++;
				} else {
					String topicsAvailableAyats = childRow.get(j).findElement(By.tagName("p")).getText();
					Assert.assertEquals(topicsAvailableAyats, topicsAvailableAyatsList.get(i));
					sscrollToLocateElement(childRow.get(j).findElement(By.tagName("p")));
					// checking heading h1 on each Topics page
					Assert.assertEquals(alQuranPageLocators.h1Tag.getText(), topicsh1HeadingList.get(i));
					((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
					implicicitwait2sec();
					clickTopicsTab();
					helpcount = 0;
				}
			}
		}

	}

	private void checkSurahClick(WebElement findElement) throws Exception {
		scrollToLocateElement(findElement);
		WebElement element = driver.findElement(By.tagName("h1"));

		surahsClickEvent.add('"' + element.getText() + '"');
		System.out.println(surahsClickEvent);
		((JavascriptExecutor) driver).executeScript("window.history.go(-1)");
		implicicitwait2sec();
		clickTopicsTab();
	}

	private void sscrollToLocateElement(WebElement element) throws Exception {
		implicicitwait2sec();
		System.out.println(element.getText());
		((JavascriptExecutor) driver).executeScript(
				"arguments[0].scrollIntoView({behavior: 'instant', block: 'end', inline: 'nearest'})", element);
		element.click();
		implicicitwait2sec();

	}

}