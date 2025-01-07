package com.grexrr;

public class TestAlgebra {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = i; j <= 9; j++){
                System.out.print(i + "*" + j +"="+ i * j + "\t");
            }
            System.out.printf("%n");
        }
    }
}
