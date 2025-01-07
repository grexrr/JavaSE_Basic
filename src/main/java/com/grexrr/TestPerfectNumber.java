package com.grexrr;

import java.util.ArrayList;

public class TestPerfectNumber {
    public static void main(String[] args) {

        int cap = 100000;
        ArrayList<Integer> factors = new ArrayList<>();
        for (int num = 1; num <= cap; num++) {
            int sum = 0;
            for (int i = 1; i <= num/2; i++){
                if (num % i == 0){
                    sum += i;
                    factors.add(i);
                }
            }

            if (sum == num){
                for (int j = 0; j < factors.size(); j++){
                    System.out.print(factors.get(j));
                    if (j != factors.size() - 1){
                        System.out.print(" + ");
                    }
                }
                System.out.print(" = " + num);
                System.out.println();
            }
            factors.clear();
        }
    }
}
