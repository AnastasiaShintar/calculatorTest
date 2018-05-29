package testNGTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTests extends BaseCalculatorTestTestNG {

    @DataProvider(name = "simpleDataProvider")
    public Object[][] createSomeData() {
        return new Object[][]{
                {3d, 2d, 6d},
                {3d, 0d, 0d},
                {3l, 2l, 6l},
                {0l, 1l, 0l}
        };
    }

    @Test (dataProvider = "simpleDataProvider")
    public void positiveMultTest(double arg1, double arg2, double expected){
        double result = calculator.mult(arg1, arg2);
        Assert.assertEquals(result, expected);
    }
}
