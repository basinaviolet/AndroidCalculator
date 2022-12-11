package forDelete;

import configuration.AppiumSession;
import configuration.CapabilitiesConfigurator;
import configuration.PropertiesReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import static java.lang.String.format;


public class Driver {
    private AppiumDriver driver;
    private static Driver instance;
    private Driver() {
    }

    public Driver createDriver() {
        driver = new AndroidDriver(AppiumSession.getAppiumDriverLocalService(PropertiesReader.get().appiumPort()),
                CapabilitiesConfigurator.getLocalCapabilities());
        return this;
    }
    public static synchronized Driver getInstance() {
        if (instance == null) {
            instance = new Driver();
        }
        return instance;
    }
    public AppiumDriver getMobileDriver(){
        return driver;
    }
    public void closeDriver() {
        driver.quit();
    }
   // public void resetApp() { driver.resetApp();}
 //   public void closeApp() { driver.closeApp();}

    public static void closeAppium() {
        AppiumSession.stopService();
    }

    public static void closedEmulator() {
        try {
            Runtime.getRuntime().exec(format("adb -s %s emu kill", PropertiesReader.get().udid()));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
