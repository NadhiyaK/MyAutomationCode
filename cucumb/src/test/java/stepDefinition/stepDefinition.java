package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {

	
	
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		System.out.println("User is in login page now");
	}
	@When("^user provide username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_provide_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
       System.out.println(strArg1);
       System.out.println(strArg2);
    }
	@And("clicking login button")
	public void clicking()
	{
		System.out.println("And user is clicking login button");
	}
	@Then("^home page should be displayed \"([^\"]*)\"$")
    public void home_page_should_be_displayed_something(String strArg1) throws Throwable {
      
        
        System.out.println("card displayed " + strArg1);
    }
	 
	
}
