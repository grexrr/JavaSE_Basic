package com.grexrr;

public class TestArray {
    public static void main(String[] args) {
        //1. Static initialization
        String[] names;
        int[] scores;
        names = new String[]{"Alice", "Bob", "Charlie"};

        for (String name : names) {
            System.out.println(name);
        }

        //2. dynamic initialization
        scores = new int[4];
        scores[0] = 90;
        scores[1] = 80;
        scores[2] = 70;
    }
}
