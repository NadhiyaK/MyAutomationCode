package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import EndtoEnd.EndtoEndAuto.base;



public class Loginpage extends base{

	//public WebDriver driver;
	By username = By.id("email");
	By password = By.id("password");
	By loginbutton = By.xpath("//input[@type='submit']");
	By logo = By.cssSelector("input[type='submit']");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement pwd()
	{
		return driver.findElement(password);
	}
	public WebElement Logbut()
	{
		return driver.findElement(loginbutton);
	}
	public WebElement logo()
	{
		return driver.findElement(logo);
	}


	
	
}
