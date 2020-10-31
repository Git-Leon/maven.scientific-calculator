package com.github.curriculeon;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author leonhunter
 * @created 02/12/2020 - 6:01 PM
 * used to output prompt to user and get input from user
 */
public class IOConsole {

    private final Scanner input;
    private final PrintStream output;
    private final AnsiColor ansiColor;

    public IOConsole() {
        this(System.in, System.out);
    }

    public IOConsole(AnsiColor ansiColor) {
        this(ansiColor, System.in, System.out);
    }

    public IOConsole(InputStream in, OutputStream out) {
        this(AnsiColor.AUTO, System.in, System.out);
    }

    public IOConsole(AnsiColor ansiColor, InputStream in, OutputStream out) {
        this.ansiColor = ansiColor;
        this.input = new Scanner(in);
        this.output = new PrintStream(out);
    }

    public void print(String val, Object... args) {
        output.format(ansiColor.getColor() + val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public Double getDoubleInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Double doubleInput = Double.parseDouble(stringInput);
            return doubleInput;
        } catch (NumberFormatException nfe) {
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting a numeric value!");
            return getDoubleInput(prompt, args);
        }
    }

    public Float getFloatInput(String prompt, Object... args) {
        return getDoubleInput(prompt, args).floatValue();
    }

    public Long getLongInput(String prompt, Object... args) {
        return getDoubleInput(prompt, args).longValue();
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        return getDoubleInput(prompt, args).intValue();
    }
}
