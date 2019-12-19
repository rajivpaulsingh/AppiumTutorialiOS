import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.net.MalformedURLException;

public class IOSTest extends Base {

    public static void mian(String[] args) throws MalformedURLException {

        IOSDriver<IOSElement> driver = Capabilities();
        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//*[@value='Text Entry']").click();
        driver.findElementByClassName("XCUIElementTextField").sendKeys("Hello");
        driver.findElementByName("OK").click();
    }
}
