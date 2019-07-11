package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReturnOrderPOM {
private WebDriver driver; 
	
	public ReturnOrderPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Order History'])[1]")
	private WebElement Orderhistory;
	
	@FindBy(xpath="//span[@class='caret']")
	private WebElement Dropdown; 
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement Viewicon; 
	
	@FindBy(xpath="//i[@class='fa fa-reply']")
	private WebElement Returnicon;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement RadioBtn; 
	@FindBy(xpath="(//input[@value='1'])[3]")
	private WebElement orderopened;
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement Faultydetail;
	@FindBy(xpath="//input[@name='agree']")
	private WebElement Checkbox;
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement Submit;
	@FindBy(xpath="(//p)[2]")
	private WebElement Alert1;
	@FindBy(xpath="(//p)[3]")
	private WebElement Alert2;
	
	/* Method to click on dropdown*/
	public void clickDropdown() {
	   this.Dropdown.click();
	}
	/* Method to click on orderhistory link*/
	public void clickOrderhistory() {
		   this.Orderhistory.click();
	}
	/* Method to click on viewicon*/
	public void clickViewicon() {
	this.Viewicon.click();
		}
	/* Method to click on Return icon*/
   public void clickReturnicon() {
	   this.Returnicon.click();
  }
   /* Method to send faulty detail*/
	public void sendFaultydetail(String Faultydetail) {
		this.Faultydetail.clear();
		this.Faultydetail.sendKeys(Faultydetail);
	}
	/* Method to click on radiobutton*/
	public void clickRadioBtn() {
		this.RadioBtn.click(); 
	}
	/* Method to click on Yes radio button*/
	public void clickYes() {
		this.orderopened.click(); 
	}
	/* Method to click on checkbox*/
	public void clickCheckbox() {
		this.Checkbox.click(); 
	}
	/* Method to click on Submit*/
	public void clickSubmit() {
		this.Submit.click(); 
	}
	/* Method to print confirm message1*/
	public void Alert1() {
		String S = this.Alert1.getText(); 
		System.out.println(S);
	}
	/* Method to print confirm message2*/
	public void Alert2() {
		String S = this.Alert2.getText(); 
		System.out.println(S);
}
}


