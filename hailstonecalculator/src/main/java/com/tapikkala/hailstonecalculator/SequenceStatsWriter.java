package com.tapikkala.hailstonecalculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class SequenceStatsWriter {

    private FileWriter fWriter;
    private BufferedWriter writer;
    private Calculator calculator;

    public SequenceStatsWriter() {
        try {
            this.calculator = new Calculator();
            this.fWriter = new FileWriter("hailstonesequence.html");
            this.writer = new BufferedWriter(fWriter);
        } catch (IOException ex) {
            Logger.getLogger(SequenceStatsWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeSequenceStats(int input) {
        try {
            this.calculator.calculate(input);
            final int numberOfSteps = calculator.getNumbeofStepsToOne();
            final int secondLargestNumber = calculator.getSecondLargestNumberInSequence();
            this.writer.write(beginHtml());
            this.writer.write("<h1>Hailstone sequence stats for " + Integer.toString(input) + "</h1>\n");
            this.writer.write("<p> Number of steps to reach 1: " + Integer.toString(numberOfSteps) + "</p>\n");
            this.writer.write("<p> Second largest number in the sequence: " + Integer.toString(secondLargestNumber) + "</p>\n");
            this.writer.write(closeHtml());
            this.writer.close();
            this.fWriter.close();
            System.out.println("Number of steps to reach 1: " + Integer.toString(numberOfSteps));
            System.out.println("Second largest number in the sequence: " + Integer.toString(secondLargestNumber));
        } catch (IOException ex) {
            Logger.getLogger(SequenceStatsWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String beginHtml() {
        return "<!doctype html>\n<html>\n<body>\n";
    }

    private String closeHtml() {
        return "</body>\n</html>";
    }
}
