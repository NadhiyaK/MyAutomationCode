package E2ERSAProject.RSAProject;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.homepageobjects;
import pageObject.landingpageclass;
import resources.baseclass;

public class landingPage extends baseclass{

	@BeforeTest
	public void browserinitialize() throws IOException {
		driver = initialize();
		
	}
	
	@Test(dataProvider="userdata")
	public void landingpagevalidation(String username, String password) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		landingpageclass lp = new landingpageclass(driver);
		lp.login().click();
		homepageobjects hp = new homepageobjects(driver);
		hp.username().sendKeys(username);
		hp.password().sendKeys(password);
		hp.loginbutton().click();
	}
	
@AfterTest
public void closingbrowser() {
	driver.close();
}
	
	@DataProvider()
	public Object[][] userdata() {
		Object[][] userdata = {{"nadhima28@gmail.com","12345"},{"ajanths@gmail.com","54321"}};
		return userdata;
	}
	
	
}
