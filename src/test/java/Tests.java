import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Tests {
    private AndroidDriver driver = null; //private AndroidDriver<AndroidElement> driver = null;
    private DesiredCapabilities capabilities = new DesiredCapabilities();

    public void initialize() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 33_device");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, " com.android.calculator2.Calculator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void checkCalculate() {
        initialize();
        driver.findElement(By.id("com.android.calculator2.Calculator:id/btn_3_s")).click();
        driver.findElement(By.id("com.android.calculator2.Calculator:id/btn_plus_s")).click();
        driver.findElement(By.id("com.android.calculator2.Calculator:id/btn_9_s")).click();
        driver.findElement(By.id("com.android.calculator2.Calculator:id/btn_equal_s")).click();
        assert (driver.findElement (MobileBy.AndroidUIAutomator("new UiSelector().packageName(\"com.android.calculator2.Calculator\")" +
                ".resourceId(\"com.android.calculator2.Calculator:id/result\")")).getText().equals("= 12"));
    }
}
