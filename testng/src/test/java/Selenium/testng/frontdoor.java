package Selenium.testng;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class frontdoor {

	@Test
	public void ahs() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/nkarunakaran/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.frontdoorhome.com/");
		driver.findElement(By.partialLinkText("Services")).click();
		driver.findElement(By.linkText("American Home Shield")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		String title = driver.getTitle();
		Assert.assertEquals("America’s #1 Home Warranty Company | American Home Shield", title);
		driver.switchTo().window(parentid);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement logo = driver.findElement(By.className("logo"));
		File logofil = logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(logofil, new File("logo.png"));
		
		if(logofil.exists())
		{
			System.out.println("Image logo is captured");
		}
		else
			System.out.println("Image logo is not available");
		
		BufferedImage expectedlogo = ImageIO.read(new File("/Users/nkarunakaran/Documents/Selenium/screenshots/logo.png"));
		BufferedImage actuallogo = ImageIO.read(new File("logo.png"));
		ImageDiffer imagediff = new ImageDiffer();
		ImageDiff img = imagediff.makeDiff(expectedlogo, actuallogo);
		
		
		
		if(img.hasDiff()==true)
		{
			System.out.println("Images are not same");
		}
		else
		{
			System.out.println("Images are same");
		}
	}
}
