package testcases;

import org.testng.annotations.Test;
import pageobject.Registration;

public class TC_001_LumaRegistration extends Luma_BaseClass 
{
	Registration lr;
	@Test
	public void LumaRegisration()
	{
		lr=new Registration(driver);
		lr.clickCreateAccountLink();
		log.info("Luma create account clicking activity is completed");
		lr.setFirstName(Fname);
		log.info("Firstname enterd sucessfully");
		lr.setLastName(Lname);
		log.info("Lastaname enterd sucessfully");
		lr.setEmailAddress(Emailadd);
		log.info("emailaddress enterd sucessfully");
		lr.setPassword(password);
		log.info("password enterd sucessfully");
		lr.setConfirmpasswod(Cpassword);
		log.info("confrm password");
		lr.clickCreateAccountbtn();
		log.info("createAccount button is clickable");
		}
}
