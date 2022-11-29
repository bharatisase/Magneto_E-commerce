package com.magentoE_commerce.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magentoE_commerce.actionDriver.Actiondriver;
import com.magentoE_commerce.base.Baseclass;

public class Mobilepage extends Baseclass {
	Mobilepage mobilepage;
	@FindBy(xpath = "//h1[text()='Mobile']")
	private WebElement mobilePageTitle;

	@FindBy(xpath = "(//select[@title='Sort By'])[1]")
	private WebElement sortBy;

	public Mobilepage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyMobilePageTitle() {
		String verifyMobilePageTitle = mobilePageTitle.getText();
		return verifyMobilePageTitle;
	}

	/*
	 * public Mobilepage clickMobile() { Actiondriver.click(driver,
	 * mobilePageTitle); return new Mobilepage(); }
	 */
	public void clickDropdown() {
		Actiondriver.click(driver, sortBy);
	}
	public void SortByDropdown(int index) {
		Actiondriver.clickDropdown(sortBy,index);
		
				
	}

}
