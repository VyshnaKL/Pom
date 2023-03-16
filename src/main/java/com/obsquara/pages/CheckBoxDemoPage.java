package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxDemoPage {
	WebDriver driver;

	public CheckBoxDemoPage(WebDriver driver) {
		this.driver = driver;

	}

	By checkBoxClick = By.xpath("//input[@id='gridCheck']");
	By checkBoxResponse = By.xpath("//div[@id='message-one']");

	public WebElement responseCheckBoxDemoElement() {
		WebElement CheckBoxDemoResponseElement = driver.findElement(checkBoxResponse);
		return CheckBoxDemoResponseElement;

	}

	public WebElement clickCheckBoxDemoElement() {
		WebElement ClickCheckBoxDemoElement = driver.findElement(checkBoxClick);
		return ClickCheckBoxDemoElement;

	}

	public void clickCheckBox() {
		clickCheckBoxDemoElement().click();
	}

	public String checkBoxResponse() {
		String actualResponse = responseCheckBoxDemoElement().getText();
		return actualResponse;
	}

	public boolean isCheckBoxResponseEnabled() {

		return responseCheckBoxDemoElement().isEnabled();
	}
}
