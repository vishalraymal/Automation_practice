package eJagruti.test.excute;

import ejagruti.finsys.modules.ApplicationLaunching;
import ejagruti.finsys.modules.CreateNewCompany;
import ejagruti.finsys.modules.Login;

public class TestCaseDemo {
	public void testcase1() throws InterruptedException {
		System.out.println("TS1");
		ApplicationLaunching LanApp = new ApplicationLaunching(null);
		System.out.println("123");
		LanApp.SelectBrowser("ch","http://localhost:90/finsys","" );
		
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
		System.out.println("heelo");
		TestCaseDemo op =new TestCaseDemo();
		op.testcase1();
		op.testcase2();
		
	
	}*/
	
	public static void main(String[] args) {
		try{
		System.out.println("heelo");
		TestCaseDemo op =new TestCaseDemo();
		op.testcase1();
		op.testcase2();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	
	}

}
