package test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.time.Duration;

public class BaseTest {

    public static AppiumDriver driver = null;

    @Before
    public void setUp() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("deviceName", "Device 2");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("app", "C:/Users/sh.singh9/Downloads/sdk-tools/platform-tools/ApiDemos-debug.apk");

            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            driver = new AndroidDriver(url, capabilities);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
