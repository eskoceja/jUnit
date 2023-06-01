package com.ctac.testing;

import java.util.Scanner;
import java.util.function.Supplier;

public class NumberComparisons {
    //UPDATED FOR EFFICIENCY AND TESTING
    public static boolean comparingNumbers(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }


    //ORIGINAL
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Use all three conditional statements (if, else if, and else) to output one of the three statements
        depending on what the two numbers are.
            Same: Numbers are the same
            Number one is larger than number two: The first number was larger than the second
            Number two is larger than number one: The second number was larger than the first*/

        System.out.println("Enter a number: ");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int numTwo = Integer.valueOf(scanner.nextLine());

        if (numOne == numTwo) {
            System.out.println("The numbers are the same");
        } else if (numOne > numTwo) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}
