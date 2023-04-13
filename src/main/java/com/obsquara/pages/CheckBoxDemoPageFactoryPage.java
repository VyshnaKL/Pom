package com.obsquara.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class CheckBoxDemoPageFactoryPage {
	public WebDriver driver;

	public CheckBoxDemoPageFactoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='gridCheck']")
	WebElement checkBoxClick;

	@FindBy(xpath = "//div[@id='message-one']")
	WebElement checkBoxResponse;

	public void clickCheckBox() {
		PageUtility.clickOnElement(checkBoxClick);
	}

	public String checkBoxResponse() {
		String actualResponse = PageUtility.getElementText(checkBoxResponse);
		return actualResponse;
	}

	public boolean isCheckBoxResponseEnabled() {
		return PageUtility.isEnabled(checkBoxResponse);

	}
}
