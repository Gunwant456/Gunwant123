package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.*;

//import org.apache.logging.log4j.core.util.FileUtils;
public class base {

	//public File result;
public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Gunwant\\Automation\\apache-maven-3.6.3\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");

		if (browserName.equals("chrome"));
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Gunwant\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		/*else if(browserName.equals("firefox"));
		{
			//Firefox code
			 System.setProperty("webdriver.gecko.driver", "D:\\Gunwant\\Automation\\geckodriver\\geckodriver.exe");
		     driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE"));
		{
			System.setProperty("webdriver.ie.driver","D:\\Gunwant\\Automation\\IEDriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} */
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	
		
	}
/*	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copyFile(src, "D:\\Gunwant\\Automation\\Screenshots\\"+result+"screenshot.png");
	//	FileHandler.copyFile(src,"D:\\Gunwant\\Automation\\Screenshots\\"+result+"screenshot.png");
		//FileUtils.copyFile(src, "D://Gunwant//Automation//Screenshots//"+result+"screenshot.png" );
		FileHandler.copy(src, "D:\\Gunwant\\Automation\\Screenshots\\"+result+"screenshot.png");
		org.openqa.selenium.io.FileHandler.copy(src, "D:\\Gunwant\\Automation\\Screenshots\\"+result+"screenshot.png");
		
	}*/
}
