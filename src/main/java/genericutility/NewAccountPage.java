package genericutility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage {

@FindBy(xpath="//input[@name='firstname']")
private WebElement firstnametext;

@FindBy(xpath="//input[@name='lastname']")
private WebElement lastnametext;

@FindBy(xpath="//input[@name='reg_email__']")
private WebElement mobilenotext;

@FindBy(xpath="//input[@data-type='password']")
private WebElement newpasswordtext;


public WebElement getfirstnametext()
{
	return firstnametext;
}
public WebElement getfirstnametext()
{
	return firstnametext;
}


}
