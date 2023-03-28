package com.backfcdev.reviewjunit.calculator;

import com.backfcdev.reviewjunit.Calculator;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    @DisplayName("Test Sum")
    void sumTest(){
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sum(2, 2));
        assertNotEquals(2, calculator.sum(2,6));
    }

    @Test
    @DisplayName("Test Divide")
    void divideTest(){
        Calculator calculator = new Calculator();
        assertTrue(calculator.divide(10, 2) == 5);
        assertFalse(calculator.divide(6, 1) == 12);
    }

    @Test
    @DisplayName("Test Multiplication")
    @Disabled
    void multiplicationTest(){
        Calculator calculator = new Calculator();
        assertTrue(calculator.multiplication(10, 2) == 5);
    }
}
