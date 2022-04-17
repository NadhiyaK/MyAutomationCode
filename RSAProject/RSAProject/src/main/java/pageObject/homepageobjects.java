package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobjects {

	WebDriver driver;
	public homepageobjects(WebDriver driver) {
		this.driver=driver;
	}
	
	By username = By.id("email");
	By password = By.id("password");
	By login = By.cssSelector("[value='Login']");
	
	
	public WebElement username() {
		return driver.findElement(username);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement loginbutton() {
		return driver.findElement(login);
	}
}