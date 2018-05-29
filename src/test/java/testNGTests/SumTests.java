package testNGTests;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTests extends BaseCalculatorTestTestNG {

    @DataProvider (name = "simpleDataProvider")
    public Object[][] createSomeData() {
return new Object[][]{
        {1d, 3d, 4d},
        {0d, 1d, 1d},
        {-1d, 0d, -1d},
        {1l, 3l, 4l},
        {0l, 1l, 1l},
        {-1l, 0l, -1l},

};

    }
    @Test (dataProvider = "simpleDataProvider")
    private void sumDoubleTest (double arg1, double arg2, double expected){

        double result = calculator.sum(arg1, arg2);
        Assert.assertEquals(result, expected);
    }
}
