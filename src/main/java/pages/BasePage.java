package pages;

import io.appium.java_client.windows.WindowsDriver;

public class BasePage {
    protected WindowsDriver driver;

    private final String plus= "plusButton";
    private final String minus = "minusButton";
    private final String equal = "equalButton";
    private final String multiply = "multiplyButton";
    private final String divide = "divideButton";
    private final String result="CalculatorResults";
    private final String header="Header";
    private final String decimal="decimalSeparatorButton";
    private final String menu= "TogglePaneButton";
    private final String clear= "clearEntryButton";

    public BasePage(WindowsDriver driver) {
        this.driver = driver;
    }

    public void clickNumElement(int number){
        driver.findElementByAccessibilityId("num"+number+"Button").click();
    }

    public String getHeader(){
        return driver.findElementByAccessibilityId(header).getText();
    }

    public void clickPlus() {
        driver.findElementByAccessibilityId(plus).click();
    }

    public void clickMinus() {
        driver.findElementByAccessibilityId(minus).click();
    }

    public void clickEqual() {
         driver.findElementByAccessibilityId(equal).click();
    }

    public void clickDecimal(){
        driver.findElementByAccessibilityId(decimal).click();
    }

    public void clickMultiply() {
        driver.findElementByAccessibilityId(multiply).click();
    }

    public void clickDivide() {
         driver.findElementByAccessibilityId(divide).click();
    }

    public String getTextResult(){
         return driver.findElementByAccessibilityId(result).getText();
    }

    public void clickMenu(){
        driver.findElementByAccessibilityId(menu).click();
    }

    public void chooseCalc(String nameCalc){
        clickMenu();
        driver.findElementByAccessibilityId(nameCalc).click();
    }

    public void clickClear(){
        driver.findElementByAccessibilityId(clear).click();
    }


}

