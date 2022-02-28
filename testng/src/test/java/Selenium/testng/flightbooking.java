package Selenium.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flightbooking {
@Test
public void flightbook() {
	System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("divpaxinfo")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	for(int i = 1; i<=5; i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	
	
}
	
	
}
