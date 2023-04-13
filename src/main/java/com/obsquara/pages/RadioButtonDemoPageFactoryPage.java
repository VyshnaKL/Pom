package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class RadioButtonDemoPageFactoryPage {
	public WebDriver driver;

	public RadioButtonDemoPageFactoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='inlineRadio2']")
	WebElement femaleRadioButton;

	@FindBy(xpath = "//input[@id='inlineRadio1']")
	WebElement maleRadioButton;

	@FindBy(xpath = "//button[@id='button-one']")
	WebElement showSelectedValueBox;

	@FindBy(xpath = "//div[@id='message-one']")
	WebElement showSelectedValueMessage;

	@FindBy(xpath = "//input[@id='inlineRadio11']")
	WebElement malePatientButton;

	@FindBy(xpath = "//input[@id='inlineRadio21']")
	WebElement femalePatientButton;

	@FindBy(xpath = "//button[@id='button-two']")
	WebElement getResultsBox;

	@FindBy(xpath = "//input[@id='inlineRadio22']")
	WebElement onetoEighteenAgeGroup;

	public void clickFemaleRadioButton() {
		PageUtility.clickOnElement(femaleRadioButton);

	}

	public void clickMaleRadioButton() {
		PageUtility.clickOnElement(maleRadioButton);

	}

	public boolean maleCheckBoxisSelected() {
		return PageUtility.isSelected(maleRadioButton);
	}

	public boolean femaleCheckBoxisSelected() {
		return PageUtility.isSelected(femaleRadioButton);
	}

	public void clickShowSelectedValueBox() {

		PageUtility.clickOnElement(showSelectedValueBox);
	}

	public String showSelectedValueMessage() {
		String actualInputMessage = PageUtility.getElementText(showSelectedValueMessage);
		return actualInputMessage;

	}
	
	public void clickFemalePatientButton() {
		
		PageUtility.clickOnElement(femalePatientButton);
	}

	public void clickMalePatientButton() {
		
		PageUtility.clickOnElement(malePatientButton);
	}

	public void clickGetResultsBox() {
	
		PageUtility.clickOnElement(getResultsBox);
	}
	
	public void clickonetoEighteenAgeGroup() {
		
		PageUtility.clickOnElement(onetoEighteenAgeGroup);
	}
	
	
	public boolean onetoEighteenAgeGroupisSelected() {
		
		return PageUtility.isSelected(onetoEighteenAgeGroup);
	}
	
	public String showGetResultFieldText() {
		String actualInputMessage = PageUtility.getElementText(getResultsBox);
		return actualInputMessage;
	}
	public boolean femalePatientButtonisSelected() {
		
		return PageUtility.isSelected(femalePatientButton);

	}

	public boolean malePatientButtonisSelected() {
		
		return PageUtility.isSelected(malePatientButton);
	}
}
