package com.interviewquestions.maximizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingChromeOptionsStartMaximized {

	public static void main(String[] args) {

		ChromeOptions chromeOptions = new ChromeOptions();

		if (System.getProperty("os.name").startsWith("Windows")) {

			// To maximize window in Windows system use "--start-maximized"
			chromeOptions.addArguments("--start-maximized");
		} else {

			// To maximize window in Mac & linux system use "--kiosk"
			chromeOptions.addArguments("--kiosk");
		}

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Navigate to a website
		driver.get("https://www.myautomationlab.com/");

		// Close the browser
		driver.quit();

	}

}
