package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuPage {

    WebDriverWait wait;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    //android.widget.ImageButton[@content-desc="0"]
    public WebElement butZero;
}
