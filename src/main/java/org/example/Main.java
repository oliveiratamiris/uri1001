package org.example;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        int a, b, x;

        a = sc.nextInt();

        b = sc.nextInt();

        x = a + b;

        System.out.println("x = " + x);

        sc.close();
    }
}