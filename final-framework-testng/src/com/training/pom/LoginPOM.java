package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	private WebElement Dropdown;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login; 
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement userName; 
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
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
	//@FindBy(xpath="//a[text()='View your order history']")
	//private WebElement order;
	public void clickDropdown() {
	   this.Dropdown.click();
	}
	public void clicklogin() {
		   this.login.click();
	}
	public void clickContinue() {
		   this.Continue.click();
	}
   // public void clickorder() {
	//this.order.click();
	//	}
	public void Edit() {
		   this.EditAccount.click();
	}
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
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
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
