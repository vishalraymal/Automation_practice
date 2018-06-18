package ejagruti.finsys.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ejagruti.finsys.modules.ApplicationLaunching;

public class homepage {

	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	final static Logger logger=Logger.getLogger(homepage.class);

	
	@FindBy(how=How.XPATH,using="//div[3]//*[.='Financial Analysis']")
	public WebElement finacialAnalysis;
	
	public void clickFinacialAnalysis()
	{
		try
		{
			finacialAnalysis.click();
			logger.info("Able to click on Finacial Analysis");
		}
		catch(Exception ex)
		{
			logger.error("Not able to Finacial Analysis");			
		}
	}
	
	
	@FindBy(how=How.XPATH,using="//a[@title='Manage Company']")
	public WebElement manageCompany;
	
	public void manageCompany()
	{
		try
		{
		manageCompany.click();
		logger.info("Able to click on Manage Company");
		}
		catch(Exception ex)
		{
		logger.error("Not able to click on Manage company");

		}
	}
	
	
	


}
