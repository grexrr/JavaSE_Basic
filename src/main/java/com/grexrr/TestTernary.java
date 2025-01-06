/*
(condition)? expression1 if true : expression2 if false
*/

package com.grexrr;

public class TestTernary {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        String s1 = (i > j) ? "i is greater than j" : "i is smaller than j";
        System.out.println(s1);

        System.out.println(findMax(1, 4, 6));
        System.out.println("hex: " + convert(60, "hex") + " " + "binary: " + convert(60, "binary"));
    }

    public static int findMax(int a, int b, int c){
        return((a < b)? (b < c) ? c : b : (a < c) ? c : a);
    }

    public static String convert(int a, String b){
        if (b == "hex"){
            return(Integer.toHexString(a));
        } else if (b == "binary"){
            return(Integer.toBinaryString(a));
        } else {
            return("Decimal: " + a);
        }
    }
}
