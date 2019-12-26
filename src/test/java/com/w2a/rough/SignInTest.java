package com.w2a.rough;

import org.apache.commons.math3.analysis.function.Signum;

import com.w2a.base.Page;
import com.w2a.pages.actions.SignInPage;

public class SignInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Page.initConfiguration();
		SignInPage signIn= Page.topNavigation.gotoSignIn();
		signIn.doLogIn("manish", "test");
		
		Page.quitBrowser();
	}

}
