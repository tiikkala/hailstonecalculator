/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tapikkala.hailstonecalculator;

import java.util.Scanner;

/**
 *
 * @author tapio
 */
public class TextInterface {

    private Scanner console;

    public TextInterface() {
        console = new Scanner(System.in);
    }

    public int input() {
        while (true) {
            try {
                System.out.println("Give a number:");
                int input = Integer.parseInt(console.nextLine());
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
