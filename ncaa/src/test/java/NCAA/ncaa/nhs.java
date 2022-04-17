package NCAA.ncaa;

import java.io.File;
import java.time.Duration;
import java.util.List;



import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.Files;


public class nhs {

	@Test
	public static void nhs1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ahs.com/");
		
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		String name = driver.findElement(By.partialLinkText("Electrical")).getText();
//		System.out.println(name);
//		List<WebElement> appliancelist = driver.findElements(By.cssSelector("span[class='pl-3 text-center']"));
//		for(WebElement c : appliancelist)
//		{
//			if(c.getText().equalsIgnoreCase("Electrical Systems"))
//			{
//				
//			}
//					
//		}
		//System.out.println(driver.findElement(By.xpath("//div[@id='homepage_coverage_details_LaundryAppliances']/p")).getText());
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//js.executeScript("window.scrollBy(900, 900)");
//		js.executeScript("window.scrollBy(800,800)");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	//	driver.findElement(By.xpath("(//*[local-name()='svg'])[11]")).click();
//		
//		driver.findElement(By.cssSelector("div#homepage_coverage_details_ElectricalSystems h2 svg")).click();
//		driver.findElement(By.cssSelector("div[class='dialog-close-button'] button svg")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		js.executeScript("window.scrollBy(-800,-800)");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	List<WebElement> links = driver.findElements(By.cssSelector("nav[class*='horizontal-main-nav-menu'] ul li"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(800,800)");
//		String n = driver.findElement(By.cssSelector("div[id='homepage_coverage_details_ElectricalSystems'] p")).getText();
//		System.out.println(n);
		Thread.sleep(4000);
		WebElement ads = driver.findElement(By.xpath("//div[@id='HeroSection.Main']"));
		ads.findElement(By.className("button-label-text")).click();
		
		File act = ads.getScreenshotAs(OutputType.FILE);
		
		
//		TakesScreenshot scr = (TakesScreenshot)driver;
//		File file = scr.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("/Users/nkarunakaran/Documents/Selenium/screenshot.png");
//		Files.copyFile(scr, destfile);	
		
		
		
		//FileUtils.copyFile(scr, new File("/Users/nkarunakaran/Documents/Selenium"));
		
//		String val = driver.findElement(By.xpath("//div[@class='my-3 text-center text-base md:mx-16 lg:mx-32 xl:mx-64']")).getText();
//		System.out.println(val);
//		
//		String exp = driver.findElement(By.xpath("//ul[@class='horizontal-main-nav-menu-list']/li[2]")).getText();
//		String Act = "Blog";
//		if(Act.equalsIgnoreCase(exp))
//		{
//			System.out.println("They are matching");
//		}
//		else
//		{
//			System.out.println("They are not matching");
//		}
//		SoftAssert s = new SoftAssert();
//		s.assertEquals(exp, Act);
//		s.assertAll();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='horizontal-main-nav-menu-list']/li[2]")));
//		
		
				
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.findElement(By.linkText("Reviews")).click();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement frame = driver.findElement(By.className("Reviews_videoFrame__w_cR_"));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.switchTo().frame(frame);
//		driver.findElement(By.id("player")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		if(driver.findElement(By.xpath("//button[@title='Pause (k)']")).isEnabled())
//				{
//			System.out.println("Video is playing successfully");
//				}
//		else
//		{
//			System.out.println("Video is not playing ");
//		}
//		driver.switchTo().defaultContent();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		//JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(500,500)");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		int starcount = driver.findElements(By.cssSelector("div[class='flex flex-wrap justify-center md:mt-8'] div[class='flex flex-wrap relative mx-2 my-2 OpinionItem_opinionBox__92iJC OpinionItem_featuredBox__2beca Reviews_featuredItem__lnKcN'] div[class='flex items-end w-full justify-end'] span")).size();
//		System.out.println(starcount);
	}
}
