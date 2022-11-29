package com.magentoE_commerce.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.magentoE_commerce.base.Baseclass;
import com.magentoE_commerce.pageObject.Indexpage;
import com.magentoE_commerce.pageObject.Mobilepage;

public class TC_001_VerifyTitle extends Baseclass {
	Indexpage indexpage;
	Mobilepage mobilepage;

	@Test(priority=0)
	public void verifyTitle() {

		indexpage = new Indexpage();

		String expectedTitle = "THIS IS DEMO SITE FOR   ";
		String actualTitle = indexpage.pageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		/*mobilepage = new Mobilepage();
		mobilepage.clickMobile();
	*/}

	@Test(priority=1)
	public void clickMobileTab() {
		indexpage = new Indexpage();
		indexpage.clickMobileBtn();
		mobilepage = new Mobilepage();
		mobilepage.clickDropdown();
		mobilepage.SortByDropdown(1);
	}

	@Test(priority=2)
	public void verifyTitleMobile() {
		mobilepage = new Mobilepage();
		String actualTitle2 = mobilepage.verifyMobilePageTitle();
		System.out.println(actualTitle2);
		String expectedTitle2 = "MOBILE";
		Assert.assertEquals(actualTitle2, expectedTitle2);
	}
	@Test(priority=3)
	
	public void sortByDropdown() {
		mobilepage = new Mobilepage();
		mobilepage.clickDropdown();
		mobilepage.SortByDropdown(1);

	}

}
