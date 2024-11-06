package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pageobject.Task;
import pageobject.login;

public class TC_003_Task extends Luma_BaseClass {
	login lg;
	Task ts;
	@Test
	public void Testfun() throws InterruptedException {
		lg=new login (driver);
		lg.setEmail();
		lg.setPassword();
		lg.clcikButton();
		ts=new Task(driver);
		ts.mensdrioClick();
		ts.topsClick();
		ts.jocketsClick();
		ts.imageCick();
		ts.sizeClick();
		ts.colorClick();
		ts.addCart();
		Thread.sleep(3000);
		ts.logoClick();
		Thread.sleep(3000);
		ts.procedClick();
		Thread.sleep(5000);
		//ts.emailCLick();
		Thread.sleep(5000);
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,1450)", "");
		//ts.FristnameEnter();
		//ts.LastnameEnter();
		ts.streetEnter();
		ts.cityEnter();
		ts.State();
		ts.postcodeEnter();
		ts.country();
		ts.Mobile();
		ts.radio();
		Thread.sleep(3000);
		ts.nextButton();
	}
}
