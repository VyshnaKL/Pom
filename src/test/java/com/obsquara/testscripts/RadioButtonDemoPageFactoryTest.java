package com.obsquara.testscripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import com.obsquara.pages.RadioButtonDemoPage;
import com.obsquara.pages.RadioButtonDemoPageFactoryPage;
import com.obsquara.pages.SelectCategory;

import Utilities.ExcelUtility;

public class RadioButtonDemoPageFactoryTest  extends Base{
	RadioButtonDemoPageFactoryPage radioButtonDemoPageFactoryPage;
	
	@Test
	
	public void verifyFemaleRadioButton() throws IOException {
		String Gender = ExcelUtility.getString(0, 0,System.getProperty("user.dir") + "\\src\\main\\java\\Resource\\TestDAte.xlsx", "RadioButtonDemo");
		String expectedShowSelectedValueMessage = "Radio button " + Gender + " is checked";
		radioButtonDemoPageFactoryPage = new RadioButtonDemoPageFactoryPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		assertFalse(radioButtonDemoPageFactoryPage.maleCheckBoxisSelected(), " Male CheckBox is selected");
		assertFalse(radioButtonDemoPageFactoryPage.femaleCheckBoxisSelected(), "Female CheckBox is selected");
		radioButtonDemoPageFactoryPage.clickFemaleRadioButton();
		assertTrue(radioButtonDemoPageFactoryPage.femaleCheckBoxisSelected(), " Female CheckBox is not Selected");
		assertFalse(radioButtonDemoPageFactoryPage.maleCheckBoxisSelected(), "Male CheckBox is selected");
		radioButtonDemoPageFactoryPage.clickShowSelectedValueBox();
		assertEquals(expectedShowSelectedValueMessage, radioButtonDemoPageFactoryPage.showSelectedValueMessage()," Show Selected Text Messages are not same");
	}
	@Test
	public void verifyMaleRadioButton() {
		String Gender="'Male'";
		String expectedShowSelectedValueMessage = "Radio button " + Gender + " is checked";
		radioButtonDemoPageFactoryPage = new RadioButtonDemoPageFactoryPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		assertFalse(radioButtonDemoPageFactoryPage.maleCheckBoxisSelected(), "Female CheckBox is selected");
		assertFalse(radioButtonDemoPageFactoryPage.femaleCheckBoxisSelected(), "Male CheckBox is selected");
		radioButtonDemoPageFactoryPage.clickMaleRadioButton();
		assertTrue(radioButtonDemoPageFactoryPage.maleCheckBoxisSelected(), " Male CheckBox is not Selected");
		assertFalse(radioButtonDemoPageFactoryPage.femaleCheckBoxisSelected(), "Female CheckBox is selected");
		radioButtonDemoPageFactoryPage.clickShowSelectedValueBox();
		assertEquals(expectedShowSelectedValueMessage, radioButtonDemoPageFactoryPage.showSelectedValueMessage()," Show Selected Text Messages are not same");
	}
	@Test
	
	public  void verifyGroupRadioButtonsDemoGender() {
		String gender="Female";
		String ageGroup="1 to 18";
		String expectedGetResult="Gender : "+gender+"\n"+"Age group: "+ageGroup;
		radioButtonDemoPageFactoryPage = new RadioButtonDemoPageFactoryPage(driver);
		SelectCategory SelectCategoryObject = new SelectCategory(driver);
		SelectCategoryObject.listFindElements("Radio Buttons Demo");
		assertFalse(radioButtonDemoPageFactoryPage.malePatientButtonisSelected(), "Male  Patient Button is selected");
		assertFalse(radioButtonDemoPageFactoryPage.femalePatientButtonisSelected(), "Female  Patient Button is selected");
		radioButtonDemoPageFactoryPage.clickFemalePatientButton();
		assertTrue(radioButtonDemoPageFactoryPage.femalePatientButtonisSelected(), " Female Patient Button is not Selected");
		assertFalse(radioButtonDemoPageFactoryPage.malePatientButtonisSelected(), "Male Patient Button is selected");
		radioButtonDemoPageFactoryPage.clickonetoEighteenAgeGroup();
		radioButtonDemoPageFactoryPage.clickGetResultsBox();
		assertEquals(expectedGetResult, radioButtonDemoPageFactoryPage.showGetResultFieldText()," Show Selected Text Messages are not same");
		
	}
}
