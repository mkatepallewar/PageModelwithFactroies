package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.actions.SignInPage;
import com.w2a.utilities.Utilities;

public class SignInTest {

	
	@Test (dataProviderClass = Utilities.class,dataProvider = "dp" )
	public void signInTest(Hashtable<String, String> data) {
		// TODO Auto-generated method stub
		System.out.println("User Name : " + data.get("username"));
		System.out.println("Run mode: " + data.get("Runmode"));
		if (data.get("Runmode").equalsIgnoreCase("N")){
			throw new SkipException("Skipping test case as the Run Mode is No");
		}
		Page.initConfiguration();
		SignInPage signIn= Page.topNavigation.gotoSignIn();
		signIn.doLogIn(data.get("username"), data.get("password"));

	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Quiting Browser");
		if (Page.driver!=null) {
			Page.quitBrowser();
		}
	}
}
