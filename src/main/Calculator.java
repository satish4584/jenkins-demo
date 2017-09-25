/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.devops.sqjavaexample.sonarqube.java.example;

import java.security.InvalidParameterException;

/**
 *
 * @author jape
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double squareRoot(int a) {
        if (a < 0) {
            throw new InvalidParameterException("Must be zero or positive.");
        }
        return Math.sqrt(a);
    }
}