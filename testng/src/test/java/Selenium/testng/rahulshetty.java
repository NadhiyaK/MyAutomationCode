package Selenium.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulshetty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/nkarunakaran/Documents/Selenium/Git/testng/src/main/java/data.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='path' and @fill-rule='evenodd'])[9]")).click();
		System.out.println(driver.findElement(By.xpath("(//p[@class='text-center text-1 xs:whitespace-pre'])[2]")).getText());
		driver.findElement(By.xpath("(//*[name()='svg'])[11]")).click();
	}

}
