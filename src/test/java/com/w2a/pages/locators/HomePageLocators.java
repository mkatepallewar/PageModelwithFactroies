package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {
	
	
	@FindBy (css = "#tab-flight-tab-hp > span.tab-label")
	public WebElement flightTab;
	
	
	//Locators for flight
	//findbys  -- is used generally for within first element find 2nd element
	@FindBys ({
		@FindBy (css = ".hero-banner-box.siteId-27.cf.hideClassicDcol"),
		@FindBy (css = "#flight-origin-hp-flight")
	})
	public WebElement fromCity;
	

	@FindBy (css = "#flight-destination-hp-flight")
	public WebElement toCity;
	
	@FindBy (css = "#flight-departing-hp-flight")
	public WebElement departFlight;
	
	@FindBy (css = "#flight-returning-hp-flight")
	public WebElement returnFlight;
	
	@FindBy (css = "#traveler-selector-hp-flight > div > ul > li > button")
	public WebElement adultBtn;
	
	@FindBy (css = "#traveler-selector-hp-flight > div > ul > li > div > div > div > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon > svg")
	public WebElement adultCount;
		
	
	@FindBy (css = "#traveler-selector-hp-flight > div > ul > li > div > div > div > div.children-wrapper > div.uitk-grid.step-input-outside.gcw-component.gcw-component-step-input.gcw-step-input.gcw-component-initialized > div:nth-child(4) > button > span.uitk-icon > svg")
	public WebElement childCount;
	
	//findall used used to select element either by one selection method. if one doesnt match, it will look for other selection. 
	@FindAll ({
		@FindBy (css = "#flight-age-select-1-hp-flight"),
		@FindBy (id = "flight-age-select-1-hp-flight")
	})
	public WebElement childAge;
		
	
	@FindBy (css = "#gcw-flights-form-hp-flight > div.cols-nested.ab25184-submit > label > button")
	public WebElement search;
	
	@FindBy(xpath = "//button[contains(@id,'-tab-hp')]")
	public List<WebElement> tabCount;
	
}
