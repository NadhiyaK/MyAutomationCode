package Selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class ncaa {

	
	@Test
	public void ncaa() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ncaa.com/video");
		driver.findElement(By.xpath("//button[@class='player-slate-pre-play']")).click();
		Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("//div/span/span/i[@class='tui-icon tui-icon-pause']")).isEnabled())
		
		{
			System.out.println("Video is playing fine");
		}
		else
			System.out.println("Video is not working");
	}
}
