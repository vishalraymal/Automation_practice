package ejagruti.finsys.modules;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ejagruti.finsys.pageobjects.loginpage;

public class Login {
	
	final static Logger logger=Logger.getLogger(Login.class);

	
	@Test(description="Perform login to the application")
	@Parameters({"uName","pWord"})	
	public void doLogin(String username,String password)
	{
		loginpage lp=new loginpage(ApplicationLaunching.driver);
		lp.EnterUserName(username);
		lp.EnterPassword(password);
		lp.clickLogin();	
		String text = lp.getLoginText();
		if(text == "Welcome dummy[FM]"){
			logger.info("Application sucessfully logged in...");
		}else{
			logger.info("Unable to login into application....");
		}
	}
	
}
