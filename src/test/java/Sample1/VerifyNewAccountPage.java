package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericutility.LoginPOMpage;
import genericutility.NewAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyNewAccountPage {
	WebDriver driver;

	@Test(groups="smoke")
	
	public void Rememberpasswordpage()
	{
	
		LoginPOMpage lp=new LoginPOMpage();
	lp.getcreatenewaccount();
	NewAccountPage na=new NewAccountPage();
	na.getfirstnametext();
	na.getlastnametext();
	WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select sel=new Select(day);
		sel.selectByIndex(8);
	WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
	Select sel1=new Select(month);
	sel1.selectByVisibleText("Jan");
	WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
	Select sel2=new Select(year);
	sel2.selectByVisibleText("2025");
	driver.findElement(By.xpath("//label[contains(.,'Female')]")).click();
	na.getmobilenotext();
	na.getregemailtext();
	na.getsubmitbtn();
	
	}

}
