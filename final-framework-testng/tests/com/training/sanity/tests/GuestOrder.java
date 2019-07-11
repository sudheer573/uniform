package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChangePOM;
import com.training.pom.LoginPOM;
import com.training.pom.GuestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class GuestOrder {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ChangePOM changePOM;
	private GuestPOM guestPOM;
	private Select se;
	private Actions act;
	private JavascriptExecutor jse;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		changePOM = new ChangePOM(driver);
		guestPOM = new GuestPOM(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void GuestTest() {
		guestPOM.Premium();
		guestPOM.Shirt();
		guestPOM.Add();
		guestPOM.Dropdown();
		guestPOM.Add1();
		guestPOM.Alert();
		guestPOM.Mouseover();
		guestPOM.ViewCart();
		guestPOM.Checkout();
		guestPOM.Guest();
		guestPOM.Continue();
		guestPOM.sendFirstNAME("Sudheer");
		guestPOM.sendLastName("Kumar");
		guestPOM.sendEmail1("sudheer.katikireddy@gmail.com");
		guestPOM.sendPhone("9959600475");
		guestPOM.sendAddress1("Mainstreet");
		guestPOM.sendCity("Bhimavaram");
		guestPOM.sendPostcode("534244");
		guestPOM.State();
		guestPOM.Continue1();
		guestPOM.sendtext("Please Delivery by 10am to 7PM");
		guestPOM.Continue2();
		guestPOM.Checkbox1();
	    guestPOM.Continue3();
		guestPOM.Confirmorder();
	}
}
