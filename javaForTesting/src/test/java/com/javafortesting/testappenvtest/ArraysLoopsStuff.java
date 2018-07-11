package com.javafortesting.testappenvtest;

import javafortesting.testappenv.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraysLoopsStuff {

    int integersArray[] = new int[10];       //arrays of fixed size -> 10 values
    String[] stringsArray = new String[10];

    int integersTo6[] = {1,2,3,4,5,6};      //array with actual values

    int zeroLengthArray[] = {};                       //empty arrays
    int differentZeroLenthArray[] = new int[0];

//    int uninitializedArray[];   array declared for later initialization, not that useful, better to initialize as empty
//    uninitializedArray = new int[10];   new array allocated to an existing empty array


    @Test
    public void createArrayOfUsers() {
        User users[] = new User[3];

        users[0] = new User("Mike", "Litoris");
        users[1] = new User("Johnsons", "Baby");
        users[2] = new User("Chris P", "Chicken");

        assertEquals("Mike", users[0].getUsername());

    }

    String workdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    @Test
    public void forEachThroughWorkdays(){            //for each loop

        String days="";

        for( String workday : workdays){     // for( variable : collection) {
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday", days);

    }

}
