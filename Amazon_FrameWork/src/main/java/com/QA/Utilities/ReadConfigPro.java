package com.QA.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigPro {
	
	Properties pro;
	public ReadConfigPro() {
		File src =new File("C:\\Users\\parim\\eclipse-workspace\\Amazon_FrameWork\\src\\main\\java\\com\\QA\\Utilities\\config.properties");
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro =new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getURL()
	{
		String baseURL = pro.getProperty("URL");
		return baseURL;
	}
	
	public String getUsername()
	{
		String email = pro.getProperty("UserName");
		return email;
	}
	public String getPassword()
	{
		String pass = pro.getProperty("Password");
		return pass;
	}

}
