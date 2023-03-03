package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
        static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the change amount: ");
            int change = scanner.nextInt();
            List<Integer> result = calculateChange(change);
            System.out.println("Minimum number of notes needed: " + result.size());
            System.out.println("Notes to be returned: " + result);
        }

        public static List<Integer> calculateChange(int amount) {
            List<Integer> result = new ArrayList<>();
            for (int note : notes) {
                if (amount >= note) {
                    int count = amount / note;
                    for (int i = 0; i < count; i++) {
                        result.add(note);
                    }
                    amount -= count * note;
                }
            }
            return result;
        }
}
