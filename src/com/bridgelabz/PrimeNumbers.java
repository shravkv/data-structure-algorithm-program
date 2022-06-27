package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers prime = new PrimeNumbers();
        prime.primeMethod();
    }

    public void primeMethod() {
        System.out.println("PrimeNumbers are :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the last number");
        int b = scanner.nextInt();
        for (int i = a; i < b; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
