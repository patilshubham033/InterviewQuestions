package com.interviewquestions.maximizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingMaximizeFunction {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize current window
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://www.myautomationlab.com/");

		// Close the browser
		driver.quit();

	}

}
