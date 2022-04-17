package NCAA.ncaa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NBAteams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
