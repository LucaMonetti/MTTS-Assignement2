package it.unipd.mtss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RomanPrinterParameterizedTest {

    private int input;
    private String expectedOutput;

    public RomanPrinterParameterizedTest(int input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection testConditions() {
        return Arrays.asList(new Object[][] {
                { 1,    "  _____  \n |_   _| \n   | |   \n   | |   \n  _| |_  \n |_____| \n" },
                { 2,    "  _____    _____  \n" +
                        " |_   _|  |_   _| \n" +
                        "   | |      | |   \n" +
                        "   | |      | |   \n" +
                        "  _| |_    _| |_  \n" +
                        " |_____|  |_____| \n" },
        });
    }

    @Test
    public void testWithParameters() {
        try {
            String res = RomanPrinter.print(input);
            assertEquals(expectedOutput, res);
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }
}