/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.devops.sqjavaexample.sonarqube.java.example;

import java.security.InvalidParameterException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jape
 */
public class CalculatorTest {

    public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAddZeroes() {
        System.out.println("testAddZeroes");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testAddPositiveNumbers() {
        System.out.println("testAddPositiveNumbers");
        int a = 1;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        System.out.println("testAddNegativeNumbers");
        int a = -1;
        int b = -2;
        Calculator instance = new Calculator();
        int expResult = -3;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of square method, of class Calculator.
     */
    @Test
    public void testSquareZero() {
        System.out.println("testSquareZero");
        int a = 0;
        Calculator instance = new Calculator();
        double expResult = 0;
        double result = instance.squareRoot(a);
        assertEquals(expResult, result, 1e-15);
    }

    @Test
    public void testSquarePositive() {
        System.out.println("testSquarePositive");
        int a = 4;
        Calculator instance = new Calculator();
        double expResult = 2;
        double result = instance.squareRoot(a);
        assertEquals(expResult, result, 1e-15);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSquareNegative() {
        System.out.println("testSquareNegative");
        int a = -4;
        Calculator instance = new Calculator();
        double result = instance.squareRoot(a);
    }

}