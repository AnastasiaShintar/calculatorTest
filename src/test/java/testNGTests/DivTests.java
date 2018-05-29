package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTests extends BaseCalculatorTestTestNG {

    @DataProvider(name = "simpleDataProvider")
    public Object[][] createSomeData() {
        return new Object[][]{
                {6d, 2d, 3d},
                {30l, 6l, 5l}
        };
    }

    @Test (dataProvider = "simpleDataProvider")
    public void positiveDivTest(double arg1, double arg2, double expected){
        Object result = calculator.div(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divTestLong (){
        long result1 = calculator.div(3l, 0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divTestDouble (){
        double result1 = calculator.div(3d, 0);
    }

}
