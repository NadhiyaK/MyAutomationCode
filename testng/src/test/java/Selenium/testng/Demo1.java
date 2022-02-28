package Selenium.testng;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nba.com");
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Teams")).click();
		Assert.assertEquals(title, "The official site of the NBA for the latest NBA Scores, Stats & News. | NBA.com", "Test Failed");
		driver.findElement(By.linkText("Atlanta Hawks")).click();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[@title='Close (Esc)']")).click();
		driver.switchTo().window(parentid);
		
	}

}
