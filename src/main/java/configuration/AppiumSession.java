package configuration;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.IOException;
import java.net.ServerSocket;

import static io.appium.java_client.service.local.flags.GeneralServerFlag.SESSION_OVERRIDE;

public class AppiumSession {

    private static final String KILL_NODE_COMMAND = "taskkill /F /IM node.exe";
    private static AppiumDriverLocalService appiumDriverLocalService;

    private AppiumSession() {
    }

    public static AppiumDriverLocalService getAppiumDriverLocalService(int port) {
        if (appiumDriverLocalService == null) startService(port);
        return appiumDriverLocalService;
    }

    public static void startService(int port) {
        makePortAvailableIfOccupied(port);
        appiumDriverLocalService = new AppiumServiceBuilder()
                .withIPAddress(PropertiesReader.get().appiumAddress())
                .usingPort(port)
                .withArgument(SESSION_OVERRIDE)
                .build();
        appiumDriverLocalService.start();
    }

    public static void stopService() {
        appiumDriverLocalService.stop();
    }

    private static void makePortAvailableIfOccupied(int port) {
        if (!isPortFree(port)) {
            try {
                Runtime.getRuntime().exec(KILL_NODE_COMMAND);
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    private static boolean isPortFree(int port) {
        boolean isFree = true;
        try (ServerSocket ignored = new ServerSocket(port)) {
        } catch (Exception e) {
            isFree = false;
            e.getMessage();
        }
        return isFree;
    }
}
