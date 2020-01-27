package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class HomePage extends base {

	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest()
	public void initialize() throws IOException
	{
		driver= initializeDriver();
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String email, String password) throws IOException
	{

		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.login().click();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(email);
		lp.getpassword().sendKeys(password);
		lp.loginbutton1().click();
		log.info("username password entered and clicked on login button");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="123456";
		//data[0][2]="non restricted  user";
		data[1][0]="restricteduser@gmail.com";
		data[1][1]="678921";
		//data[1][2]="restricted  user";
		
		return data;
	}

	@AfterTest()
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
