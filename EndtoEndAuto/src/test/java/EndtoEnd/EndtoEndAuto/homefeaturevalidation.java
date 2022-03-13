package EndtoEnd.EndtoEndAuto;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Loginpage;

public class homefeaturevalidation extends base{

	@BeforeTest
	public void beforetes() throws IOException
	{
		driver = Initializedriver();
		
	}
	@Test
	public void hpvalidation() throws IOException
	{
		driver.get(prop.getProperty("url"));
		Loginpage lp = new Loginpage(driver);
		AssertJUnit.assertTrue(lp.logo().isDisplayed());
	}
	@AfterTest
	public void aftertes()
	{
		driver.close();
	}
	
}
