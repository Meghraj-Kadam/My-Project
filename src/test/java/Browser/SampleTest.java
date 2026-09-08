package Browser;


import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.ScreenshotUtil;

public class SampleTest extends BaseTest {

    @Test
    public void testHomePageVerification() {
        HomePage homePage = new HomePage(driver);
        
        // Manual checkpoint screenshot
        String screenshotPath = ScreenshotUtil.capture(driver, "HomePage_Loaded");
        System.out.println("Screenshot saved at: " + screenshotPath);
    }
}
