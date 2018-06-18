
package ejagruti.finsys.tcdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ejagruti.finsys.modules.ApplicationLaunching;
import ejagruti.finsys.modules.CreateNewCompany;
import ejagruti.finsys.modules.Login;

public class demotest {
	
		/*	@Test(priority=1)
			@Parameters({"uName","pWrd","result"})*/
			public void loginValid(String un, String pw)
			{
				String result;
				Login LI = new Login();
				LI.doLogin(un, pw);
			}
			
	
	
			@Test(priority=2)	
			public void testcase1() throws InterruptedException {
				ApplicationLaunching LanApp = new ApplicationLaunching(null);
				LanApp.SelectBrowser("ff","http://localhost:90/finsys","" );
				
				Login logOb= new Login();
				logOb.doLogin("dummyfm", "passw0rd");
				Thread.sleep(5000);
				
			    CreateNewCompany comObj = new CreateNewCompany();
				comObj.createCompany("KamalNayn", "IT", "Service", "B-CABIN", "7208751589", "sachinsose@gmail.com", "BQGPRGGHHH", "7246454565", "7528588825", "www.fb.com", "IN", "ANDHRA PRADESH", "HYDERABAD", "200");
					
			}
			public void testcase2() throws InterruptedException {
				ApplicationLaunching LanApp = new ApplicationLaunching(null);
				LanApp.SelectBrowser("ch","http://localhost:90/finsys","" );
				
				Login logOb= new Login();
				logOb.doLogin("dummyfm", "passw0rd");
				Thread.sleep(5000);
				
			    CreateNewCompany comObj = new CreateNewCompany();
				comObj.createCompany("Vijay PVT LTD", "IT", "Service", "B-CABIN", "7208751589", "sachinsose@gmail.com", "BQGPRGGHHH", "7246454565", "7528588825", "www.fb.com", "IN", "ANDHRA PRADESH", "HYDERABAD", "200");
			}
			/*public static void main(String[] args) throws InterruptedException {
				demotest dt = new demotest();
				dt.testcase1();
			}
	*/
	
	
}
