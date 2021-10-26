package CucumberScripts;

import BaseClass.OpenBrowser;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static BaseClass.OpenBrowser.driver;

public class AT01_NavigatingToHNwebsite {
    @Test
    public static void NavHNsite() throws IOException {
        OpenBrowser.NavToWebsite("Ecomurl");
    }

    @Test
    public static void assertHomePage() throws IOException {
        String actualTitle=OpenBrowser.driver.getTitle();
        System.out.println("Actuak title"+actualTitle);
        String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
        //Assertion
        Assert.assertEquals(ExpectedTitle,actualTitle);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\hinan\\Desktop\\Testing Class Jagan\\screenshot23.png"));


    }

}
