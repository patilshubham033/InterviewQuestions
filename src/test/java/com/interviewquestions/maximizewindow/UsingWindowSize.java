package com.interviewquestions.maximizewindow;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingWindowSize {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Maximize current window by setting windows size
		Dimension dim = new Dimension(1280, 860);
		driver.manage().window().setSize(dim);

		// Navigate to a website
		driver.get("https://www.myautomationlab.com/");

		// Close the browser
		driver.quit();

	}

}
