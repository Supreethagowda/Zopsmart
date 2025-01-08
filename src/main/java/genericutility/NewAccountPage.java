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

@FindBy(xpath="//button[@name='websubmit']")
private WebElement submitbtn;

public WebElement getfirstnametext()
{
	return firstnametext;
}
public WebElement getlastnametext()
{
	return lastnametext;
}
public WebElement getregemailtext()
{
	return mobilenotext;
}
public WebElement getmobilenotext()
{
	return newpasswordtext;
}
public WebElement getsubmitbtn()
{
	return submitbtn;
}
public void NewAccountpage(String firstname,String lastname,int mobileno, String newpassword)
{
	firstnametext.sendKeys("Supreetha");
	lastnametext.sendKeys("gowda");
	mobilenotext.sendKeys("9898787822");
	newpasswordtext.sendKeys("Supri66@");
	submitbtn.click();
	
}
}
