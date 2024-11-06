package testcases;

import org.testng.annotations.Test;

import pageobject.login;

public class TC_002_Login extends Luma_BaseClass {
	login lp;
	@Test
	public void loginFunction() {
		lp=new login(driver);
		lp.setEmail();
	    lp.setPassword();
	    lp.clcikButton();
	}
}
