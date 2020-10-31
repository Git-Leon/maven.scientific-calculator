package com.github.curriculeon.inputoutputconsole;

import com.github.curriculeon.IOConsole;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author leon on 03/02/2019.
 */
@SuppressWarnings("all")
public class GetStringInputTest {
    private IOConsole console;


    @Test
    public void test1() {
        test("0");
    }

    @Test
    public void test2() {
        test("1");
    }

    @Test
    public void test3() {
        test("3.4028235E38");
    }

    @Test
    public void test5() {
        test("-9223372036854775808");
    }

    @Test
    public void test6() {
        test("1.1");
    }

    @Test
    public void test7() {
        test("_");
    }


    private void test(String input) {
        // Given
        String expected = input;
        this.console = getConsoleWithBufferedInput(input);

        // When
        String actual = console.getStringInput("Fetching input from console object...");

        // Then
        Assert.assertEquals(actual, expected);
    }

    private IOConsole getConsoleWithBufferedInput(String inputString) {
        byte[] inputBytes = inputString.getBytes();
        ByteArrayInputStream inputStringConvertedToInputStream = new ByteArrayInputStream(inputBytes);
        IOConsole console = new IOConsole(inputStringConvertedToInputStream, System.out);
        return console;
    }
}
