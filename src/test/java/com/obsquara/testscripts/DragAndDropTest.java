package com.obsquara.testscripts;

import org.testng.annotations.Test;

import com.obsquara.pages.DragAndDropPage;

public class DragAndDropTest  extends Base{
	DragAndDropPage dragAndDropPage;
	@Test
	
	public void verifyDragAndDrop() {
	driver.navigate().to("https://selenium.obsqurazone.com/drag-drop.php");
	dragAndDropPage= new DragAndDropPage(driver);
	dragAndDropPage.dragAndDropListItems();
}
}