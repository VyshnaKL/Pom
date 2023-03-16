package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.obsquara.pages.SelectCategory;
import com.obsquara.pages.SelectInputPage;

import Utilities.ExcelUtility;

public class SelectInputTest extends Base {
	SelectInputPage selectInputPage;

	@Test
	public void verifySelectInputField() throws IOException {
		String inputColor = ExcelUtility.getString(0, 0,System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "SelectInputFormDemo");
		String expectedColor = "Selected Color : " + inputColor;
		selectInputPage = new SelectInputPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Select Input");
		Select selectObject = new  Select(selectInputPage.selectColorDropDownElement());
		selectObject.selectByVisibleText("Red");
		String actualdisplayedColor = selectInputPage.getTextofSelectedColorTextFieldElement();
		assertEquals(expectedColor, actualdisplayedColor, "Color displayed is not the expected one");

	}

}
