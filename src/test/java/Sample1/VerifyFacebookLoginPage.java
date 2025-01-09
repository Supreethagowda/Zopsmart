package Sample1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import genericutility.LoginPOMpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyFacebookLoginPage extends Baseclass {
	
	@Test
	public void LaunchApplication()
	{
	
		driver.get("https://www.facebook.com/");
	}
	@Test(groups="smoke")
	public void loginpage()
	{
		
	
		LoginPOMpage lp=new LoginPOMpage(driver);
		lp.getemailtext();
		lp.getpasswordtext();
	lp.loginbtn();
	//String expectedtitle="Homepage";
	//String acttitle=driver.getTitle();
	
	//	Assert.assertEquals(expectedtitle, acttitle);
	}

}
