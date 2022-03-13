package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import EndtoEnd.EndtoEndAuto.base;



public class Home {
	
		
		public WebDriver driver;
		By login = By.cssSelector(".theme-btn.register-btn");
		By popup = By.xpath("//button[text()='NO THANKS']");
		
		
		public Home(WebDriver driver) {
			this.driver=driver;
		}


		public WebElement loginpage(WebDriver driver)
		{
			return driver.findElement(login);
		}
		public WebElement popuphandle(WebDriver driver)
		{
			return driver.findElement(popup);
		}
		public int popuphandles(WebDriver driver)
		{
			return driver.findElements(popup).size();
		}
		
		
		
		
		
		
}
