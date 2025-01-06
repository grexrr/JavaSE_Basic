package com.grexrr;

public class TestVariables {
    public static void main(String[] args) {
        int myInt1 = 10;
        double myDouble1 = 12.3;

        System.out.println(myInt1);
        System.out.println(myDouble1 + myInt1);

        System.out.println(conversion(20));

        // byte(1) short(2) int(4) long(8)
        byte b1 = 127;
        short s1 = 128;
        long l1 = 128l;
        int i1 = 12;
        System.out.println(b1 + s1 + l1 + i1);

        //float double
        double d1 = 12.3;
        float f1 = 12.3f;
        System.out.println(d1 + f1);
    }

    private static String conversion(double i){
        return Double.toString(i);
    }
}
