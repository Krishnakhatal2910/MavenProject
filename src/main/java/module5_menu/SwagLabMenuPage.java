package module5_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabMenuPage 
{
	//step1: declaration
	@FindBy(xpath="//a[text()='Logout']")private WebElement logout;
	
	//step2: initialization
	
	public SwagLabMenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickSwagLabMenuPageLogout() 
	{
	   logout.click();	
	}
}
