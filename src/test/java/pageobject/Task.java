package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task {
	public static WebDriver driver;
	public Task(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@id='ui-id-5']/span[1]")
	WebElement mansDropdown;
	
	@FindBy(xpath="//a[@id='ui-id-17']")
	WebElement Tops;
	
	@FindBy(xpath="//a[@id='ui-id-19']")
	WebElement jockets;
	
	@FindBy(xpath="//img[@alt='Proteus Fitness Jackshirt']")
	WebElement jocketImage;
	
	
	@FindBy(id="option-label-size-143-item-169")
	WebElement size;
	
	@FindBy(id="option-label-color-93-item-50")
	WebElement color;

	
	@FindBy(xpath="//button[@id='product-addtocart-button']")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='minicart-wrapper']")
	WebElement cartlogo;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	WebElement procedButton;
	
	
	@FindBy(id="customer-email")
	WebElement email;
	
	@FindBy(xpath="(//input[@id='K8YMWDU']")
	WebElement fristname;
	
	
	@FindBy(xpath="//input[@id='Y93I08N']")
	WebElement lastname;
	
	
	@FindBy(xpath="//input[@name='street[0]']")
	WebElement street;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//select[@name='region_id']")
	WebElement stateSelect;
	
	@FindBy(xpath="//input[@name='postcode']")
	WebElement postalcode;
	
	@FindBy(xpath="//select[@name='country_id']")
	WebElement countryselect;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement number;
	
	@FindBy(xpath="//input[@name='ko_unique_1']")
	WebElement radiobutton;
	
	@FindBy(xpath="(//button[@type='submit']/span)[2]")
	WebElement next;
	
	
	
	@FindBy(xpath="//button[@class='action primary checkout']")
	WebElement placeorder;
	
	
	public void mensdrioClick() {
		Actions as=new Actions(driver);
		as.moveToElement(mansDropdown).build().perform();
		//as.click(mansDropdown).build().perform();	
	}
	
	
	public void topsClick() {
		Actions as=new Actions(driver);
		as.moveToElement(Tops).build().perform();
		//as.click(Tops).build().perform();	
		
	}
	
	public void jocketsClick() {
		Actions as=new Actions (driver);
		as.moveToElement(jockets).click().build().perform();;
		//as.click(jockets).build().perform();
		
	}
	
	public void imageCick() {
		jocketImage.click();
	}
	
	public void sizeClick() {
		size.click();
	}
	
	public void colorClick() {
		 color.click();
	}
	public void addCart() {
		addtocart.click();
	}
	
	public void logoClick() {
		cartlogo.click();
	}
	
	public void procedClick() {
		procedButton.click();
	}
	
	public void emailCLick() {
		email.sendKeys("madan@gmail.com");
	}
	public void FristnameEnter() {
		fristname.sendKeys("madan");
	}
	
	public void LastnameEnter() {
		lastname.sendKeys("gopal");
	}
	
	public void streetEnter() {
		street.sendKeys("hyderabad");
	}
	
	public void cityEnter() {
		city.sendKeys("Hyderbad");
	}
	
	public void State() {
		Select sc=new Select(stateSelect);
		sc.selectByValue("1");
	}
	public void postcodeEnter() {
		postalcode.sendKeys("245");
	}
	public void country() {
		Select sc=new Select(countryselect);
		sc.selectByValue("AF");
	}
	public void Mobile() {
		number.sendKeys("9177158925");
	}
	
	public void radio() {
		radiobutton.click();
		
	}
	public void nextButton() {
		next.click();
	}
}
