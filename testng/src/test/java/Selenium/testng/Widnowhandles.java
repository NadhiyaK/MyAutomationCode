package Selenium.testng;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Widnowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("testing");
		List <WebElement> lists = driver.findElements(By.cssSelector(".sbct"));
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div/ul/li[1]"))).click().build().perform();
	//	a.keyDown(Keys.ENTER).build().perform();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.get("https://www.googlemaps.com");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}

}
