/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tapikkala.hailstonecalculator;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * The Calculator class provides the methods for calculating hallstone sequence of a
 * a given integer and retreiving the length and second largest element of the
 * sequence.
 */
public class Calculator {

    private int numberOfSteps;
    private final PriorityQueue<Integer> sequenceInMaxHeap;

    public Calculator() {
        this.numberOfSteps = 0;
        this.sequenceInMaxHeap = new PriorityQueue<>(12, Collections.reverseOrder());
    }

    /**
     * Returns the number steps it takes for the sequence to reach one.
     * @return number of steps
     */
    public int getNumbeofStepsToOne() {
        return this.numberOfSteps;
    }

    /**
     * Retuns the second largest number in the sequence.
     * @return second largest number in the sequence
     */
    public int getSecondLargestNumberInSequence() {
        this.sequenceInMaxHeap.poll();
        return this.sequenceInMaxHeap.peek();
    }

    /**
     * A recursice method for producing the Hallstone sequence of a given positive integer n.
     * Base case is n=1. With each recursive call the current number is added to the max-heap and
     * the numberOfSteps attribute is increased with one.
     * @param n integer from which the sequence is calculated
     * @return the current number in the sequence
     */
    public int calculate(int n) {
        this.sequenceInMaxHeap.add(n);
        if (n == 1) {
            return n;
        }
        this.numberOfSteps++;
        if (n % 2 == 0) {
            return calculate(n / 2);
        }
        return calculate(3 * n + 1);
    }

}
