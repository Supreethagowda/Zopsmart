package Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import genericutility.LoginPOMpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyNewAccountPage {

	@Test(groups="smoke")
	
	public void Rememberpasswordpage()
	{
	
		LoginPOMpage lp=new LoginPOMpage();
		ChromeOptions opt=new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		
	}

}
