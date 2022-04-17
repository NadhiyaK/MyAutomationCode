package NCAA.ncaa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("nadhima28");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Ayush@2410");
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		String error = driver.findElement(By.cssSelector("p[class='error']")).getText();
		System.out.println(error);
		driver.close();
	}

}
