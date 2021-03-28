package com.interviewquestions.maximizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingChromeOptionsStartFullscreen {

	public static void main(String[] args) {

		// Maximize current window using ChromeOptions "--start-fullscreen"
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-fullscreen");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Navigate to a website
		driver.get("https://www.myautomationlab.com/");

		// Close the browser
		driver.quit();

	}

}
