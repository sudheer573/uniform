package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.AdminPOM;
import com.training.pom.ChangePOM;
import com.training.pom.LoginPOM;
import com.training.pom.GuestPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class AdminTest {
	private WebDriver driver;
	private String adminUrl;
	private AdminPOM adminPOM;
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
		adminPOM = new AdminPOM(driver);
		adminUrl = properties.getProperty("adminURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(adminUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test
	public void AdminTest() throws InterruptedException {
		adminPOM.sendUsername("admin");
		adminPOM.sendPassword("admin@123");
		adminPOM.Login();
		adminPOM.Catelog();
		adminPOM.Product();
		adminPOM.Newicon();
		adminPOM.sendProductname("Blazer Girls(7-8)");
		adminPOM.sendMetatag("Blazer for Girls");
		Thread.sleep(3000);
		adminPOM.Datatab();
		adminPOM.sendModelname("BLG-112");
		adminPOM.sendPrice("3000");
		adminPOM.sendQuantity("100");
		Thread.sleep(3000);
		adminPOM.Linkstab();
		adminPOM.clickCategories();
		adminPOM.Dropdown();
		Thread.sleep(3000);
		adminPOM.Discounttab();
		adminPOM.Addiscount();
		adminPOM.sendQuantity1("5");
		adminPOM.sendPrice1("200");
		adminPOM.Startdateicon();
		adminPOM.Currentdate();
		adminPOM.Enddateicon();
		adminPOM.Nextday();
		Thread.sleep(3000);
		adminPOM.Rewardstab();
		adminPOM.sendPoints("20");
		Thread.sleep(3000);
		adminPOM.Save();
		adminPOM.Alert();
	}
}

