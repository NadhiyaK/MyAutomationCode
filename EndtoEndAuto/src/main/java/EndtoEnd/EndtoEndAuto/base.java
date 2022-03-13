package EndtoEnd.EndtoEndAuto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver Initializedriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/nkarunakaran/Documents/Selenium/Git/EndtoEndAuto/src/main/java/EndtoEnd/EndtoEndAuto/data.properties");
		prop.load(fis);
		
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
			driver = new ChromeDriver();
			
		}
		if(browsername.equals("firefox"))
		{
			
		}
		if(browsername.equals("safari"))
		{
			driver = new SafariDriver();
			driver.get("www.ncaa.com");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		return driver;
	}
	
	
	
}
