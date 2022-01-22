package com.QA.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.QA.TestBase.TestBase;
import com.QA.Utilities.ReadConfigPro;


public class PageLayer extends TestBase{
	ReadConfigPro r = new ReadConfigPro();
	public PageLayer() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='pageContent']")
	WebElement ClickEnter;
	@FindBy(xpath = "//span[@id = 'nav-link-accountList-nav-line-1']")
	WebElement HoverToElement;
	@FindBy(xpath = "(//span[@class = 'nav-action-inner'])[1]")
	WebElement SignInButton;
	public void ClickOnSignInButton() {
		ClickEnter.click();
		Actions a = new Actions(driver);
		a.moveToElement(HoverToElement).perform();
		SignInButton.click();
	}
	
	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement UsernameBox;
	@FindBy(xpath = "//input[@id='continue']")
	WebElement ContniueButton;
	public void InputUsername() {
		UsernameBox.sendKeys(r.getUsername());
		ContniueButton.click();
	}
	
	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement PasswordBox;
	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement SignInButton1;
	public void InputPassword() {
		PasswordBox.sendKeys(r.getPassword());
		SignInButton1.click();
	}
	
	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	WebElement Logo;
	public boolean CheckLogo() {
		boolean f = Logo.isDisplayed();
		return f;
	}
	

}
