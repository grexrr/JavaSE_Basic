/*
break: used in switch-case and for loop
    indicate to end the current for loop
continue: used in for loop
    indicate to end the current loop
*/
package com.grexrr;

public class TestPrimeBreak {
    public static void main(String[] args) {
        method1(1000000);
    }

    private static void method1(int ceil){
        for (int i = 2; i < ceil; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
