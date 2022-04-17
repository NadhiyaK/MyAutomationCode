package Java.Coding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workdaymain {

	public static void initializedriver()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	public static int calculator(int a, int b, String operation)
	{
		int result = 0;
		if(operation.equalsIgnoreCase("add"))
		{
			result = a +b;
		}
		if(operation.equalsIgnoreCase("subtract"))
		{
			result = a -b;
		}
		if(operation.equalsIgnoreCase("multiply"))
		{
			result = a * b;
		}
		if(operation.equalsIgnoreCase("divide"))
		{
			result = b / a;
		}
		return result;
	}
	

}
