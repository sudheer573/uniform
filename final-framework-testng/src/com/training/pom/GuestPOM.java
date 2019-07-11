package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GuestPOM {
private WebDriver driver; 
	
	public GuestPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='banner1']")
	private WebElement PremiumSchool;
	@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
	private WebElement AddCart;
	@FindBy(xpath="//img[@alt='REGULAR T-SHIRTS (Rust)']")
	private WebElement Shirt;
	@FindBy(xpath="//select[@name='option[376]']")
	private WebElement dropdown;
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement Addcart1;
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement alert1;
	@FindBy(xpath="//div[@id='cart']")
	private WebElement Mouseover;
	@FindBy(xpath="//strong[text()=' View Cart']")
	private WebElement Viewcart;
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement Checkout;
	@FindBy(xpath="//input[@value='guest']")
	private WebElement Guest;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement Continue;
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LName;
	@FindBy(xpath="//input[@id='input-payment-email']")
	private WebElement Email1;
	@FindBy(xpath="//input[@id='input-payment-telephone']")
	private WebElement Phone;
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	private WebElement Address1;
	@FindBy(xpath="//input[@id='input-payment-city']")
	private WebElement City;
	@FindBy(xpath="//select[@id='input-payment-zone']")
	private WebElement State;
	@FindBy(xpath="//input[@id='input-payment-postcode']")
	private WebElement Postcode;
	@FindBy(xpath="//input[@id='button-guest']")
	private WebElement Continue1;
	@FindBy(xpath="//textarea")
	private WebElement Comment;
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement Continue2;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement Checkbox;
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement Continue3;
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement Confirmorder;
	
	/* Method to move element to premium school*/
	public void Premium(){
		Actions act = new Actions(driver);
		act.moveToElement(PremiumSchool).click().build().perform();
	}
	/* Method to move element to T-shirt*/
	public void Shirt(){
		Actions act = new Actions(driver);
		act.moveToElement(Shirt).build().perform();
	}
	/* Method to move element to select REGULAR T-SHIRTS (Rust)*/
	public void Mouseover(){
		Actions act = new Actions(driver);
		act.moveToElement(Mouseover).click().build().perform();
	}
	/* Method to add the item to cart*/
	public void Add(){
	  this.AddCart.click();
	}
	/* Method to View cart*/
	public void ViewCart(){
		  this.Viewcart.click();
		}
	/* Method to add cart*/
	public void Add1(){
		  this.Addcart1.click();
		}
	/* Method to checkout the item*/
	public void Checkout(){
		  this.Checkout.click();
		  
		}
	/* Method to select Guest radio button*/
	public void Guest(){
		  this.Guest.click();
		  }
	/* Method to continue after selection of Guest radio button*/
	public void Continue(){
		  this.Continue.click();
		  
		}
	/* Method to select value from dropdown*/
	public void Dropdown(){
	  Select se = new Select(dropdown);
	  se.selectByValue("973");
	}
	/* Method to select state*/
	public void State(){
		  Select se = new Select(State);
		  se.selectByValue("1476");
		}
	/* Method to print the success message*/
	  public void Alert(){
		String text=this.alert1.getText();
		  System.out.println(text);
	}
	  /* Method to continue after guest details given*/
	  public void Continue1() {
		  this.Continue1.click();
		}
	  /* Method to continue after shipping details given*/
	  public void Continue2() {
		  this.Continue2.click();
		}
	  /* Method to click the check box*/
	  public void Checkbox1() {
		  this.Checkbox.click();
		}
	  /* Method to continue after selection of check box*/
	  public void Continue3() {
		  this.Continue3.click();
		}
	  /* Method to confirm the order*/
	  public void Confirmorder() {
		  this.Confirmorder.click();
		}
	  /* Method to send the Email address*/
	public void sendEmail1(String Email1) {
		this.Email1.clear();
		this.Email1.sendKeys(Email1);
	}
	 /* Method to send the phone number*/
	public void sendPhone(String Phone) {
		this.Phone.clear(); 
		this.Phone.sendKeys(Phone);
	}
	 /* Method to send the first name*/
	public void sendFirstNAME(String Firstname) {
			this.Firstname.clear();
			this.Firstname.sendKeys(Firstname);
	}
	 /* Method to send the last name*/
	public void sendLastName(String LName) {
			this.LName.clear(); 
			this.LName.sendKeys(LName);
	}
	 /* Method to send the address*/
	public void sendAddress1(String Address1) {
		this.Address1.clear(); 
		this.Address1.sendKeys(Address1);
}
	 /* Method to send the city name*/
	public void sendCity(String City) {
		this.City.clear(); 
		this.City.sendKeys(City);
}
	 /* Method to send the postcode*/
	public void sendPostcode(String Postcode) {
		this.Postcode.clear(); 
		this.Postcode.sendKeys(Postcode);
}
	 /* Method to send the comment for delivery instructions */
	public void sendtext(String Comment) {
		this.Comment.clear(); 
		this.Comment.sendKeys(Comment);
}
}

