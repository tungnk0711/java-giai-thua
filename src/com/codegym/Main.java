package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:");
        long num = scanner.nextInt();

        long res = factorial(num);
        System.out.println("The factorial of num is: " + res);

    }

    public static long factorial(long num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
