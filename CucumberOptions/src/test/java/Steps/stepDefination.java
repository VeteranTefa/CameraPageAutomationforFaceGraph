package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination {

    @Given("user should exist in website and registered")
    public void user_should_exist_in_website_and_registered() {
        System.out.println("1");
    }

    @When("user fill username and password")
    public void user_fill_username_and_password() {
        System.out.println("1");

    }
    @When("make a new feature")
    public void make_a_new_feature() {

    }
    @Then("Login is successfully and navigate to home page")
    public void login_is_successfully_and_navigate_to_home_page() {
        System.out.println("1");

    }
}
