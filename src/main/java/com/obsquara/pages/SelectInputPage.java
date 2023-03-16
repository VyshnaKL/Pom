package com.obsquara.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectInputPage {
	WebDriver driver;

	public SelectInputPage(WebDriver driver) {
		this.driver = driver;
	}

	By selectColorDropDown = By.xpath("//select[@id='single-input-field']");
	By selectColorTextField = By.xpath("//div[@id='message-one']");

	public WebElement selectColorDropDownElement() {
		WebElement SelectColorDropDownElement = driver.findElement(selectColorDropDown);
		return SelectColorDropDownElement;

	}

	public WebElement selectColorTextFieldElement() {
		WebElement SelectColorTextFieldElement = driver.findElement(selectColorTextField);
		return SelectColorTextFieldElement;
	}

	public String getTextofSelectedColorTextFieldElement() {
		String actualdisplayedColor = selectColorTextFieldElement().getText();
		return actualdisplayedColor;
	}

}
