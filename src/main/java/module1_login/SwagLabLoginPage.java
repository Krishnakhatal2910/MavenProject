package module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	//step1: declaration 
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']")private WebElement login;
	
	//step2: initialization
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//enter un
	public void inpSwagLabLoginPageUsername(String UNValue) 
	{
		UN.sendKeys(UNValue);
	}
	//enter pw
	public void inpSwagLabLoginPagePassword(String PWValue)
	{
	  PWD.sendKeys(PWValue);	
	}
	//click on login btn
	public void clickSwagLoginPageLoginBtn() 
	{
	   login.click();	
	}
	

}
