package module1_login_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import module1_login.SwagLabLoginPage;
import module4_orders.SwagLabHomePage;
import module5_menu.SwagLabMenuPage;

public class SwagLabLoginTest1 extends BaseClass 
{
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabMenuPage menu;
	int TCID;
	
	
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		initializeBrowser();
	    
		login=new SwagLabLoginPage(driver);
		home=new SwagLabHomePage(driver);
		menu=new SwagLabMenuPage(driver);
		int TCID;
	}
	@BeforeMethod
	public void loginToApp() throws IOException, InterruptedException 
	{
		login.inpSwagLabLoginPageUsername(UtilityClass.readDataFromPF("UN"));
		login.inpSwagLabLoginPagePassword(UtilityClass.readDataFromPF("PWD"));
		login.clickSwagLoginPageLoginBtn();
		
		Thread.sleep(3000);
	}
	@Test(priority=1)
	public void verifyLogo() 
	{
		TCID=162;
		boolean actResult =home.getSwagLabHomePageLogo();////false;//
		Assert.assertTrue(actResult, "Failed: actResult is false");
	}
	@Test(priority=2)
	public void addToCartBtn() throws EncryptedDocumentException, IOException 
	{
		TCID=161;
		home.clickSwagLabHomePageAddTocart();
		String extResult =UtilityClass.getTD(0, 2);
		String actResult=home.clickSwagLabHomePageRemoveBtn();
		Assert.assertEquals(actResult, extResult, "Failed102: both results are diff");
	}
	
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws InterruptedException, IOException 
	{
		
		if(s1.getStatus()==ITestResult.FAILURE)//always return fail 
		{
			UtilityClass.captureSS(driver, TCID);
		}
		home.clickOnSwagLabHomePageOpenMenu();
		Thread.sleep(3000);
		menu.clickSwagLabMenuPageLogout();
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.close();
	}
	
	

}
