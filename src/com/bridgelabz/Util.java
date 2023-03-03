package com.bridgelabz;

    public class Util {
        public static void main(String[] args) {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);
            int dayOfWeek = dayOfWeek(month, day, year);
            System.out.println(dayOfWeek);
        }

        public static int dayOfWeek(int month, int day, int year) {
            int y0 = year - (14 - month) / 12;
            int x = y0 + y0/4 - y0/100 + y0/400;
            int m0 = month + 12 * ((14 - month) / 12) - 2;
            int d0 = (day + x + 31 * m0 / 12) % 7;
            return d0;
        }
}
