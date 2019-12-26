package com.w2a.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topNavigation;
	
	public TopNavigation(WebDriver driver) {
		this.topNavigation=new TopNavigationLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.topNavigation);
	}
	public SignInPage gotoSignIn() {
		Page.click(topNavigation.Account);
//		topNavigation.Account.click();
		Page.click(topNavigation.signIn);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new SignInPage();
	}
	
	public void gotoCreatAccount() {
		
	}

	public void gotoList() {
		
	}
	
	public void gotoSupport() {
		
	}
	public void gotoHome() {
		
	}
	
	public void gotoFlights() {
		
	}
}
