package test;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppiumTest extends BaseTest {
    /**
     * Click Test
     */
    @Test
    public void clickTest() throws InterruptedException {
        WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
        views.click();
        Thread.sleep(2000);
    }

    /**
     * SendKeys Test
     */
    @Test
    public void sendKeysTest() throws InterruptedException {
        WebElement views = driver.findElement(AppiumBy.accessibilityId("Views"));
        views.click();
        WebElement controls = driver.findElement(AppiumBy.accessibilityId("Controls"));
        controls.click();
        WebElement lightTheme = driver.findElement(AppiumBy.accessibilityId("1. Light Theme"));
        lightTheme.click();
        WebElement textBox = driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
        textBox.sendKeys("some text");
        Thread.sleep(2000);
    }

//    /**
//     * Alert Test
//     */
//    @Ignore
//    @Test
//    public void alertTest() throws InterruptedException {
//        WebElement app = driver.findElement(AppiumBy.accessibilityId("App"));
//        app.click();
//        WebElement alertDialogs = driver.findElement(AppiumBy.accessibilityId("Alert Dialogs"));
//        alertDialogs.click();
//        WebElement alertButton = driver.findElement(AppiumBy.id("io.appium.android.apis:id/two_buttons"));
//        alertButton.click();
//        WebElement alertOK = driver.findElement(AppiumBy.id("android:id/button1"));
//        alertOK.click();
//        Thread.sleep(2000);
//    }
//
//    /**
//     * LongPress Test
//     */
//    @Ignore
//    @Test
//    public void longPressTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
//        driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
//
//        LongPressOptions longPressOptions = new LongPressOptions();
//        WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.TextView[" +
//                "@text='People Names']"));
//        longPressOptions.withDuration(ofSeconds(2)).withElement(ElementOption.element(element));
//        TouchAction action = new TouchAction((PerformsTouchActions) driver);
//        action.longPress(longPressOptions).release().perform();
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Scroll Test
//     */
//    @Ignore
//    @Test
//    public void scrollTest() throws InterruptedException {
////        driver.findElement(AppiumBy.accessibilityId("Views")).click();
////        driver.findElement(AppiumBy.accessibilityId("Controls")).click();
////        driver.findElement(AppiumBy.accessibilityId("1. Light Theme")).click();
//
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView" +
//                "(text(\"WebView\"));"));
//        Thread.sleep(2000);
//
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView" +
//                "(text(\"Expandable Lists\"));"));
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Dropdown Test
//     */
//    @Ignore
//    @Test
//    public void dropdownTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView" +
//                "(text(\"Popup Menu\"));"));
//        Thread.sleep(1000);
//
//        List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.widget.ListView/" +
//                "android.widget.TextView"));
//
//        for (WebElement element : elements) {
//            if (element.getText().equals("Popup Menu")) {
//                element.click();
//                break;
//            }
//        }
//
//        driver.findElement(AppiumBy.accessibilityId("Make a Popup!")).click();
//        Thread.sleep(1000);
//        driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id=" +
//                "'android:id/title'])[1]")).click();
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Swipe Test
//     * https://appium.io/docs/en/writing-running-appium/android/android-mobile-gestures/#mobile-swipeGesture
//     */
//    @Ignore
//    @Test
//    public void swipeTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
//        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
//
//        WebElement img1 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));
//        WebElement img2 = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[3]"));
//
//        // direction can be - up, down, left, right
//        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) img1).getId(),
//                "direction", "left",
//                "percent", 0.75
//        ));
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Verify Text Test
//     */
//    @Ignore
//    @Test
//    public void verifyTextTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("App")).click();
//        driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
//        driver.findElement(AppiumBy.id("io.appium.android.apis:id/two_buttons2")).click();
//
//        String alertHeader = driver.findElement(AppiumBy.id("android:id/alertTitle")).getText();
//        System.out.println(alertHeader);
//
//        assertEquals("Header title", alertHeader);
//
//        String alertBody = driver.findElement(AppiumBy.id("android:id/message")).getText();
//        System.out.println(alertBody);
//
//        assertTrue(alertBody.contains("Swipontgwook proudgs"));
//
//        driver.findElement(AppiumBy.id("android:id/button1")).click();
//
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Verify Toast Message Test
//     */
//    @Ignore
//    @Test
//    public void verifyToastMessageTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView" +
//                "(text(\"Popup Menu\"));"));
//        Thread.sleep(1000);
//
//        List<WebElement> elements = driver.findElements(AppiumBy.xpath("//android.widget.ListView/" +
//                "android.widget.TextView"));
//
//        for (WebElement element : elements) {
//            if (element.getText().equals("Popup Menu")) {
//                element.click();
//                break;
//            }
//        }
//
//        driver.findElement(AppiumBy.accessibilityId("Make a Popup!")).click();
//        Thread.sleep(1000);
//        driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@resource-id=" +
//                "'android:id/title'])[1]")).click();
//
//        String toastMsg = driver.findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getAttribute(
//                "name");
//        System.out.println(toastMsg);
//
//        assertEquals(toastMsg, "Clicked popup menu item Search");
//
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Drag and Drop Test
//     */
//    @Ignore
//    @Test
//    public void dragAndDropTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
//
//        WebElement src = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
//        WebElement dest = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
//
//        TouchAction drag = new TouchAction((PerformsTouchActions) driver)
//                .press(ElementOption.element(src))
//                .waitAction(waitOptions(ofSeconds(2)))
//                .moveTo(ElementOption.element(dest))
//                .release()
//                .perform();
//
//        String successMsg = driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
//        System.out.println(successMsg);
//
//        assertEquals(successMsg, "Dropped!");
//
//        Thread.sleep(2000);
//    }
//
//    /**
//     * Key Event Test
//     */
//    @Ignore
//    @Test
//    public void keyEventTest() throws InterruptedException {
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        driver.findElement(AppiumBy.accessibilityId("Controls")).click();
//        driver.findElement(AppiumBy.accessibilityId("1. Light Theme")).click();
//
//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
//        Thread.sleep(1000);
//
//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
//        Thread.sleep(1000);
//
//        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.VOICE_ASSIST));
//
//        Thread.sleep(2000);
//    }


}
