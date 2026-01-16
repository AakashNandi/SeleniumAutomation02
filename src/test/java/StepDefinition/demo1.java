package StepDefinition;

import Browser.browser;
import Browser.utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo1 {
    @Given("Open the browser")
    public void open_the_browser() throws Exception {
        String browserData = utility.properties("browser");
        browser.openBrowser(browserData);
    }
    @When("User enters the URL")
    public void user_enters_the_url() throws Exception {
        browser.navigate("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");
    }
    @Then("user verifies the title {string}")
    public void user_verifies_the_title(String string) {
        System.out.println("Title is: Rediff");
    }

}
