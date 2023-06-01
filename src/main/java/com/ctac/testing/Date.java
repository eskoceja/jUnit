package com.ctac.testing;

public class Date {
    /*ORIGINAL FROM CODINGBAT:
     *You and your date are trying to get a table at a restaurant.
     * The parameter "you" is the stylishness of your clothes,
     * in the range 0..10, and "date" is the stylishness of your date's clothes.
     * The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
     * If either of you is very stylish, 8 or more, then the result is 2 (yes).
     * With the exception that if either of you has style of 2 or less, then the result is 0 (no).
     * Otherwise, the result is 1 (maybe). */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {                //if you and your date are NOT styling and rank low on scale
            return 0;                               //you won't get a table, dress nicer!
        } else if (you >= 8 || date >= 8) {         //if you and your date are very stylish and score over an 8
            return 2;                               //then you definitely will get a table. Enjoy the meal!
        } else {                                    //otherwise, if you both look avg
            return 1;                               //you may get a table
        }
    }
}
