package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MainPage;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonsTest extends BaseTest {
    MainPage mainPage = new MainPage(driver);

    private static Stream<Arguments> buttonList() {
        return Stream.of(
                Arguments.of('0', "0"),
                Arguments.of('1', "1"),
                Arguments.of('2', "2"),
                Arguments.of('3', "3"),
                Arguments.of('4', "4"),
                Arguments.of('5', "5"),
                Arguments.of('6', "6"),
                Arguments.of('7', "7"),
                Arguments.of('8', "8"),
                Arguments.of('9', "9"),
                Arguments.of('+', "+"),
                Arguments.of('-', "-"),
                Arguments.of('*', "*"),
                Arguments.of('/', "/"),
                Arguments.of('%', "/"),
                Arguments.of('(', "("),
                Arguments.of('.', ".")
        );
    }

    private static Stream<Arguments> buttonOfActionList() {
        return Stream.of(
                Arguments.of("11d", "1"),
                Arguments.of("111dd", "1"),
                Arguments.of("111c", ""),
                Arguments.of("(1+2)", "(1+2)"),
                Arguments.of("((", "(("),
                Arguments.of("((1))", "((1))")
        );
    }
    @ParameterizedTest(name = "testing buttons {0}")
    @MethodSource("buttonList")
    public void clickButtonTest(char button, String result) {
        mainPage.clearAll();
        mainPage.buttonClick(button);
        assertEquals(result, mainPage.getFormula());
    }

    @ParameterizedTest(name = "testing buttons {0}")
    @MethodSource("buttonOfActionList")
    public void clickActionButtonTest(String button, String result) {
        mainPage.clearAll();
        mainPage.calculate(button);
        assertEquals(result, mainPage.getFormula());
    }

}
