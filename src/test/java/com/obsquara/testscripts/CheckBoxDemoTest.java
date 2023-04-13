
package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsquara.pages.CheckBoxDemoPage;
import com.obsquara.pages.SelectCategory;

import Utilities.ExcelUtility;

public class CheckBoxDemoTest extends Base {
	CheckBoxDemoPage checkBoxDemoPage;

	@Test(priority=3)

	public void verifyCheckBoxDemo() throws IOException {
		// String expectedMessage = "Success - Check box is checked";
		String expectedMessage = ExcelUtility.getString(0, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "CheckBoxDemo");
		checkBoxDemoPage = new CheckBoxDemoPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		checkBoxDemoPage.clickCheckBox();
		assertTrue(checkBoxDemoPage.isCheckBoxResponseEnabled(), " response is not enabled");
		String actualMessage = checkBoxDemoPage.checkBoxResponse();
		assertEquals(expectedMessage, actualMessage, " the message not match");
	}
	@Test(priority=2)
	
	public void verifySelectMultipleCheckBoxDemo(){
		
		String expectedValue = "Unselect All";
		checkBoxDemoPage = new CheckBoxDemoPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		checkBoxDemoPage.clickSelectAllButton();
		assertTrue(checkBoxDemoPage.isCheckBoxOneSelected(),"CheckBoxOne is not selected");
		assertTrue(checkBoxDemoPage.isCheckBoxTwoSelected(),"CheckBoxtwois not selected");
		assertTrue(checkBoxDemoPage.isCheckBoxThreeSelected(),"three is not selected");
		assertTrue(checkBoxDemoPage.isCheckBoxFourSelected(),"four is not selected");
		assertEquals(expectedValue, checkBoxDemoPage.selectAllButtonValue(), "value doesn't match");
	}
	@Test(priority=1)
	
	public void verifyUnselectAllButton() {
		
		String expectedValue = "Select All";
		checkBoxDemoPage = new CheckBoxDemoPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		checkBoxDemoPage.unselectAllButtonElement();
		assertFalse(checkBoxDemoPage.isCheckBoxOneSelected(),"CheckBoxOne is selected");
		assertFalse(checkBoxDemoPage.isCheckBoxTwoSelected(),"CheckBoxtwois selected");
		assertFalse(checkBoxDemoPage.isCheckBoxThreeSelected(),"three is  selected");
		assertFalse(checkBoxDemoPage.isCheckBoxFourSelected(),"four is selected");
		assertEquals(expectedValue, checkBoxDemoPage.unselectAllButtonValue(), "value doesn't match");
	}
}
