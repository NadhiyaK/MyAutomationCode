package NCAA.ncaa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nhs {

	
	@Test
	public static void nhs1() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ahs.com/");
		System.out.println(driver.findElement(By.xpath("//div[@id='homepage_coverage_details_LaundryAppliances']/p")).getText());
		
	}
}
