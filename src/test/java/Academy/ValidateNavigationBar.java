package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class ValidateNavigationBar extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest()
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void basePageNavigation() throws IOException
	{
	
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.gettitle().getText(), "FEATURED COURSES");
		log.info("Title is validated");
	//	Assert.assertTrue(l.contactIcon().isDisplayed());
	}

	@AfterTest()
	public void teardown()
	{
		driver.close();
		driver=null;	
	}
}
