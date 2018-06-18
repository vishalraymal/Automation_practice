package ejagruti.finsys.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']")
	public WebElement username;
	
	public void EnterUserName(String userName)
	{
		username.sendKeys(userName);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
	public WebElement password;
	
	public void EnterPassword(String PassWord)
	{
		password.sendKeys(PassWord);
	}
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	public WebElement remebermecheckbox;
	
	public void clickRemember()
	{
		remebermecheckbox.click();
	}
	
	@FindBy(how=How.XPATH, using="//a[@id='']")
	public WebElement login;
	
	public void clickLogin()
	{
		login.click();
	}

	@FindBy(how=How.XPATH,using="//div[@id='error']")
	WebElement errorMsg;
	
	public void loginErrMsg(String errMsg)
	{
		errorMsg.getAttribute(errMsg);
	}
	
	@FindBy(how=How.XPATH, using ="//span[text()='Welcome dummy[FM]']")
	public WebElement loginText;
	
	public String getLoginText(){

		String text =loginText.getText();
		return text;
	}
	
	
	
}
