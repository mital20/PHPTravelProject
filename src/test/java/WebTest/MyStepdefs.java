package WebTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    @Given("user is on home page")
    public void userIsOnHomePage() {
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        homePage.userClickOnLoggInPage();
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
    }

    @And("user enters login details")
    public void userEntersLoginDetails() {
        homePage.clickoncreateaccount();
    }

    @Then("user is successfully logged on")
    public void userIsSuccessfullyLoggedOn() {
    }
}
