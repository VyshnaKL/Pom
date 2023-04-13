package com.obsquara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.PageUtility;

public class  DragAndDropPage{
	WebDriver driver;

	public  DragAndDropPage(WebDriver driver) {
		this.driver = driver;

	}
	By draggableItemList = By.xpath("//span[text()='Draggable n°1']");
	By droppedItemList = By.xpath("//div[@id='mydropzone']");
	
	public WebElement draggableItemListElement()
	{
		WebElement DraggableListSourceElement= driver.findElement(draggableItemList);
		return DraggableListSourceElement;
	}
	
	public WebElement dropItemElement()
	{
		WebElement DroppableListDestinationElement= driver.findElement(droppedItemList);
		return DroppableListDestinationElement;
	}
	
	public void dragAndDropListItems()
	{
		PageUtility.dragAndDrop(driver,  draggableItemListElement(), dropItemElement());
	}
}

