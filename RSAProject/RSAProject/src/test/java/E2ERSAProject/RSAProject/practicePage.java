package E2ERSAProject.RSAProject;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.landingpageclass;
import resources.baseclass;

public class practicePage extends baseclass {

	@BeforeTest
	public void browserinitialize() throws IOException {
		driver = initialize();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void practice() throws IOException {
		
		driver = initialize();
		driver.get(prop.getProperty("url"));
		landingpageclass lp = new landingpageclass(driver);
		lp.practice().click();
		
		
		
	}
	@AfterTest
	public void closingbrowser() {
		driver.close();
	}
}
