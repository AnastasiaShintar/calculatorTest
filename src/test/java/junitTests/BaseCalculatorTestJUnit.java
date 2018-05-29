package junitTests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalculatorTestJUnit {

    protected Calculator calculator;

    @BeforeClass
    public void setUp() {
        System.out.println("Config prepare calculator");
        calculator = new Calculator();
    }
}
