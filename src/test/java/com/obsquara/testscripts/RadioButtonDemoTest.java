package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsquara.pages.RadioButtonDemoPage;
import com.obsquara.pages.SelectCategory;

import Utilities.ExcelUtility;

public class RadioButtonDemoTest extends Base {
	RadioButtonDemoPage radioButtonDemoPage;

	@Test
	public void verifyFemaleRadioButton() throws IOException {
		String Gender = ExcelUtility.getString(0, 0,System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "RadioButtonDemo");
		String expectedShowSelectedValueMessage = "Radio button " + Gender + " is checked";
		radioButtonDemoPage = new RadioButtonDemoPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		assertFalse(radioButtonDemoPage.maleCheckBoxisSelected(), " Male CheckBox is selected");
		assertFalse(radioButtonDemoPage.femaleCheckBoxisSelected(), "Female CheckBox is selected");
		radioButtonDemoPage.clickFemaleRadioButton();
		assertTrue(radioButtonDemoPage.femaleCheckBoxisSelected(), " Female CheckBox is not Selected");
		assertFalse(radioButtonDemoPage.maleCheckBoxisSelected(), "Male CheckBox is selected");
		radioButtonDemoPage.clickShowSelectedValueBox();
		assertEquals(expectedShowSelectedValueMessage, radioButtonDemoPage.showSelectedValueMessage()," Show Selected Text Messages are not same");
	}
	@Test
	
	public void verifyMaleRadioButton() {
		String Gender="'Male'";
		String expectedShowSelectedValueMessage = "Radio button " + Gender + " is checked";
		radioButtonDemoPage = new RadioButtonDemoPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		assertFalse(radioButtonDemoPage.maleCheckBoxisSelected(), "Female CheckBox is selected");
		assertFalse(radioButtonDemoPage.femaleCheckBoxisSelected(), "Male CheckBox is selected");
		radioButtonDemoPage.clickeMaleRadioButton();
		assertTrue(radioButtonDemoPage.maleCheckBoxisSelected(), " Male CheckBox is not Selected");
		assertFalse(radioButtonDemoPage.femaleCheckBoxisSelected(), "Female CheckBox is selected");
		radioButtonDemoPage.clickShowSelectedValueBox();
		assertEquals(expectedShowSelectedValueMessage, radioButtonDemoPage.showSelectedValueMessage()," Show Selected Text Messages are not same");
	}
	@Test
	
	public  void verifyGroupRadioButtonsDemoGender() {
		String gender="Female";
		String ageGroup="1 to 18";
		String expectedGetResult="Gender : "+gender+"\n"+"Age group: "+ageGroup;
		radioButtonDemoPage = new RadioButtonDemoPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		assertFalse(radioButtonDemoPage.malePatientButtonisSelected(), "Male  Patient Button is selected");
		assertFalse(radioButtonDemoPage.femalePatientButtonisSelected(), "Female  Patient Button is selected");
		radioButtonDemoPage.clickFemalePatientButton();
		assertTrue(radioButtonDemoPage.femalePatientButtonisSelected(), " Female Patient Button is not Selected");
		assertFalse(radioButtonDemoPage.malePatientButtonisSelected(), "Male Patient Button is selected");
		radioButtonDemoPage.clickonetoEighteenAgeGroup();
		radioButtonDemoPage.clickGetResultsBox();
		assertEquals(expectedGetResult, radioButtonDemoPage.showGetResultFieldText()," Show Selected Text Messages are not same");
		
	}
	
	}


