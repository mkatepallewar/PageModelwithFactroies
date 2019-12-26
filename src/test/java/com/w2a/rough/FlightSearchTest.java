package com.w2a.rough;


import com.w2a.base.Page;
import com.w2a.pages.actions.HomePage;

public class FlightSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		Page.initConfiguration();
		HomePage home=new HomePage();
		home.gotoFlights().bookAFlight("Delhi, India (DEL-Indira Gandhi Intl.)", "Pune, India (PNQ-Lohegaon)", "14/01/2020", "18/01/2020", "3");
		
		
		Page.quitBrowser();
	}

}
