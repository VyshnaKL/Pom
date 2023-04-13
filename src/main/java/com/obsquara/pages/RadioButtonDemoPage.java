package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.PageUtility;

public class RadioButtonDemoPage {
	WebDriver driver;

	public RadioButtonDemoPage(WebDriver driver) {
		this.driver = driver;
	}

	By femaleRadioButton = By.xpath("//input[@id='inlineRadio2']");
	By maleRadioButton = By.xpath("//input[@id='inlineRadio1']");
	By showSelectedValueBox = By.xpath("//button[@id='button-one']");
	By showSelectedValueMessage = By.xpath("//div[@id='message-one']");
	By malePatientButton = By.xpath("//input[@id='inlineRadio11']");
	By femalePatientButton = By.xpath("//input[@id='inlineRadio21']");
	By getResultsBox = By.xpath("//button[@id='button-two']");
	By getResultFieldText = By.xpath("//div[@id='message-two']");
	By  onetoEighteenAgeGroup= By.xpath("//input[@id='inlineRadio22']");
	public WebElement femaleRadioButtonElement() {
		WebElement femaleRadioButtonElement = driver.findElement(femaleRadioButton);
		return femaleRadioButtonElement;

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

	public WebElement femalePatientButtonElement() {
		WebElement femalePatientButtonElement = driver.findElement(femalePatientButton);
		return femalePatientButtonElement;

	}

	public WebElement malePatientButtonElement() {
		WebElement MalePatientButtonElement = driver.findElement(malePatientButton);
		return MalePatientButtonElement;

	}

	public WebElement getResultsBoxElement() {
		WebElement GetResultsBoxElement = driver.findElement(getResultsBox);
		return GetResultsBoxElement;
	}

	public WebElement getResultFieldTextElement() {
		WebElement GetResultFieldTextElement = driver.findElement(getResultFieldText);
		return GetResultFieldTextElement;
	}
	public WebElement onetoEighteenAgeGroupElement() {
		WebElement OnetoEighteenAgeGroupElement= driver.findElement(onetoEighteenAgeGroup);
		return OnetoEighteenAgeGroupElement;
	}
	public void clickonetoEighteenAgeGroup() {
		//onetoEighteenAgeGroupElement().click();
		PageUtility.clickOnElement(onetoEighteenAgeGroupElement());
	}
	
	public boolean onetoEighteenAgeGroupisSelected() {
		//return onetoEighteenAgeGroupElement().isSelected();
		return PageUtility.isSelected(onetoEighteenAgeGroupElement());
	}
	public void clickFemaleRadioButton() {
		// femaleRadioButtonElement().click();
		PageUtility.clickOnElement(femaleRadioButtonElement());

	}

	public void clickeMaleRadioButton() {
		// maleRadioButtonElement().click();
		PageUtility.clickOnElement(maleRadioButtonElement());
	}

	public void clickShowSelectedValueBox() {
		// showSelectedValueBoxElement().click();
		PageUtility.clickOnElement(showSelectedValueBoxElement());
	}

	public boolean maleCheckBoxisSelected() {
		// return maleRadioButtonElement().isSelected();
		return PageUtility.isSelected(maleRadioButtonElement());
	}

	public boolean femaleCheckBoxisSelected() {
		// return femaleRadioButtonElement().isSelected();
		return PageUtility.isSelected(femaleRadioButtonElement());
	}

	public String showSelectedValueMessage() {
		String actualInputMessage = PageUtility.getElementText(showSelectedValueMessageElement());
		return actualInputMessage;

	}

	public void clickFemalePatientButton() {
		// femalePatientButtonElement().click();
		PageUtility.clickOnElement(femalePatientButtonElement());
	}

	public void clickMalePatientButton() {
		// malePatientButtonElement().click();
		PageUtility.clickOnElement(malePatientButtonElement());
	}

	public void clickGetResultsBox() {
		// getResultsBoxElement().click();
		PageUtility.clickOnElement(getResultsBoxElement());
	}

	public boolean femalePatientButtonisSelected() {
		// return femalePatientButtonElement().isSelected();
		return PageUtility.isSelected(femalePatientButtonElement());

	}

	public boolean malePatientButtonisSelected() {
		// return maleRadioButtonElement().isSelected();
		return PageUtility.isSelected(malePatientButtonElement());
	}

	public String showGetResultFieldText() {
		String actualInputMessage = PageUtility.getElementText(getResultFieldTextElement());
		return actualInputMessage;
	}
}
