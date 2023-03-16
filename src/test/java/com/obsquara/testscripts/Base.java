package com.obsquara.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base {
	public WebDriver driver;

	@BeforeMethod
	public void intialisebrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}

	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}

}
