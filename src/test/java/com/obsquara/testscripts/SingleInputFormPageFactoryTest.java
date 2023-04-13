package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.obsquara.pages.SimpleInputFormDemoPages;
import com.obsquara.pages.SingleinputFormPageFactoryPage;

import Utilities.ExcelUtility;

public class SingleInputFormPageFactoryTest  extends  Base{
	SingleinputFormPageFactoryPage singleinputFormPageFactoryPage;
	@Test(priority=4)
	@Parameters({"inputMessage"})
	

	public void verifySingleInputField(String inputMessage) throws IOException {
		//String inputMessage = ExcelUtility.getString(0, 0,System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "SingleInputFieldDemo");
		String expectedMessage = "Your Message : " + inputMessage;
		singleinputFormPageFactoryPage = new  SingleinputFormPageFactoryPage(driver);
		singleinputFormPageFactoryPage.enterValueInSingleInputField(inputMessage);
		assertTrue(singleinputFormPageFactoryPage.showMessageButtonisEnabled(), "Show message is not enabled");
		singleinputFormPageFactoryPage.clickShowMessageButton();
	}
	@Test
	public void verifyTwoInputField() {
		String input1 = "5";
		String input2 = "4";
		int expectedTotal = Integer.parseInt(input1) + Integer.parseInt(input2);
		String expectedMessage = "Total A + B : " + expectedTotal;
		singleinputFormPageFactoryPage = new SingleinputFormPageFactoryPage(driver);
		singleinputFormPageFactoryPage.enterValueA(input1);
		singleinputFormPageFactoryPage.enterValueB(input2);
		singleinputFormPageFactoryPage.clickGetTotalButton();
		assertEquals(expectedMessage, singleinputFormPageFactoryPage.twoInputResponseGetText(), "response doesn't match");

	}
}
