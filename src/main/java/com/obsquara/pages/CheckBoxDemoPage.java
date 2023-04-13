package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.PageUtility;

public class CheckBoxDemoPage {
	WebDriver driver;

	public CheckBoxDemoPage(WebDriver driver) {
		this.driver = driver;

	}

	By checkBoxClick = By.xpath("//input[@id='gridCheck']");
	By checkBoxResponse = By.xpath("//div[@id='message-one']");
	By checkBoxOne = By.xpath("//input[@id='check-box-one']");
	By checkBoxTwo = By.xpath("//input[@id='check-box-two']");
	By checkBoxThree = By.xpath("//input[@id='check-box-three']");
	By checkBoxFour = By.xpath("//input[@id='check-box-four']");
	By selectAllButton = By.xpath("//input[@id='button-two']");

	public WebElement responseCheckBoxDemoElement() {
		WebElement CheckBoxDemoResponseElement = driver.findElement(checkBoxResponse);
		return CheckBoxDemoResponseElement;

	}

	public WebElement clickCheckBoxDemoElement() {
		WebElement ClickCheckBoxDemoElement = driver.findElement(checkBoxClick);
		return ClickCheckBoxDemoElement;

	}

	public boolean isCheckBoxOneSelected() {
		WebElement SelectCheckBoxOneElement = driver.findElement(checkBoxOne);
		return SelectCheckBoxOneElement.isSelected();
	}

	public boolean isCheckBoxTwoSelected() {
		WebElement SelectCheckBoxTwoElement = driver.findElement(checkBoxTwo);
		return SelectCheckBoxTwoElement.isSelected();
	}

	public boolean isCheckBoxThreeSelected() {
		WebElement SelectCheckBoxThreeElement = driver.findElement(checkBoxThree);
		return SelectCheckBoxThreeElement.isSelected();
	}

	public boolean isCheckBoxFourSelected() {
		WebElement SelectCheckBoxFourElement = driver.findElement(checkBoxFour);
		return SelectCheckBoxFourElement.isSelected();
	}

	public void selectCheckBoxOneElement() {
		WebElement SelectCheckBoxOneElement = driver.findElement(checkBoxOne);
		PageUtility.clickOnElement(SelectCheckBoxOneElement);

	}

	public void selectCheckBoxTwoElement() {
		WebElement SelectCheckBoxTwoElement = driver.findElement(checkBoxTwo);
		// SelectCheckBoxTwoElement.click();
		PageUtility.clickOnElement(SelectCheckBoxTwoElement);

	}

	public void selectCheckBoxThreeElement() {
		WebElement SelectCheckBoxThreeElement = driver.findElement(checkBoxThree);
		PageUtility.clickOnElement(SelectCheckBoxThreeElement);

	}

	public void selectCheckBoxFourElement() {
		WebElement SelectCheckBoxFourElement = driver.findElement(checkBoxFour);
		PageUtility.clickOnElement(SelectCheckBoxFourElement);
	}

	public WebElement selectAllButtonElement() {
		WebElement SelectAllButtonElement = driver.findElement(selectAllButton);
		return SelectAllButtonElement;
	}
	
	public WebElement unselectAllButtonElement() {
		WebElement unselectAllButtonElement = driver.findElement(selectAllButton);
		return unselectAllButtonElement;
	}

	public void clickCheckBox() {
		PageUtility.clickOnElement(clickCheckBoxDemoElement());
	}


	public WebElement clickCheckBoxOneElement() {
		WebElement ClickCheckBoxOneElement = driver.findElement(checkBoxOne);
		return ClickCheckBoxOneElement;

	}

	public WebElement clickCheckBoxTwoElement() {
		WebElement ClickCheckBoxTwoElement = driver.findElement(checkBoxTwo);
		return ClickCheckBoxTwoElement;

	}

	public WebElement clickCheckBoxThreeElement() {
		WebElement ClickCheckBoxThreeElement = driver.findElement(checkBoxThree);
		return ClickCheckBoxThreeElement;

	}

	public WebElement clickCheckBoxFourElement() {
		WebElement ClickCheckBoxFourElement = driver.findElement(checkBoxFour);
		return ClickCheckBoxFourElement;

	}

	public void clickSelectAllButton() {
		PageUtility.clickOnElement(selectAllButtonElement());
	}
	
	public void clickUnselectAllButton() {
		PageUtility.clickOnElement(unselectAllButtonElement());
	}

	public String checkBoxResponse() {
		String actualResponse = PageUtility.getElementText(responseCheckBoxDemoElement());
		return actualResponse;
	}

	public boolean isCheckBoxResponseEnabled() {
		return PageUtility.isEnabled(responseCheckBoxDemoElement());

		// return responseCheckBoxDemoElement().isEnabled();
	}

	public String selectAllButtonValue() {
		return PageUtility.getValue(selectAllButtonElement());
	}
	
	public String unselectAllButtonValue() {
		return PageUtility.getValue(unselectAllButtonElement());
	}
}
