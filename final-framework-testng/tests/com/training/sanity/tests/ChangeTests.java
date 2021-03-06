package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ChangePOM;
import com.training.pom.ClearPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ChangeTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private ChangePOM changePOM;
	private ClearPOM clearPOM;
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
		clearPOM = new ClearPOM(driver);
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
	public void validChangeTest() {
		loginPOM.clickDropdown();
		loginPOM.clicklogin();
		loginPOM.sendUserName("sudheer.katikireddy@gmail.com");
		loginPOM.sendPassword("sudheer123");
		loginPOM.clickLoginBtn();  
		changePOM.ChangePassword();
		changePOM.sendPassword("Sudheer123");
		changePOM.sendConfirmPassword("Sudheer123");
		changePOM.clickContinue();
	}
}