package driver;

import configuration.AppiumSession;
import configuration.CapabilitiesConfigurator;
import configuration.PropertiesReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


import static java.lang.String.format;


public class MobileDriver {
    private static AppiumDriver mobileDriver;
    private static MobileDriver instance;
    private MobileDriver() {
    }

    public static synchronized MobileDriver getInstance() {
        if (instance == null) {
            instance = new MobileDriver();
        }
        return instance;
    }
    public AppiumDriver getMobileDriver(){
        return mobileDriver;
    }

    public static AppiumDriver createDriver() {
        //AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        mobileDriver = new AndroidDriver(AppiumSession.getAppiumDriverLocalService(PropertiesReader.get().appiumPort()),
                CapabilitiesConfigurator.getLocalCapabilities());
        return mobileDriver;
    }

}
