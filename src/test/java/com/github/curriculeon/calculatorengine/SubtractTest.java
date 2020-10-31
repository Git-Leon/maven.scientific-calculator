package com.github.curriculeon.calculatorengine;

import com.github.curriculeon.CalculatorEngine;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 10/31/2020.
 */
public class SubtractTest {
    // given
    private void test(Double firstValue, Double secondValue, Double expectedValue) {
        CalculatorEngine calculatorEngine = new CalculatorEngine();

        // when
        Double actualValue = calculatorEngine.subtract(firstValue, secondValue);

        // then
        Assert.assertEquals(expectedValue, actualValue);
    }


    @Test
    public void test1() {
        test(5.0, 10.0, -5.0);
    }

    @Test
    public void test2() {
        test(15.0, 5.0, 10.0);
    }
}
