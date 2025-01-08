package Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import genericutility.Forgotpasswordpage;
import genericutility.LoginPOMpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyForgotPasswordpage {

	@Test(groups="smoke")
	
	public void forgotpasswordpage()
	{
	
		LoginPOMpage lp=new LoginPOMpage();
	lp.getForgotpasswordlink();
	Forgotpasswordpage fp=new Forgotpasswordpage();
	fp.getmobilenumber();
	fp.getsubmitbutton();
	
	
	
		
	}
}
