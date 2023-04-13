package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsquara.pages.CheckBoxDemoPage;
import com.obsquara.pages.CheckBoxDemoPageFactoryPage;
import com.obsquara.pages.SelectCategory;

import Utilities.ExcelUtility;

public class CheckBoxDemoPageFactoryTest  extends Base{
	
		CheckBoxDemoPageFactoryPage checkBoxDemoPageFactoryPage;

@Test

	public void verifyCheckBoxDemo() throws IOException {
		
		String expectedMessage = ExcelUtility.getString(0, 0, System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "CheckBoxDemo");
		checkBoxDemoPageFactoryPage = new CheckBoxDemoPageFactoryPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Checkbox Demo");
		checkBoxDemoPageFactoryPage.clickCheckBox();
		assertTrue(checkBoxDemoPageFactoryPage.isCheckBoxResponseEnabled(), " response is not enabled");
		String actualMessage = checkBoxDemoPageFactoryPage.checkBoxResponse();
		assertEquals(expectedMessage, actualMessage, " the message not match");
	}
}
