package pages.enums;

import org.openqa.selenium.WebElement;

public class _ButtonMapElement {

        private char buttonName;
        private WebElement buttonLocator;

        public _ButtonMapElement(char buttonName, WebElement buttonLocator) {
            this.buttonName = buttonName;
            this.buttonLocator = buttonLocator;
        }

    public char getButtonName() {
        return buttonName;
    }

    public WebElement getButtonLocator() {
        return buttonLocator;
    }
}
