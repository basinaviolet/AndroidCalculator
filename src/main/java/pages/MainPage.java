package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

 //   AndroidDriver driver;
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
    //android.widget.ImageButton[@content-desc="0"]
    public WebElement butZero;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_1")
    public WebElement butOne;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public WebElement butTwo;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    public WebElement butThree;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    public WebElement butFour;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public WebElement butFive;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_6")
    public WebElement butSix;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_7")
    public WebElement butSeven;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_8")
    public WebElement butEight;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_9")
    public WebElement butNine;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public WebElement equals;

    @AndroidFindBy(id = "com.google.android.calculator:id/dec_point")
    public WebElement point;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public WebElement add;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    public WebElement minus;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    public WebElement multiply;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    public WebElement divide;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_preview")
    public WebElement ResPrev;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public WebElement ResFin;

    public MainPage(AndroidDriver driver) {
       super(driver);
    }

    public void buttonClick(WebElement button) {
        if (button.isDisplayed()) button.click();
        else System.out.println("The template button does not displayed");
    }
    public void buttonClick() {
        if (butNine.isDisplayed())
           butNine.click();
        else System.out.println("The template button does not displayed");
    }
}
