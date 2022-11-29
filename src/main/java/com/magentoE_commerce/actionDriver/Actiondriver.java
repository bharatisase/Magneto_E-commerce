package com.magentoE_commerce.actionDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actiondriver {
	
	public static void click(WebDriver driver,WebElement ele) {
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).click().build().perform();
	}
	public static void clickDropdown(WebElement ele1,int index) {
		Select select=new Select(ele1);
		select.selectByIndex(index);
		
	}

}
