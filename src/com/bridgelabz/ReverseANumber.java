package com.bridgelabz;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int reverse = 0;

        while(num != 0) {
            int digit = num % 10;
            reverse = (reverse * 10) + digit;
            num /= 10;
        }

        System.out.println("Reverse of the number: " + reverse);
    }
}
