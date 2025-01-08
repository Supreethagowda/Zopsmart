package genericutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgotpasswordpage {

@FindBy(xpath="//input[@placeholder='Email address or mobile number']")
private WebElement mobilenumbertext;

@FindBy(xpath="//a[contains(.,'Cancel')]")
private WebElement cancelbtn;

@FindBy(xpath="//button[@type='submit']")
private WebElement submitbutton;

public WebElement getmobilenumber()
{
	return mobilenumbertext;
}

public WebElement getcancelbtn()
{
	return cancelbtn;
}
public WebElement getsubmitbutton()
{
	return submitbutton;
}
public void Forgotpasswordpage(String mobilenumber)
{
	mobilenumbertext.sendKeys(mobilenumber);
	cancelbtn.click();
	submitbutton.click();
}

}
