import io.qameta.allure.*;
import org.junit.Assert;
import org.junit.Test;

@Feature("Windows calculator tests")
public class WinAppStandardTest extends BaseTest {

    private static String result;

    @Test()
    @Severity(SeverityLevel.MINOR)
    @Description("Tests Description: Combination operation on Windows calculator")
    @Story("Combination operation on Windows calculator")
    public void Combination(){
        result=standardPage.combination(8, 4);
        Assert.assertTrue("Display ",result.contains("12"));
    }

    @Test
    @Description("Tests Description: Multiply operation on Windows calculator")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Multiply operation on Windows calculator")
    public void Multiply(){
        result=standardPage.multiply(5,9);
        Assert.assertTrue("Display ",result.contains("45"));
    }

    @Test
    @Description("Tests Description: Subtraction operation on Windows calculator")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Subtraction operation on Windows calculator")
    public void Subtraction(){
        result=standardPage.subtraction(8, 2);
        Assert.assertTrue("Display ",result.contains("6"));
    }

    @Test
    @Description("Tests Description: Division operation on Windows calculator")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Division operation on Windows calculator")
    public void Division(){
        result=standardPage.division(9,3);
        Assert.assertTrue("Display ",result.contains("3"));
    }

    @Test
    @Description("Tests Description: Verify calculator is standard")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verify calculator is standard")
    public void checkTheCalculatorIsStandard(){
        result=standardPage.getTextHeader();
        Assert.assertTrue("The calculator is standard", result.contains("Standard"));
    }

    @Test
    @Description("Tests Description: Multiply operation on Windows calculator with decimal numbers")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Multiply operation on Windows calculator with decimal numbers")
    public void MultiplyDecimalNumbers(){
        result=standardPage.operationWithDecimal("multiply", 2,5,3,5);
        Assert.assertTrue("The calculator is standard", result.contains("8,75"));
    }

    @Test
    @Description("Tests Description: Verify division by zero")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Verify division by zero")
    public void VerifyDivideByZero(){
        result=standardPage.arithmeticOperations("divide", 1, 0);
        Assert.assertTrue("Verify divide by zero", result.contains("Cannot divide by zero"));
    }

}