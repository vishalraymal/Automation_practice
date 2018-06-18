package ejagruti.finsys.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Config {
	
	
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	public static ArrayList<String> TestExecutionList=null;
	public static String TestExecutionTag=null;

	
	private String getParameterValue_child(String parametername)throws IOException
	{
		InputStream input=null;
		Properties prop=new Properties();
		
		input=getClass().getClassLoader().getResourceAsStream("config.properties");
		prop.load(input);
		
		String parameterValue=prop.getProperty(parametername);
		
		return parameterValue;
	}
	
	public static String getParameterValue(String parametername) throws IOException
	{
		Config pf= new Config();
		
		return pf.getParameterValue_child(parametername);
		
	}

	
	

}
