
import org.junit.*;


public class WinAppStandardTest extends BaseTest {

    private static String result;

    @Test
    public void Combination(){
        result=standardPage.combination(8, 4);
        Assert.assertTrue("Display ",result.contains("12"));
    }

    @Test
    public void Multiply(){
        result=standardPage.multiply(5,9);
        Assert.assertTrue("Display ",result.contains("45"));
    }

    @Test
    public void Subtraction(){
        result=standardPage.subtraction(8, 2);
        Assert.assertTrue("Display ",result.contains("6"));
    }

    @Test
    public void Division(){
        result=standardPage.division(9,3);
        Assert.assertTrue("Display ",result.contains("3"));
    }

    @Test
    public void checkTheCalculatorIsStandard(){
        result=standardPage.getTextHeader();
        Assert.assertTrue("The calculator is standard", result.contains("Standard"));
    }

    @Test
    public void MultiplyDecimalNumbers(){
        result=standardPage.operationWithDecimal("multiply", 2,5,3,5);
        Assert.assertTrue("The calculator is standard", result.contains("8,75"));
    }

    @Test
    public void VerifyDivideByZero(){
        result=standardPage.arithmeticOperations("divide", 1, 0);
        Assert.assertTrue("Verify divide by zero", result.contains("Cannot divide by zero"));
    }

}