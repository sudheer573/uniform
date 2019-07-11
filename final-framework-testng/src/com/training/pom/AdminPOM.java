package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPOM {
private WebDriver driver; 
	
	public AdminPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='input-username']")
	private WebElement Username;
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	@FindBy(xpath="//li[@id='catalog']")
	private WebElement catelog;
	@FindBy(xpath="//a[text()='Products']")
	private WebElement Product;
	@FindBy(xpath="//a[@data-original-title='Add New']")
	private WebElement Newicon;
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement Productname;
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement Metatag;
	@FindBy(xpath="//a[text()='Data']")
	private WebElement Datatab;
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement Modelname;
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement Price;
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement Quantity;
	@FindBy(xpath="//a[text()='Links']")
	private WebElement Linkstab;
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement Categories;
	@FindBy(xpath="//li[@data-value='368']")
	private WebElement Dropdown;
	@FindBy(xpath="//a[text()='Discount']")
	private WebElement Discounttab;
	@FindBy(xpath="//button[@data-original-title='Add Discount']")
	private WebElement Addiscount;
	@FindBy(xpath="(//input[@placeholder='Quantity'])[2]")
	private WebElement Quantity1;
	@FindBy(xpath="(//input[@placeholder='Price'])[2]")
	private WebElement Price1;
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[2]")
	private WebElement Startdateicon;
	@FindBy(xpath="(//td[@class='day active today'])[1]")
	private WebElement Currentdate;
	@FindBy(xpath="(//i[@class='fa fa-calendar'])[3]")
	private WebElement Enddateicon;
	@FindBy(xpath="(//td[@class='day active today'])[2]/following-sibling::td")
	private WebElement Nextday;
	@FindBy(xpath="(//a[text()='Reward Points'])[2]")
	private WebElement Rewardstab;
	@FindBy(xpath="//input[@id='input-points']")
	private WebElement Points;
	@FindBy(xpath="//button[@data-original-title='Save']")
	private WebElement Save;
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement Alert1;
	
	/*public void Premium(){
		Actions act = new Actions(driver);
		act.moveToElement(PremiumSchool).click().build().perform();
		 //  this.PremiumSchool.click();
	}*/
	public void Catelog(){
		Actions act = new Actions(driver);
		act.moveToElement(catelog).build().perform();
	}
	 /* Method to click on the products*/
	public void Product(){
		Actions act = new Actions(driver);
		act.moveToElement(Product).click().build().perform();
	}
	/* Method to click on New icon*/
	public void Newicon(){
	  this.Newicon.click();
	}
	/* Method to click on Data tab*/
	public void Datatab(){
		  this.Datatab.click();
		}
	/* Method to click on Link tab*/
	public void Linkstab(){
		  this.Linkstab.click();
		}
	/* Method to click on Discount tab*/
	public void Discounttab(){
		  this.Discounttab.click();
		  
		}
	/* Method to click on add discount*/
	public void Addiscount(){
		  this.Addiscount.click();
		  
		}
	/* Method to click on login*/
	public void Login(){
		  this.Login.click();
	}
	/* Method to click categories*/
    public void clickCategories() {
    this.Categories.click();
		  }
    /* Method to click on categories dropdown*/
	public void Dropdown(){
		  this.Dropdown.click();
		}
	/* Method to print the message*/
	 public void Alert(){
		String text=this.Alert1.getText();
		  System.out.println(text);
	}
	 /* Method to click on start date icon*/
	  public void Startdateicon() {
		  this.Startdateicon.click();
		}
	  /* Method to select on current icon*/
	  public void Currentdate() {
		  this.Currentdate.click();
		}
	  /* Method to click on Save button*/
	  public void Save() {
		  this.Save.click();
		}
	  /* Method to click on rewards tab*/
	  public void Rewardstab() {
		  this.Rewardstab.click();
		}
	  /* Method to click on End date icon*/
	  public void Enddateicon() {
		  this.Enddateicon.click();
		}
	  /* Method to select the end date*/
	  public void Nextday() {
		  this.Nextday.click();
		}
	  /* Method to give the value of price*/
	public void sendPrice(String Price) {
		this.Price.clear();
		this.Price.sendKeys(Price);
	}
	/* Method to send the Model name*/
	public void sendModelname(String Phone) {
		this.Modelname.clear(); 
		this.Modelname.sendKeys(Phone);
	}
	/* Method to send the User name*/
	public void sendUsername(String Username) {
			this.Username.clear();
			this.Username.sendKeys(Username);
	}
	/* Method to send the Password*/
	public void sendPassword(String Password) {
			this.Password.clear(); 
			this.Password.sendKeys(Password);
	}
	/* Method to send the Price*/
	public void sendPrice1(String Price1) {
		this.Price1.clear(); 
		this.Price1.sendKeys(Price1);
}
	/* Method to send the metatag value*/
	public void sendMetatag(String Metatag) {
		this.Metatag.clear(); 
		this.Metatag.sendKeys(Metatag);
}
	/* Method to send the quantity*/
	public void sendQuantity(String Quantity) {
		this.Quantity.clear(); 
		this.Quantity.sendKeys(Quantity);
}
	/* Method to send the quantity1*/
	public void sendQuantity1(String Quantity1) {
		this.Quantity1.clear(); 
		this.Quantity1.sendKeys(Quantity1);
}
	/* Method to send the Product name*/
	public void sendProductname(String Productname) {
		this.Productname.clear(); 
		this.Productname.sendKeys(Productname);
}
	/* Method to send the Points*/
	public void sendPoints(String Points) {
		this.Points.clear(); 
		this.Points.sendKeys(Points);
}

}

