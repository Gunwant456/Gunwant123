package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class ValidateTitle extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeGroups()
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to homepage");
		
	}
	@Test
	public void basePageNavigation() throws IOException
	{

		LandingPage l = new LandingPage(driver);
		Assert.assertFalse(l.contactIcon().isDisplayed());
		log.info("successfully validated");
	}

	@AfterTest()
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
