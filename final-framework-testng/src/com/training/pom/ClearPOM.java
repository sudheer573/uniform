package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClearPOM {
private WebDriver driver; 
	
	public ClearPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Edit Account']")
	private WebElement EditAccount;
	@FindBy(xpath="(//input[@type='text'])[1]")
	private static WebElement FName;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement LName;
	@FindBy(xpath="//input[@type='email']")
	private WebElement Email;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement Telephone;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Continue;
	public void clickContinue() {
		   this.Continue.click();
	}
	public void Edit() {
		   this.EditAccount.click();
	}
	public void sendEmail(String Email) {
		this.Email.clear();
		this.Email.sendKeys(Email);
	}
	
	public void sendTelephone(String Telephone) {
		this.Telephone.clear(); 
		this.Telephone.sendKeys(Telephone);
	}
	public void sendFirstNAME(String FName) {
			this.FName.clear();
			this.FName.sendKeys(FName);
		}
	public void sendLastName(String LName) {
			this.LName.clear(); 
			this.LName.sendKeys(LName);
	}
}
