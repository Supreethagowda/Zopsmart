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
	@Test(groups="smoke")
	public void loginpage()
	{
		String expectedtitle="Homepage";
	
		LoginPOMpage lp=new LoginPOMpage();
		lp.getemailtext();
		lp.getpasswordtext();
	lp.loginbtn();
	String acttitle=driver.getTitle();
	
		Assert.assertEquals(expectedtitle, acttitle);
	}

}
