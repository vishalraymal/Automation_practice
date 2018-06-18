package ejagruti.finsys.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ejagruti.finsys.pageobjects.homepage;
import ejagruti.finsys.pageobjects.managecompanypage;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class CreateNewCompany {
	
	final static Logger logger=Logger.getLogger(CreateNewCompany.class);

	@Test(description="Enter the details for the new company creation")
	@Parameters({"comName","comType","comSubType","Add","phNo","eMail","panNo","TinNo","moNo","wSite","seConty","seState","compName","noEmp"})
	public void createCompany(String comName, String comType, String comSubType, String Add, String phNo, String eMail, String panNo, String TinNo, String moNo, String wSite, String seConty, String seState, String compName, String noEmp) throws InterruptedException
	{
		homepage mObj = new homepage(ApplicationLaunching.driver);
		mObj.manageCompany();
		managecompanypage addCom = new managecompanypage(ApplicationLaunching.driver);
		Thread.sleep(3000L);
		addCom.newFrame(0);
		addCom.newCompany();
		addCom.newCompanyName(comName);
		addCom.selectCompanyType(comType);
		addCom.selectCompanySubType(comSubType);
		addCom.enterAdress(Add);
		addCom.enterPhoneNo(phNo);
		addCom.enterEmailid(eMail);
		addCom.enterPanDetails(panNo);
		addCom.enterTinDetails(TinNo);
		addCom.enterMobileNo(moNo);
		addCom.enterWebsite(wSite);
		addCom.selectCountyId(seConty);
		addCom.selectState(seState);
		addCom.SelectCity(compName);
		addCom.enterTotalemp(noEmp);
		addCom.clickSavebutton();
		Thread.sleep(2000);
		String newCompanyName = addCom.getCompanyName(comName);
		Assert.assertEquals(newCompanyName, comName, "Company Created Sucessfully");
		
	}
	

}
