package pages;

import io.appium.java_client.windows.WindowsDriver;

public class Standard extends BasePage {

    public Standard(WindowsDriver driver) {
        super(driver);
    }

    public String multiply(int first_num, int second_num) {
        clickClear();
        clickNumElement(first_num);
        clickMultiply();
        clickNumElement(second_num);
        clickEqual();
        return getTextResult();
    }

    public String combination(int first_num, int second_num) {
        clickClear();
        clickNumElement(first_num);
        clickPlus();
        clickNumElement(second_num);
        clickEqual();
        return getTextResult();
    }

    public String subtraction(int first_num, int second_num) {
        clickClear();
        clickNumElement(first_num);
        clickMinus();
        clickNumElement(second_num);
        clickEqual();
        return getTextResult();
    }

    public String division(int first_num, int second_num) {
        clickClear();
        clickNumElement(first_num);
        clickDivide();
        clickNumElement(second_num);
        clickEqual();
        return getTextResult();
    }

    public String getTextHeader() {
        return getHeader();
    }

    public void switchOperation(String operation_num) {
        switch (operation_num) {
            case "multiply":
                clickMultiply();
                break;
            case "combination":
                clickPlus();
                break;
            case "subtraction":
                clickMinus();
                break;
            case "divide":
                clickDivide();
                break;
        }
    }

    public String arithmeticOperations(String name_operation, int first_num, int second_num) {
        clickClear();
        clickNumElement(first_num);
        switchOperation(name_operation);
        clickNumElement(second_num);
        clickEqual();
        return getTextResult();
    }

    public String operationWithDecimal(String name_operation, int first_num, int first_decimal_num, int second_num, int second_decimal_num) {
        clickClear();
        clickNumElement(first_num);
        clickDecimal();
        clickNumElement(first_decimal_num);
        switchOperation(name_operation);
        clickNumElement(second_num);
        clickDecimal();
        clickNumElement(second_decimal_num);
        clickEqual();
        return getTextResult();
    }
}

