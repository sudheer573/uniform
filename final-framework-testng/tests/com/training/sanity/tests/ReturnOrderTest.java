package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.ReturnOrderPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ReturnOrderTest {
	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ReturnOrderPOM returnOrderPOM;
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
		returnOrderPOM = new ReturnOrderPOM(driver);
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
	public void ReturnTest() {
		loginPOM.clickDropdown();
		loginPOM.clicklogin();
		loginPOM.sendUserName("sudheer.katikireddy@gmail.com");
		loginPOM.sendPassword("Sudheer123");
		loginPOM.clickLoginBtn(); 
		returnOrderPOM.clickDropdown();
		returnOrderPOM.clickOrderhistory();
		returnOrderPOM.clickViewicon();
		returnOrderPOM.clickReturnicon();
		returnOrderPOM.clickRadioBtn();
		returnOrderPOM.clickYes();
		returnOrderPOM.sendFaultydetail("Incorrect Item");
		returnOrderPOM.clickCheckbox();
		returnOrderPOM.clickSubmit();
		returnOrderPOM.Alert1();
		returnOrderPOM.Alert2();
	}
	
}

