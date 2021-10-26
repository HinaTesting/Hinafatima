package PractisingSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AT011_NavigateToHNwebsite1 {

    @Test
    public void NavHN(){
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions options=new ChromeOptions();
        // we create an object of WebDriver
        WebDriver driver=new ChromeDriver(options);
        //Maximize the page
        driver.manage().window().maximize();
        //Navigate to that url
        driver.get("Ecomurl");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
