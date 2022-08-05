package com.company;
import java.util.Scanner;

public class evenequatingtoodd {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int odd;
        int even;
        odd = 0;
        even = 0;
        int a[];
        int s = r.nextInt();
        for (int i = 0; i < s; i++) {
            int b = r.nextInt();
            a = new int[2 * b];
            for (int j = 0; j < b * 2; j++) {
                a = new int[2 * b];
                a[j] = r.nextInt();
            }
            for (int j = 0; j < b * 2; j++) {
                if (a[j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (odd > even) {
                System.out.println((odd - even) / 2);
            } else if (even > odd) {
                System.out.println((even - odd) / 2);
            } else if (even == odd) {
                System.out.println(even - odd);
            }
        }
    }
}