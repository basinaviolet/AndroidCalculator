package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.MainPage;

public class Test1 extends BaseTest{

    @Test
    public void divisionTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.buttonClick();
//        mainPage.butNine.click();
//        mainPage.butNine.click();
//        mainPage.divide.click();
//        mainPage.butFour.click();
//        mainPage.equals.click();
//        Assertions.assertEquals(mainPage.ResFin.getText(), "249.75");
    }
}
