package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class HomePage{
	
	public WebDriver driver;
	
	
	By gametile = By.xpath("(//a[@href='/march-madness-live/game/214'])[2]");
//	By spotlight = By.link
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement gametile()
	{
		
		return driver.findElement(gametile);
	}
//	public WebElement spotlight()
//	{
		
	//	return driver.findElement(spotlight);
//	}
	
	

}
