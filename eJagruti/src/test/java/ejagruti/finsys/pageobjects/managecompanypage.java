package ejagruti.finsys.pageobjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.Mongo;

import ejagruti.finsys.modules.ApplicationLaunching;

public class managecompanypage {
	
	public managecompanypage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	final static Logger logger = Logger.getLogger(managecompanypage.class); 

	@FindBy(how=How.XPATH, using = "//span[.='New']")
    public WebElement newcompany;
	
	public void newCompany()
	{
		try
		{
			newcompany.click();
			logger.info("Able to click on New Company buttion");
		}
		catch(Exception ex)
		{
			logger.error("Not able to click on New Company button");
		}
	}
	
	@FindBy(how=How.XPATH,using="//span[.='Destroy']")
	public WebElement destroycompany;
	
	public void destroyCompany()
	{
		try{
		destroycompany.click();
		logger.info("Able to click on destroy company");
		}
		catch(Exception ex)
		{
		logger.error("Not able to click on Destroy Company");
		}
	}
	
	public void newFrame(int index){
		try
		{
		ApplicationLaunching.driver.switchTo().frame(index);
		logger.info("Driver has been sucessfully switch to frame : "+index);
		}
		catch(Exception ex)
		{
		logger.error("Driver has failed to switch to frame : "+index);
		}
	}
	

	@FindBy(how=How.XPATH,using="//input[@name='name']")
	public WebElement cName;
	public void newCompanyName(String companyName)
	{
		try
		{
			cName.sendKeys(companyName);
			logger.info("Able to entered company name: " + companyName);
		}
		catch(Exception ex)
		{
			logger.error("Not able to entered company name : "+ companyName);
		}
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='companytype']")
	public WebElement companytype;
	public void selectCompanyType(String compType)
	{
		try
		{
		Select se=new Select(companytype);
		se.selectByValue(compType);
		logger.info("Company type has been selected as : "+ compType);
		}
		catch(Exception ex)
		{
		logger.error("Not able to select company type : "+ compType);
		}
	}
	
	@FindBy(how=How.XPATH,using="//*[@name='subtype']")
	public WebElement companySubtype;
	public void selectCompanySubType(String subComType)
	{
		try
		{
		Select se = new Select(companySubtype);
		se.selectByValue(subComType);
		logger.info("Company sub type has been selected sucessfully as  :"+subComType);
		}
		catch(Exception ex)
		{
		logger.error("Not able to select company sub type : "+ subComType);
		}
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@autocomplete='off']")
	public WebElement address;
	public void enterAdress(String addressDetails)
	{
		try
		{
		address.sendKeys(addressDetails);
		logger.info("Adress has been entered sucessfully : "+ addressDetails);
		}
		catch(Exception ex)
		{
		logger.error("Not able to enter address : "+ addressDetails);
		}
	}
	
	
	@FindBy(how=How.XPATH,using="//table[@class='dv-table']//tbody//tr[3]//td[2]//span/input[1]")
	public WebElement phoneNo;
	public void enterPhoneNo(String phonenumber)
	{
		try
		{
		phoneNo.sendKeys(String.valueOf(phonenumber));
		logger.info("Phone number has been entered : "+ phonenumber);
		}
		catch(Exception ex)
		{
		logger.error("Not able to enter phone number : "+ phonenumber);	
		}
	}
	
	@FindBy(how=How.XPATH,using="//input[@validtype='email']")
	public WebElement email;
	public void enterEmailid(String emailID)
	{
		try
		{
		email.sendKeys(emailID);
		logger.info("Email Id has been entered :"+ emailID);
		}
		catch(Exception ex)
		{
		logger.error("Not able to enter Email ID : "+ emailID);
		}
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='pan']")
	public WebElement panNo;
	public void enterPanDetails(String PanNumber)
	{
		try
		{
		panNo.sendKeys(PanNumber);	
		logger.info("PAN Number has been entered : "+ PanNumber);
		}
		catch(Exception ex)
		{
		logger.error("Not able to entered pan number : "+ PanNumber);			
		}
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='tin']")
	public WebElement tinNo;
	public void enterTinDetails(String TinNumber)
	{
		try
		{
			tinNo.sendKeys(TinNumber);
			logger.info("TIN Number has been entered :"+ TinNumber);
		}
		catch(Exception ex)
		{
			logger.error("Not able to entered TIN Number :"+ TinNumber);
		}
	}
	
