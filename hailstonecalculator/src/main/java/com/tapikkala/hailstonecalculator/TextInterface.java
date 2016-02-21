package com.tapikkala.hailstonecalculator;

import java.util.Scanner;

/**
 *A simple text interface for using the calculator,
 */
public class TextInterface {

    private final Scanner console;

    public TextInterface() {
        console = new Scanner(System.in);
    }

    /**
     *Methove invokes a message for invalid input, if the given input is not an integer
     * greater than 1.
     */
    public int input() {
        while (true) {
            try {
                System.out.println("Give a number:");
                final int input = Integer.parseInt(console.nextLine());
                if (input <= 1) {
                    System.out.println(invalidInputMessage());
                    continue;
                }
                return input;
            } catch (NumberFormatException e) {
                System.out.println(invalidInputMessage());
            }
        }
    }

    private String invalidInputMessage() {
        return "Hailstone sequence can only be calculated from natural numbers greater"
                + " than 1!";
    }

}
