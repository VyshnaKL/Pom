
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

	@Test

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
}
