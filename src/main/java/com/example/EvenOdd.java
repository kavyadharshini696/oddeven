
package com.example;

public class EvenOdd {

    public String checkNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        EvenOdd obj = new EvenOdd();
        System.out.println(number + " is " + obj.checkNumber(number));
    }
}