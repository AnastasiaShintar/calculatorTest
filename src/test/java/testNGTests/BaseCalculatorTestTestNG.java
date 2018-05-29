package testNGTests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalculatorTestTestNG {

        protected Calculator calculator;

        @BeforeClass
        public void setUp() {
            System.out.println("Config prepare calculator");
            calculator = new Calculator();
        }



}
