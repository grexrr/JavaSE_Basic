package com.grexrr;

public class TestPrime {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 2; i < 101; i++){
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    flag = true;
                }
            }
            if(flag == false){
                System.out.println(i);
            }
            flag = false;
        }
    }
}
