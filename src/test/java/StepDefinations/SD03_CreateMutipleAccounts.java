package StepDefinations;

import BaseClass.OpenBrowser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import java.io.IOException;

public class SD03_CreateMutipleAccounts {
    @Given("Navigate to registration screen on HN website")
    public void navigate_to_registration_screen_on_hn_website() throws InterruptedException, IOException {
        OpenBrowser.NavToWebsite("CreAcc");
        Thread.sleep(1000);
    }
    @Then("customer enter firstname as {string}")
    public void customer_enter_firstname_as(String FirstName) {
         OpenBrowser.driver.findElement(By.id("firstname")).sendKeys(FirstName);

    }
    @Then("customer enter lastname as {string}")
    public void customer_enter_lastname_as(String LastName) {
        OpenBrowser.driver.findElement(By.id("lastname")).sendKeys(LastName);
    }
    @Then("customer enter email_address as {string}")
    public void customer_enter_emailaddress_as(String EmailAdd) {
        OpenBrowser.driver.findElement(By.id("email_address")).sendKeys(EmailAdd);
    }
    @Then("customer enter password as {string}")
    public void customer_enter_pass_as(String password) {
        OpenBrowser.driver.findElement(By.id("password")).sendKeys(password);
    }
    @Then("customer enter confirmation as {string}")
    public void customer_enter_repass_as(String Repassword) {
        OpenBrowser.driver.findElement(By.id("confirmation")).sendKeys(Repassword);
    }

}
