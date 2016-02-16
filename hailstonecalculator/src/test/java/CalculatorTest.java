/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tapikkala.hailstonecalculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tapio
 */
public class CalculatorTest {
    
    Calculator calculator;
    
    @Before
    public void setUp() {
        this.calculator = new Calculator();
    }
    
    @Test
    public void calculationReachesOne() {
        assertEquals(1, this.calculator.calculate(1000));
    }
    
    @Test public void numberOfSetpsIsCorrect() {
        this.calculator.calculate(27);
        assertEquals(111, this.calculator.getNumbeofStepsToOne());
    }
    
    @Test public void secondLargestInTheSequenceIsCorrect() {
        this.calculator.calculate(27);
        assertEquals(7288, this.calculator.getSecondLargestNumberInSequence());
    }
}
