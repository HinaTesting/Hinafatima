package StepDefinations;

import CucumberScripts.AT01_NavigatingToEchowebsite;
import io.cucumber.java.en.Given;

import java.io.IOException;

public class SD01_NavigateToEchowebsite {
    @Given("open the browser and enter echourl and press enter key")
    public void open_the_browser_and_enter_echourl_and_press_enter_key() throws IOException {
        AT01_NavigatingToEchowebsite.NavEchosite();

    }
    /*@Then("System should navigate to HomePage of HN website")
    public void system_should_navigate_to_home_page_of_hn_website() throws IOException {
        AT01_NavigatingToHNwebsite.assertHomePage();

    }
*/
}
