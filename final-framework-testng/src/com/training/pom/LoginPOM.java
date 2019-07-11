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
	@FindBy(xpath="//a[text()='View your order history']")
	private WebElement order;
	
	@FindBy(xpath="//a[text()='Continue']")
	private WebElement continue1;
	/* Method to click on dropdown*/
	public void clickDropdown() {
	   this.Dropdown.click();
	}
	/* Method to click on login*/
	public void clicklogin() {
		   this.login.click();
	}
	/* Method to click on order*/
   public void clickorder() {
	this.order.click();
		}
   /* Method to click on continue1*/
   public void clickContinue1() {
	   this.continue1.click();
}
   /* Method to send the username*/
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	/* Method to send the password */
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	/* Method to click on loginbutton*/
	public void clickLoginBtn() {
		this.loginBtn.click(); 
			}
}
