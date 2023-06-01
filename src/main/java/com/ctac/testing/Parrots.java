package com.ctac.testing;

public class Parrots {
    /*ORIGINAL FROM CODINGBAT
     *We have a loud talking parrot. The "hour" parameter is the current hour time
     * in the range 0..23. We are in trouble if the parrot is talking and the hour is
     * before 7 or after 20. Return true if we are in trouble. */
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {           //if the parrot is talking, and it is before 7am and after 11pm
            return true;                                    //true, we are in trouble
        } else {                                            //otherwise
            return false;                                   //we are not in trouble
        }
    }
}
