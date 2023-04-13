package com.obsquara.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.ExcelUtility;
import Utilities.PageUtility;

public class SingleinputFormPageFactoryPage {

	public WebDriver driver;

	public SingleinputFormPageFactoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='single-input-field']")
	WebElement singleInputFieldTextBoxElement;

	@FindBy(xpath = "//button[@id='button-one']")
	WebElement showMessageButton;

	@FindBy(xpath = "//button[@id='button-two']")
	WebElement twoInputGetTotal;

	@FindBy(xpath = "//input[@id='value-a']")
	WebElement twoInputFieldValueA;

	@FindBy(xpath = "//input[@id='value-b']")
	WebElement twoInputFieldValueB;

	@FindBy(xpath = "//div[@id='message-two']")
	WebElement twoInputResponse;

	public WebElement enterValueInSingleInputField(String input) {

		return PageUtility.enterText(singleInputFieldTextBoxElement, input);
	}

	public void clickShowMessageButton() {

		PageUtility.clickOnElement(showMessageButton);

	}

	public boolean showMessageButtonisEnabled() {

		return PageUtility.isElementEnabled(showMessageButton);
	}

	public void clickGetTotalButton() {
		PageUtility.clickOnElement(twoInputGetTotal);
	}

	
	public String twoInputResponseGetText() {
		return PageUtility.getElementText(twoInputResponse);
	}

	public String displayValueBoxA() {

		String actualInputMessage = PageUtility.getElementText(twoInputFieldValueA);
		return actualInputMessage;

	}

	public String displayValueBoxB() {

		String actualInputMessage = PageUtility.getElementText(twoInputFieldValueB);
		return actualInputMessage;

	}
	public WebElement enterValueA(String input) {
	
		return PageUtility.enterText(twoInputFieldValueA, input);
	}
	public WebElement enterValueB(String input) {
		
		return PageUtility.enterText(twoInputFieldValueB, input);
	}
}
