package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.enums.ButtonList;
import pages.enums._ButtonMapElement;
import pages.enums.CalculatorStructure;

import java.time.Duration;
import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MainPage extends BasePage {

    //   AndroidDriver driver;
    public CalculatorStructure calculator;
    WebDriverWait wait;
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

    @AndroidFindBy(id = "com.google.android.calculator:id/dec_point")
    public WebElement butSeparator;

    @AndroidFindBy(id = "com.google.android.calculator:id/eq")
    public WebElement butEquals;

    @AndroidFindBy(id = "com.google.android.calculator:id/del")
    public WebElement butDelete;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_add")
    public WebElement butPlus;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_sub")
    public WebElement butMinus;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_mul")
    public WebElement butMultiply;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_div")
    public WebElement butDivide;

    @AndroidFindBy(id = "com.google.android.calculator:id/op_pct")
    public WebElement butPercentage;

    @AndroidFindBy(id = "com.google.android.calculator:id/parens")
    public WebElement butParens;

    @AndroidFindBy(id = "com.google.android.calculator:id/clr")
    public WebElement butClear;

    @AndroidFindBy(id = "com.google.android.calculator:id/formula")
    public WebElement formula;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_preview")
    public WebElement resultPreview;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public WebElement result;

 //-------------Menu----------------
//    @AndroidFindBy(id = "com.google.android.calculator:id/digit_0")
//    //android.widget.ImageButton[@content-desc="0"]
//    public WebElement butZero;
//---------------!!!!!!!!!!


    public MainPage(AndroidDriver driver) {
        super(driver);
        wait = new WebDriverWait(super.getDriver(), Duration.ofSeconds(10));
    }

    public void calculatorConstructor() {
        calculator = new CalculatorStructure();
        CalculatorStructure calculator = new CalculatorStructure();
        calculator.setCalcStructure(ButtonList.ZERO, butZero);
        calculator.setCalcStructure(ButtonList.ONE, butOne);
        calculator.setCalcStructure(ButtonList.TWO, butTwo);
        calculator.setCalcStructure(ButtonList.THREE, butThree);
        calculator.setCalcStructure(ButtonList.FOUR, butFour);
        // if(wait.until(elementToBeSelected(butFive))) calculator.setCalcStructure(ButtonList.FIVE, butFive);// .Click)butFive.wait().isDisplayed().butFive);
        calculator.setCalcStructure(ButtonList.SIX, butSix);
        calculator.setCalcStructure(ButtonList.SEVEN, butSeven);
        calculator.setCalcStructure(ButtonList.EIGHT, butEight);
        calculator.setCalcStructure(ButtonList.NINE, butNine);
        calculator.setCalcStructure(ButtonList.PLUS, butPlus);
        calculator.setCalcStructure(ButtonList.MINUS, butMinus);
        calculator.setCalcStructure(ButtonList.MULTIPLY, butMultiply);
        calculator.setCalcStructure(ButtonList.DIVIDE, butDivide);
        calculator.setCalcStructure(ButtonList.PERCENTAGE, butPercentage);
        calculator.setCalcStructure(ButtonList.CLEAR, butClear);
        calculator.setCalcStructure(ButtonList.DELETE, butDelete);
        calculator.setCalcStructure(ButtonList.EQUAL, butEquals);
        calculator.setCalcStructure(ButtonList.SEPARATOR, butSeparator);
        for (ButtonList but : calculator.calcStructure.keySet()) {
            System.out.println(but + "->" + but.getValue() + "->" + calculator.calcStructure.get(but.getValue()));

        }
//      calculator.setCalcStructure(ButtonList.ZERO, new _ButtonMapElement('0', butZero));
//      calculator.setCalcStructure(ButtonList.ONE, new _ButtonMapElement('1', butOne));
//      calculator.setCalcStructure(ButtonList.TWO, new _ButtonMapElement('2', butTwo));
//      calculator.setCalcStructure(ButtonList.THREE, new _ButtonMapElement('3', butThree));
//      calculator.setCalcStructure(ButtonList.FOUR, new _ButtonMapElement('4', butFour));
//      calculator.setCalcStructure(ButtonList.FIVE, new _ButtonMapElement('5', butFive));
//      calculator.setCalcStructure(ButtonList.SIX, new _ButtonMapElement('6', butSix));
//      calculator.setCalcStructure(ButtonList.SEVEN, new _ButtonMapElement('7', butSeven));
//      calculator.setCalcStructure(ButtonList.EIGHT, new _ButtonMapElement('8', butEight));
//      calculator.setCalcStructure(ButtonList.NINE, new _ButtonMapElement('9', butNine));
//      calculator.setCalcStructure(ButtonList.PLUS, new _ButtonMapElement('+', plus));
//      calculator.setCalcStructure(ButtonList.MINUS, new _ButtonMapElement('-', minus));
//      calculator.setCalcStructure(ButtonList.MULTIPLY, new _ButtonMapElement('*', multiply));
//      calculator.setCalcStructure(ButtonList.DIVIDE, new _ButtonMapElement('/', divide));
//   //   calculator.setCalcStructure(ButtonList.PERCENTAGE, new ButtonMapElement('%', percentage));
//      calculator.setCalcStructure(ButtonList.CANCEL, new _ButtonMapElement('c', cansel));
//      calculator.setCalcStructure(ButtonList.RESET, new _ButtonMapElement('r', reset));
//      calculator.setCalcStructure(ButtonList.EQUAL, new _ButtonMapElement('=', equals));
//      calculator.setCalcStructure(ButtonList.SEPARATOR, new _ButtonMapElement(',', separator));
    }

//    public void buttonClick(WebElement button) {
//        if (button.isDisplayed()) button.click();
//        else System.out.println("The template button does not displayed");
//    }


    public WebElement chooseElement(char buttonIdentifier) {
        switch (getButtonName(buttonIdentifier)) {
            case ZERO:
                return butZero;
            case ONE:
                return butOne;
            case TWO:
                return butTwo;
            case THREE:
                return butThree;
            case FOUR:
                return butFour;
            case FIVE:
                return butFive;
            case SIX:
                return butSix;
            case SEVEN:
                return butSeven;
            case EIGHT:
                return butEight;
            case NINE:
                return butNine;
            case SEPARATOR:
                return butSeparator;
            case PLUS:
                return butPlus;
            case MINUS:
                return butMinus;
            case MULTIPLY:
                return butMultiply;
            case DIVIDE:
                return butDivide;
            case PERCENTAGE:
                return butPercentage;
            case CLEAR:
                return butClear;
            case DELETE:
                return butDelete;
            case EQUAL:
                return butEquals;
            case PARENTL, PARENTR:
                return butParens;
            default:
                return null;
        }
    }

    public ButtonList getButtonName(char buttonIdentifier) {
        for (ButtonList button : ButtonList.values()) {
            if (button.getValue() == buttonIdentifier) return button;
        }
        return null;
    }

    public void calculate(String expression) {
        char[] actionSet = expression.toLowerCase().trim().replaceAll("\\s", "").toCharArray();
        //   System.out.println(Arrays.toString(actionSet));
        for (char action : actionSet) {
            buttonClick(action);
        }
    }

    public void clearAll() {
        clickAction(butClear);
    }

    public String getResult() {
        return getTextAction(result);
    }

    public String getPreview() {
        return getTextAction(resultPreview);
    }

    public String getFormula() {
        return getTextAction(formula);
    }

    public void buttonClick(char buttonValue) {
        clickAction(chooseElement(buttonValue));
    }

    public void insertValue(double value) {
        setTextAction(formula, value);
        clickAction(butEquals);
    }

    public String getTextAction(WebElement elementToAction) {
        try {
            if (elementToAction.isDisplayed())
                return elementToAction.getText();
            else return elementToAction + " is not displayed";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void setTextAction(WebElement elementToAction, double value) {
        try {
            if (elementToAction.isDisplayed())
                elementToAction.sendKeys(String.valueOf(value));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickAction(WebElement elementToAction) {
        try {
            if (elementToAction.isDisplayed())
                elementToAction.click();
            else System.out.println("The button " + elementToAction + " does not displayed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
