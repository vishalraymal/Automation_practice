package ejagruti.finsys.modules;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ejagruti.finsys.listners.SuitListners;
import ejagruti.org.operations.HTMLReportGenerator;
import ejagruti.org.operations.TakeScreenShot;


public class ApplicationLaunching {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	private int timeout=30;
/*	private int counter=1;
	private String FolderPath;
	private String LogFilePath;
	private boolean isResultEnabled=false;
	private boolean isLogEnabled=false;
	*/
	
	final static Logger logger=Logger.getLogger(ApplicationLaunching.class);

	public ApplicationLaunching()
	{
		System.out.println("Default");
	}
	
	public ApplicationLaunching(WebDriver driver)
	{
		System.out.println("AL");
		PageFactory.initElements(driver, this);
	}
	

	@Test(description = "Select browser to launch application " )
	@Parameters({"bName","url","driverpath"})
	public void SelectBrowser(String BrowserName, String URL, String WebDriverExePath)
	{
		try{
			if(BrowserName.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gekco.driver", "C:\\Users\\Vishal-PC\\Downloads\\DRIVERS\\geckodriver_64bit_0.19.1.exe");
				driver=new FirefoxDriver();
			}
			if(BrowserName.equalsIgnoreCase("ch"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal-PC\\Downloads\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			if(BrowserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver",WebDriverExePath);
				driver=new InternetExplorerDriver();
			}
		/*	String message=TextOperations.getDateTime()+"-----INFO------Step Number:"+(counter++)+" Able to launch Application="+BrowserName;
			if(isResultEnabled){
			String imgSS= TakeScreenShot.TakeScreenShot(FolderPath+ "\\IMG"+TextOperations.getDateTime("ddMMyyyyHHmmSSS")+".png", driver);
			HTMLReportGenerator.StepDetails("pass", "LaunchApplication", message, imgSS);}
			if(isLogEnabled){TextOperations.AppendTextFile(LogFilePath, message);}
			System.out.println(message);	*/    	
			logger.info("Application sucessfully launched :"+ BrowserName);
		}
		catch(Exception ex)
		{
		/*	String message=TextOperations.getDateTime()+"-----ERROR------Step Number:"+(counter++)+"Unable to launch Application"+BrowserName;	
			if(isResultEnabled){HTMLReportGenerator.StepDetails("error", "LaunchApplication", message,"");}
			if(isLogEnabled){TextOperations.AppendTextFile(LogFilePath, message);}
			throw new WebDriverException(message);*/
			logger.error("Not able to Launch application");
		}
		wait=new WebDriverWait(driver,timeout);
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 }
//	public static void main(String[] args) {
//		ApplicationLaunching obj = new ApplicationLaunching(null);
//		System.out.println("Hello");
//		obj.SelectBrowser("ff", "https://www.facebook.com", "");
//	}

}
