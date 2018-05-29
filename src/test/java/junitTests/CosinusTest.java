package junitTests;

import org.junit.runners.Parameterized;
import org.testng.annotations.Parameters;

import java.util.Arrays;
import java.util.Collection;

public class CosinusTest extends BaseCalculatorTestJUnit{

    private double arg1;
    private double arg2;
    private double expected;

    @Parameterized.Parameters
    public static Collection <Object> setValues (){
        return Arrays.asList(new Object[][]{
                {30, }

        })
    }

}
