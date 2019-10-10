package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.BaseClass;

public class Login extends BaseClass {
public Login() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[@class='signupbtn']")
private WebElement sighupClk;
@FindBy(xpath="//input[@placeholder='Username']")
private WebElement userTxt;
@FindBy(xpath="//input[@id='input-email']")
private WebElement bemaiTxt;
@FindBy(xpath="//input[@id='input-password']")
private WebElement passTxt;
@FindBy(xpath="//button[@id='signupSubmit']")
private WebElement btnClk;
@FindBy(xpath="//a[contains(text(),'Login')]")
private WebElement loginClk;
@FindBy(xpath="//input[@id='login-email']")
private WebElement userNameTxt;
@FindBy(xpath="//input[@id='login-password']")
private WebElement passWordTxt;
@FindBy(xpath="//button[@id='loginSubmit']")
private WebElement loginBtnClk;

public WebElement getSighupClk() {
	return sighupClk;
}
public WebElement getUserTxt() {
	return userTxt;
}
public WebElement getBemaiTxt() {
	return bemaiTxt;
}
public WebElement getPassTxt() {
	return passTxt;
}
public WebElement getBtnClk() {
	return btnClk;
}
public WebElement getLoginClk() {
	return loginClk;
}
public WebElement getUserNameTxt() {
	return userNameTxt;
}
public WebElement getPassWordTxt() {
	return passWordTxt;
}
public WebElement getLoginBtnClk() {
	return loginBtnClk;
}

}
