package com.ctac.testing;

import java.util.Scanner;

public class Grading {
    //UPDATED FOR EFFICIENCY AND TESTING
    public char determineLetterGrade(int numberGrade) {

        if (numberGrade < 0 || numberGrade > 100) {
            throw new IllegalArgumentException("Number cannot be below 0 or above 100");
        }
        if (numberGrade < 60) {
            return 'F';
        }
        if (numberGrade < 70) {
            return 'D';
        }
        if (numberGrade < 80) {
            return 'C';
        }
        if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }

    }

    //ORIGINAL
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*Depending on what the number is, return a statement telling the user what score they got on a test
        using a 10 point grading scale. For example,
        if the user enters 73, then the program should return "Your grade is a C."*/

        System.out.println("Enter your score (must be between 0 and 100): ");
        int score = Integer.valueOf(scanner.nextLine());

        if (score >= 90) {
            System.out.println("You made an A - for Amazing! :)");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Good job! You made a B!");
        } else if (score >= 70 && score <= 79) {
            System.out.println("You made a C!");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Uh-oh! You made a D!");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Oh no! You made an F! :(");
        } else {
            System.out.println("You score is not in range!");
        }
    }
}
