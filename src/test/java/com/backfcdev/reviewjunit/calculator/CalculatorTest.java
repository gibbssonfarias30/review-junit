package com.backfcdev.reviewjunit.calculator;

import com.backfcdev.reviewjunit.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    Calculator calculator;
    //unit testing lifecycle

    @BeforeAll
    public static void first(){
        System.out.println("runs at the beginning of all unit tests, one time only");
    }

    @AfterAll
    public static void last(){
        System.out.println("is executed at the end of all unit tests, for one time");
    }

    @BeforeEach
    public void objectInstance(){
        calculator = new Calculator();
        System.out.println("is executed at the beginning of each unit test");
    }

    @AfterEach
    public void afterTheTest(){
        System.out.println("runs at the end of each unit test");
    }

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
        calculator = new Calculator();
        assertTrue(calculator.divide(10, 2) == 5);
        assertFalse(calculator.divide(6, 1) == 12);
    }

    @Test
    @DisplayName("Test Multiplication")
    //@Disabled
    void multiplicationTest(){
        calculator = new Calculator();
        assertTrue(calculator.multiplication(10, 2) == 5);
    }
}
