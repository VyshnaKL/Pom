package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v102.page.Page;

import Utilities.PageUtility;

public class SimpleInputFormDemoPages {
	WebDriver driver;

	public SimpleInputFormDemoPages(WebDriver driver) {
		this.driver = driver;

	}

	By singleInputFieldTextBox = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By singleInputTextMessage = By.cssSelector("div[id=message-one]");
	By twoInputFieldValueA = By.xpath("//input[@id='value-a']");
	By twoInputFieldValueB = By.xpath("//input[@id='value-b']");
	By twoInputGetTotal = By.xpath("//button[@id='button-two']");
	By twoInputResponse = By.cssSelector("div#message-two");

	public WebElement singleInputFieldTextBoxElement() {
		WebElement SingleInputFieldTextBoxElement = driver.findElement(singleInputFieldTextBox);
		return SingleInputFieldTextBoxElement;

	}

	public WebElement showMessageButtonElement() {
		WebElement ShowMessageButtonElement = driver.findElement(showMessageButton);
		return ShowMessageButtonElement;

	}

	public WebElement singleInputTextMessageElement() {
		WebElement SingleInputTextMessageElement = driver.findElement(singleInputTextMessage);
		return SingleInputTextMessageElement;
	}

	public WebElement showMessageFontColorElement() {
		WebElement ShowMessageFontColorElement = driver.findElement(showMessageButton);
		return ShowMessageFontColorElement;

	}

	public WebElement twoInputFieldValueAElement() {
		WebElement TwoInputFieldValueAElement = driver.findElement(twoInputFieldValueA);
		return TwoInputFieldValueAElement;

	}

	public WebElement twoInputFieldValueBElement() {
		WebElement TwoInputFieldValueBElement = driver.findElement(twoInputFieldValueB);
		return TwoInputFieldValueBElement;

	}
	
	public WebElement twoInputGetTotalElement() {
		WebElement twoInputGetTotalElement = driver.findElement(twoInputGetTotal);
		return twoInputGetTotalElement;
	}
	
	public WebElement twoInputResponseElement() {
		WebElement twoInputResponseElement = driver.findElement(twoInputResponse);
		return twoInputResponseElement;
	}
	
	public String twoInputResponseGetText() {
		return PageUtility.getElementText(twoInputResponseElement());
	}
	
	public void clickGetTotalButton() {
		PageUtility.clickOnElement(twoInputGetTotalElement());
	}

	public WebElement enterValueInSingleInputField(String input) {
		// singleInputFieldTextBoxElement().sendKeys(input);
		return PageUtility.enterText(singleInputFieldTextBoxElement(), input);
	}
	public WebElement enterValueA(String input) {
		
		
		return PageUtility.enterText(twoInputFieldValueBElement(), input);
	}
	public WebElement enterValueB(String input) {
		
		return PageUtility.enterText(twoInputFieldValueBElement(), input);
	}
	

	public void clickShowMessageButton() {
		// showMessageButtonElement().click();
		PageUtility.clickOnElement(showMessageButtonElement());

	}

	public String displaysingleInputTextMessage() {
		// String actualInputMessage = singleInputTextMessageElement().getText();
		String actualInputMessage = PageUtility.getElementText(singleInputTextMessageElement());
		return actualInputMessage;

	}

	public boolean showMessageButtonisEnabled() {
		// return showMessageButtonElement().isEnabled();
		return PageUtility.isElementEnabled(showMessageButtonElement());
	}

	public String showMessageFontColor() {
		// String expectedFontcolor =
		// showMessageFontColorElement().getCssValue("color");
		String expectedFontcolor = PageUtility.getElementFontColor(showMessageFontColorElement(), "color");
		return expectedFontcolor;
	}

	public String displayValueBoxA() {
		// String actualInputMessage= twoInputFieldValueAElement().getText();
		String actualInputMessage = PageUtility.getElementText(twoInputFieldValueAElement());
		return actualInputMessage;

	}

	public String displayValueBoxB() {
		// String actualInputMessage= twoInputFieldValueBElement().getText();
		String actualInputMessage = PageUtility.getElementText(twoInputFieldValueBElement());
		return actualInputMessage;

	}

	
	
	

}
