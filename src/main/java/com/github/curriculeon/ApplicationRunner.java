package com.github.curriculeon;

public class ApplicationRunner implements Runnable {
    private Calculator calculator = new Calculator();

    public void run() {
        IOConsole console = new IOConsole(IOConsole.AnsiColor.YELLOW);

        console.println("Welcome to the main-menu application.");
        console.println("From here, you can select any of the following options:");
        String options = "[off, compute, change-base, show-display, clear-display]";
        String userInput;
        loop_label:
        while (true) {
            userInput = console.getStringInput(options);
            switch (userInput) {
                case "compute":
                    triggerComputeMenuSelection();
                    break;

                case "change-base":
                    triggerChangeBaseMenuSelection();
                    break;

                case "clear-display":
                    calculator.clearDisplay();
                    break;


                case "show-display":
                    calculator.display();
                    break;

                case "off":
                    break loop_label;

                default:
                    console.println("Invalid input!");
                    console.println("Please try again!");
                    run();
                    break;
            }
        }
    }

    private void triggerChangeBaseMenuSelection() {
        IOConsole console = new IOConsole(IOConsole.AnsiColor.CYAN);
        console.println("Welcome to the change-base-menu.");
        console.println("From here, you can select any of the following options:");
        String options = "[binary, octal, decimal, hexadecimal]";
        String userInput = console.getStringInput(options);
        switch (userInput) {
            case "binary":
                calculator.convertToBinaryBase();
                break;

            case "octal":
                calculator.convertToOctalBase();
                break;

            case "decimal":
                calculator.convertToDecimalBase();
                break;

            case "hexadecimal":
                calculator.convertToHexadecimalBase();
                break;

        }
    }

    private void triggerComputeMenuSelection() {
        IOConsole console = new IOConsole(IOConsole.AnsiColor.PURPLE);
        console.println("Welcome to the compute-menu.");
        console.println("From here, you can select any of the following options:");
        String options = "[arithmetic, trigonometric, logarithmic]";
        String userInput = console.getStringInput(options);
        switch (userInput) {
            case "arithmetic":
                triggerComputeArithmetic();
                break;
            case "trigonometric":
                triggerComputeTrigonometric();
                break;
            case "logarithmic":
                triggerComputeLogarithmic();
                break;
            default:
                console.println("Invalid input!");
                console.println("Please try again!");
                triggerComputeMenuSelection();
        }
    }

    private void triggerComputeArithmetic() {
        IOConsole console = new IOConsole(IOConsole.AnsiColor.BLUE);
        console.println("Welcome to the arithmetic-menu.");
        console.println("From here, you can select any of the following options:");
        String options = "[add, subtract, multiply, divide]";
        String userInput = console.getStringInput(options);
        switch (userInput) {
            case "add":
                calculator.computeAddition();
                break;
            case "subtract":
                calculator.computeSubtraction();
                break;
            case "multiply":
                calculator.computeMultiplication();
                break;
            case "divide":
                calculator.computeDivision();
                break;
            default:
                console.println("Invalid input!");
                console.println("Please try again!");
                triggerComputeArithmetic();
        }
    }


    private void triggerComputeTrigonometric() {
        IOConsole console = new IOConsole(IOConsole.AnsiColor.GREEN);
        console.println("Welcome to the trigonometric-menu.");
        console.println("From here, you can select any of the following options:");
        String options = "[sine, cosine, tangent, inverseSine, inverseCosine, inverseTangent]";
        String userInput = console.getStringInput(options);
        switch (userInput) {
            case "sine":
                calculator.computeSine();
                break;

            case "cosine":
                calculator.computeCosine();
                break;

            case "tangent":
                calculator.computeTangent();
                break;

            case "inverseSine":
                calculator.computeInverseSine();
                break;

            case "inverseCosine":
                calculator.computeInverseCosine();
                break;
            case "inverseTangent":
                calculator.computeInverseTangent();
                break;

            case "radians":
                calculator.convertToRadians();

            case "degrees":
                calculator.convertToDegrees();

            default:
                console.println("Invalid input!");
                console.println("Please try again!");
                triggerComputeTrigonometric();
        }
    }

    private void triggerComputeLogarithmic() {
        IOConsole console = new IOConsole(IOConsole.AnsiColor.BLUE);
        console.println("Welcome to the logarithmic-menu.");
        console.println("From here, you can select any of the following options:");
        String options = "[log, natural-log, inverse-natual-log]";
        String userInput = console.getStringInput(options);
        switch (userInput) {
            case "log":
                break;

            case "natural-log":
                break;

            case "inverse-natual-log":
                break;

            default:
                console.println("Invalid input!");
                console.println("Please try again!");
                triggerComputeLogarithmic();
        }
    }
}
