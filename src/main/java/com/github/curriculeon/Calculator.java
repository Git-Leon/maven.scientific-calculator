package com.github.curriculeon;

/**
 * Created by leon on 10/31/2020.
 */ // TODO
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

    public void clearDisplay() {

    }

    public void computeAddition() {

    }

    public void computeSubtraction() {

    }

    public void computeMultiplication() {

    }

    public void computeDivision() {

    }

    public void computeInverseTangent() {

    }

    public void computeInverseCosine() {

    }

    public void computeInverseSine() {

    }

    public void computeTangent() {

    }

    public void computeCosine() {
    }

    public void computeSine() {

    }

    public void convertToDegrees() {

    }

    public void convertToRadians() {

    }

    public void convertToBinaryBase() {

    }

    public void convertToOctalBase() {
    }

    public void convertToDecimalBase() {
    }

    public void convertToHexadecimalBase() {

    }

    public void display() {

    }
}
