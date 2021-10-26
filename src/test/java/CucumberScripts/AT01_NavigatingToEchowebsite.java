package CucumberScripts;

import BaseClass.OpenBrowser;
import org.junit.Test;

import java.io.IOException;

public class AT01_NavigatingToEchowebsite {
    @Test
    public static void NavEchosite() throws IOException {
        OpenBrowser.NavToWebsite("EchoUrl");
    }

    /*@Test
    public static void assertHomePage() throws IOException {
        String actualTitle=OpenBrowser.driver.getTitle();
        System.out.println("Actuak title"+actualTitle);
        String ExpectedTitle="Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
        //Assertion
        Assert.assertEquals(ExpectedTitle,actualTitle);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\hinan\\Desktop\\Testing Class Jagan\\screenshot23.png"));


    }*/

}
