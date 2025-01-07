package com.grexrr;

import java.util.Scanner;

public class LoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int previous = a;
            for (int j = 0; j <= n - 1; j++){
                previous += (int) Math.pow(2.0, (double)j) * b;
                System.out.print(previous);
                if (j != n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
