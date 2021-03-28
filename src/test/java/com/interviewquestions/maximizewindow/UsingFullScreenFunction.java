package com.interviewquestions.maximizewindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingFullScreenFunction {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Navigate to a website
		driver.get("https://www.myautomationlab.com/");

		// Maximize current window using "fullscreen" function
		driver.manage().window().fullscreen();

		Thread.sleep(3000);

		// Close the browser
		driver.quit();
	}

}
