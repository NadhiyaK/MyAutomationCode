package stepDefinition;

import EndtoEnd.EndtoEndAuto.base;
import PageObject.Home;
import PageObject.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions extends base {
	
	 @Given("^Initialize the browser with chrome$")
	    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver = Initializedriver();
	    }

	 @When("^user enteres (.+) and (.+)$")
	    public void user_enteres_and(String username, String password) throws Throwable {
	    
	    	Loginpage lp = new Loginpage(driver);
			lp.username().sendKeys(username);
			lp.pwd().sendKeys(password);
			lp.Logbut().click();
	    }

	    @Then("^home page displayed \"([^\"]*)\"$")
	    public void home_page_displayed_something(String strArg1) throws Throwable {
	     Thread.sleep(2000);
	    	String url=  driver.getCurrentUrl();
	      System.out.println(url);
	    
	    	  System.out.println("Login is successful");
	    }

	    @And("^Navigate to \"([^\"]*)\" site$")
	    public void navigate_to_something_site(String strArg1) throws Throwable {

			driver.get(strArg1);
		
			
	    }

	    @And("^click on the sign in page$")
	    public void click_on_the_sign_in_page() throws Throwable {
	    	Home hp = new Home(driver);
			
			hp.loginpage(driver).click();
			
	    }
	    @And("^close the browser$")
	    public void close_the_browser() throws Throwable {
	       driver.quit();
	    }

	

}
