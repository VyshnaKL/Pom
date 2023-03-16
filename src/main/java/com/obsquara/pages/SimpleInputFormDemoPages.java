package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleInputFormDemoPages {
	WebDriver driver;

	public SimpleInputFormDemoPages(WebDriver driver) {
		this.driver = driver;

	}

	By singleInputFieldTextBox = By.xpath("//input[@id='single-input-field']");
	By showMessageButton = By.xpath("//button[@id='button-one']");
	By singleInputTextMessage = By.cssSelector("div[id=message-one]");

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

	public void enterValueInSingleInputField(String input) {
		singleInputFieldTextBoxElement().sendKeys(input);
	}

	public void clickShowMessageButton() {
		showMessageButtonElement().click();

	}

	public String displaysingleInputTextMessage() {
		String actualInputMessage = singleInputTextMessageElement().getText();
		return actualInputMessage;

	}
	public boolean showMessageButtonisEnabled() {
		return showMessageButtonElement().isEnabled();
	}

}
