package Browser;

import base.BaseTest;
import listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// Attach TestListener here
@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginFailureScenario() {
        // If an assertion fails, TestListener automatically triggers ScreenshotUtil.capture()
        Assert.assertTrue(false, "Failing test intentionally to trigger screenshot!");
    }
}
