package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reading_lumadata {
	Properties pro;
	public Reading_lumadata()
	{
		try
		{
		File file=new File("C:\\Users\\hi\\eclipse-workspace\\LumaHybridFramework\\configuration\\datafile");
		FileInputStream fis=new FileInputStream(file);
		 pro=new Properties();
		 pro.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		//registration
		public String getFirstName()
		{
			String FName=pro.getProperty("FirstName");
			return FName;
		}
		public String getLastName()
		{
			String LName=pro.getProperty("LastName");
			return LName;
		}
		public String getEmailAddress()
		{
			String EmailAdd=pro.getProperty("Email");
			return EmailAdd;
		}
		public String getPassword()
		{
			String password=pro.getProperty("password");
			return password;
		}
		public String getcnfrmpassword()
		{
			String cpassword=pro.getProperty("confirmpassword");
			return cpassword;
			
		}
		
		

}
