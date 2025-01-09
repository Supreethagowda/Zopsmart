package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMpage {

@FindBy(xpath="//input[@name='email']")
private WebElement emailtextfld;

@FindBy(xpath="//input[@name='pass']")
private WebElement passwordtextfld;

@FindBy(xpath="//button[@name='login']")
private WebElement Loginbtn;

@FindBy(xpath="//a[contains(.,'Forgotten password?')]")
private WebElement Forgotpasswordlink;

@FindBy(xpath="//a[contains(.,'Create new account')]")
private WebElement createnewaccount;


public LoginPOMpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getemailtext()
{
	return emailtextfld;
}
public WebElement getpasswordtext()
{
	return passwordtextfld;
}
public WebElement loginbtn()
{
	return Loginbtn;
}
public WebElement getForgotpasswordlink()
{
	return Forgotpasswordlink;
}
public WebElement getcreatenewaccount()
{
	return createnewaccount;
}

public void LogintoApp(String emailtext,String passwordtext)
{
	emailtextfld.sendKeys(emailtext);
	passwordtextfld.sendKeys(passwordtext);
	Loginbtn.click();
	Forgotpasswordlink.click();
	createnewaccount.click();
}
}
