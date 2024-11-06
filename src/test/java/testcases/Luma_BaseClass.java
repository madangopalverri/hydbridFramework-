package testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;



import freemarker.log.Logger;
import utilities.Reading_lumadata;

public class Luma_BaseClass {

public Logger log;
	
 	Reading_lumadata rid =new Reading_lumadata();
	public static WebDriver driver;
	
	public String Fname=rid.getFirstName();
	public String Lname=rid.getLastName();
	public String Emailadd=rid.getEmailAddress();
	public String password=rid.getPassword();
	public String Cpassword=rid.getcnfrmpassword();
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApplication(String br,String URl)
	{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URl);
		driver.manage().window().maximize();
		log=Logger.getLogger("LumaHybridFramework");
		PropertyConfigurator.configure("log4j");
		}
	public String captureScreen(String tname)
	{
		 String timestamp=new SimpleDateFormat("yyyy.MM.DD.HH.mm.ss").format(new Date());
		 TakesScreenshot screenshot=((TakesScreenshot) driver);
		 File source=screenshot.getScreenshotAs(OutputType.FILE);
		 String destination=System.getProperty("user.dir")+"\\Screenshot\\"+tname+"_"+timestamp+".png";
		 try
		 {
			 FileUtils.copyFile(source, new File(destination));
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		return destination;
		
	}
	
}
