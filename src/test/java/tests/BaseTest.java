package tests;

import driver.AppiumDriverManager;
import driver.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    public static AndroidDriver driver;

    @BeforeAll
    public static void createSession() {
        driver = AppiumDriverManager.getDriver();
 //       MobileDriver.getInstance();
        // .createDriver();
    }

//    @AfterAll
//    public void resetApp() {
//        DriverManager.getDriver().resetApp();
//    }

//    @AfterEach
//    public void closeSession() {
//        AppiumDriverManager.closeDriver();
//        AppiumDriverManager.closeAppium();
//        AppiumDriverManager.closedEmulator();
//    }
}
