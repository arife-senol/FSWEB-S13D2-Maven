package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(isPalindrome(-1221));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {

        String gelenSayi = String.valueOf(Math.abs(number));
        String sayininTersi = "";
        for (int i = gelenSayi.length() - 1; i >= 0; i--) {
            sayininTersi = sayininTersi + gelenSayi.charAt(i);
        }

        if (gelenSayi.equals(sayininTersi)) {
            return true;
        } else {

            return false;
        }


    }


    public static boolean isPerfectNumber(int number) {
        int total = 1;
        if (number < 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        if (number == total) {
            return true;
        } else {
            return false;
        }
    }
    public static String numberToWords (int number){
        return "" ;
    }


}
