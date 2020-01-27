package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By contactIcon = By.xpath("//a[contains(text(),'Contact')]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public  WebElement login()
	{
		return driver.findElement(signin);
		
	}
	
	public  WebElement gettitle()
	{
		return driver.findElement(title);
		
	}
	
	public  WebElement contactIcon()
	{
		return driver.findElement(contactIcon);
		
	}
}
