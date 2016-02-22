package com.tapikkala.hailstonecalculator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        final TextInterface textInterface = new TextInterface();
        final Calculator calculator = new Calculator();
        final SequenceStatsWriter sequenceWriter = new SequenceStatsWriter();
        sequenceWriter.writeSequenceStats(textInterface.input());
    }
}
