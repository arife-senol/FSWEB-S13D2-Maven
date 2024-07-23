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
        if(number<0){
            return "Invalid Value";
        }
        String result = "";
        String strNumber = String.valueOf(number);
        for (int i = 0; i <strNumber.length() ; i++) {
            switch (strNumber.charAt(i)){
                case '1' :
                    result += "One ";
                    break;
                case '2'  :
                    result += "Two ";
                    break;
                case '3'  :
                    result += "Three ";
                    break;
                case '4'  :
                    result += "Four ";
                    break;
                case '5'  :
                    result += "Five ";
                    break;
                case '6'  :
                    result += "Six ";
                    break;
                case '7'  :
                    result += "Seven ";
                    break;
                case '8'  :
                    result += "Eight ";
                    break;
                case '9'  :
                    result += "Nine ";
                    break;
                case '0'  :
                    result += "Zero ";
                    break;
            }
        }

        return result.trim();

    }


}
