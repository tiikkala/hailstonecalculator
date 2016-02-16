/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tapikkala.hailstonecalculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tapio
 */
public class Main {

    public static void main(String[] args) {
        TextInterface textInterface = new TextInterface();
        Calculator calculator = new Calculator();
        FileWriter fWriter;
        BufferedWriter writer;

        int input = textInterface.input();
        calculator.calculate(input);
        
        try {
        int numberOfSteps = calculator.getNumbeofStepsToOne();
        int secondLargestNumber = calculator.getSecondLargestNumberInSequence();
            fWriter = new FileWriter("hailstonesequence.html");
            writer = new BufferedWriter(fWriter);
            writer.write(beginHtml());
            writer.write("<h1>Hailstone sequence stats for " + Integer.toString(input) + "</h1>\n");
            writer.write("<p> Number of steps to reach 1: " + Integer.toString(numberOfSteps) + "</p>\n");
            writer.write("<p> Second largest number in the sequence: " + Integer.toString(secondLargestNumber) + "</p>\n");
            writer.write(closeHtml());
            writer.close();
            System.out.println("Number of steps to reach 1: " + Integer.toString(numberOfSteps));
            System.out.println("Second largest number in the sequence: " + Integer.toString(secondLargestNumber));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String beginHtml() {
        return "<!doctype html>\n<html>\n<body>\n";
    }

    private static String closeHtml() {
        return "</body>\n</html>";
    }

}
