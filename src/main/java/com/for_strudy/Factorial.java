package com.for_strudy;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Factorial {
    public  static ArrayList<BigDecimal> calculateFactorial(int n) throws IOException {
        
        if( n < 0){
            IOException a = new IOException("n can't be negative");
            throw(a);
        }

        ArrayList<BigDecimal> FactorialList = new ArrayList<BigDecimal>(n);

        BigDecimal currentFactorial = BigDecimal.ONE;
        FactorialList.add(currentFactorial);

        for(int i = 1; i < n; i++){
            currentFactorial = currentFactorial.multiply(new BigDecimal(i));
            FactorialList.add(currentFactorial);
        }
        return FactorialList;
    }
}