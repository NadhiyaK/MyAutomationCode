package Java.Coding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ahs.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(800,800)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.xpath("(//*[local-name()='svg'])[11]")).click();
		String url = driver.findElement(By.cssSelector("div[class*='text-center'] img[class='inline CoverageDetailsSection_coverageDetailsDialogIcon__E5P3O']")).getAttribute("src");
		System.out.println(url);
		driver.findElement(By.xpath("//*[@class='text-currentcolor text-black']")).click();
		driver.close();
	
		//	driver.findElement(By.cssSelector("div[class*='dialog w-full mx-3 rounded-5 overlay-content']"))
		

}
}
