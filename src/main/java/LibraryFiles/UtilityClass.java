package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String getTD(int rowIndex, int celIndex) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("D:\\DEMO\\Maven\\TestData\\SauceLabTestData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowIndex).getCell(celIndex).getStringCellValue();
		return value;
	}
	
	public static void captureSS(WebDriver driver, int TCID) throws IOException 
	{
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   
	   File dest=new File("D:\\DEMO\\Maven\\FailedTCesSS\\TestCaseID_"+TCID+ ".png");
	   
	   FileHandler.copy(src, dest);
	}
	
	public static String readDataFromPF(String key) throws IOException
	{
	
        FileInputStream file=new FileInputStream("D:\\Demo_practice_task\\4sep_Maven\\PropertyFile.properties");
        
        Properties p=new Properties();
        p.load(file);
        
        String value = p.getProperty(key);
        return value;
        
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
