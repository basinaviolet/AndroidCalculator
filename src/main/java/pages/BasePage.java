package pages;

import driver.AppiumDriverManager;
import driver.Driver;
import driver.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    private AndroidDriver driver;

    public BasePage(AndroidDriver driver) {
        this.driver = driver; //Driver.getInstance().getMobileDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
   //     PageFactory.initElements(new AppiumFieldDecorator(Driver.getInstance().getMobileDriver()), this);
    }

    public AndroidDriver getDriver(){
        return driver;
    }
}
