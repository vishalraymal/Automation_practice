package ejagruti.finsys.listners;
import ejagruti.finsys.config.Config;

import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.xml.XmlTest;

import ejagruti.finsys.pageobjects.homepage;

public class TestCaseListners implements ITestListener{
	
	String ToBeExecuted, TcToExecute, MyOneParameter;
	
	

	public void onFinish(ITestContext arg0) {
		
		System.out.println("Test Case Execution Finished:Test Case Name :"+arg0.getName()+"\n");
	}

	
	public void onStart(ITestContext arg0) {
		
		
		System.out.println("Test Case Execution Started:Test Case Name :"+arg0.getName());
		XmlTest itc=arg0.getCurrentXmlTest();
		
		System.out.println("Test Case ID::"+itc.getParameter("tcid"));
		System.out.println("Requirement Id::"+itc.getParameter("req_id"));
		System.out.println("Owner::"+itc.getParameter("owner"));
		System.out.println("ToBeExecuted::"+itc.getParameter("Excuted"));
		ToBeExecuted=itc.getParameter("Excuted");
		TcToExecute=itc.getParameter("tcid");
		
		
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult arg0) {
		
		System.out.print("Test Step Execution Finished::"+arg0.getName()+":: FAILED"+"\n");
	}

	
	public void onTestSkipped(ITestResult arg0) {

		System.out.println("Test Step Execution Finished::"+arg0.getName()+":: SKIPPED"+"\n");
		
	}
    
	
	public void onTestStart(ITestResult arg0) {
		
		     /*  Logic to decide if TC step needs to execute,if the parameter is defined 
		     at each Test case level
		     	     
		     if(ToBeExecuted.equalsIgnoreCase("0"))
		     {   
		    	 throw new SkipException(arg0.getName());
		     }
		     else
		     {
		    	  System.out.println("Test Step Execution Started::"+arg0.getName());
		     }   */
		
		     if((Config.TestExecutionTag=="include" & Config.TestExecutionList.contains(TcToExecute))
		    	||(Config.TestExecutionTag=="exclude" & !Config.TestExecutionList.contains(TcToExecute)))
		     {
		    	  System.out.println("Test Step Execution Started::"+arg0.getName());
				  System.out.println("Test Step Execution Started::"+Config.TestExecutionList.size()); 
				  
				  System.out.println("Test Step Execution Started::"+Config.TestExecutionTag);
		     }
		     else
		     {
		    	 throw new SkipException(arg0.getName());
		     }  
		
		
	}
	
	public void onTestSuccess(ITestResult arg0) {

		System.out.println("Test Step Execution Finished::"+arg0.getName()+":: PASSED"+"\n");
	}
	

}
