package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class login 
{
	public static WebDriver driver;
	public login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement txtemail;
	@FindBy(id="pass")
	WebElement txtpassword;
	@FindBy(id="send2")
	WebElement btnsignin;
	public void setEmail()
	{
		txtemail.sendKeys("verri.madangopal@gmail.com");
	}
	public void setPassword()
	{
		txtpassword.sendKeys("Madan@123");
	}
	public void clcikButton()
	{
		btnsignin.click();
	}
	
}
