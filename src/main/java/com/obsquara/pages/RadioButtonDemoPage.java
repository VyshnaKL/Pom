package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonDemoPage {
	WebDriver driver;

	public RadioButtonDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	By femaleRadioButton = By.xpath("//input[@id='inlineRadio2']");
	By maleRadioButton = By.xpath("//input[@id='inlineRadio1']");
	By showSelectedValueBox = By.xpath("//button[@id='button-one']");
	By showSelectedValueMessage = By.xpath("//div[@id='message-one']");

	public WebElement femaleRadioButtonElement() {
		WebElement FemaleRadioButtonElement = driver.findElement(femaleRadioButton);
		return FemaleRadioButtonElement;

	}

	public WebElement maleRadioButtonElement() {
		WebElement MaleRadioButtonElement = driver.findElement(maleRadioButton);
		return MaleRadioButtonElement;
	}

	public WebElement showSelectedValueBoxElement() {
		WebElement ShowSelectedValueBoxElement = driver.findElement(showSelectedValueBox);
		return ShowSelectedValueBoxElement;

	}

	public WebElement showSelectedValueMessageElement() {
		WebElement ShowSelectedValueMessageElement = driver.findElement(showSelectedValueMessage);
		return ShowSelectedValueMessageElement;
	}

	public void clickFemaleRadioButton() {
		femaleRadioButtonElement().click();

	}

	public void clickeMaleRadioButton() {
		maleRadioButtonElement().click();
	}

	public void clickShowSelectedValueBox() {
		showSelectedValueBoxElement().click();
	}

	public boolean maleCheckBoxisSelected() {
		return maleRadioButtonElement().isSelected();
	}

	public boolean femaleCheckBoxisSelected() {
		return femaleRadioButtonElement().isSelected();
	}

	public String showSelectedValueMessage() {
		String actualInputMessage = showSelectedValueMessageElement().getText();
		return actualInputMessage;

	}
}
