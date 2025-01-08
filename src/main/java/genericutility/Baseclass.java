package genericutility;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {


public static Properties p=null; 

public DatabaseUtility dlib=new DatabaseUtility();


public static WebDriver sdriver;

@BeforeClass(alwaysRun=true)
{
	public void config()
	{
		String BROWSER=flib.getPropertyKeyValue("browser1");
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid browser");
		}
		sdriver=driver;
		wlib.maximizeTheBrowser(driver);
	}
	@BeforeMethod(alwaysRun=true)
	{
		public void configBM()
		{
			String URL=flib.getPropertyKeyValue("url");
			driver.get(URL);
			
		}
		@AfterClass(alwaysRun=true)
		{
			public void configAC()
			{
				driver.quit();
				System.out.println("---close the Browser--");
			}
		}
	}
}

