package EndtoEnd.EndtoEndAuto;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Home;
import PageObject.Loginpage;

public class HomePage extends base{
	
	@BeforeTest
	public void beforetes() throws IOException
	{
		driver = Initializedriver();
	}

	@Test(dataProvider="data")
	public  void homepage(String username, String pwd) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		
		Home hp = new Home(driver);
		hp.loginpage(driver).click();
		Loginpage lp = new Loginpage(driver);
		lp.username().sendKeys(username);
		lp.pwd().sendKeys(pwd);
		lp.Logbut().click();
	}
	
	@DataProvider(name="data")
	public Object[][] dataprovider()
	{
		Object[][] userdetails = new Object[1][2];
		userdetails[0][0] = "test99@gmail.com";
		userdetails[0][1] = "123456";
		
//		userdetails[1][0] = "ajanths@gmail.com";
//		userdetails[1][1] = "Testing23";
		
		return userdetails;
	}
	
	@AfterTest
	public void browserclose()
	{
		driver.close();
	}
}
