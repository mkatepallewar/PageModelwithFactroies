package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	@FindBy (css = "#header-account-menu")
	public WebElement Account;
	
	@FindBy (css = "#account-signin")
	public WebElement signIn;
	
	@FindBy (css = "#account-register")
	public WebElement createAccount;
	
	@FindBy (css = "#header-history > span.sp-name")
	public WebElement myList;
	
	@FindBy (css = "#header-support-menu")
	public WebElement support;
	
}
