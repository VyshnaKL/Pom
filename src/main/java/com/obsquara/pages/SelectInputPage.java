package com.obsquara.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.PageUtility;

public class SelectInputPage {
	WebDriver driver;

	public SelectInputPage(WebDriver driver) {
		this.driver = driver;
	}

	By selectColorDropDown = By.xpath("//select[@id='single-input-field']");
	By selectColorTextField = By.xpath("//div[@id='message-one']");
	By multiSelectColor = By.xpath("//select[@id='multi-select-field']");
	By getAllSelectButton = By.xpath("//button[@id='button-all']");

	public WebElement selectColorDropDownElement() {
		WebElement SelectColorDropDownElement = driver.findElement(selectColorDropDown);
		return SelectColorDropDownElement;

	}

	public WebElement selectColorTextFieldElement() {
		WebElement SelectColorTextFieldElement = driver.findElement(selectColorTextField);
		return SelectColorTextFieldElement;
	}
	public WebElement multiSelectColorElement() {
		WebElement MultiSelectColorElement= driver.findElement(multiSelectColor);
		return MultiSelectColorElement;
	}
	public WebElement  getAllSelectButtonElement() {
		WebElement GetAllSelectButtonElement= driver.findElement(getAllSelectButton);
		return GetAllSelectButtonElement;
	}
	public String getTextofSelectedColorTextFieldElement() {
		// String actualdisplayedColor = selectColorTextFieldElement().getText();
		String actualdisplayedColor = PageUtility.getElementText(selectColorTextFieldElement());
		return actualdisplayedColor;
	}
	public void  clickGetAllSelectedElement() {
		PageUtility.clickOnElement(getAllSelectButtonElement());
	}
	

}
