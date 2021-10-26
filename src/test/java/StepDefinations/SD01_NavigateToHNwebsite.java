package StepDefinations;

import CucumberScripts.AT01_NavigatingToHNwebsite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD01_NavigateToHNwebsite {
    @Given("Open the Browser and enter url and press enter key")
    public void open_the_browser_and_enter_url_and_press_enter_key() throws IOException {
        AT01_NavigatingToHNwebsite.NavHNsite();

    }
    @Then("System should navigate to HomePage of HN website")
    public void system_should_navigate_to_home_page_of_hn_website() throws IOException {
        AT01_NavigatingToHNwebsite.assertHomePage();

    }

}
