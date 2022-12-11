package driver;

import configuration.AppiumSession;
import configuration.CapabilitiesConfigurator;
import configuration.PropertiesReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

import static java.lang.String.format;


public class AppiumDriverManager {
   // private static AppiumDriver appiumDriver;
    private static AndroidDriver androidDriver;

    private AppiumDriverManager() {
    }

    // Получаем драйвер
    public static AndroidDriver getDriver() {
        if (androidDriver == null) {
            androidDriver = createDriver();
        }
        return androidDriver;
    }

    // Создаем драйвер
    private static AndroidDriver createDriver() {
        //AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        androidDriver = new AndroidDriver(AppiumSession.getAppiumDriverLocalService(PropertiesReader.get().appiumPort()),
                CapabilitiesConfigurator.getLocalCapabilities());
        return androidDriver;
    }

    // Закрываем драйвер
    public static void closeDriver() {
        androidDriver.quit();
    }

    // Закрываем Appium
    public static void closeAppium() {
        AppiumSession.stopService();
    }

    //Закрываем эмулятор
    public static void closedEmulator() {
        try {
            Runtime.getRuntime().exec(format("adb -s %s emu kill", PropertiesReader.get().udid()));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
