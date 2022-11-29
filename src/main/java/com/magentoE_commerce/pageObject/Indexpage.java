/**
 * 
 */
package com.magentoE_commerce.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magentoE_commerce.actionDriver.Actiondriver;
import com.magentoE_commerce.base.Baseclass;

/**
 * @author Shashank U Sase
 *
 */
public class Indexpage extends Baseclass{
@FindBy(xpath="//div[@class='page-title']")
private WebElement pageTitle;

@FindBy(xpath="//a[text()='Mobile']")
public WebElement mobileText;



public Indexpage() {
	PageFactory.initElements(driver, this);
}
public String pageTitle() {
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	String verifyPageTitle=pageTitle.getText();
	return verifyPageTitle;
}
public Mobilepage clickMobileBtn() {
	Actiondriver.click(driver, mobileText);
	return new Mobilepage();
}


}
