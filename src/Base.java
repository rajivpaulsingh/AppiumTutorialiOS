import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static IOSDriver<IOSElement> Capabilities() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "/Users/singh2_rajiv/Library/Developer/Xcode/DerivedData/UIKitCatalog-caymnoohisuimeburqrhimsticrm/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");

        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        return driver;

    }
}
