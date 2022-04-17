package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpageclass {
	
	WebDriver driver;
	
	public landingpageclass(WebDriver driver) {
		this.driver = driver;
	}
	
	By login = By.cssSelector(".theme-btn.register-btn");
	By practice = By.linkText("Practice");
	
	

	public WebElement login() {
		return driver.findElement(login);
	}
	public WebElement practice() {
		return driver.findElement(practice);
		
		
	}
}
