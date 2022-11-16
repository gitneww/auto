package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
       
    	System.out.println("On page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
    	System.out.println("Logged in");
    }
    
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Values...."+string+string2);
    }
    
  /*  @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Values...."+strArg1+strArg2);
    }*/

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("On home page");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
       
    	System.out.println("Cards displayed");
    }

    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(string);
    }



}