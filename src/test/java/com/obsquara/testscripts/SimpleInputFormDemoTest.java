package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsquara.pages.SimpleInputFormDemoPages;

import Utilities.ExcelUtility;

public class SimpleInputFormDemoTest extends Base {
	SimpleInputFormDemoPages simpleinputFormdemoPages;

	@Test
	public void verifySingleInputField() throws IOException {
		String inputMessage = ExcelUtility.getString(0, 0,System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "SingleInputFieldDemo");
		String expectedMessage = "Your Message : " + inputMessage;
		simpleinputFormdemoPages = new SimpleInputFormDemoPages(driver);
		simpleinputFormdemoPages.enterValueInSingleInputField(inputMessage);
		assertTrue(simpleinputFormdemoPages.showMessageButtonisEnabled(), "Show message is not enabled");
		simpleinputFormdemoPages.clickShowMessageButton();
		assertEquals(expectedMessage, simpleinputFormdemoPages.displaysingleInputTextMessage(), " Message not entered");
	}

}
