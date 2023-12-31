package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass 
{
	
	public WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	  
		System.setProperty("webdriver.chrome.driver", "D:\\DEMO\\Maven\\BroweserFile\\chromedriver.exe");
		driver=new ChromeDriver(op);
		driver.get(UtilityClass.readDataFromPF("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

}
