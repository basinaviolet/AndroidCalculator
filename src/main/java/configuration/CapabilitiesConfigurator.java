package configuration;

import org.openqa.selenium.remote.DesiredCapabilities;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.*;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

public class CapabilitiesConfigurator {

     private CapabilitiesConfigurator(){
     }

     // Указывваем наши capabilities
     public static DesiredCapabilities getLocalCapabilities(){
         DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability(PLATFORM_NAME, PropertiesReader.get().platformName());
         capabilities.setCapability(PLATFORM_VERSION, PropertiesReader.get().platformVersion());
         capabilities.setCapability(UDID, PropertiesReader.get().udid());
         capabilities.setCapability(AVD, PropertiesReader.get().localDeviceName());
         capabilities.setCapability(APP_PACKAGE, PropertiesReader.get().appPackage());
         capabilities.setCapability(APP_ACTIVITY, PropertiesReader.get().appActivity());
         capabilities.setCapability(AUTOMATION_NAME, PropertiesReader.get().automationName());
         return  capabilities;
     }
}
