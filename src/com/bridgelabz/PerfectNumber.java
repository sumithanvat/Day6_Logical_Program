package com.bridgelabz;

public class PerfectNumber {
    public static void main(String[] args) {

        int num = 28; // number to check

        int sum = 0;
        for(int i=1;i<num;i++){
            if(num%i==0){ // check if i is a divisor of num
                sum += i; // add i to the sum
            }
        }

        if(sum==num){ // check if sum is equal to num
            System.out.println(num + " is a Perfect Number.");
        }
        else{
            System.out.println(num + " is not a Perfect Number.");
        }
    }
}
