package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePOM {
	private WebDriver driver;

	public ChangePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Password']")
	private WebElement ChangePassword;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement Password; 
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement ConfirmPassword; 
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Continue;
	
	public void ChangePassword() {
		this.ChangePassword.click();
	}
	public void sendPassword(String Password) {
		this.Password.clear();
		this.Password.sendKeys(Password);
	}
	
	public void sendConfirmPassword(String ConfirmPassword) {
		this.ConfirmPassword.clear(); 
		this.ConfirmPassword.sendKeys(ConfirmPassword); 
	}
	public void clickContinue() {
		   this.Continue.click();
	}
}
