package NCAA.MML;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.base;

public class ncaahomepage extends base{

	
	@Test
	public void homepagenavigation() throws IOException, InterruptedException
	{
		driver = utilities();
		driver.get("https://mml:turn3rsp0rt5!@uat.ncaa.com/march-madness-live/watch?env=r1d2live4&mmlDebug=logging");
	//	driver.findElement(By.cssSelector(".top-level.menu-item-march_madness_live")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,200)");
	
		HomePage hp = new HomePage(driver);
		hp.gametile().click();
	//	WebElement spotlight = hp.spotlight();
	//	spotlight.findElement(null)
		
		
		 
	}
}
