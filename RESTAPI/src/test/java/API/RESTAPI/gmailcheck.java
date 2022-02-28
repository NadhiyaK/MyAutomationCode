package API.RESTAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmailcheck {

	@Test
	public static void gmail() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.cssSelector("input[type='email']")).click();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("nadhima28@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Arush@1008");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.close();
		
		
		
	}
	
	
	
}