	@FindBy(how=How.XPATH,using="//table[@class='dv-table']//tbody//tr[5]//td[2]//span/input[1]")
	public WebElement mobileNo;
	public void enterMobileNo(String MobNumber)
	{
		try
		{
		mobileNo.sendKeys(MobNumber);
		logger.info("Mobile number has been entered : "+ MobNumber);
		}
		catch(Exception ex)
		{
			logger.error("Not able to enter mobile number :"+ MobNumber);
		}
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='website']")
	public WebElement website;
	public void enterWebsite(String webSite)
	{
		try
		{
			website.sendKeys(webSite);
			logger.info("WebSite name has been entered :"+ webSite);
		}
		catch(Exception ex)
		{
			logger.error("Not able to enter web site name : "+ webSite);
		}
	}
	@FindBy(how=How.XPATH,using="//select[@id='countryid']")
	public WebElement countryid;
	public void selectCountyId(String countryID)
	{
		try
		{
		Select se= new Select(countryid);
		se.selectByValue(countryID);
		logger.info("Able to select country id : "+ countryID);
		}
		catch(Exception ex)
		{
		logger.error("Not able to select country id : "+ countryID);	
		}
	}
	@FindBy(how=How.XPATH,using="//select[@id='stateidlist']")
	public WebElement state;
	public void selectState(String stateName)
	{
		try
		{
		Select se= new Select(state);
		se.selectByValue(stateName);
		logger.info("State name has been selected : "+ stateName);
		}
		catch(Exception ex)
		{
		logger.error("Not able to select state : "+ stateName);
		}
	}
	
	@FindBy(how=How.XPATH,using="//select[@id='citylist']")
	public WebElement cityname;
	public void SelectCity(String CityName)
	{
		try
		{
		Select se = new Select(cityname);
		se.selectByValue(CityName);
		logger.info("City name has been selected : "+ CityName);
		}
		catch(Exception ex)
		{
		logger.error("Not able to select city name : "+ CityName);
		}
	}
	
	@FindBy(how=How.XPATH,using="//table[@class='dv-table']//tr[8]//td[2]//span//input[1]")
	public WebElement totalEmp;
	public void enterTotalemp(String empNo)
	{
		try
		{
			totalEmp.sendKeys(empNo);
			logger.info("Employeed number entered : "+ empNo);
		}
		catch(Exception ex)
		{
			logger.error("Not able to enter employeed : "+ empNo);
		}
	}
	@FindBy(how=How.XPATH,using="//*[.='Save']")
	public WebElement savebutton;
	public void clickSavebutton()
	{
		try
		{
		savebutton.click();
		logger.info("Save button clicked sucessfully...");
		}
		catch(Exception ex)
		{
		logger.error("Not able to click on saved button...");
		}
	}
	
	// Following logic is useless for validating new company creation.- VRR 
	@FindBy(how=How.XPATH, using="//table[@class='datagrid-btable']//tbody//tr[15]//td//div//span")
	public WebElement collapserButton;
	public String collapseVisible()
	{
		collapserButton.isDisplayed();
		return null;
	}
	
	public String alertMessage(){
		String alertMsg = ApplicationLaunching.driver.switchTo().alert().getText();
		return alertMsg;
		//Company Already Exists.Please Select different Company Name!!!
	}
	
	
	public String getCompanyName(String companyname)
	{
		return companyname;
		
	}
}
