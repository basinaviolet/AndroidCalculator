package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pages.MainPage;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class ActionsTest extends BaseTest {
    MainPage mainPage = new MainPage(driver);

    private static Stream<Arguments> realExpressions() {
        return Stream.of(
                Arguments.of("1 + 2 =", 3),
                Arguments.of("(-1) - 2 =", -3),
                Arguments.of("1 + 2 * 2 =", 5),
                Arguments.of("1 + 2 = * 2 =", 6),
                Arguments.of("4 / 2 =", 2),
                Arguments.of("4 / (-1) =", -4),
                Arguments.of("(-4) / 2 =", -2),
                Arguments.of("10 % 100 =", 10),
                Arguments.of("1.2 / 2 =", 0.6),
                Arguments.of("2 / 0.5 =", 4),
                Arguments.of("(1 + 2) * 2 =", 6),
                Arguments.of("0 / 4 =", 0)
        );
    }

    private static Stream<Arguments> preview() {
        return Stream.of(
                Arguments.of("1 + 2", 3),
                Arguments.of("(-1) - 2", -3),
//                Arguments.of("1 + 2 * 2", 5),
//                Arguments.of("1 + 2 = * 2", 6),
//                Arguments.of("4 / 2", 2),
                Arguments.of("4 / (-2)", -2),
                Arguments.of("(-4) / 2", -2),
//                Arguments.of("10 % 100", 10),
//                Arguments.of("1.2 / 2", 0.6),
//                Arguments.of("2 / 0.5", 4),
//                Arguments.of("(1 + 2) * 2", 6),
                Arguments.of("0 / 4", 0)
        );
    }

    private static Stream<Arguments> negativeExpressions() {
        return Stream.of(
                Arguments.of("2 / 0 =")
//MIN \ MAX
                //сделать тест меню
        );
    }

    //    @Story(value = "Common registration")
//    @Severity(SeverityLevel.NORMAL)
//    @Owner(value = "Violetta Basina")

    @ParameterizedTest(name = "testing positive expressions {0} -> {1} result")
    @MethodSource("realExpressions")
    public void positiveResultTest(String expression, double result) {
        //    mainPage.calculatorConstructor();
        mainPage.clearAll();
        mainPage.calculate(expression);
        assertEquals(result, Double.parseDouble(mainPage.getResult()), 0.001);
    }

    @ParameterizedTest(name = "testing positive expressions {0} -> {1} preview")
    @MethodSource("preview")
    public void positivePrevResultTest(String expression, double result) {
        mainPage.clearAll();
            mainPage.calculatorConstructor();
        mainPage.calculate(expression);
        System.out.println(mainPage.getPreview());
        assertEquals(result, Double.parseDouble(mainPage.getPreview()), 0.001);
    }

    @ParameterizedTest(name = "testing negative expressions {0}")
    @MethodSource("negativeExpressions")
    public void negativeResultTest(String expression) {
        mainPage.clearAll();
        mainPage.calculate(expression);
        //  assertThrowsExactly(mainPage.getResult())
        assertEquals("Can`t divide by 0", mainPage.getPreview());
    }

    @Test
    public void limitsTest() {
        mainPage.clearAll();
        mainPage.insertValue(Double.MAX_VALUE);
        mainPage.calculate("-1");
        assertEquals("Can`t divide by 0", mainPage.getPreview());
    }
}
