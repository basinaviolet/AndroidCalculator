package pages.enums;

import org.openqa.selenium.WebElement;

import java.util.EnumMap;

public class CalculatorStructure {
    public static EnumMap<ButtonList, WebElement> calcStructure = new EnumMap<>(ButtonList.class);

    public CalculatorStructure() {
    }

    public void setCalcStructure(ButtonList buttonIdentification, WebElement calcElement) {
        calcStructure.put(buttonIdentification, calcElement);
    }

    public WebElement getWebElementByButtonIdentification(char elementName){
        for(ButtonList but : calcStructure.keySet()){
            System.out.println(but + "->" + but.getValue() + "->" + calcStructure.get(but.getValue()));

        }
        ButtonList buttonIdentification = null;
            for (ButtonList button : ButtonList.values()) {
              //  System.out.println(elementName + ":" + button);
                if(button.equals(elementName)) buttonIdentification = button;
            }
        return (buttonIdentification != null) ? calcStructure.get(buttonIdentification) : null;
    }
}
