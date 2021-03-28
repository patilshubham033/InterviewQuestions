package com.interviewquestions.maximizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingChromeOptionsWindowSize {

	public static void main(String[] args) {

		// Maximize current window using ChromeOptions "window-size"
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("window-size=1280,860");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// Navigate to a website
		driver.get("https://www.myautomationlab.com/");

		// Close the browser
		driver.quit();

	}

}
