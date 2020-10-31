package com.github.curriculeon;

/**
 * Created by leon on 10/31/2020.
 */
public class Calculator {
    private CalculatorEngine calculatorEngine;
    private CalculatorDisplay calculatorDisplay;

    public Calculator(CalculatorEngine calculatorEngine, CalculatorDisplay calculatorDisplay) {
        this.calculatorEngine = calculatorEngine;
        this.calculatorDisplay = calculatorDisplay;
    }

    public Calculator() {
        this(new CalculatorEngine(), new CalculatorDisplay());
    }
}
