package com.for_strudy;

import java.io.IOException;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        ArrayList<BigDecimal> list = Factorial.calculateFactorial(5);
        System.out.println(list);
    }
}
