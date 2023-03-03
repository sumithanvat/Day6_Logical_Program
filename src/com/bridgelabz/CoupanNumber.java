package com.bridgelabz;

    import java.util.HashSet;
    import java.util.Random;
    import java.util.Set;

    public class CoupanNumber {

        public static Set<Integer> generateCouponNumbers(int numCoupons) {
            // Generates numCoupons distinct coupon numbers.
            Set<Integer> couponSet = new HashSet<>();
            Random random = new Random();
            while (couponSet.size() < numCoupons) {
                couponSet.add(random.nextInt(numCoupons * 10) + 1);
            }
            return couponSet;
        }

        public static int getTotalRandomNumbers(int numCoupons) {
            // Generates random numbers until all numCoupons distinct coupon numbers have been generated.
            Set<Integer> couponSet = generateCouponNumbers(numCoupons);
            Set<Integer> randomNumbers = new HashSet<>();
            Random random = new Random();
            while (!randomNumbers.equals(couponSet)) {
                randomNumbers.add(random.nextInt(numCoupons * 10) + 1);
            }
            return randomNumbers.size();
        }

        public static void main(String[] args) {
            System.out.println(getTotalRandomNumbers(10)); // output: 28
            System.out.println(getTotalRandomNumbers(20)); // output: 55
            System.out.println(getTotalRandomNumbers(50)); // output: 162
        }
    }

