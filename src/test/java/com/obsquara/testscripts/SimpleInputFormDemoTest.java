package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsquara.pages.SimpleInputFormDemoPages;

import Utilities.ExcelUtility;

public class SimpleInputFormDemoTest extends Base {
	SimpleInputFormDemoPages simpleInputFormDemoPage;

	@Test
	public void verifySingleInputField() throws IOException {
		String inputMessage = ExcelUtility.getString(0, 0,	System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "SingleInputFieldDemo");
		String expectedMessage = "Your Message : " + inputMessage;
		simpleInputFormDemoPage = new SimpleInputFormDemoPages(driver);
		simpleInputFormDemoPage.enterValueInSingleInputField(inputMessage);
		assertTrue(simpleInputFormDemoPage.showMessageButtonisEnabled(), "Show message is not enabled");
		simpleInputFormDemoPage.clickShowMessageButton();
		assertEquals(expectedMessage, simpleInputFormDemoPage.displaysingleInputTextMessage(), " Message not entered");
	}

	@Test

	public void verifyFontColorofShowMessageButton() {

		String expectedFontcolor = "rgba(255, 255, 255, 1)";
		simpleInputFormDemoPage = new SimpleInputFormDemoPages(driver);

		assertEquals(expectedFontcolor, simpleInputFormDemoPage.showMessageFontColor(), " font color not matching");
	}

	@Test
	public void verifyTwoInputField() {
		String input1 = "5";
		String input2 = "4";
		int expectedTotal = Integer.parseInt(input1) + Integer.parseInt(input2);
		String expectedMessage = "Total A + B : " + expectedTotal;
		simpleInputFormDemoPage = new SimpleInputFormDemoPages(driver);
		simpleInputFormDemoPage.enterValueA(input1);
		simpleInputFormDemoPage.enterValueB(input2);
		simpleInputFormDemoPage.clickGetTotalButton();
		assertEquals(expectedMessage, simpleInputFormDemoPage.twoInputResponseGetText(), "response doesn't match");

	}
}
