package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	public WebDriver driver;
	By username = By.xpath("//input[@id='user_email']");
	By password = By.xpath("//input[@id='user_password']");
	By loginbutton = By.xpath("//input[@name='commit']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public  WebElement getusername()
	{
		return driver.findElement(username);
		
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginbutton1()
	{
		return driver.findElement(loginbutton);
	}
}

