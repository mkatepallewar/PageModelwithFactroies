package com.w2a.testcases;


import java.util.Hashtable;

import org.junit.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.HomePage;
import com.w2a.utilities.Utilities;

public class FlightSearchTest {
	
	
	@Test (dataProviderClass = Utilities.class,dataProvider = "dp" )
	public void flightSearchTest(Hashtable<String, String> data) throws InterruptedException {
		
		System.out.println("Run mode: " + data.get("Runmode"));
		System.out.println("Printing age: " + data.get("age"));
		if (data.get("Runmode").equalsIgnoreCase("N")){
			throw new SkipException("Skipping test case as the Run Mode is No");
		}
		Page.initConfiguration();
		HomePage home=new HomePage();
		
		ErrorCollector.verifyEquals(home.findTabCount(), 6);
		Thread.sleep(500);
		
		home.gotoFlights().bookAFlight(data.get("fromCity"), data.get("toCity"), data.get("fromDate"), data.get("toDate"), data.get("age"));
	}
	
	@AfterMethod
	public void tearDown() {
		if (Page.driver!=null) {
			Page.quitBrowser();
		}
	}
}
