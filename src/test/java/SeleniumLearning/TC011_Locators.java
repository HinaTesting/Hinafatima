package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TC011_Locators {

	public static void main(String[] args) {
		//Locate Chrome Driver in your machine and open
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		// creating a variable called driver and pointing to chromedriver
				WebDriver driver = new ChromeDriver();
				//Maximize chrome browser
				driver.manage().window().maximize();
				//wait either 10sec or if browser opens go to next step
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Open HarveyNorman website
				driver.get("http://www.harveynorman.com.au/");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Clicking Account link
				//driver.findElement(By.linkText("Account")).click();
				driver.findElement(By.className("my-account-link tracked")).click();
				
				//driver.get("https://www.harveynorman.com.au/customer/account/login/");
				
				//entering Email address
				//driver.findElement(By.id("email")).sendKeys("software1@hotmail.com");
				
				//entering password 
				//driver.findElement(By.id("pass")).sendKeys("Passw0rd");
		System.out.println();

	}

}
