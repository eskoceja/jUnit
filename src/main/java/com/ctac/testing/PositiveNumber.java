package com.ctac.testing;

import java.util.Scanner;

public class PositiveNumber {

    //UPDATED FOR EFFICIENCY AND TESTING
    public boolean isPositive(int n) {
        if (n < 0) {
            return false;
        } else {
            return true;
        }
    }


    //ORIGINAL
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        for (; ; ) {
            System.out.println("Enter a positive number (or 0 to quit): ");
            num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                System.out.println("You are quitting the game");
                break;
            } else if (num < 0) {
                System.out.println("Number must be positive");
            } else {
                System.out.println("You typed in " + num);
            }
        }

    }

}
