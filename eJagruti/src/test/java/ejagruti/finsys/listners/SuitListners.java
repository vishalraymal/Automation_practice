package ejagruti.finsys.listners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.xml.XmlSuite;

import ejagruti.finsys.config.Config;


public class SuitListners implements ISuiteListener {
	
	

    private String getTagName(ISuite arg0)
   {
    
	  Map<String, String> allSuiteParams=new HashMap<String,String>();
	  String tagName;
	
	  XmlSuite tcs=arg0.getXmlSuite();
	  allSuiteParams=tcs.getAllParameters();
	    if(allSuiteParams.containsKey("include"))
	    {
		  tagName="include";
	    }
	    else
	    {
		  tagName="exclude";
	     }
	
	      //System.out.println("Tag Value Is...: "+tagName);
	      
	     return tagName;
      }

     
     private String getTagValue(ISuite arg0)
    {
	   String tagValue, str;
	   XmlSuite tcs=arg0.getXmlSuite();
	
	   str=this.getTagName(arg0);
	   Config.TestExecutionTag=this.getTagName(arg0);
		 
	
	     if(str.equalsIgnoreCase("include"))
	    {
		  tagValue=tcs.getParameter("include");
	    }
	    else
	    {
		  tagValue=tcs.getParameter("exclude");
	    }
	
	 
	    //System.out.println("Tag Value Is...: "+tagValue);
	  
	    return tagValue;
      }

      
    private ArrayList TcExecutionId(ISuite arg0)
   {
	  String str, splitStrArr[];
	  int i,k,j, start, end;
	  ArrayList<String> TcList=null;
	
	  str=this.getTagValue(arg0);
	  
	  splitStrArr=new String[str.length()];
	  splitStrArr=str.split(",");
	 
	  
	  TcList=new ArrayList<String>();
	 
	    for(i=0; i<splitStrArr.length;i++)
	    {
		  
		   if(splitStrArr[i].contains("["))
		   {
			
			  start=Integer.parseInt(splitStrArr[i].substring(1, splitStrArr[i].indexOf('-')));
			  //System.out.println("Replaced String111 Is :"+splitStrArr[i].substring(1, splitStrArr[i].indexOf('-')));
			
			  end=Integer.parseInt(splitStrArr[i].substring(splitStrArr[i].indexOf('-')+1, splitStrArr[i].indexOf(']')));
			  //System.out.println("Replaced String222 Is :"+splitStrArr[i].substring(splitStrArr[i].indexOf('-')+1, splitStrArr[i].indexOf(']')));
			
			
			   for(j=start;j<=end;j++)
			   {
				  //System.out.println("Inside For***** "+j+" *****");
				  TcList.add(String.valueOf(j));
			   }
		    }
		
		    else
		    {
			//System.out.println("----"+splitStrArr[i]+"----");
			TcList.add(splitStrArr[i]);
		    }
     }
	       return TcList;
 }
 
 

public void onStart(ISuite arg0) 
{
	
Config.TestExecutionList=new ArrayList<String>();
Config.TestExecutionList=TcExecutionId(arg0);

//System.out.println("******* "+Config.TcExecutionList.size()+" @@************");
System.out.println("\\n"+" Suite execution Started:Suite Name:"+arg0.getName());
}
	
private void getTagValue1() {
// TODO Auto-generated method stub

}


private void elseIf(boolean containsKey) {
	// TODO Auto-generated method stub
	
}


public void onFinish(ISuite arg0) {

	System.out.println("Suite Excecution Finished:"+arg0.getName()+"\n");
}


}
