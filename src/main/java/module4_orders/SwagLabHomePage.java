package module4_orders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	//step1: declaration
	@FindBy(xpath="//div[@class='app_logo']")private WebElement logo;
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement OpenMenu;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement AddToCart;
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")private WebElement remove;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean getSwagLabHomePageLogo() 
	{
        boolean result=logo.isDisplayed();
        return result;
//		if (result=true) 
//		{
//			System.out.println("logo found pass");
//		} else 
//		{
//           System.out.println("logo not found fail");
//		}
	}
	public void clickOnSwagLabHomePageOpenMenu()
	{
		OpenMenu.click();
	}
	

	public void clickSwagLabHomePageAddTocart() 
	{
	    AddToCart.click();
	    
	}
	public String clickSwagLabHomePageRemoveBtn() 
	{
	    String actResult = remove.getText();
	    return actResult;
	}
	
}
	    
	
	
	

