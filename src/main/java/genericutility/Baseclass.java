package genericutility;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {


public static Properties p=null; 

public DatabaseUtils dlib=new DatabaseUtils();
public Fileutils fu=new Fileutils();


public static  WebDriver driver;

@BeforeClass(alwaysRun=true)

	public void LaunchBrowser() throws IOException
	{
//		String URL=fu.getDataFromPropertyFile();
		String BROWSER=fu.getDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.print("Invalid Browser");
		}
}
@AfterClass(alwaysRun=true)
public void closeBrowser()
{
	System.out.print("close Browser");
}
}


