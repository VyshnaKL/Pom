package com.obsquara.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectCategory {
	WebDriver driver;

	public SelectCategory(WebDriver driver) {
		this.driver = driver;
	}

	public void listFindElements(String inputCategory) {

		List<WebElement> inputFormCategories = driver.findElements(By.xpath("//li[@class='list-group-item']//a"));

		for (WebElement category : inputFormCategories) {
			if (category.getText().equals(inputCategory)) {
				category.click();
				break;
			}

		}
	}

}